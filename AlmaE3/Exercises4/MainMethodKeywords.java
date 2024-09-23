package AlmaE3.Exercises4;
public class MainMethodKeywords {

    public static void main(String[] args) {
        System.out.println("main is working fine");
        //Om du sätter private först så kommer inte JVM hitta och kunna köra main() 
        //Om du tar bort static kommer programmet vilja att du instantierar ett objekt för att kunna köra main()
        //Du kan inte ha annat än void för att metoden ska inte returnera någonting, JVM ska endast köra igenom den och skriva ut dess innehåll
        //programmet funkar om du byter ut args mot argument
        //Det är för att det ska vara en array av String-typen, för att det ska gå att skriva ut nästan alla argument
        //Programmet fungerar om du byter hakparenteserna till efter args
    }
    
}
