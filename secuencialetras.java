package bucles;

public class secuencialetras {

	public static void main(String[] args) {
		
		int vocales = 0;
		int letras = 0;
		
		for (char i = 'a'; i <= 'z'; i++)
		{
			System.out.print(i);
			if(i == 'a')
			{
				vocales++;
			}
			else
			{
				if(i == 'e')
				{
					vocales++;
				}
				else 
				{
					if(i == 'i')
					{
						vocales++;
					}
					else
					{
						if(i == 'o')
						{
							vocales++;
						}
						else
						{
							if(i == 'u')
							{
								vocales++;
							}
							else
							{
								letras++;
							}
						}
					}
				}
			}
		}
		
		System.out.println();
		for (char j = 'a'; j <= 'z'; j += 2)
		{
			System.out.print(j);
			if(j == 'a')
			{
				vocales++;
			}
			else
			{
				if(j == 'e')
				{
					vocales++;
				}
				else 
				{
					if(j == 'i')
					{
						vocales++;
					}
					else
					{
						if(j == 'o')
						{
							vocales++;
						}
						else
						{
							if(j == 'u')
							{
								vocales++;
							}
							else
							{
								letras++;
							}
						}
					}
				}
			}
		}
		System.out.println();
		for (char b = 'B'; b <= 'Z'; b += 2)
		{
			System.out.print(b);
			if(b == 'a')
			{
				vocales++;
			}
			else
			{
				if(b == 'e')
				{
					vocales++;
				}
				else 
				{
					if(b == 'i')
					{
						vocales++;
					}
					else
					{
						if(b == 'o')
						{
							vocales++;
						}
						else
						{
							if(b == 'u')
							{
								vocales++;
							}
							else
							{
								letras++;
							}
						}
					}
				}
			}
		}
		System.out.println();
		for (char l = 'z'; l >= 'a'; l--)
		{
			System.out.print(l);
			if(l == 'a')
			{
				vocales++;
			}
			else
			{
				if(l == 'e')
				{
					vocales++;
				}
				else 
				{
					if(l == 'i')
					{
						vocales++;
					}
					else
					{
						if(l == 'o')
						{
							vocales++;
						}
						else
						{
							if(l == 'u')
							{
								vocales++;
							}
							else
							{
								letras++;
							}
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("Has generado " + vocales + " vocales");
		System.out.println("Has generado " + (letras + vocales) + " letras");
	}
