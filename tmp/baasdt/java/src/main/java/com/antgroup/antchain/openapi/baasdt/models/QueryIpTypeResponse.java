// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpTypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // ip的type列表
    @NameInMap("type")
    public java.util.List<String> type;

    // ip的受众人群
    @NameInMap("audience_group")
    public java.util.List<String> audienceGroup;

    public static QueryIpTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpTypeResponse self = new QueryIpTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpTypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpTypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpTypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpTypeResponse setType(java.util.List<String> type) {
        this.type = type;
        return this;
    }
    public java.util.List<String> getType() {
        return this.type;
    }

    public QueryIpTypeResponse setAudienceGroup(java.util.List<String> audienceGroup) {
        this.audienceGroup = audienceGroup;
        return this;
    }
    public java.util.List<String> getAudienceGroup() {
        return this.audienceGroup;
    }

}
