// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class ContentObjVO extends TeaModel {
    // novice_must_sees
    @NameInMap("novice_must_sees")
    public java.util.List<NoviceMustSee> noviceMustSees;

    // popular_document
    @NameInMap("popular_document")
    public java.util.List<PopularDocument> popularDocument;

    // product_presentation
    @NameInMap("product_presentation")
    public String productPresentation;

    public static ContentObjVO build(java.util.Map<String, ?> map) throws Exception {
        ContentObjVO self = new ContentObjVO();
        return TeaModel.build(map, self);
    }

    public ContentObjVO setNoviceMustSees(java.util.List<NoviceMustSee> noviceMustSees) {
        this.noviceMustSees = noviceMustSees;
        return this;
    }
    public java.util.List<NoviceMustSee> getNoviceMustSees() {
        return this.noviceMustSees;
    }

    public ContentObjVO setPopularDocument(java.util.List<PopularDocument> popularDocument) {
        this.popularDocument = popularDocument;
        return this;
    }
    public java.util.List<PopularDocument> getPopularDocument() {
        return this.popularDocument;
    }

    public ContentObjVO setProductPresentation(String productPresentation) {
        this.productPresentation = productPresentation;
        return this;
    }
    public String getProductPresentation() {
        return this.productPresentation;
    }

}
