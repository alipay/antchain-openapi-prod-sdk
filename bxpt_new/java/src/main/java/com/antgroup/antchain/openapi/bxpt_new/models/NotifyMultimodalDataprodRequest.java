// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class NotifyMultimodalDataprodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 通知具体json内容
    @NameInMap("biz_content")
    public String bizContent;

    // 唯一请求id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务标识
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static NotifyMultimodalDataprodRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyMultimodalDataprodRequest self = new NotifyMultimodalDataprodRequest();
        return TeaModel.build(map, self);
    }

    public NotifyMultimodalDataprodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyMultimodalDataprodRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public NotifyMultimodalDataprodRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyMultimodalDataprodRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
