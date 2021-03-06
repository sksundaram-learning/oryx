/*
 * Copyright (c) 2015, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */

package com.cloudera.oryx.lambda;

import org.junit.Test;

import com.cloudera.oryx.common.OryxTest;

public final class TopicProducerImplTest extends OryxTest {

  @Test
  public void testProducer() {
    String broker = "localhost:1234";
    String topic = "DummyTopic";
    try (TopicProducerImpl<String,String> topicProducer = new TopicProducerImpl<>(broker, topic, true)) {
      assertEquals(broker, topicProducer.getUpdateBroker());
      assertEquals(topic, topicProducer.getTopic());
      //topicProducer.send("foo", "bar");
    }
  }

}
