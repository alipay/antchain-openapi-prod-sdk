// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppgroupTreeResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用列表，包含依赖关系
    @NameInMap("data")
    public java.util.List<AppDomainFlatten> data;

    public static GetAppgroupTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppgroupTreeResponse self = new GetAppgroupTreeResponse();
        return TeaModel.build(map, self);
    }

    public GetAppgroupTreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAppgroupTreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAppgroupTreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAppgroupTreeResponse setData(java.util.List<AppDomainFlatten> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppDomainFlatten> getData() {
        return this.data;
    }

}
