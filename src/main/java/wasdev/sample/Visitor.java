/*
 * Copyright IBM Corp. 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wasdev.sample;

/**
 * Represents a Visitor document stored in Cloudant.
 */

public class Visitor {
	private String _id;
	private String _rev;
	private String name = null;

	public Visitor() {
		this.name = "";
	}


	public String get_id() {
		return _id;
	}

	
	public void set_id(String _id) {
		this._id = _id;
	}

	
	public String get_rev() {
		return _rev;
	}

	
	public void set_rev(String _rev) {
		this._rev = _rev;
	}
	
	
	public String getName() {
		return name;
	}

	
	public void setName(String visitorName) {
		this.name = visitorName;
	}

}