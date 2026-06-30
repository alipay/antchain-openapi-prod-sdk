// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ApplyNotaryOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公证出证申请信息
    @NameInMap("notary_apply_info")
    @Validation(required = true)
    public NotaryApplyInfo notaryApplyInfo;

    // 公证出证收件信息
    @NameInMap("notary_receive_info")
    @Validation(required = true)
    public NotaryReceiveInfo notaryReceiveInfo;

    // 用户预览签署文件的时间
    @NameInMap("preview_time")
    @Validation(required = true)
    public Long previewTime;

    // 用户签署文件时间
    @NameInMap("agree_time")
    @Validation(required = true)
    public Long agreeTime;

    // 客户端令牌
    @NameInMap("client_token")
    public String clientToken;

    public static ApplyNotaryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyNotaryOrderRequest self = new ApplyNotaryOrderRequest();
        return TeaModel.build(map, self);
    }

    public ApplyNotaryOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyNotaryOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyNotaryOrderRequest setNotaryApplyInfo(NotaryApplyInfo notaryApplyInfo) {
        this.notaryApplyInfo = notaryApplyInfo;
        return this;
    }
    public NotaryApplyInfo getNotaryApplyInfo() {
        return this.notaryApplyInfo;
    }

    public ApplyNotaryOrderRequest setNotaryReceiveInfo(NotaryReceiveInfo notaryReceiveInfo) {
        this.notaryReceiveInfo = notaryReceiveInfo;
        return this;
    }
    public NotaryReceiveInfo getNotaryReceiveInfo() {
        return this.notaryReceiveInfo;
    }

    public ApplyNotaryOrderRequest setPreviewTime(Long previewTime) {
        this.previewTime = previewTime;
        return this;
    }
    public Long getPreviewTime() {
        return this.previewTime;
    }

    public ApplyNotaryOrderRequest setAgreeTime(Long agreeTime) {
        this.agreeTime = agreeTime;
        return this;
    }
    public Long getAgreeTime() {
        return this.agreeTime;
    }

    public ApplyNotaryOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
