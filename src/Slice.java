
/**
 *
 * @author Michele
 *
 */
public class Slice {

    private Pizza p; //pizza a cui appartiene la Slice
    private Integer nRighe; //numero di righe della fetta
    private Integer nColonne; //numero di colonne della fetta
    private Integer nCelle; //numero di celle totali della fetta
    private Integer pRiga; //posizionamento della Slice rispetto alla pizza 
    //(riga) centrato sull'n-esimo elemento della Slice
    private Integer pColonna;//posizionamento della Slice rispetto alla pizza 
    //(colonna) centrato sull'n-esimo elemento della Slice
    private Integer nElemento; //fetta centrata sull'n-esimo elemento della Slice
    //il primo elemento è l'elemento 1
    private Integer pRigaAssoluta; //posizionamento della Slice rispetto alla pizza 
    //(riga) centrato sull'angolo in alto a sinistra
    private Integer pColonnaAssoluta;//posizionamento della Slice rispetto alla pizza 
    //(colonna) centrato sull'angolo in alto a sinistra
    private Integer pRelativoRigaElementoN;
    private Integer pRelativoColonnaElementoN;

    public Slice(Pizza p, Integer nRighe, Integer nColonne) {
        this.p = p;
        this.nRighe = nRighe;
        this.nColonne = nColonne;
        nCelle = nRighe * nColonne;
    }

    public Boolean calcolaCoordinateAssolute() {
        pRelativoRigaElementoN = nElemento / nColonne;
        pRelativoColonnaElementoN = (nElemento % nColonne)-1;
        pRigaAssoluta=pRiga-pRelativoRigaElementoN;
        pColonnaAssoluta=pColonna-pRelativoColonnaElementoN;
        if ((pRigaAssoluta>=0) && (pColonnaAssoluta>=0) && (pRigaAssoluta<p.getR())&&(pColonnaAssoluta<p.getC()))
        return true;
        else
        return false;
    }
    
    //verifica se nella fetta ci sono un adeguato numero di funghi e pomodori
    public Boolean verificaFunghiPomodori(){
        return true;
    }
    
    //riempie di X le celle della Slice tagliata e la scrive nel file di output
    public void tagliaSlice(){
    }
    
    
}
