// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckNotarizationOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 下单的业务类型ID列表
    @NameInMap("biz_id")
    public java.util.List<String> bizId;

    // 实人认证接口调用授权码，与公证订单一一对应，有效次数默认为3次，超过调用次数则失效
    @NameInMap("face_auth_code")
    public String faceAuthCode;

    // 下单客户的账号ID
    @NameInMap("user_id")
    public String userId;

    // 是否为合法订单
    @NameInMap("valid")
    public Boolean valid;

    // 平台公证机构ID
    @NameInMap("org_id")
    public String orgId;

    public static CheckNotarizationOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckNotarizationOrderResponse self = new CheckNotarizationOrderResponse();
        return TeaModel.build(map, self);
    }

    public CheckNotarizationOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckNotarizationOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckNotarizationOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckNotarizationOrderResponse setBizId(java.util.List<String> bizId) {
        this.bizId = bizId;
        return this;
    }
    public java.util.List<String> getBizId() {
        return this.bizId;
    }

    public CheckNotarizationOrderResponse setFaceAuthCode(String faceAuthCode) {
        this.faceAuthCode = faceAuthCode;
        return this;
    }
    public String getFaceAuthCode() {
        return this.faceAuthCode;
    }

    public CheckNotarizationOrderResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CheckNotarizationOrderResponse setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

    public CheckNotarizationOrderResponse setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
