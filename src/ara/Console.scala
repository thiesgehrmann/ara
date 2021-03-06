package ara

import ara.uniquemarkers.UniqueMarkers



object Console {
  
  def main(args: Array[String]) ={
    
    if (args.size == 0) listInstructions
    else {
      args(0) match {
        
        case "help" => listInstructions
        case "snp-typer" => MacawSNPtyper.main(args.drop(1))
        case "interpret" => AraUtilities.main(args.drop(1))
        case "list-results" => ListAraResults.main(args.drop(1))
        //case "interpret-macaw" => MacawUtilities.main(args.drop(1))
        //case "interpret-DR" => DrugResistances.main(args.drop(1))
        //case "mutation-rate-DR" => MutationRate.main(args.drop(1))
        case "vcf2snp-phylip" => Vcf2snpPhylip.main(args.drop(1))
        case "qc-snp-sequences" => QCsnpSequences.main(args.drop(1))
        case "qc-snp-fasta" => QCsnpFasta.main(args.drop(1))
        case "markers-qc" => QCGlobalMarkers.main(args.drop(1))
        //case "dr-markers" => DrugResistanceMarkers.main(args.drop(1))
        case "hier-clusters" => HierClusters.main(args.drop(1))
        case "bj-markers" => BlueJayMarkers.main(args.drop(1))
        case "ref-DR-region" => DRMap.main(args.drop(1))
        case "dr-snps" => DrugResistanceSnps.main(args.drop(1))
        case "prepare-ara" => PrepareAra.main(args.drop(1))
        case "prepare-drmapping" => PrepareDRMapping.main(args.drop(1))
        case "prepare-bluejay" => PrepareBlueJay.main(args.drop(1))
        case "generate-validation" => Validation.main(args.drop(1))
        case "unique-markers" => UniqueMarkers.main(args.drop(1))
        case _ => listInstructions 
      }
    }
    
    
    
    def listInstructions() {
      println("Usage: java -jar ara.jar [instruction] [instruction options...]")
      println("Instructions:")
      println("\tsnp-typer\t\tDetect presence/absence of SNP markers to detect mixed infection/drug resistance.")
      println("\tinterpret-macaw\t\tInterpret MTBC hierarchy clusters from SNP-typer results.")
      println("\tlist-results\t\tList all ara results in a data directory.")
      //println("\tinterpret-DR\t\tInterpret drug resistances from SNP-typer results.")
      println
      println("\tvcf2snp-phylip\t\tWrite phy-file from SNP sequences.")
      //println("\tmutation-rate-DR\tCount mutations within 21 bp window of DR markers given of list of VCFs.")
      println("\tqc-snp-sequences\tCheck snp-sequences (phy-file) with >0.05 unknown bases N.")
      println("\tqc-snp-fasta\t\tCheck length or N-content of multi fasta-file with SNP sequences.")
      println("\tmarkers-qc\t\tCheck effectiveness of markers.")
      //println("\tdr-markers\t\tCreate 21bp markers from a list with known TB drug resistance mutations.")
      println("\thier-clusters\t\tHierarchical clusters of tree, given lineage information.")
      println("\tbj-markers\t\tConvert cluster associated SNPs from BlueJay tsv-files to 21 bp markers, given a reference genome.")
      println("\tall-bj-markers\t\tCombine multiple marker files into one.")
      println("\tref-DR-region\t\tCreate minimized version of reference genome containing known DR-regions.")
      println("\tdr-snps\t\t\tRead drug resistance region VCF file.")
      println
      println("\tprepare-ara\t\tPrepare sbatch scripts to run Ara.")
      println("\tprepare-drmapping\tPrepare slurm script for each sample to detect drug resistance.")
      println("\tprepare-bluejay\t\tPrepare slurm script for hierarchical clusters for SNP-association.")
      println("\tunique-markers\t\tCreate unique markers for a given group of sequences.");
    }    
    
  }
  
}
