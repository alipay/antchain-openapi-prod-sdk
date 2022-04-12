// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryCustomResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 调用结果是否成功标识
    @NameInMap("success")
    public Boolean success;

    // 项目数组
    @NameInMap("data")
    public java.util.List<AcesProject> data;

    // 项目总数
    @NameInMap("total")
    public Long total;

    public static QueryCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomResponse self = new QueryCustomResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCustomResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCustomResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCustomResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCustomResponse setData(java.util.List<AcesProject> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AcesProject> getData() {
        return this.data;
    }

    public QueryCustomResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
