// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryUnifiedaccessinstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 统一接入实例列表信息
    @NameInMap("list")
    public java.util.List<UnifiedAccessInstanceInfo> list;

    public static QueryUnifiedaccessinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedaccessinstanceResponse self = new QueryUnifiedaccessinstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedaccessinstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedaccessinstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedaccessinstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedaccessinstanceResponse setList(java.util.List<UnifiedAccessInstanceInfo> list) {
        this.list = list;
        return this;
    }
    public java.util.List<UnifiedAccessInstanceInfo> getList() {
        return this.list;
    }

}
