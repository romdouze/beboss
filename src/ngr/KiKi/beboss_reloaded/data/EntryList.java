/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngr.KiKi.beboss_reloaded.data;

import java.util.List;

/**
 *
 * @author KiKi
 * @param <T>
 */
public abstract class EntryList<T extends Entry>
{

    private List<T> values;

    public List<T> getValues ()
    {
        return values;
    }

    public void setValues (List<T> values)
    {
        this.values = values;
    }

    public double getTotalAmount ()
    {
        return values.stream ().mapToDouble ((entry) -> entry.getAmount ()).sum ();
    }
}
