/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 the "License";
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalawebtest.core

import com.gargoylesoftware.htmlunit.BrowserVersion
import org.scalatest.selenium.{Driver, WebBrowser}

/**
 * Uses a custom web driver implementation that exposes its web client's options. 
 * Also uses a more current browser version than the default HtmlUnit trait.
 */
trait WebClientExposingHtmlUnit extends WebBrowser with Driver {
  override implicit val webDriver = new WebClientExposingDriver(BrowserVersion.CHROME)
}