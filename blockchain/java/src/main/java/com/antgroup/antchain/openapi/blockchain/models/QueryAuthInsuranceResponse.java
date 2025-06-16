// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthInsuranceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 	
    // 提交是否成功
    @NameInMap("push_success")
    public String pushSuccess;

    public static QueryAuthInsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthInsuranceResponse self = new QueryAuthInsuranceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthInsuranceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthInsuranceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthInsuranceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthInsuranceResponse setPushSuccess(String pushSuccess) {
        this.pushSuccess = pushSuccess;
        return this;
    }
    public String getPushSuccess() {
        return this.pushSuccess;
    }

}
