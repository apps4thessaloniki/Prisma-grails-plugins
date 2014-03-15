package de.andreasschmitt.richui.taglib.renderer;

import groovy.xml.MarkupBuilder
import de.andreasschmitt.richui.taglib.Resource

/*
*
* @author Andreas Schmitt
*/
class CarouselItemRenderer extends AbstractRenderer {

	protected void renderTagContent(Map attrs, MarkupBuilder builder) throws RenderException {
		renderTagContent(attrs, null, builder)
	}
	
	protected void renderTagContent(Map attrs, Closure body, MarkupBuilder builder) throws RenderException {			
		builder."li"(){
			builder.yield("${body.call()}", false)
		}
	}
	
	protected List<Resource> getComponentResources(Map attrs, String resourcePath) throws RenderException {
		
	}
	
	protected void renderResourcesContent(Map attrs, MarkupBuilder builder, String resourcePath) throws RenderException {

	}

}