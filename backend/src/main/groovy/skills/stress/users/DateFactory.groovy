/**
 * Copyright 2020 SkillTree
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package skills.stress.users

import callStack.profiler.Profile
import groovy.time.TimeCategory

class DateFactory {

    int numDates = 365

    Random r = new Random()
    @Profile
    Date getDate(){
        int ranNum = r.nextInt(numDates)
        use (TimeCategory) {
            return ranNum.days.ago
        }
    }
}
