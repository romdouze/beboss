/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngr.KiKi.beboss_reloaded.data;

import java.util.List;
import ngr.KiKi.beboss_reloaded.data.Entry.TresorerieEntry;
import ngr.KiKi.beboss_reloaded.data.Entry.VenteEntry;

/**
 *
 * @author KiKi
 */
public class BebossProject
{

    private String ownerLastName;
    private String ownerFirstName;
    private String companyName;
    private String companyStreet;
    private String companyStreet2;
    private String companyCity;
    private String companyCountry;
    private String companyZipCode;

    private CR cr;
    private List<TresorerieEntry> tresorerie;
    private List<VenteEntry> vente;

    public CR getCr ()
    {
        return cr;
    }

    public void setCr (CR cr)
    {
        this.cr = cr;
    }

    public List<TresorerieEntry> getTresorerie ()
    {
        return tresorerie;
    }

    public void setTresorerie (List<TresorerieEntry> tresorerie)
    {
        this.tresorerie = tresorerie;
    }

    public List<VenteEntry> getVente ()
    {
        return vente;
    }

    public void setVente (List<VenteEntry> vente)
    {
        this.vente = vente;
    }

    public String getOwnerLastName ()
    {
        return ownerLastName;
    }

    public void setOwnerLastName (String ownerLastName)
    {
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerFirstName ()
    {
        return ownerFirstName;
    }

    public void setOwnerFirstName (String ownerFirstName)
    {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerName ()
    {
        return ownerFirstName + " " + ownerLastName;
    }

    public String getCompanyName ()
    {
        return companyName;
    }

    public void setCompanyName (String companyName)
    {
        this.companyName = companyName;
    }

    public String getCompanyStreet ()
    {
        return companyStreet;
    }

    public void setCompanyStreet (String companyStreet)
    {
        this.companyStreet = companyStreet;
    }

    public String getCompanyStreet2 ()
    {
        return companyStreet2;
    }

    public void setCompanyStreet2 (String companyStreet2)
    {
        this.companyStreet2 = companyStreet2;
    }

    public String getCompanyCity ()
    {
        return companyCity;
    }

    public void setCompanyCity (String companyCity)
    {
        this.companyCity = companyCity;
    }

    public String getCompanyCountry ()
    {
        return companyCountry;
    }

    public void setCompanyCountry (String companyCountry)
    {
        this.companyCountry = companyCountry;
    }

    public String getCompanyZipCode ()
    {
        return companyZipCode;
    }

    public void setCompanyZipCode (String companyZipCode)
    {
        this.companyZipCode = companyZipCode;
    }
}
