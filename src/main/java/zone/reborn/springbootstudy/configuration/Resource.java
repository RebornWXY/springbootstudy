package zone.reborn.springbootstudy.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年7月25日 上午11:13:19
 * @Description 类描述
 */
@Configuration
@ConfigurationProperties(prefix = "zone.reborn.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {
	private String name;
	private String website;
	private String language;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
