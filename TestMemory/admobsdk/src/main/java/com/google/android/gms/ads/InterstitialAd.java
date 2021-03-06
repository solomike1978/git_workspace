package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzac;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public final class InterstitialAd
{
  private final zzac zzoL;

  public InterstitialAd(Context context)
  {
    this.zzoL = new zzac(context);
  }

  public AdListener getAdListener()
  {
    return this.zzoL.getAdListener();
  }

  public String getAdUnitId()
  {
    return this.zzoL.getAdUnitId();
  }

  public InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.zzoL.getInAppPurchaseListener();
  }

  public boolean isLoaded()
  {
    return this.zzoL.isLoaded();
  }

  public boolean isLoading()
  {
    return this.zzoL.isLoading();
  }

  @RequiresPermission("android.permission.INTERNET")
  public void loadAd(AdRequest adRequest)
  {
    this.zzoL.zza(adRequest.zzaE());
  }

  public void setAdListener(AdListener adListener)
  {
    this.zzoL.setAdListener(adListener);
    if ((adListener != null) && ((adListener instanceof zza)))
      this.zzoL.zza((zza)adListener);
    else if (adListener == null)
      this.zzoL.zza(null);
  }

  public void setAdUnitId(String adUnitId)
  {
    this.zzoL.setAdUnitId(adUnitId);
  }

  public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener)
  {
    this.zzoL.setInAppPurchaseListener(inAppPurchaseListener);
  }

  public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String publicKey)
  {
    this.zzoL.setPlayStorePurchaseParams(playStorePurchaseListener, publicKey);
  }

  public String getMediationAdapterClassName()
  {
    return this.zzoL.getMediationAdapterClassName();
  }

  public void show()
  {
    this.zzoL.show();
  }

  public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener)
  {
    this.zzoL.setRewardedVideoAdListener(rewardedVideoAdListener);
  }

  public void zzm(String paramString)
  {
    this.zzoL.setUserId(paramString);
  }

  public void zza(boolean paramBoolean)
  {
    this.zzoL.zza(paramBoolean);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.InterstitialAd
 * JD-Core Version:    0.6.0
 */