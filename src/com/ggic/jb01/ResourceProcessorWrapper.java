package com.ggic.jb01;

public class ResourceProcessorWrapper implements Runnable{

    private final ResourceProcessor resourceProcessor;
    private final Resource resource;

    public ResourceProcessorWrapper(ResourceProcessor resourceProcessor, Resource resource) {
        this.resourceProcessor = resourceProcessor;
        this.resource = resource;
    }

    @Override
    public void run() {
        resourceProcessor.process(resource);
    }
}
