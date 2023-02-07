// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CheckQuotaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是够超额
    @NameInMap("quota_exceed")
    public Boolean quotaExceed;

    // quota实例ID
    @NameInMap("quota_ins_id")
    public String quotaInsId;

    // dim_identity
    @NameInMap("dim_identity")
    public String dimIdentity;

    // 维度值
    @NameInMap("dim_ins_value")
    public String dimInsValue;

    // resource
    @NameInMap("resource")
    public String resource;

    // 申请的资源的数量
    @NameInMap("count")
    public Long count;

    // 当前剩余的量
    @NameInMap("remain")
    public Long remain;

    public static CheckQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckQuotaResponse self = new CheckQuotaResponse();
        return TeaModel.build(map, self);
    }

    public CheckQuotaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckQuotaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckQuotaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckQuotaResponse setQuotaExceed(Boolean quotaExceed) {
        this.quotaExceed = quotaExceed;
        return this;
    }
    public Boolean getQuotaExceed() {
        return this.quotaExceed;
    }

    public CheckQuotaResponse setQuotaInsId(String quotaInsId) {
        this.quotaInsId = quotaInsId;
        return this;
    }
    public String getQuotaInsId() {
        return this.quotaInsId;
    }

    public CheckQuotaResponse setDimIdentity(String dimIdentity) {
        this.dimIdentity = dimIdentity;
        return this;
    }
    public String getDimIdentity() {
        return this.dimIdentity;
    }

    public CheckQuotaResponse setDimInsValue(String dimInsValue) {
        this.dimInsValue = dimInsValue;
        return this;
    }
    public String getDimInsValue() {
        return this.dimInsValue;
    }

    public CheckQuotaResponse setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CheckQuotaResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public CheckQuotaResponse setRemain(Long remain) {
        this.remain = remain;
        return this;
    }
    public Long getRemain() {
        return this.remain;
    }

}
