// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceSecuritygroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 安全组详细信息。
    @NameInMap("security_groups")
    public java.util.List<SecurityGroup> securityGroups;

    // 安全组的总数。
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryResourceSecuritygroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceSecuritygroupResponse self = new QueryResourceSecuritygroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceSecuritygroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryResourceSecuritygroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryResourceSecuritygroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryResourceSecuritygroupResponse setSecurityGroups(java.util.List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<SecurityGroup> getSecurityGroups() {
        return this.securityGroups;
    }

    public QueryResourceSecuritygroupResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
