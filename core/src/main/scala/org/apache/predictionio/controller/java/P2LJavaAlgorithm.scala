/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.predictionio.controller.java

import org.apache.predictionio.controller.P2LAlgorithm

import scala.reflect.ClassTag

/** Base class of a Java parallel-to-local algorithm. Refer to [[P2LAlgorithm]] for documentation.
  *
  * @tparam PD Prepared data class.
  * @tparam M Trained model class.
  * @tparam Q Input query class.
  * @tparam P Output prediction class.
  * @group Algorithm
  */
abstract class P2LJavaAlgorithm[PD, M, Q, P]
  extends P2LAlgorithm[PD, M, Q, P]()(
    ClassTag.AnyRef.asInstanceOf[ClassTag[M]],
    ClassTag.AnyRef.asInstanceOf[ClassTag[Q]])
