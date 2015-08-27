package macaw2

object Console {
  
  def main(args: Array[String]) ={
    
    if (args.size == 0) listInstructions
    else {
      args(0) match {
        
        case "help" => listInstructions
        case "SNP-typer" => MacawSNPtyper.main(args.drop(1))
        case "interpret-GT" => MacawUtilities.main(args.drop(1))
        case "interpret-DR" => DrugResistances.main(args.drop(1))
        case _ => listInstructions 
      }
    }
    
    
    
    def listInstructions() {
      println("Usage: java -jar Ara.jar [instruction] [instruction options...]")
      println("Instructions:")
      println("\tSNP-typer\tDetect presence/absence of SNP markers.")
      println("\tinterpret-GT\tInterpret genotypes from SNP/typer.")
      println("\tinterpret-DR\tInterpret drug resistances from SNP/typer.")      
    }    
    
  }
  
}