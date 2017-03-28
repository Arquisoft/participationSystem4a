package participationSystem.producer;

public class Topics {
	public final static String SEPARATOR = "@@";
	public final static String CREATE_SUGGESTION = "CREATE_SUGGESTION"; //Cuando se crea una sugerencia
	public final static String COMMENT_SUGGESTION = "COMMENT_SUGGESTION"; //Comentar una sugerencia (Crea comentario y enlaza con la sugerencia)
	public final static String POSITIVE_SUGGESTION_VOTE = "POSITIVE_SUGGESTION_VOTE"; //Votar positivamente una propuesta. 
	public final static String NEGATIVE_SUGGESTION_VOTE = "NEGATIVE_SUGGESTION_VOTE"; //Votar negativamente una propuesta. 
	public final static String POSITIVE_COMMENT_VOTE = "POSITIVE_COMMENT_VOTE"; //Votar positivamente una propuesta. 
	public final static String NEGATIVE_COMMENT_VOTE = "NEGATIVE_COMMENT_VOTE"; //Votar positivamente una propuesta. 

}
