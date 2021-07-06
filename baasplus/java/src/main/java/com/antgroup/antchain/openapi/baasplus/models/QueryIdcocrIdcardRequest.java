// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIdcocrIdcardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份证图片base64编码内容
    @NameInMap("image_content")
    @Validation(required = true)
    public String imageContent;

    // face: 身份证正面
    // back: 身份证反面
    @NameInMap("side")
    @Validation(required = true)
    public String side;

    public static QueryIdcocrIdcardRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIdcocrIdcardRequest self = new QueryIdcocrIdcardRequest();
        return TeaModel.build(map, self);
    }

    public QueryIdcocrIdcardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIdcocrIdcardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIdcocrIdcardRequest setImageContent(String imageContent) {
        this.imageContent = imageContent;
        return this;
    }
    public String getImageContent() {
        return this.imageContent;
    }

    public QueryIdcocrIdcardRequest setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

}
