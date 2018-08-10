/*
 * Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.schemaorg.core.datatype;

import com.google.schemaorg.core.CoreConstants;

/**
 * Represents <a href="http://schema.org/Float">http://schema.org/Float</a>.
 */
public class Float extends Number {
  Float(float value) {
    super(String.valueOf(value));
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.NAMESPACE + "Float";
  }

  public static Float of(float value) {
    return new Float(value);
  }
}
