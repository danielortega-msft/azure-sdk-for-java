// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A content line object consisting of an adjacent sequence of content elements, such as words and selection marks. */
@Fluent
public final class DocumentLine {
    /*
     * Concatenated content of the contained elements in reading order.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * Bounding polygon of the line.
     */
    @JsonProperty(value = "polygon")
    private List<Float> polygon;

    /*
     * Location of the line in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /** Creates an instance of DocumentLine class. */
    public DocumentLine() {}

    /**
     * Get the content property: Concatenated content of the contained elements in reading order.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Concatenated content of the contained elements in reading order.
     *
     * @param content the content value to set.
     * @return the DocumentLine object itself.
     */
    public DocumentLine setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the polygon property: Bounding polygon of the line.
     *
     * @return the polygon value.
     */
    public List<Float> getPolygon() {
        return this.polygon;
    }

    /**
     * Set the polygon property: Bounding polygon of the line.
     *
     * @param polygon the polygon value to set.
     * @return the DocumentLine object itself.
     */
    public DocumentLine setPolygon(List<Float> polygon) {
        this.polygon = polygon;
        return this;
    }

    /**
     * Get the spans property: Location of the line in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the line in the reading order concatenated content.
     *
     * @param spans the spans value to set.
     * @return the DocumentLine object itself.
     */
    public DocumentLine setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }
}
