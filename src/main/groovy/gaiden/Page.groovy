/*
 * Copyright 2013 the original author or authors
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

package gaiden

import groovy.transform.CompileStatic

import java.nio.file.Path

/**
 * A holder for a content and the meta information.
 *
 * @author Hideki IGARASHI
 * @author Kazuki YAMAMOTO
 */
@CompileStatic
class Page {

    /** A page source */
    PageSource source

    /** Headers of content */
    List<Header> headers

    /** A output content */
    String content

    /**
     * Returns a relative path from the output directory.
     */
    Path getPath() {
        source.outputPath
    }
}
