package com.googy.emoji.listeners;

import android.support.annotation.NonNull;
import com.googy.emoji.EmojiImageView;
import com.googy.emoji.provider.Emoji;

public interface OnEmojiLongClickListener {
  void onEmojiLongClick(@NonNull EmojiImageView view, @NonNull Emoji emoji);
}
