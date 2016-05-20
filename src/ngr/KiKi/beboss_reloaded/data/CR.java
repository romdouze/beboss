/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngr.KiKi.beboss_reloaded.data;

import ngr.KiKi.beboss_reloaded.data.Entry.CREntry;
import ngr.KiKi.beboss_reloaded.data.Entry.StockEntry;

/**
 *
 * @author KiKi
 */
public class CR
{

    private double chiffreAffaire;
    private double travauxInit;
    private double travauxFinaux;

    private EntryList<CREntry> chargesFixes;
    private EntryList<CREntry> chargesVariables;
    private EntryList<StockEntry> stocks;
    private EntryList<CREntry> achatsConsommes;
    private EntryList<CREntry> achatsNonStockables;
    private EntryList<CREntry> servicesExterieurs;
    private EntryList<CREntry> impotsEtTaxes; // TODO: handle that shit
    private EntryList<CREntry> chargesDePersonnels;
    private EntryList<CREntry> cotisationsPersonnelles;
    private EntryList<CREntry> DotationAmortissements;
    private EntryList<CREntry> AutresChargesGestion;
    private EntryList<CREntry> AutresProduitsGestion;
    private EntryList<CREntry> produitsFinanciers;
    private EntryList<CREntry> chargesFinancieres;
    private EntryList<CREntry> produitsExceptionnels;
    private EntryList<CREntry> chargesExceptionnelles;
    private double impotBenefices;

    public double getVolumeActivite ()
    {
        return chiffreAffaire + travauxInit + travauxFinaux;
    }

    public double getTotChargesFixes ()
    {
        return chargesFixes.getTotalAmount ();
    }

    public double getTotChargesVariables ()
    {
        return chargesVariables.getTotalAmount ();
    }

    public double getTotStocks ()
    {
        return stocks.getTotalAmount ();
    }

    public double getTotAchatsConsommes ()
    {
        return achatsConsommes.getTotalAmount ();
    }

    public double getMargeBrute ()
    {
        return getVolumeActivite () - getTotChargesFixes () - getTotChargesVariables () + getTotStocks () - getTotAchatsConsommes ();
    }

    public double getTotAchatsNonStockables ()
    {
        return achatsNonStockables.getTotalAmount ();
    }

    public double getTotServicesExterieurs ()
    {
        return servicesExterieurs.getTotalAmount ();
    }

    public double getTotValeurAjoutee ()
    {
        return getMargeBrute () - getTotAchatsNonStockables () - getTotServicesExterieurs ();
    }

    public double getTotImpotsEtTaxes ()
    {
        return impotsEtTaxes.getTotalAmount ();
    }

    public double getTotChargesDePersonnel ()
    {
        return chargesDePersonnels.getTotalAmount ();
    }

    public double getTotCotisationsPersonnelles ()
    {
        return cotisationsPersonnelles.getTotalAmount ();
    }

    public double getTotExcedentBrutExploitation ()
    {
        return getTotValeurAjoutee () - (getTotImpotsEtTaxes () + getTotChargesDePersonnel () + getTotCotisationsPersonnelles ());
    }

    public double getTotDotationAmortissements ()
    {
        return DotationAmortissements.getTotalAmount ();
    }

    public double getTotAutresChargesGestion ()
    {
        return AutresChargesGestion.getTotalAmount ();
    }

    public double getTotAutresProduitsGestion ()
    {
        return AutresProduitsGestion.getTotalAmount ();
    }

    public double getTotResultatExploitation ()
    {
        return getTotExcedentBrutExploitation () + getTotDotationAmortissements () - getTotAutresChargesGestion () + getTotAutresProduitsGestion ();
    }

    public double getTotProduitsFinanciers ()
    {
        return produitsFinanciers.getTotalAmount ();
    }

    public double getTotChargesFinancieres ()
    {
        return chargesFinancieres.getTotalAmount ();
    }

    public double getTotResultatFinancier ()
    {
        return getTotProduitsFinanciers () + getTotChargesFinancieres ();
    }

    public double getTotResultatCourant ()
    {
        return getTotResultatExploitation () + getTotResultatFinancier ();
    }

    public double getTotProduitsExceptionnels ()
    {
        return produitsExceptionnels.getTotalAmount ();
    }

    public double getTotChargesExceptionnelles ()
    {
        return chargesExceptionnelles.getTotalAmount ();
    }

    public double getTotResultatExceptionnel ()
    {
        return getTotProduitsExceptionnels () - getTotChargesExceptionnelles ();
    }

    public double getTotResultatCourantAvantImpot ()
    {
        return getTotResultatCourant () + getTotResultatExceptionnel ();
    }

    public double getTotImpotBenefices ()
    {
        return Math.max (0, getTotResultatCourantAvantImpot () * impotBenefices);
    }

    public double getTotResultatNet ()
    {
        return getTotResultatCourantAvantImpot () - getTotImpotBenefices ();
    }

    public double getChiffreAffaire ()
    {
        return chiffreAffaire;
    }

    public void setChiffreAffaire (double chiffreAffaire)
    {
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getTravauxInit ()
    {
        return travauxInit;
    }

    public void setTravauxInit (double travauxInit)
    {
        this.travauxInit = travauxInit;
    }

    public double getTravauxFinaux ()
    {
        return travauxFinaux;
    }

    public void setTravauxFinaux (double travauxFinaux)
    {
        this.travauxFinaux = travauxFinaux;
    }

    public EntryList<CREntry> getChargesFixes ()
    {
        return chargesFixes;
    }

    public void setChargesFixes (EntryList<CREntry> chargesFixes)
    {
        this.chargesFixes = chargesFixes;
    }

    public EntryList<CREntry> getChargesVariables ()
    {
        return chargesVariables;
    }

    public void setChargesVariables (EntryList<CREntry> chargesVariables)
    {
        this.chargesVariables = chargesVariables;
    }

    public EntryList<StockEntry> getStocks ()
    {
        return stocks;
    }

    public void setStocks (EntryList<StockEntry> stocks)
    {
        this.stocks = stocks;
    }

    public EntryList<CREntry> getAchatsConsommes ()
    {
        return achatsConsommes;
    }

    public void setAchatsConsommes (EntryList<CREntry> achatsConsommes)
    {
        this.achatsConsommes = achatsConsommes;
    }

    public EntryList<CREntry> getAchatsNonStockables ()
    {
        return achatsNonStockables;
    }

    public void setAchatsNonStockables (EntryList<CREntry> achatsNonStockables)
    {
        this.achatsNonStockables = achatsNonStockables;
    }

    public EntryList<CREntry> getServicesExterieurs ()
    {
        return servicesExterieurs;
    }

    public void setServicesExterieurs (EntryList<CREntry> servicesExterieurs)
    {
        this.servicesExterieurs = servicesExterieurs;
    }

    public EntryList<CREntry> getImpotsEtTaxes ()
    {
        return impotsEtTaxes;
    }

    public void setImpotsEtTaxes (EntryList<CREntry> impotsEtTaxes)
    {
        this.impotsEtTaxes = impotsEtTaxes;
    }

    public EntryList<CREntry> getChargesDePersonnels ()
    {
        return chargesDePersonnels;
    }

    public void setChargesDePersonnels (EntryList<CREntry> chargesDePersonnels)
    {
        this.chargesDePersonnels = chargesDePersonnels;
    }

    public EntryList<CREntry> getCotisationsPersonnelles ()
    {
        return cotisationsPersonnelles;
    }

    public void setCotisationsPersonnelles (EntryList<CREntry> cotisationsPersonnelles)
    {
        this.cotisationsPersonnelles = cotisationsPersonnelles;
    }

    public EntryList<CREntry> getDotationAmortissements ()
    {
        return DotationAmortissements;
    }

    public void setDotationAmortissements (EntryList<CREntry> DotationAmortissements)
    {
        this.DotationAmortissements = DotationAmortissements;
    }

    public EntryList<CREntry> getAutresChargesGestion ()
    {
        return AutresChargesGestion;
    }

    public void setAutresChargesGestion (EntryList<CREntry> AutresChargesGestion)
    {
        this.AutresChargesGestion = AutresChargesGestion;
    }

    public EntryList<CREntry> getAutresProduitsGestion ()
    {
        return AutresProduitsGestion;
    }

    public void setAutresProduitsGestion (EntryList<CREntry> AutresProduitsGestion)
    {
        this.AutresProduitsGestion = AutresProduitsGestion;
    }

    public EntryList<CREntry> getProduitsFinanciers ()
    {
        return produitsFinanciers;
    }

    public void setProduitsFinanciers (EntryList<CREntry> produitsFinanciers)
    {
        this.produitsFinanciers = produitsFinanciers;
    }

    public EntryList<CREntry> getChargesFinancieres ()
    {
        return chargesFinancieres;
    }

    public void setChargesFinancieres (EntryList<CREntry> chargesFinancieres)
    {
        this.chargesFinancieres = chargesFinancieres;
    }

    public EntryList<CREntry> getProduitsExceptionnels ()
    {
        return produitsExceptionnels;
    }

    public void setProduitsExceptionnels (EntryList<CREntry> produitsExceptionnels)
    {
        this.produitsExceptionnels = produitsExceptionnels;
    }

    public EntryList<CREntry> getChargesExceptionnelles ()
    {
        return chargesExceptionnelles;
    }

    public void setChargesExceptionnelles (EntryList<CREntry> chargesExceptionnelles)
    {
        this.chargesExceptionnelles = chargesExceptionnelles;
    }

    public double getImpotBenefices ()
    {
        return impotBenefices;
    }

    public void setImpotBenefices (double impotBenefices)
    {
        this.impotBenefices = impotBenefices;
    }
}
