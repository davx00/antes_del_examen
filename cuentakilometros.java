package bucles;

public class cuentakilometros {
	public static void main(String[] args)
	{
		for (int num1 = 0; num1 <= 9; num1++)
		{
			for (int num2 = 0; num2 <= 9; num2++)
			{
				for (int num3 = 0; num3 <= 9; num3++)
				{
					if (num1 == 3)
					{
						System.out.println("E" + num2 + num3);
					}
					else
					{
						if (num2 == 3)
						{
							System.out.println(num1 + "E" + num3);
						}
						else

							if (num3 == 3)
							{
								System.out.println(num1 + num2 + "E");
							}
							else
								System.out.println("" + num1 + num2 + num3);
					}
				}
			}
		}
	}
}
