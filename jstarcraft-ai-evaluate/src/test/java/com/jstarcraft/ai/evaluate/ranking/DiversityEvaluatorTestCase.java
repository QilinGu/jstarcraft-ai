package com.jstarcraft.ai.evaluate.ranking;

import com.jstarcraft.ai.evaluate.AbstractRankingEvaluatorTestCase;
import com.jstarcraft.ai.evaluate.Evaluator;
import com.jstarcraft.ai.math.algorithm.correlation.Correlation;
import com.jstarcraft.ai.math.algorithm.correlation.similarity.CosineSimilarity;
import com.jstarcraft.ai.math.structure.matrix.SparseMatrix;
import com.jstarcraft.ai.math.structure.matrix.SymmetryMatrix;

import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntSet;

public class DiversityEvaluatorTestCase extends AbstractRankingEvaluatorTestCase {

    @Override
    protected Evaluator<IntSet, IntList> getEvaluator(SparseMatrix featureMatrix) {
        // Item Similarity Matrix
        Correlation similarity = new CosineSimilarity();
        SymmetryMatrix similarityMatrix = similarity.makeCorrelationMatrix(featureMatrix, true, 0F);
        return new DiversityEvaluator(10, similarityMatrix);
    }

    @Override
    protected float getMeasure() {
        return 0.24876F;
    }

}