package capitulo3;

public class GradeBook {
	
	private String courseName;// nome do curso para esse GradeBook
	
	//método para configurar o nome do curso
	//salve
	public void setCourseName(String name){
		courseName = name;// armazena o nome do curso
	}// fim do método setCourseName
	
	//método para recuperar o nome do curso
	public String getCourseName(){
		return courseName;
	}//fim do mérotodo getCourseName
	
	//exibe uma mensagem  de boas-vindas para o usuÃ¡rio  GrandeBook
	// o curso que essa Gradebook repesenta
	public void displayMessage(String courseName){
		System.out.printf("Welcometo the Grade Book for \n%s!\n", getCourseName());
	}// fim do mÃ©todo displayMessage

}// fim da classe GradeBook
