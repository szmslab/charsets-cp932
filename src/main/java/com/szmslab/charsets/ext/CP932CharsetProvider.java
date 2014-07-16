/*
 * Copyright (c) 2014 szmslab
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package com.szmslab.charsets.ext;

import sun.nio.cs.AbstractCharsetProvider;

/**
 * CP932の文字セットをMS932として使用できるようにするProviderクラスです。
 *
 * @author szmslab
 */
public class CP932CharsetProvider extends AbstractCharsetProvider {

    /**
     * CP932CharsetProvider自身のインスタンスです。
     */
    static volatile CP932CharsetProvider instance = null;

    /**
     * コンストラクタです。
     */
    public CP932CharsetProvider() {
        super("sun.nio.cs.ext");
        charset("CP932", "MS932", new String[] {"windows-31j", "MS932"});
        instance = this;
    }

    /**
     * エイリアスを返します。
     *
     * @param paramString
     *            文字セット
     * @return 文字セットのエイリアス
     */
    public static String[] aliasesFor(String paramString) {
        if (instance == null) {
            return null;
        }
        return instance.aliases(paramString);
    }

}
