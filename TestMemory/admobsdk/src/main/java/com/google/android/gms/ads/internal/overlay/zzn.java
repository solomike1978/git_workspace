package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzjp;

@zzhb
public class zzn extends zzj
{
  @Nullable
  public zzi zza(Context paramContext, zzjp paramzzjp, int paramInt, zzcb paramzzcb, zzbz paramzzbz)
  {
    if (!zzx(paramContext))
      return null;
    return new zzc(paramContext, new zzt(paramContext, paramzzjp.zzhX(), paramzzjp.getRequestId(), paramzzcb, paramzzbz));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzn
 * JD-Core Version:    0.6.0
 */