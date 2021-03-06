/*
 * Copyright (C) 2009-2019 the original author(s).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.jansi;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import org.fusesource.jansi.impl.WindowsSupport;
import org.junit.Test;

public class WindowsSupportTest {

    @Test
    public void testErrorMessage() {
        assumeTrue(AnsiConsole.IS_WINDOWS);
        String msg = WindowsSupport.getErrorMessage(500);
        assertTrue(msg.equals("User profile cannot be loaded.") // en-US
                || msg.equals("Impossible de charger le profil d’utilisateur.") // fr
                );
    }
}
