/*******************************************************************************
 * Copyright (c) 2016, 2018 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Roman Grigoriadi
 ******************************************************************************/

package org.eclipse.yasson.internal.serializer;

import org.eclipse.yasson.internal.Marshaller;
import org.eclipse.yasson.internal.model.customization.Customization;

import javax.json.stream.JsonGenerator;
import java.time.Duration;

/**
 * Serializer for {@link Duration} type.
 *
 * @author David Kral
 */
public class DurationTypeSerializer extends AbstractValueTypeSerializer<Duration> {

    /**
     * Creates a new instance.
     *
     * @param customization Model customization.
     */
    public DurationTypeSerializer(Customization customization) {
        super(customization);
    }

    @Override
    protected void serialize(Duration obj, JsonGenerator generator, Marshaller marshaller) {
        generator.write(obj.toString());
    }
}
