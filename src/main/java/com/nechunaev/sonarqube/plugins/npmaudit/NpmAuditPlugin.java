package com.nechunaev.sonarqube.plugins.npmaudit;

import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;
import com.nechunaev.sonarqube.plugins.npmaudit.measures.ComputeSizeAverage;
import com.nechunaev.sonarqube.plugins.npmaudit.measures.ComputeSizeRating;
import com.nechunaev.sonarqube.plugins.npmaudit.measures.ExampleMetrics;
import com.nechunaev.sonarqube.plugins.npmaudit.measures.SetSizeOnFilesSensor;

// Tab in settings page
import com.nechunaev.sonarqube.plugins.npmaudit.settings.NpmAuditProperties;
import com.nechunaev.sonarqube.plugins.npmaudit.settings.SayHelloFromScanner;

import com.nechunaev.sonarqube.plugins.npmaudit.web.MyPluginPageDefinition;

import static java.util.Arrays.asList;

public class NpmAuditPlugin implements Plugin {

	@Override
	public void define(Context context) {
		// tutorial on measures
		context.addExtensions(ExampleMetrics.class, SetSizeOnFilesSensor.class, ComputeSizeAverage.class,
				ComputeSizeRating.class);

		// tutorial on settings
		context.addExtensions(NpmAuditProperties.getProperties()).addExtension(SayHelloFromScanner.class);

		// tutorial on web extensions
		context.addExtension(MyPluginPageDefinition.class);

		context.addExtensions(asList(PropertyDefinition.builder("sonar.foo.file.suffixes").name("Suffixes FooLint")
				.description("Suffixes supported by FooLint").category("FooLint").defaultValue("").build()));
	}
}
