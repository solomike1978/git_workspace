package com.wandoujia.image;

import java.util.concurrent.FutureTask;

final class o extends s
{
  private final String e;
  private FutureTask f;

  o(b paramb, String paramString, u paramu)
  {
    super(paramu, 0, 0);
    this.e = paramString;
  }

  final void a()
  {
    this.f = new FutureTask(new p(this));
    b.h(this.a).a(this.f);
  }

  final void b()
  {
    if (this.f != null)
    {
      this.f.cancel(true);
      b.h(this.a).b(this.f);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.o
 * JD-Core Version:    0.6.0
 */