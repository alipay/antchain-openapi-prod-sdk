// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoMerchantexpandDividerelationResponse extends TeaModel {
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

    public static QueryAntchainAtoMerchantexpandDividerelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoMerchantexpandDividerelationResponse self = new QueryAntchainAtoMerchantexpandDividerelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoMerchantexpandDividerelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoMerchantexpandDividerelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoMerchantexpandDividerelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoMerchantexpandDividerelationResponse setAlipayPidList(java.util.List<String> alipayPidList) {
        this.alipayPidList = alipayPidList;
        return this;
    }
    public java.util.List<String> getAlipayPidList() {
        return this.alipayPidList;
    }

    public QueryAntchainAtoMerchantexpandDividerelationResponse setDivideRadio(String divideRadio) {
        this.divideRadio = divideRadio;
        return this;
    }
    public String getDivideRadio() {
        return this.divideRadio;
    }

}
