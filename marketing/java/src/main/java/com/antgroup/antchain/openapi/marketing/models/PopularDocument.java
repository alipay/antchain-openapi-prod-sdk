// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class PopularDocument extends TeaModel {
    // popular_document_title
    @NameInMap("popular_document_title")
    public String popularDocumentTitle;

    // popular_document_id
    @NameInMap("popular_document_id")
    public String popularDocumentId;

    // popular_document_info
    @NameInMap("popular_document_info")
    public String popularDocumentInfo;

    // children
    @NameInMap("children")
    @Validation(required = true)
    public java.util.List<CategoryVO> children;

    public static PopularDocument build(java.util.Map<String, ?> map) throws Exception {
        PopularDocument self = new PopularDocument();
        return TeaModel.build(map, self);
    }

    public PopularDocument setPopularDocumentTitle(String popularDocumentTitle) {
        this.popularDocumentTitle = popularDocumentTitle;
        return this;
    }
    public String getPopularDocumentTitle() {
        return this.popularDocumentTitle;
    }

    public PopularDocument setPopularDocumentId(String popularDocumentId) {
        this.popularDocumentId = popularDocumentId;
        return this;
    }
    public String getPopularDocumentId() {
        return this.popularDocumentId;
    }

    public PopularDocument setPopularDocumentInfo(String popularDocumentInfo) {
        this.popularDocumentInfo = popularDocumentInfo;
        return this;
    }
    public String getPopularDocumentInfo() {
        return this.popularDocumentInfo;
    }

    public PopularDocument setChildren(java.util.List<CategoryVO> children) {
        this.children = children;
        return this;
    }
    public java.util.List<CategoryVO> getChildren() {
        return this.children;
    }

}
