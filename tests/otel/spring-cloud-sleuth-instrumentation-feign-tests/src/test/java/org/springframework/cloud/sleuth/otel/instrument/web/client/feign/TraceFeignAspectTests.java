/*
 * Copyright 2013-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.sleuth.otel.instrument.web.client.feign;

import org.springframework.cloud.sleuth.otel.OtelTestTracing;
import org.springframework.cloud.sleuth.test.TestTracingAware;

/**
 * @author Marcin Grzejszczak
 */
public class TraceFeignAspectTests
		extends org.springframework.cloud.sleuth.instrument.web.client.feign.TraceFeignAspectTests {

	OtelTestTracing testTracing;

	@Override
	public TestTracingAware tracerTest() {
		if (this.testTracing == null) {
			this.testTracing = new OtelTestTracing();
		}
		return this.testTracing;
	}

}
