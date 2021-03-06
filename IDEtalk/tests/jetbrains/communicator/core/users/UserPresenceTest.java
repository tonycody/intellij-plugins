/*
 * Copyright 2000-2006 JetBrains s.r.o.
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
package jetbrains.communicator.core.users;

import junit.framework.TestCase;

/**
 * @author Kir
 */
public class UserPresenceTest extends TestCase {
  public void testVectorConversion() throws Exception {
    assertVectorConversion(new UserPresence(true));
    assertVectorConversion(new UserPresence(false));
    assertVectorConversion(new UserPresence(PresenceMode.EXTENDED_AWAY));
    assertVectorConversion(new UserPresence(PresenceMode.UNAVAILABLE));
    assertVectorConversion(new UserPresence(PresenceMode.AWAY));
  }

  private void assertVectorConversion(UserPresence presence) {
    UserPresence result = UserPresence.fromVector(presence.toVector());
    assertEquals("Should be equal", presence, result);
  }

  public void testDisplayText() throws Exception {
    assertDisplayText("(online)", new UserPresence(true));
    assertDisplayText("", new UserPresence(false));

    assertDisplayText("(dnd)", new UserPresence(PresenceMode.DND));
    assertDisplayText("(away)", new UserPresence(PresenceMode.AWAY));
    assertDisplayText("(not available)", new UserPresence(PresenceMode.EXTENDED_AWAY));
  }

  private void assertDisplayText(String expected, UserPresence presence) {
    assertEquals(expected, presence.getDisplayText());
  }
}
