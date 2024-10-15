package com.weather.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class WeatherResponse {
    private String cod;
    private int message;
    private int cnt;
    private List<WeatherData> list;

    public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public List<WeatherData> getList() {
		return list;
	}

	public void setList(List<WeatherData> list) {
		this.list = list;
	}

	public static class WeatherData {
        public long getDt() {
			return dt;
		}

		public void setDt(long dt) {
			this.dt = dt;
		}

		public Main getMain() {
			return main;
		}

		public void setMain(Main main) {
			this.main = main;
		}

		public List<Weather> getWeather() {
			return weather;
		}

		public void setWeather(List<Weather> weather) {
			this.weather = weather;
		}

		public Clouds getClouds() {
			return clouds;
		}

		public void setClouds(Clouds clouds) {
			this.clouds = clouds;
		}

		public Wind getWind() {
			return wind;
		}

		public void setWind(Wind wind) {
			this.wind = wind;
		}

		public int getVisibility() {
			return visibility;
		}

		public void setVisibility(int visibility) {
			this.visibility = visibility;
		}

		public double getPop() {
			return pop;
		}

		public void setPop(double pop) {
			this.pop = pop;
		}

		public Sys getSys() {
			return sys;
		}

		public void setSys(Sys sys) {
			this.sys = sys;
		}

		public String getDtTxt() {
			return dtTxt;
		}

		public void setDtTxt(String dtTxt) {
			this.dtTxt = dtTxt;
		}

		private long dt;
        private Main main;
        private List<Weather> weather;
        private Clouds clouds;
        private Wind wind;
        private int visibility;
        private double pop;
        private Sys sys;
        @JsonProperty("dt_txt")
        private String dtTxt;

        // Getters and setters...

        public static class Main {
            private double temp;
            private double feelsLike;
            private double tempMin;
            private double tempMax;
            private int pressure;
            private int seaLevel;
            private int grndLevel;
            private int humidity;
            private double tempKf;
			public double getTemp() {
				return temp;
			}
			public void setTemp(double temp) {
				this.temp = temp;
			}
			public double getFeelsLike() {
				return feelsLike;
			}
			public void setFeelsLike(double feelsLike) {
				this.feelsLike = feelsLike;
			}
			public double getTempMin() {
				return tempMin;
			}
			public void setTempMin(double tempMin) {
				this.tempMin = tempMin;
			}
			public double getTempMax() {
				return tempMax;
			}
			public void setTempMax(double tempMax) {
				this.tempMax = tempMax;
			}
			public int getPressure() {
				return pressure;
			}
			public void setPressure(int pressure) {
				this.pressure = pressure;
			}
			public int getSeaLevel() {
				return seaLevel;
			}
			public void setSeaLevel(int seaLevel) {
				this.seaLevel = seaLevel;
			}
			public int getGrndLevel() {
				return grndLevel;
			}
			public void setGrndLevel(int grndLevel) {
				this.grndLevel = grndLevel;
			}
			public int getHumidity() {
				return humidity;
			}
			public void setHumidity(int humidity) {
				this.humidity = humidity;
			}
			public double getTempKf() {
				return tempKf;
			}
			public void setTempKf(double tempKf) {
				this.tempKf = tempKf;
			}

            // Getters and setters...
        }

        public static class Weather {
            private int id;
            private String main;
            private String description;
            private String icon;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getMain() {
				return main;
			}
			public void setMain(String main) {
				this.main = main;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public String getIcon() {
				return icon;
			}
			public void setIcon(String icon) {
				this.icon = icon;
			}

            // Getters and setters...
        }

        public static class Clouds {
            private int all;

			public int getAll() {
				return all;
			}

			public void setAll(int all) {
				this.all = all;
			}

            // Getters and setters...
        }

        public static class Wind {
            private double speed;
            private int deg;
            private double gust;
			public double getSpeed() {
				return speed;
			}
			public void setSpeed(double speed) {
				this.speed = speed;
			}
			public int getDeg() {
				return deg;
			}
			public void setDeg(int deg) {
				this.deg = deg;
			}
			public double getGust() {
				return gust;
			}
			public void setGust(double gust) {
				this.gust = gust;
			}

            // Getters and setters...
        }

        public static class Sys {
            private String pod;

			public String getPod() {
				return pod;
			}

			public void setPod(String pod) {
				this.pod = pod;
			}

            // Getters and setters...
        }
    }

	
}
