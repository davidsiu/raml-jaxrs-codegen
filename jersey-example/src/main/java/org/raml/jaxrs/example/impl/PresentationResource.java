
package org.raml.jaxrs.example.impl;

import org.raml.jaxrs.example.model.Presentation;
import org.raml.jaxrs.example.resource.Presentations;

public class PresentationResource implements Presentations
{
    @Override
    public GetPresentationsResponse getPresentations(final String authorization,
                                                     final String title,
                                                     final Double start,
                                                     final Double pages)
    {
        if (!"s3cr3t".equals(authorization))
        {
            return GetPresentationsResponse.unauthorized();
        }

        final Presentation presentation = new Presentation().withId("fake-id").withTitle(title);

        return GetPresentationsResponse.jsonOK(presentation);
    }

    @Override
    public PostPresentationsResponse postPresentations(final String authorization, final Presentation entity)
    {
        if (!"s3cr3t".equals(authorization))
        {
            return PostPresentationsResponse.unauthorized();
        }

        entity.setId("fake-new-id");

        return PostPresentationsResponse.jsonCreated(entity);
    }

    @Override
    public GetPresentationsByPresentationIdResponse getPresentationsByPresentationId(final String presentationId,
                                                                                     final String authorization)
    {
        // TODO implement me!
        return null;
    }

    @Override
    public PutPresentationsByPresentationIdResponse putPresentationsByPresentationId(final String presentationId,
                                                                                     final String authorization,
                                                                                     final Presentation entity)
    {
        // TODO implement me!
        return null;
    }

    @Override
    public PatchPresentationsByPresentationIdResponse patchPresentationsByPresentationId(final String presentationId,
                                                                                         final String authorization,
                                                                                         final Presentation entity)
    {
        // TODO implement me!
        return null;
    }

    @Override
    public void deletePresentationsByPresentationId(final String presentationId, final String authorization)
    {
        // TODO implement me!
    }
}
