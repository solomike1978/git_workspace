package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;

public class zzah extends zzu.zza
{
  private zzq zzpK;

  public com.google.android.gms.dynamic.zzd zzaM()
  {
    return null;
  }

  public void destroy()
  {
  }

  public boolean isReady()
  {
    return false;
  }

  public boolean zzb(AdRequestParcel paramAdRequestParcel)
  {
    zzb.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    zza.zzMS.post(new Runnable()
    {
      public void run()
      {
        if (zzah.zza(zzah.this) != null)
          try
          {
            zzah.zza(zzah.this).onAdFailedToLoad(1);
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not notify onAdFailedToLoad event.", localRemoteException);
          }
      }
    });
    return false;
  }

  public void pause()
  {
  }

  public void resume()
  {
  }

  public void zza(zzq paramzzq)
  {
    this.zzpK = paramzzq;
  }

  public void zza(zzw paramzzw)
  {
  }

  public void showInterstitial()
  {
  }

  public void stopLoading()
  {
  }

  public void zzaP()
  {
  }

  public AdSizeParcel zzaN()
  {
    return null;
  }

  public void zza(AdSizeParcel paramAdSizeParcel)
  {
  }

  public void zza(zzgd paramzzgd)
  {
  }

  public void zza(zzgh paramzzgh, String paramString)
  {
  }

  public String getMediationAdapterClassName()
  {
    return null;
  }

  public void zza(zzcf paramzzcf)
  {
  }

  public void zza(zzp paramzzp)
  {
  }

  public void zza(zzx paramzzx)
  {
  }

  public void setManualImpressionsEnabled(boolean enabled)
  {
  }

  public boolean isLoading()
  {
    return false;
  }

  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
  }

  public void setUserId(String userId)
  {
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzah
 * JD-Core Version:    0.6.0
 */