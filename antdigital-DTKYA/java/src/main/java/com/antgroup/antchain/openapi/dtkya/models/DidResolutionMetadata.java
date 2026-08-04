// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DidResolutionMetadata extends TeaModel {
    // 媒体类型
    /**
     * <strong>example:</strong>
     * <p>application/did+ld+json</p>
     */
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    public static DidResolutionMetadata build(java.util.Map<String, ?> map) throws Exception {
        DidResolutionMetadata self = new DidResolutionMetadata();
        return TeaModel.build(map, self);
    }

    public DidResolutionMetadata setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

}
