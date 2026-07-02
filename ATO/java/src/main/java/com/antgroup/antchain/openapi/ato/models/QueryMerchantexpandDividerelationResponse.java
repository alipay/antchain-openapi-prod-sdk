// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryMerchantexpandDividerelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分账绑定关系支付宝pid
    @NameInMap("alipay_pid_list")
    public java.util.List<String> alipayPidList;

    // 分账比例上限
    @NameInMap("divide_radio")
    public String divideRadio;

    public static QueryMerchantexpandDividerelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantexpandDividerelationResponse self = new QueryMerchantexpandDividerelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantexpandDividerelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantexpandDividerelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantexpandDividerelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantexpandDividerelationResponse setAlipayPidList(java.util.List<String> alipayPidList) {
        this.alipayPidList = alipayPidList;
        return this;
    }
    public java.util.List<String> getAlipayPidList() {
        return this.alipayPidList;
    }

    public QueryMerchantexpandDividerelationResponse setDivideRadio(String divideRadio) {
        this.divideRadio = divideRadio;
        return this;
    }
    public String getDivideRadio() {
        return this.divideRadio;
    }

}
