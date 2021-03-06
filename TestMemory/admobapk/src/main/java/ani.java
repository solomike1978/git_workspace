import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class ani extends Binder
  implements anh
{
  public ani()
  {
    attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
  }

  public static anh a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof anh)))
      return (anh)localIInterface;
    return new anj(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
      int k = paramParcel1.readInt();
      IBinder localIBinder = paramParcel1.readStrongBinder();
      int m = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (m != 0)
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      a(k, localIBinder, localBundle2);
      paramParcel2.writeNoException();
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
    int i = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    Bundle localBundle1 = null;
    if (j != 0)
      localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
    a(i, localBundle1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ani
 * JD-Core Version:    0.6.0
 */