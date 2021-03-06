package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@zzhb
public class zzej
  implements zzei
{
  private final zzeh zzBx;
  private final HashSet<AbstractMap.SimpleEntry<String, zzdf>> zzBy;

  public zzej(zzeh paramzzeh)
  {
    this.zzBx = paramzzeh;
    this.zzBy = new HashSet();
  }

  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    this.zzBx.zzb(paramString, paramJSONObject);
  }

  public void zza(String paramString, JSONObject paramJSONObject)
  {
    this.zzBx.zza(paramString, paramJSONObject);
  }

  public void zze(String paramString1, String paramString2)
  {
    this.zzBx.zze(paramString1, paramString2);
  }

  public void zza(String paramString, zzdf paramzzdf)
  {
    this.zzBx.zza(paramString, paramzzdf);
    this.zzBy.add(new AbstractMap.SimpleEntry(paramString, paramzzdf));
  }

  public void zzb(String paramString, zzdf paramzzdf)
  {
    this.zzBx.zzb(paramString, paramzzdf);
    this.zzBy.remove(new AbstractMap.SimpleEntry(paramString, paramzzdf));
  }

  public void zzew()
  {
    Iterator localIterator = this.zzBy.iterator();
    while (localIterator.hasNext())
    {
      AbstractMap.SimpleEntry localSimpleEntry = (AbstractMap.SimpleEntry)localIterator.next();
      zzin.v("Unregistering eventhandler: " + ((zzdf)localSimpleEntry.getValue()).toString());
      this.zzBx.zzb((String)localSimpleEntry.getKey(), (zzdf)localSimpleEntry.getValue());
    }
    this.zzBy.clear();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzej
 * JD-Core Version:    0.6.0
 */