package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.e.a;

public final class MediaMetadataCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
  private static final a<String, Integer> a;
  private final Bundle b;

  static
  {
    a locala = new a();
    a = locala;
    locala.put("android.media.metadata.TITLE", Integer.valueOf(1));
    a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
    a.put("android.media.metadata.DURATION", Integer.valueOf(0));
    a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
    a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
    a.put("android.media.metadata.WRITER", Integer.valueOf(1));
    a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
    a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
    a.put("android.media.metadata.DATE", Integer.valueOf(1));
    a.put("android.media.metadata.YEAR", Integer.valueOf(0));
    a.put("android.media.metadata.GENRE", Integer.valueOf(1));
    a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
    a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
    a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
    a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
    a.put("android.media.metadata.ART", Integer.valueOf(2));
    a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
    a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
    a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
    a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
    a.put("android.media.metadata.RATING", Integer.valueOf(3));
    a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
    a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
    a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
    a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
    a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
    a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
    new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
    new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
    new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
    CREATOR = new c();
  }

  private MediaMetadataCompat(Parcel paramParcel)
  {
    this.b = paramParcel.readBundle();
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.MediaMetadataCompat
 * JD-Core Version:    0.6.0
 */