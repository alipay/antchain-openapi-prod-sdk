// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAssetMeta extends TeaModel {
    // 资产元信息链接
    @NameInMap("uri")
    public String uri;

    // 资产元信息
    @NameInMap("meta_data")
    public String metaData;

    // 资源类型：Image / Audio / Video / Unknown
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 资源详细数据，如图片、视频的链接
    @NameInMap("resource_data")
    public String resourceData;

    public static ChainInsightAssetMeta build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAssetMeta self = new ChainInsightAssetMeta();
        return TeaModel.build(map, self);
    }

    public ChainInsightAssetMeta setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public ChainInsightAssetMeta setMetaData(String metaData) {
        this.metaData = metaData;
        return this;
    }
    public String getMetaData() {
        return this.metaData;
    }

    public ChainInsightAssetMeta setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ChainInsightAssetMeta setResourceData(String resourceData) {
        this.resourceData = resourceData;
        return this;
    }
    public String getResourceData() {
        return this.resourceData;
    }

}
