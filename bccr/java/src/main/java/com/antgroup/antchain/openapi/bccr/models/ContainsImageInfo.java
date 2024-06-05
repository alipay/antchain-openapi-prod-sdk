// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ContainsImageInfo extends TeaModel {
    // 是否包含图片
    @NameInMap("contains_image")
    public Boolean containsImage;

    // 包含图片，处理后的图片副件
    @NameInMap("resolved_file_url")
    public String resolvedFileUrl;

    public static ContainsImageInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainsImageInfo self = new ContainsImageInfo();
        return TeaModel.build(map, self);
    }

    public ContainsImageInfo setContainsImage(Boolean containsImage) {
        this.containsImage = containsImage;
        return this;
    }
    public Boolean getContainsImage() {
        return this.containsImage;
    }

    public ContainsImageInfo setResolvedFileUrl(String resolvedFileUrl) {
        this.resolvedFileUrl = resolvedFileUrl;
        return this;
    }
    public String getResolvedFileUrl() {
        return this.resolvedFileUrl;
    }

}
