/*
 * Copyright 2013 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.v2.api.model;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.nio.file.Paths;

import org.junit.Test;

/**
 * Created. There, you have it.
 */
public class PermissiveURITest
{

    @Test
    public void simple() throws Exception
    {

        URI i = PermissiveURI.create("file:/funk");
        assertEquals("funk", Paths.get(i).toString().substring(1));
    }

    @Test
    public void undone() throws Exception
    {

        URI i = PermissiveURI.create("file:/file important");
        assertEquals("file important", Paths.get(i).toString().substring(1));
    }
}