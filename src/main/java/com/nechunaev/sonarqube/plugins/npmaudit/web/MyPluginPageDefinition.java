package com.nechunaev.sonarqube.plugins.npmaudit.web;

import org.sonar.api.web.page.Page;
import org.sonar.api.web.page.PageDefinition;
import org.sonar.api.web.page.Context;

import static org.sonar.api.web.page.Page.Scope.COMPONENT;
import static org.sonar.api.web.page.Page.Qualifier.VIEW;
import static org.sonar.api.web.page.Page.Qualifier.SUB_VIEW;

public class MyPluginPageDefinition implements PageDefinition {

	@Override
	public void define(Context context) {
		context.addPage(Page.builder("npmaudit/global_page").setName("Global Page using Vanilla JS").build())
				.addPage(Page.builder("npmaudit/project_page").setName("Project Page using Backbone JS")
						.setScope(COMPONENT).build())
				.addPage(Page.builder("npmaudit/portfolio_page").setName("Portfolio Page using React JS")
						.setScope(COMPONENT).setComponentQualifiers(VIEW, SUB_VIEW).build());
		// .addPage(Page.builder("npmaudit/admin_page").setName("Admin Page using React
		// JS").setAdmin(true).build());
	}
}
