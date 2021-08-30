package com.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Primary
@Configuration
public class Swagger2Config implements SwaggerResourcesProvider {

	@Autowired
	private RouteLocator routeLocator;

	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> resources = new ArrayList<>();

		routeLocator.getRoutes().forEach(route -> {
			resources.add(swaggerResource(route.getId(), route.getFullPath().replace("**", "v2/api-docs"), "1.0"));
			resources.add(swaggerResource(route.getId(), route.getFullPath().replace("**", "swagger-ui.html"), "1.0"));
		});

		return resources;
	}

	private SwaggerResource swaggerResource(final String name, final String location, final String version) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation(location);
		swaggerResource.setSwaggerVersion(version);
		return swaggerResource;
	}
}
