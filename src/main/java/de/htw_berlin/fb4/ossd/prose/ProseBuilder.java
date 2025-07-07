/*
 * Copyright (C) 2025 Alexandra Weber
 *
 * Except speciﬁc ﬁles which bear a diﬀerent mention, this programme is licensed under the European Union Public License 1.2 (EUPL-1.2) or later
 * See the EUPL-1.2 for more details.
 *
 * SPDX-License-Identifier: EUPL-1.2
 *
 */
package de.htw_berlin.fb4.ossd.prose;

import java.util.ArrayList;
import java.util.List;

public class ProseBuilder implements Prose {

    private final List<Sentence> sentences;

    public ProseBuilder(){
        sentences = new ArrayList<>();
    }
    public void register(Sentence sentence){
        sentences.add(sentence);
    }

    public String build(){
        StringBuilder builder = new StringBuilder();
        sentences.forEach(x -> {builder.append(x.get()); builder.append("\n");});
        return builder.toString();
    }

    @Override
    public String get() {
        return build();
    }
}
