// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerTenantindirectmainclassResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前开通类目
    @NameInMap("current_indirect_main_class_list")
    public java.util.List<String> currentIndirectMainClassList;

    // 开通说明
    @NameInMap("desc")
    public String desc;

    // 状态
    // INIT:初始化
    // AUDIT:审批中 
    // AUDIT_PASSED:审批通过
    // AUDIT_NOT_PASSED:审批不通过
    @NameInMap("status")
    public String status;

    // 审核拒绝原因
    @NameInMap("fail_reason")
    public String failReason;

    // 申请开通的类目
    @NameInMap("changing_indirect_main_class_list")
    public java.util.List<String> changingIndirectMainClassList;

    public static QueryInnerTenantindirectmainclassResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerTenantindirectmainclassResponse self = new QueryInnerTenantindirectmainclassResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerTenantindirectmainclassResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerTenantindirectmainclassResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerTenantindirectmainclassResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerTenantindirectmainclassResponse setCurrentIndirectMainClassList(java.util.List<String> currentIndirectMainClassList) {
        this.currentIndirectMainClassList = currentIndirectMainClassList;
        return this;
    }
    public java.util.List<String> getCurrentIndirectMainClassList() {
        return this.currentIndirectMainClassList;
    }

    public QueryInnerTenantindirectmainclassResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public QueryInnerTenantindirectmainclassResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryInnerTenantindirectmainclassResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public QueryInnerTenantindirectmainclassResponse setChangingIndirectMainClassList(java.util.List<String> changingIndirectMainClassList) {
        this.changingIndirectMainClassList = changingIndirectMainClassList;
        return this;
    }
    public java.util.List<String> getChangingIndirectMainClassList() {
        return this.changingIndirectMainClassList;
    }

}
