// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class CreateChaininsightQrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // QR码类型，枚举值：CONTRACT / HEXADDRESS / TX / CHAIN / BLOCK / TIMELINE
    @NameInMap("page_type")
    @Validation(required = true)
    public String pageType;

    // 页面对应的参数
    @NameInMap("param_map")
    @Validation(required = true)
    public java.util.List<MapEntry> paramMap;

    public static CreateChaininsightQrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChaininsightQrcodeRequest self = new CreateChaininsightQrcodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateChaininsightQrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateChaininsightQrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateChaininsightQrcodeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateChaininsightQrcodeRequest setPageType(String pageType) {
        this.pageType = pageType;
        return this;
    }
    public String getPageType() {
        return this.pageType;
    }

    public CreateChaininsightQrcodeRequest setParamMap(java.util.List<MapEntry> paramMap) {
        this.paramMap = paramMap;
        return this;
    }
    public java.util.List<MapEntry> getParamMap() {
        return this.paramMap;
    }

}
