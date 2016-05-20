/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngr.KiKi.beboss_reloaded.data;

/**
 *
 * @author KiKi
 */
public abstract class Entry
{

    private String label;
    private double amount;

    public String getLabel ()
    {
        return label;
    }

    public void setLabel (String label)
    {
        this.label = label;
    }

    public double getAmount ()
    {
        return amount;
    }

    public void setAmount (double amount)
    {
        this.amount = amount;
    }

    @Override
    public String toString ()
    {
        return label;
    }

    public class CREntry extends Entry
    {

        private Type type;

        public Type getType ()
        {
            return type;
        }

        public void setType (Type type)
        {
            this.type = type;
        }
    }

    public class TresorerieEntry extends Entry
    {

        private long time;
        private String sType;
        private Type type;

        public long getTime ()
        {
            return time;
        }

        public void setTime (long time)
        {
            this.time = time;
        }

        public String getsType ()
        {
            return sType;
        }

        public void setsType (String sType)
        {
            this.sType = sType;
        }

        public Type getType ()
        {
            return type;
        }

        public void setType (Type type)
        {
            this.type = type;
        }
    }

    public class StockEntry extends Entry
    {

        private String type;
        private String fournisseur;
        private int allotement;
        private double prixLot;
        private double prixUnit;
        private int quantiteStock;

        public String getType ()
        {
            return type;
        }

        public void setType (String type)
        {
            this.type = type;
        }

        public String getFournisseur ()
        {
            return fournisseur;
        }

        public void setFournisseur (String fournisseur)
        {
            this.fournisseur = fournisseur;
        }

        public int getAllotement ()
        {
            return allotement;
        }

        public void setAllotement (int allotement)
        {
            this.allotement = allotement;
        }

        public double getPrixLot ()
        {
            return prixLot;
        }

        public void setPrixLot (double prixLot)
        {
            this.prixLot = prixLot;
        }

        public double getPrixUnit ()
        {
            return prixUnit;
        }

        public void setPrixUnit (double prixUnit)
        {
            this.prixUnit = prixUnit;
        }

        public int getQuantiteStock ()
        {
            return quantiteStock;
        }

        public void setQuantiteStock (int quantiteStock)
        {
            this.quantiteStock = quantiteStock;
        }
    }

    public class VenteEntry extends Entry
    {

        private long time;
        private int nombre;
        private double coutProdTotal;
        private double pdvTotal;

        public long getTime ()
        {
            return time;
        }

        public void setTime (long time)
        {
            this.time = time;
        }

        public int getNombre ()
        {
            return nombre;
        }

        public void setNombre (int nombre)
        {
            this.nombre = nombre;
        }

        public double getCoutProdTotal ()
        {
            return coutProdTotal;
        }

        public void setCoutProdTotal (double coutProdTotal)
        {
            this.coutProdTotal = coutProdTotal;
        }

        public double getPdvTotal ()
        {
            return pdvTotal;
        }

        public void setPdvTotal (double pdvTotal)
        {
            this.pdvTotal = pdvTotal;
        }
    }

    public enum Type
    {
        DEBIT, CREDIT
    }
}
