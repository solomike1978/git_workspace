package com.google.zxing.qrcode.detector;

import com.google.zxing.f;

public final class d extends f
{
  private final float a;
  private final int b;

  d(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this(paramFloat1, paramFloat2, paramFloat3, 1);
  }

  private d(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    super(paramFloat1, paramFloat2);
    this.a = paramFloat3;
    this.b = paramInt;
  }

  final boolean a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = Math.abs(paramFloat2 - b()) < paramFloat1;
    int i = 0;
    if (!bool1)
    {
      boolean bool2 = Math.abs(paramFloat3 - a()) < paramFloat1;
      i = 0;
      if (!bool2)
      {
        float f = Math.abs(paramFloat1 - this.a);
        if (f > 1.0F)
        {
          boolean bool3 = f < this.a;
          i = 0;
          if (bool3);
        }
        else
        {
          i = 1;
        }
      }
    }
    return i;
  }

  final d b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    int i = 1 + this.b;
    return new d((paramFloat2 + this.b * a()) / i, (paramFloat1 + this.b * b()) / i, (paramFloat3 + this.b * this.a) / i, i);
  }

  public final float c()
  {
    return this.a;
  }

  final int d()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.d
 * JD-Core Version:    0.6.0
 */