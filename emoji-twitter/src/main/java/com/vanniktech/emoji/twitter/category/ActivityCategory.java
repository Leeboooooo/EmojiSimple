package com.vanniktech.emoji.twitter.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.twitter.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class ActivityCategory implements EmojiCategory {
  private static final Emoji[] DATA = new Emoji[] {
    new Emoji(0x26bd, R.drawable.emoji_twitter_26bd),
    new Emoji(0x1f3c0, R.drawable.emoji_twitter_1f3c0),
    new Emoji(0x1f3c8, R.drawable.emoji_twitter_1f3c8),
    new Emoji(0x26be, R.drawable.emoji_twitter_26be),
    new Emoji(0x1f3be, R.drawable.emoji_twitter_1f3be),
    new Emoji(0x1f3d0, R.drawable.emoji_twitter_1f3d0),
    new Emoji(0x1f3c9, R.drawable.emoji_twitter_1f3c9),
    new Emoji(0x1f3b1, R.drawable.emoji_twitter_1f3b1),
    new Emoji(0x1f3d3, R.drawable.emoji_twitter_1f3d3),
    new Emoji(0x1f3f8, R.drawable.emoji_twitter_1f3f8),
    new Emoji(0x1f945, R.drawable.emoji_twitter_1f945),
    new Emoji(0x1f3d2, R.drawable.emoji_twitter_1f3d2),
    new Emoji(0x1f3d1, R.drawable.emoji_twitter_1f3d1),
    new Emoji(0x1f3cf, R.drawable.emoji_twitter_1f3cf),
    new Emoji(0x26f3, R.drawable.emoji_twitter_26f3),
    new Emoji(0x1f3f9, R.drawable.emoji_twitter_1f3f9),
    new Emoji(0x1f3a3, R.drawable.emoji_twitter_1f3a3),
    new Emoji(0x1f94a, R.drawable.emoji_twitter_1f94a),
    new Emoji(0x1f94b, R.drawable.emoji_twitter_1f94b),
    new Emoji(0x26f8, R.drawable.emoji_twitter_26f8),
    new Emoji(0x1f3bf, R.drawable.emoji_twitter_1f3bf),
    new Emoji(0x26f7, R.drawable.emoji_twitter_26f7),

    new Emoji(new int[] { 0x26f9, 0xfe0f, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_twitter_26f9_1f3ff_200d_2640_fe0f),
    new Emoji(0x26f9, R.drawable.emoji_twitter_26f9_1f3ff),
    new Emoji(0x1f3cc, R.drawable.emoji_twitter_1f3cc_1f3ff_200d_2640_fe0f),
    new Emoji(0x1f3cc, R.drawable.emoji_twitter_1f3cc_1f3ff),
    new Emoji(0x1f3bd, R.drawable.emoji_twitter_1f3bd),
    new Emoji(0x1f3c5, R.drawable.emoji_twitter_1f3c5),
    new Emoji(0x1f396, R.drawable.emoji_twitter_1f396),
    new Emoji(0x1f3c6, R.drawable.emoji_twitter_1f3c6),
    new Emoji(0x1f3f5, R.drawable.emoji_twitter_1f3f5),
    new Emoji(0x1f397, R.drawable.emoji_twitter_1f397),
    new Emoji(0x1f3ab, R.drawable.emoji_twitter_1f3ab),
    new Emoji(0x1f39f, R.drawable.emoji_twitter_1f39f),
    new Emoji(0x1f3aa, R.drawable.emoji_twitter_1f3aa),
    new Emoji(0x1f939, R.drawable.emoji_twitter_1f939_1f3ff_200d_2640_fe0f),
    new Emoji(0x1f3ad, R.drawable.emoji_twitter_1f3ad),
    new Emoji(0x1f3a8, R.drawable.emoji_twitter_1f3a8),
    new Emoji(0x1f3ac, R.drawable.emoji_twitter_1f3ac),
    new Emoji(0x1f3a4, R.drawable.emoji_twitter_1f3a4),
    new Emoji(0x1f3a7, R.drawable.emoji_twitter_1f3a7),
    new Emoji(0x1f3bc, R.drawable.emoji_twitter_1f3bc),
    new Emoji(0x1f3b9, R.drawable.emoji_twitter_1f3b9),
    new Emoji(0x1f941, R.drawable.emoji_twitter_1f941),
    new Emoji(0x1f3b7, R.drawable.emoji_twitter_1f3b7),
    new Emoji(0x1f3ba, R.drawable.emoji_twitter_1f3ba),
    new Emoji(0x1f3b8, R.drawable.emoji_twitter_1f3b8),
    new Emoji(0x1f3bb, R.drawable.emoji_twitter_1f3bb),
    new Emoji(0x1f3b2, R.drawable.emoji_twitter_1f3b2),
    new Emoji(0x1f3af, R.drawable.emoji_twitter_1f3af),
    new Emoji(0x1f3b3, R.drawable.emoji_twitter_1f3b3),
    new Emoji(0x1f3ae, R.drawable.emoji_twitter_1f3ae),
    new Emoji(0x1f3b0, R.drawable.emoji_twitter_1f3b0)
  };

  @Override @NonNull public Emoji[] getEmojis() {
    return DATA;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_twitter_category_activity;
  }
}
