/*
 * Copyright (c) 2014 szmslab
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package com.szmslab.charsets.ext;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sun.nio.cs.ext.MS932;

public class CP932CharsetProviderTest {

    @Test
    public void testCP932CharsetProvider() {
        assertThat(Charset.forName("CP932").getClass().getName(), is(MS932.class.getName()));
        assertThat(Charset.forName("cp932").getClass().getName(), is(MS932.class.getName()));
    }

    @Test
    public void testAliasesFor() {
        List<String> aliases = Arrays.asList(CP932CharsetProvider.aliasesFor("CP932"));
        assertThat(aliases, hasItem("windows-31j"));
        assertThat(aliases, hasItem("MS932"));
    }

}
