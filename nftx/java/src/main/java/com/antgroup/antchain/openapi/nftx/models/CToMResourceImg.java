// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class CToMResourceImg extends TeaModel {
    // 预览图
    @NameInMap("thumbnail_url")
    @Validation(required = true)
    public String thumbnailUrl;

    // 高清图
    @NameInMap("high_definition_url")
    @Validation(required = true)
    public String highDefinitionUrl;

    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    public static CToMResourceImg build(java.util.Map<String, ?> map) throws Exception {
        CToMResourceImg self = new CToMResourceImg();
        return TeaModel.build(map, self);
    }

    public CToMResourceImg setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public CToMResourceImg setHighDefinitionUrl(String highDefinitionUrl) {
        this.highDefinitionUrl = highDefinitionUrl;
        return this;
    }
    public String getHighDefinitionUrl() {
        return this.highDefinitionUrl;
    }

    public CToMResourceImg setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
