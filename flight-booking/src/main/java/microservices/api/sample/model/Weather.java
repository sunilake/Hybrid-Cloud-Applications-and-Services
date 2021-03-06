/**
* (C) Copyright IBM Corporation 2016.
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

package microservices.api.sample.model;

import io.swagger.annotations.ApiModelProperty;

public class Weather {
	@ApiModelProperty(required=true)
	private String date;

	@ApiModelProperty(required=true)
	private String city;

	@ApiModelProperty(required=true)
	private String weather;
	
	@ApiModelProperty(required=true)
	private int temperture;

	@ApiModelProperty(required=true)
	private String narrative;

	public Weather() {
		this.narrative = "Weather information is not yet available.";
	}
	
	public Weather(String date, String city, String weather, int temperture, String narrative) {
		this.date = date;
		this.city = city;
		this.weather = weather;
		this.temperture = temperture;
		this.narrative = narrative;
	}

	public String getDate() {
		return date;
	}

	public String getCity() {
		return city;
	}

	public String getWeather() {
		return weather;
	}

	public int getTemperture() {
		return temperture;
	}

	public String getNarrative() {
		return narrative;
	}

}
