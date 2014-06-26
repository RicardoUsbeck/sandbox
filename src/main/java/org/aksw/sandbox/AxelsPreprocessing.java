package org.aksw.sandbox;

import org.aksw.sandbox.datatypes.DocumentWithPositions;
import org.aksw.sandbox.datatypes.TokenizedDocument;

public class AxelsPreprocessing {

    public static Object getCorpusAsMatrix(String corpusName) {
        String texts[] = readCorpus(corpusName);
        DocumentWithPositions documentsWithPos = getTokenizedDocuments(texts);
        texts = null;

        performNER(documentsWithPos);

        TokenizedDocument tokenizedDocuments = mapEntitiesToTokens(documentsWithPos);

        return createMatrix(tokenizedDocuments);
    }

    private static DocumentWithPositions getTokenizedDocuments(String[] texts) {
        // TODO Auto-generated method stub
        return null;
    }

    private static void performNER(DocumentWithPositions documentsWithPos) {
        // TODO Auto-generated method stub

    }

    private static TokenizedDocument mapEntitiesToTokens(DocumentWithPositions documentsWithPos) {
        // TODO Auto-generated method stub
        return null;
    }

    private static Object createMatrix(TokenizedDocument tokenizedDocuments) {
        // TODO Auto-generated method stub
        return null;
    }

    private static String[] readCorpus(String corpusName) {
        // TODO read corpus
        return null;
    }
}
