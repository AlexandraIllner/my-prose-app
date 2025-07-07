/*
 * Copyright (C) 2025 Alexandra Weber
 *
 * Except speciﬁc ﬁles which bear a diﬀerent mention, this programme is licensed under the European Union Public License 1.2 (EUPL-1.2) or later
 * See the EUPL-1.2 for more details.
 *
 * SPDX-License-Identifier: EUPL-1.2
 *
 */
package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {

        Sentence s1 = () -> "Haste mal ne Mark?";

        ProseBuilder builder = new ProseBuilder();
        builder.register(s1);
        builder.register(new ExampleSentence());
        String result = builder.get();

        logger.info(result);
    }
}
