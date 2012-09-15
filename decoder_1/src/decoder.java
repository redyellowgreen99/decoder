import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class decoder
{
	public static void main(String[] args)
	{
		File text = new File("/Users/droid2/workspace/decoder_1/text.txt");
		long length = text.length();
		System.out.println("Text Length: " + text.length());

		byte[] readContent = new byte[(int) length];
		FileInputStream fileInputStream;
		try
		{
			fileInputStream = new FileInputStream(text);
			try
			{
				fileInputStream.read(readContent);
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < readContent.length; i++)
		{
			if (readContent[i] == 'y')
			{
				readContent[i] = 'a';
			}
			else if (readContent[i] == 'z')
			{
				readContent[i] = 'b';
			}
			else if (readContent[i] == ' ')
			{
				readContent[i] = ' ';
			}
			else if (readContent[i] == '.')
			{
				readContent[i] = '.';
			}
			else if (readContent[i] == '\'')
			{
				readContent[i] = '\'';
			}
			else if (readContent[i] == '(')
			{
				readContent[i] = '(';
			}
			else if (readContent[i] == ')')
			{
				readContent[i] = ')';
			}
			else
			{
				readContent[i] += 2;
			}
		}
		String string = new String(readContent);
		System.out.println(string);
	}
}
