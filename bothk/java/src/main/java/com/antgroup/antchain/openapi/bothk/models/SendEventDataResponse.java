// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class SendEventDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上报数据返回的上链结果
    @NameInMap("result_list")
    public java.util.List<SendCollectorResult> resultList;

    public static SendEventDataResponse build(java.util.Map<String, ?> map) throws Exception {
        SendEventDataResponse self = new SendEventDataResponse();
        return TeaModel.build(map, self);
    }

    public SendEventDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendEventDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendEventDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendEventDataResponse setResultList(java.util.List<SendCollectorResult> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<SendCollectorResult> getResultList() {
        return this.resultList;
    }

}
