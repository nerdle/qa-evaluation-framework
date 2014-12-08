/**
 * Copyright 2014 DIMA Research Group, TU Berlin (http://www.dima.tu-berlin.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tu_berlin.dima.stringmetric;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JaccardMetric implements StringSetMetric {

    @Override
    public double compare(List<String> a, List<String> b) {

        Set<String> union = new HashSet<String>(a);
        union.addAll(b);

        Set<String> intersection = new HashSet<String>(a);
        intersection.retainAll(b);

        if (union.size() != 0) {
            return (double) intersection.size() / (double) union.size();
        }

        return 1.0;
    }

}
