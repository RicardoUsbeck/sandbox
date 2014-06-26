package org.aksw.sandbox;

import java.util.List;

import org.aksw.sandbox.datatypes.DocumentWithPositions;
import org.aksw.sandbox.datatypes.Entity;
import org.aksw.sandbox.datatypes.TokenizedDocument;
import org.aksw.sandbox.nlp.Fox;
import org.aksw.sandbox.nlp.Tokenizer;

public class AxelsPreprocessing {

	public static Object getCorpusAsMatrix(String corpusName) {
		String texts[] = readCorpus(corpusName);
		DocumentWithPositions[] documentsWithPos = getTokenizedDocuments(texts);
		texts = null;
		performNER(documentsWithPos);

		TokenizedDocument tokenizedDocuments = mapEntitiesToTokens(documentsWithPos);

		return createMatrix(tokenizedDocuments);
	}

	protected static DocumentWithPositions[] getTokenizedDocuments(String[] texts) {
		// for every token store its start and end (exclusive) position
		Tokenizer tokenizer = new Tokenizer();
		DocumentWithPositions[] docs = new DocumentWithPositions[texts.length];
		for (int i = 0; i < texts.length; ++i) {
			String[] tokens = tokenizer.tokenize(texts[i]);
			DocumentWithPositions doc = new DocumentWithPositions();
			doc.text = texts[i];
			doc.tokens = tokens;
			docs[i] = doc;
		}
		return docs;
	}

	protected static void performNER(DocumentWithPositions documentsWithPos[]) {
		// for every entity store its start and end (exclusive) position
		Fox fox = new Fox();
		for (int i = 0; i < documentsWithPos.length; ++i) {
			String text = documentsWithPos[i].text;
			List<Entity> entities = fox.getEntities(text);
			documentsWithPos[i].entities = entities.toArray(new Entity[entities.size()]);
		}
	}

	protected static TokenizedDocument mapEntitiesToTokens(DocumentWithPositions documentsWithPos[]) {
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
