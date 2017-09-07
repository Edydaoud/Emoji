package com.googy.emoji;

import android.support.annotation.NonNull;

import com.googy.emoji.provider.EmojiCategory;

/**
 * Interface for a custom emoji implementation that can be used with {@link EmojiManager}.
 *
 * @since 0.4.0
 */
public interface EmojiProvider {
  /**
   * @return The Array of categories.
   * @since 0.4.0
   */
  @NonNull EmojiCategory[] getCategories();
}
