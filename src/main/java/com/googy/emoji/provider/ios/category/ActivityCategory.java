package com.googy.emoji.provider.ios.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.googy.emoji.R;
import com.googy.emoji.provider.Emoji;
import com.googy.emoji.provider.EmojiCategory;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
public final class ActivityCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            new Emoji(0x26bd, R.drawable.emoji_ios_26bd),
            new Emoji(0x1f3c0, R.drawable.emoji_ios_1f3c0),
            new Emoji(0x1f3c8, R.drawable.emoji_ios_1f3c8),
            new Emoji(0x26be, R.drawable.emoji_ios_26be),
            new Emoji(0x1f3be, R.drawable.emoji_ios_1f3be),
            new Emoji(0x1f3d0, R.drawable.emoji_ios_1f3d0),
            new Emoji(0x1f3c9, R.drawable.emoji_ios_1f3c9),
            new Emoji(0x1f3b1, R.drawable.emoji_ios_1f3b1),
            new Emoji(0x1f3d3, R.drawable.emoji_ios_1f3d3),
            new Emoji(0x1f3f8, R.drawable.emoji_ios_1f3f8),
            new Emoji(0x1f945, R.drawable.emoji_ios_1f945),
            new Emoji(0x1f3d2, R.drawable.emoji_ios_1f3d2),
            new Emoji(0x1f3d1, R.drawable.emoji_ios_1f3d1),
            new Emoji(0x1f3cf, R.drawable.emoji_ios_1f3cf),
            new Emoji(0x26f3, R.drawable.emoji_ios_26f3),
            new Emoji(0x1f3f9, R.drawable.emoji_ios_1f3f9),
            new Emoji(0x1f3a3, R.drawable.emoji_ios_1f3a3),
            new Emoji(0x1f94a, R.drawable.emoji_ios_1f94a),
            new Emoji(0x1f94b, R.drawable.emoji_ios_1f94b),
            new Emoji(0x26f8, R.drawable.emoji_ios_26f8),
            new Emoji(0x1f3bf, R.drawable.emoji_ios_1f3bf),
            new Emoji(0x26f7, R.drawable.emoji_ios_26f7),
            new Emoji(0x1f3c2, R.drawable.emoji_ios_1f3c2),
            new Emoji(new int[]{0x1f3cb, 0xfe0f, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cb_fe0f_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f3cb, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cb_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3cb, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cb_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3cb, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cb_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3cb, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cb_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3cb, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cb_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(0x1f3cb, R.drawable.emoji_ios_1f3cb,
                    new Emoji(new int[]{0x1f3cb, 0x1f3fb}, R.drawable.emoji_ios_1f3cb_1f3fb),
                    new Emoji(new int[]{0x1f3cb, 0x1f3fc}, R.drawable.emoji_ios_1f3cb_1f3fc),
                    new Emoji(new int[]{0x1f3cb, 0x1f3fd}, R.drawable.emoji_ios_1f3cb_1f3fd),
                    new Emoji(new int[]{0x1f3cb, 0x1f3fe}, R.drawable.emoji_ios_1f3cb_1f3fe),
                    new Emoji(new int[]{0x1f3cb, 0x1f3ff}, R.drawable.emoji_ios_1f3cb_1f3ff)
            ),
            new Emoji(0x1f93a, R.drawable.emoji_ios_1f93a),
            new Emoji(new int[]{0x1f93c, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93c_200d_2640_fe0f),
            new Emoji(new int[]{0x1f93c, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93c_200d_2642_fe0f),
            new Emoji(new int[]{0x1f938, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f938_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f938, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f938, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f938, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f938, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f938, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(new int[]{0x1f938, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f938_200d_2642_fe0f,
                    new Emoji(new int[]{0x1f938, 0x1f3fb, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3fb_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f938, 0x1f3fc, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3fc_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f938, 0x1f3fd, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3fd_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f938, 0x1f3fe, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3fe_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f938, 0x1f3ff, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f938_1f3ff_200d_2642_fe0f)
            ),
            new Emoji(new int[]{0x26f9, 0xfe0f, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_26f9_fe0f_200d_2640_fe0f,
                    new Emoji(new int[]{0x26f9, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_26f9_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x26f9, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_26f9_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x26f9, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_26f9_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x26f9, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_26f9_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x26f9, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_26f9_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(0x26f9, R.drawable.emoji_ios_26f9,
                    new Emoji(new int[]{0x26f9, 0x1f3fb}, R.drawable.emoji_ios_26f9_1f3fb),
                    new Emoji(new int[]{0x26f9, 0x1f3fc}, R.drawable.emoji_ios_26f9_1f3fc),
                    new Emoji(new int[]{0x26f9, 0x1f3fd}, R.drawable.emoji_ios_26f9_1f3fd),
                    new Emoji(new int[]{0x26f9, 0x1f3fe}, R.drawable.emoji_ios_26f9_1f3fe),
                    new Emoji(new int[]{0x26f9, 0x1f3ff}, R.drawable.emoji_ios_26f9_1f3ff)
            ),
            new Emoji(new int[]{0x1f93e, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93e_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f93e, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f93e, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f93e, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f93e, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f93e, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(new int[]{0x1f93e, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93e_200d_2642_fe0f,
                    new Emoji(new int[]{0x1f93e, 0x1f3fb, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3fb_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f93e, 0x1f3fc, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3fc_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f93e, 0x1f3fd, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3fd_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f93e, 0x1f3fe, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3fe_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f93e, 0x1f3ff, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93e_1f3ff_200d_2642_fe0f)
            ),
            new Emoji(new int[]{0x1f3cc, 0xfe0f, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cc_fe0f_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f3cc, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cc_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3cc, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cc_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3cc, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cc_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3cc, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cc_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3cc, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3cc_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(0x1f3cc, R.drawable.emoji_ios_1f3cc,
                    new Emoji(new int[]{0x1f3cc, 0x1f3fb}, R.drawable.emoji_ios_1f3cc_1f3fb),
                    new Emoji(new int[]{0x1f3cc, 0x1f3fc}, R.drawable.emoji_ios_1f3cc_1f3fc),
                    new Emoji(new int[]{0x1f3cc, 0x1f3fd}, R.drawable.emoji_ios_1f3cc_1f3fd),
                    new Emoji(new int[]{0x1f3cc, 0x1f3fe}, R.drawable.emoji_ios_1f3cc_1f3fe),
                    new Emoji(new int[]{0x1f3cc, 0x1f3ff}, R.drawable.emoji_ios_1f3cc_1f3ff)
            ),
            new Emoji(new int[]{0x1f3c4, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3c4_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f3c4, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3c4_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3c4, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3c4_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3c4, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3c4_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3c4, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3c4_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3c4, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3c4_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(0x1f3c4, R.drawable.emoji_ios_1f3c4,
                    new Emoji(new int[]{0x1f3c4, 0x1f3fb}, R.drawable.emoji_ios_1f3c4_1f3fb),
                    new Emoji(new int[]{0x1f3c4, 0x1f3fc}, R.drawable.emoji_ios_1f3c4_1f3fc),
                    new Emoji(new int[]{0x1f3c4, 0x1f3fd}, R.drawable.emoji_ios_1f3c4_1f3fd),
                    new Emoji(new int[]{0x1f3c4, 0x1f3fe}, R.drawable.emoji_ios_1f3c4_1f3fe),
                    new Emoji(new int[]{0x1f3c4, 0x1f3ff}, R.drawable.emoji_ios_1f3c4_1f3ff)
            ),
            new Emoji(new int[]{0x1f3ca, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3ca_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f3ca, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3ca_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3ca, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3ca_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3ca, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3ca_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3ca, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3ca_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f3ca, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f3ca_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(0x1f3ca, R.drawable.emoji_ios_1f3ca,
                    new Emoji(new int[]{0x1f3ca, 0x1f3fb}, R.drawable.emoji_ios_1f3ca_1f3fb),
                    new Emoji(new int[]{0x1f3ca, 0x1f3fc}, R.drawable.emoji_ios_1f3ca_1f3fc),
                    new Emoji(new int[]{0x1f3ca, 0x1f3fd}, R.drawable.emoji_ios_1f3ca_1f3fd),
                    new Emoji(new int[]{0x1f3ca, 0x1f3fe}, R.drawable.emoji_ios_1f3ca_1f3fe),
                    new Emoji(new int[]{0x1f3ca, 0x1f3ff}, R.drawable.emoji_ios_1f3ca_1f3ff)
            ),
            new Emoji(new int[]{0x1f93d, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93d_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f93d, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f93d, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f93d, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f93d, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f93d, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(new int[]{0x1f93d, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93d_200d_2642_fe0f,
                    new Emoji(new int[]{0x1f93d, 0x1f3fb, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3fb_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f93d, 0x1f3fc, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3fc_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f93d, 0x1f3fd, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3fd_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f93d, 0x1f3fe, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3fe_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f93d, 0x1f3ff, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f93d_1f3ff_200d_2642_fe0f)
            ),
            new Emoji(new int[]{0x1f6a3, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6a3_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f6a3, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6a3_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6a3, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6a3_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6a3, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6a3_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6a3, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6a3_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6a3, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6a3_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(0x1f6a3, R.drawable.emoji_ios_1f6a3,
                    new Emoji(new int[]{0x1f6a3, 0x1f3fb}, R.drawable.emoji_ios_1f6a3_1f3fb),
                    new Emoji(new int[]{0x1f6a3, 0x1f3fc}, R.drawable.emoji_ios_1f6a3_1f3fc),
                    new Emoji(new int[]{0x1f6a3, 0x1f3fd}, R.drawable.emoji_ios_1f6a3_1f3fd),
                    new Emoji(new int[]{0x1f6a3, 0x1f3fe}, R.drawable.emoji_ios_1f6a3_1f3fe),
                    new Emoji(new int[]{0x1f6a3, 0x1f3ff}, R.drawable.emoji_ios_1f6a3_1f3ff)
            ),
            new Emoji(0x1f3c7, R.drawable.emoji_ios_1f3c7,
                    new Emoji(new int[]{0x1f3c7, 0x1f3fb}, R.drawable.emoji_ios_1f3c7_1f3fb),
                    new Emoji(new int[]{0x1f3c7, 0x1f3fc}, R.drawable.emoji_ios_1f3c7_1f3fc),
                    new Emoji(new int[]{0x1f3c7, 0x1f3fd}, R.drawable.emoji_ios_1f3c7_1f3fd),
                    new Emoji(new int[]{0x1f3c7, 0x1f3fe}, R.drawable.emoji_ios_1f3c7_1f3fe),
                    new Emoji(new int[]{0x1f3c7, 0x1f3ff}, R.drawable.emoji_ios_1f3c7_1f3ff)
            ),
            new Emoji(new int[]{0x1f6b4, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b4_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f6b4, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b4_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6b4, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b4_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6b4, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b4_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6b4, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b4_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6b4, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b4_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(0x1f6b4, R.drawable.emoji_ios_1f6b4,
                    new Emoji(new int[]{0x1f6b4, 0x1f3fb}, R.drawable.emoji_ios_1f6b4_1f3fb),
                    new Emoji(new int[]{0x1f6b4, 0x1f3fc}, R.drawable.emoji_ios_1f6b4_1f3fc),
                    new Emoji(new int[]{0x1f6b4, 0x1f3fd}, R.drawable.emoji_ios_1f6b4_1f3fd),
                    new Emoji(new int[]{0x1f6b4, 0x1f3fe}, R.drawable.emoji_ios_1f6b4_1f3fe),
                    new Emoji(new int[]{0x1f6b4, 0x1f3ff}, R.drawable.emoji_ios_1f6b4_1f3ff)
            ),
            new Emoji(new int[]{0x1f6b5, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b5_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f6b5, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b5_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6b5, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b5_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6b5, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b5_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6b5, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b5_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f6b5, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f6b5_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(0x1f6b5, R.drawable.emoji_ios_1f6b5,
                    new Emoji(new int[]{0x1f6b5, 0x1f3fb}, R.drawable.emoji_ios_1f6b5_1f3fb),
                    new Emoji(new int[]{0x1f6b5, 0x1f3fc}, R.drawable.emoji_ios_1f6b5_1f3fc),
                    new Emoji(new int[]{0x1f6b5, 0x1f3fd}, R.drawable.emoji_ios_1f6b5_1f3fd),
                    new Emoji(new int[]{0x1f6b5, 0x1f3fe}, R.drawable.emoji_ios_1f6b5_1f3fe),
                    new Emoji(new int[]{0x1f6b5, 0x1f3ff}, R.drawable.emoji_ios_1f6b5_1f3ff)
            ),
            new Emoji(0x1f3bd, R.drawable.emoji_ios_1f3bd),
            new Emoji(0x1f3c5, R.drawable.emoji_ios_1f3c5),
            new Emoji(0x1f396, R.drawable.emoji_ios_1f396),
            new Emoji(0x1f947, R.drawable.emoji_ios_1f947),
            new Emoji(0x1f948, R.drawable.emoji_ios_1f948),
            new Emoji(0x1f949, R.drawable.emoji_ios_1f949),
            new Emoji(0x1f3c6, R.drawable.emoji_ios_1f3c6),
            new Emoji(0x1f3f5, R.drawable.emoji_ios_1f3f5),
            new Emoji(0x1f397, R.drawable.emoji_ios_1f397),
            new Emoji(0x1f3ab, R.drawable.emoji_ios_1f3ab),
            new Emoji(0x1f39f, R.drawable.emoji_ios_1f39f),
            new Emoji(0x1f3aa, R.drawable.emoji_ios_1f3aa),
            new Emoji(new int[]{0x1f939, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f939_200d_2640_fe0f,
                    new Emoji(new int[]{0x1f939, 0x1f3fb, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3fb_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f939, 0x1f3fc, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3fc_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f939, 0x1f3fd, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3fd_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f939, 0x1f3fe, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3fe_200d_2640_fe0f),
                    new Emoji(new int[]{0x1f939, 0x1f3ff, 0x200d, 0x2640, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3ff_200d_2640_fe0f)
            ),
            new Emoji(new int[]{0x1f939, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f939_200d_2642_fe0f,
                    new Emoji(new int[]{0x1f939, 0x1f3fb, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3fb_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f939, 0x1f3fc, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3fc_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f939, 0x1f3fd, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3fd_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f939, 0x1f3fe, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3fe_200d_2642_fe0f),
                    new Emoji(new int[]{0x1f939, 0x1f3ff, 0x200d, 0x2642, 0xfe0f}, R.drawable.emoji_ios_1f939_1f3ff_200d_2642_fe0f)
            ),
            new Emoji(0x1f3ad, R.drawable.emoji_ios_1f3ad),
            new Emoji(0x1f3a8, R.drawable.emoji_ios_1f3a8),
            new Emoji(0x1f3ac, R.drawable.emoji_ios_1f3ac),
            new Emoji(0x1f3a4, R.drawable.emoji_ios_1f3a4),
            new Emoji(0x1f3a7, R.drawable.emoji_ios_1f3a7),
            new Emoji(0x1f3bc, R.drawable.emoji_ios_1f3bc),
            new Emoji(0x1f3b9, R.drawable.emoji_ios_1f3b9),
            new Emoji(0x1f941, R.drawable.emoji_ios_1f941),
            new Emoji(0x1f3b7, R.drawable.emoji_ios_1f3b7),
            new Emoji(0x1f3ba, R.drawable.emoji_ios_1f3ba),
            new Emoji(0x1f3b8, R.drawable.emoji_ios_1f3b8),
            new Emoji(0x1f3bb, R.drawable.emoji_ios_1f3bb),
            new Emoji(0x1f3b2, R.drawable.emoji_ios_1f3b2),
            new Emoji(0x1f3af, R.drawable.emoji_ios_1f3af),
            new Emoji(0x1f3b3, R.drawable.emoji_ios_1f3b3),
            new Emoji(0x1f3ae, R.drawable.emoji_ios_1f3ae),
            new Emoji(0x1f3b0, R.drawable.emoji_ios_1f3b0)
    };

    @Override
    @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.emoji_ios_category_activity;
    }
}
