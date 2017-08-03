package com.vanniktech.emoji.twitter;

import android.support.annotation.NonNull;
import com.vanniktech.emoji.EmojiProvider;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.twitter.category.ActivityCategory;
import com.vanniktech.emoji.twitter.category.FoodCategory;
import com.vanniktech.emoji.twitter.category.NatureCategory;
import com.vanniktech.emoji.twitter.category.PeopleCategory;

public final class TwitterEmojiProvider implements EmojiProvider {
  @Override @NonNull public EmojiCategory[] getCategories() {
    return new EmojiCategory[] {
      new PeopleCategory(),
      new NatureCategory(),
      new FoodCategory(),
      new ActivityCategory(),
    };
  }
}
