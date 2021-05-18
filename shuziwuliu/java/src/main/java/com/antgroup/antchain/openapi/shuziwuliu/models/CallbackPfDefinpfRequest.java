// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CallbackPfDefinpfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 回调内容
    @NameInMap("content_info")
    @Validation(required = true)
    public String contentInfo;

    public static CallbackPfDefinpfRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackPfDefinpfRequest self = new CallbackPfDefinpfRequest();
        return TeaModel.build(map, self);
    }

    public CallbackPfDefinpfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackPfDefinpfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackPfDefinpfRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CallbackPfDefinpfRequest setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
        return this;
    }
    public String getContentInfo() {
        return this.contentInfo;
    }

}
