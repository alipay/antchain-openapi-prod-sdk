// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerExpandprocessResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 进件流程信息
    @NameInMap("process_info_list")
    public java.util.List<ExpandProcessInfo> processInfoList;

    public static QueryInnerExpandprocessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerExpandprocessResponse self = new QueryInnerExpandprocessResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerExpandprocessResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerExpandprocessResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerExpandprocessResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerExpandprocessResponse setProcessInfoList(java.util.List<ExpandProcessInfo> processInfoList) {
        this.processInfoList = processInfoList;
        return this;
    }
    public java.util.List<ExpandProcessInfo> getProcessInfoList() {
        return this.processInfoList;
    }

}
