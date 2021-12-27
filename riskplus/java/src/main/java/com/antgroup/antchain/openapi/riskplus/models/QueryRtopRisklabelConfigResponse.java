// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopRisklabelConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回码	
    // 
    @NameInMap("response_code")
    public String responseCode;

    // 是否调用成功	
    // 
    @NameInMap("success")
    public Boolean success;

    // 列表
    @NameInMap("tag_config")
    public java.util.List<RiskLabelConfigInfo> tagConfig;

    // 总数
    @NameInMap("total")
    public Long total;

    public static QueryRtopRisklabelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopRisklabelConfigResponse self = new QueryRtopRisklabelConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopRisklabelConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopRisklabelConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopRisklabelConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopRisklabelConfigResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryRtopRisklabelConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRtopRisklabelConfigResponse setTagConfig(java.util.List<RiskLabelConfigInfo> tagConfig) {
        this.tagConfig = tagConfig;
        return this;
    }
    public java.util.List<RiskLabelConfigInfo> getTagConfig() {
        return this.tagConfig;
    }

    public QueryRtopRisklabelConfigResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
