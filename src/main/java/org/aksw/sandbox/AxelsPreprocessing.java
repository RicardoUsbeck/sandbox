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

    protected static DocumentWithPositions getTokenizedDocuments(String[] texts) {
        // TODO tokenize the texts
        // for every token store its start and end (exclusive) position
        return null;
    }

    protected static void performNER(DocumentWithPositions documentsWithPos) {
        // TODO request entities from FOX
        // for every entity store its start and end (exclusive) position
    }

    protected static TokenizedDocument mapEntitiesToTokens(DocumentWithPositions documentsWithPos) {
        // TODO Auto-generated method stub
        return null;
    }

    protected static Object createMatrix(TokenizedDocument tokenizedDocuments) {
        // TODO Auto-generated method stub
        return null;
    }

    protected static String[] readCorpus(String corpusName) {
        // TODO read corpus
        return null;
    }

    protected static String[] readCorpusFromXML(String corpusName) {
        // TODO read corpus
        return null;
    }
}
