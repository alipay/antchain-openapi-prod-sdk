// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DownloadLibraryDocRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("library_id")
    @Validation(required = true)
    public Long libraryId;

    // 文档ID
    @NameInMap("doc_id")
    @Validation(required = true)
    public Long docId;

    public static DownloadLibraryDocRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadLibraryDocRequest self = new DownloadLibraryDocRequest();
        return TeaModel.build(map, self);
    }

    public DownloadLibraryDocRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadLibraryDocRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadLibraryDocRequest setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

    public DownloadLibraryDocRequest setDocId(Long docId) {
        this.docId = docId;
        return this;
    }
    public Long getDocId() {
        return this.docId;
    }

}
