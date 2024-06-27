import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.File; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.List; 
import java.util.Scanner;

public class AddFilmeALista extends Arquivos {
	static Scanner leia    = new Scanner(System.in);
	static Scanner leiaStr = new Scanner(System.in);

    static int maxUsuario = 1000,
               maxNota = 1000,
               maxStatus = 1000,
               maxPrivacidade = 1000,
               maxDataInicio = 1000,
               maxDataTermino = 1000,
               maxLine = 1000;

    static Usuario usuario[]           = new Usuario [maxUsuario];
    static Nota nota[]                 = new Nota [maxNota];
    static Status status[]             = new Status [maxStatus];
    static Privacidade privacidade[]   = new Privacidade [maxPrivacidade];
    static DataInicio dataInicio[]     = new DataInicio [maxDataInicio];
    static DataTermino dataTermino[]   = new DataTermino [maxDataTermino];

    static int qtdeUsuario     = 0,
               qtdeNota        = 0,
               qtdeStatus      = 0,
               qtdePrivacidade = 0,
               qtdeDataInicio  = 0,
               qtdeDataTermino = 0;

    static String arqUsuario      = "usuario.txt",
                  arqNota         = "nota.txt",
                  arqStatus       = "status.txt",
                  arqPrivacidade  = "privacidade.txt",
                  arqDataInicio   = "dataInicio.txt",
                  arqDataTermino  = "dataTermino.txt";

    static String separador = ";"
}
