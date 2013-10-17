/**
 * Copyright (c) 2008 - 2011 10gen, Inc. <http://10gen.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.mongodb;

import org.bson.*;
import org.bson.io.*;

public interface DBEncoder {
    public int writeObject( OutputBuffer buf, BSONObject o );

    /**
     * Encoder should say whether the object should be validated or not.
     * By Validation we mean to inspect the object for <b> _id</b> and
     * also check if the keys contain <b>.</b> and <b>$</b>.
     * if _id is not present and validateObject() is true an {@link org.bson.types.ObjectId} will be auto generated.
     * @return
     */
    public boolean validateObject();
}
