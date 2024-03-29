import java.io.File;

/**
 * ------------------------------------
 * COMP 249-D Assignment #3
 * 
 * @author Tsang Chi Kit (ID: 25692636)
 * ------------------------------------
 */
public class FileInvalidException extends Exception
{
	private static final long serialVersionUID = 1L;
	private ErrorType error;
	String fileName;
	
	public FileInvalidException(ErrorType errorType)
	{
		this.error = errorType;
		this.fileName = "";		
	}
	
	public FileInvalidException(File file, ErrorType errorType)
	{
		this.error = errorType;
		this.fileName = file.getName();
				
		displayError();
	}
	
	
	/**
	 * Helper function to display the error summary.
	 */
	private void displayError()
	{
		System.out.println("");
		
		System.out.println("Error: Detected Empty Field!");
		System.out.println("============================");
		
		System.out.println("");
		
		System.out.println("Problem detected with input file: " + fileName);
		System.out.println("File is invalid: Field \"" + error.toString() + "\" is empty. Processing stopped at this point. Other empty fields may be present as well!");
		
		System.out.println("");
	}

	/**
	 * Getters and setters
	 * 
	 * @return
	 */
	public ErrorType getErrors()
	{
		return error;
	}

	/**
	 * Getters and setters
	 * 
	 * @return
	 */
	public void setErrors(ErrorType errors)
	{
		this.error = errors;
	}
	
	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}
}
