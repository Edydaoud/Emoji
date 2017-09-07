package com.googy.emoji.provider.ios;

import android.support.annotation.NonNull;

import com.googy.emoji.EmojiProvider;
import com.googy.emoji.provider.EmojiCategory;
import com.googy.emoji.provider.ios.category.ActivityCategory;
import com.googy.emoji.provider.ios.category.FlagsCategory;
import com.googy.emoji.provider.ios.category.FoodCategory;
import com.googy.emoji.provider.ios.category.NatureCategory;
import com.googy.emoji.provider.ios.category.ObjectsCategory;
import com.googy.emoji.provider.ios.category.PeopleCategory;
import com.googy.emoji.provider.ios.category.SymbolsCategory;
import com.googy.emoji.provider.ios.category.TravelCategory;

public final class IosEmojiProvider implements EmojiProvider {
    @Override
    @NonNull
    public EmojiCategory[] getCategories() {
        return new EmojiCategory[]{
                new PeopleCategory(),
                new NatureCategory(),
                new FoodCategory(),
                new ActivityCategory(),
                new TravelCategory(),
                new ObjectsCategory(),
                new SymbolsCategory(),
                new FlagsCategory()
        };
    }
}
