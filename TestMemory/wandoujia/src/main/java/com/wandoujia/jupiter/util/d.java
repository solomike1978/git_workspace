package com.wandoujia.jupiter.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class d
  implements DialogInterface.OnClickListener
{
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    AutoInstallGuideUtil.a("popup_on_terminated", AutoInstallGuideUtil.DialogAction.CLICK_NEGATIVE);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.d
 * JD-Core Version:    0.6.0
 */