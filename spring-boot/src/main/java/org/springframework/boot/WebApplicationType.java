/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot;

/**
 * An enumeration of possible types of web application.
 *
 * @author Andy Wilkinson
 * @author Brian Clozel
 * @since 2.0.0
 */
public enum WebApplicationType {

	/**
	 * The application should not run as a web application and should not start an
	 * embedded web container.
	 * 非web应用，不用web容器启动
	 */
	NONE,

	/**
	 * The application should run as a servlet-based web application and should start an
	 * embedded servlet container.
	 * servlet Web应用,需要servlet容器启动
	 */
	SERVLET,

	/**
	 * The application should run as a reactive web application and should start
	 * an embedded web container.
	 * 响应式web应用
	 * reactive web应用，需要web容器启动
	 */
	REACTIVE;


}
