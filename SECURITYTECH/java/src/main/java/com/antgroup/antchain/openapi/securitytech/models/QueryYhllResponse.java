// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryYhllResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // total
    @NameInMap("total")
    public Long total;

    // open_task_result_list
    @NameInMap("open_task_result_list")
    public String openTaskResultList;

    public static QueryYhllResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryYhllResponse self = new QueryYhllResponse();
        return TeaModel.build(map, self);
    }

    public QueryYhllResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryYhllResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryYhllResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryYhllResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryYhllResponse setOpenTaskResultList(String openTaskResultList) {
        this.openTaskResultList = openTaskResultList;
        return this;
    }
    public String getOpenTaskResultList() {
        return this.openTaskResultList;
    }

}
