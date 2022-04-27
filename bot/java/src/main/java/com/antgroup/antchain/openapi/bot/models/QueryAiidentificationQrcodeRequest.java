// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryAiidentificationQrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户身份标识
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // 图片内容的base64字符串
    @NameInMap("query_image_base64")
    @Validation(required = true)
    public String queryImageBase64;

    // 底图内容的base64字符串
    @NameInMap("gallery_image_base64")
    @Validation(required = true)
    public String galleryImageBase64;

    public static QueryAiidentificationQrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiidentificationQrcodeRequest self = new QueryAiidentificationQrcodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiidentificationQrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAiidentificationQrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAiidentificationQrcodeRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public QueryAiidentificationQrcodeRequest setQueryImageBase64(String queryImageBase64) {
        this.queryImageBase64 = queryImageBase64;
        return this;
    }
    public String getQueryImageBase64() {
        return this.queryImageBase64;
    }

    public QueryAiidentificationQrcodeRequest setGalleryImageBase64(String galleryImageBase64) {
        this.galleryImageBase64 = galleryImageBase64;
        return this;
    }
    public String getGalleryImageBase64() {
        return this.galleryImageBase64;
    }

}
