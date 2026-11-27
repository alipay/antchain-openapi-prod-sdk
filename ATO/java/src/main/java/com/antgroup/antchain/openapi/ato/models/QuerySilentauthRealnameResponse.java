// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QuerySilentauthRealnameResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实名认证流程ID
    @NameInMap("auth_flow_id")
    public String authFlowId;

    // 认证状态：INIT 已发起、ING 进行中、SUCCESS 已成功、FAIL 已失败
    @NameInMap("status")
    public String status;

    // 认证失败原因，status 为 FAIL 时返回
    @NameInMap("fail_reason")
    public String failReason;

    // 认证方式（支付宝刷脸）
    @NameInMap("auth_type")
    public String authType;

    // 流程完成时间，SUCCESS 后以此为30分钟窗口起点
    @NameInMap("end_time")
    public String endTime;

    public static QuerySilentauthRealnameResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySilentauthRealnameResponse self = new QuerySilentauthRealnameResponse();
        return TeaModel.build(map, self);
    }

    public QuerySilentauthRealnameResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySilentauthRealnameResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySilentauthRealnameResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySilentauthRealnameResponse setAuthFlowId(String authFlowId) {
        this.authFlowId = authFlowId;
        return this;
    }
    public String getAuthFlowId() {
        return this.authFlowId;
    }

    public QuerySilentauthRealnameResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QuerySilentauthRealnameResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public QuerySilentauthRealnameResponse setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QuerySilentauthRealnameResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
