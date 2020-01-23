package com.nechunaev.sonarqube.plugins.npmaudit.settings;

import java.util.List;
import org.sonar.api.config.PropertyDefinition;

import static java.util.Arrays.asList;

public class NpmAuditProperties {

	public static final String REPORT_FILE_KEY = "sonar.npmaudit.report";
	public static final String CATEGORY = "NPM";

	private NpmAuditProperties() {
		// only statics
	}

	public static List<PropertyDefinition> getProperties() {
		return asList(PropertyDefinition.builder(REPORT_FILE_KEY).name("Audit").description("Path to audit report")
				.defaultValue("reports/npm-audit.json").category(CATEGORY).build());
	}

}
