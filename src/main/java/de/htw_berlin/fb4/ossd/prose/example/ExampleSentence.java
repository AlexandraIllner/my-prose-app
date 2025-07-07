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

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class ExampleSentence implements Sentence {
    @Override
    public String get() {
        return "Es steckt oft mehr Geist und Scharfsinn in einem Irrtum als in einer Entdeckung."; // (Joseph Joubert);
    }
}
