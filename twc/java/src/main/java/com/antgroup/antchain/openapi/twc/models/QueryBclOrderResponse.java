// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单信息
    @NameInMap("order_info")
    public BclOrderInfo orderInfo;

    // 实人信息
    @NameInMap("certify_info")
    public BclCertifyInfo certifyInfo;

    // 风控分数
    // 分数0-100，小数2位，分数越高风险越大
    @NameInMap("risk_score")
    public String riskScore;

    // 用户身份信息和支付宝ID的核验 
    // 1.匹配，PASS 
    // 2.不匹配，UN_PASS
    @NameInMap("identity_verification")
    public String identityVerification;

    // 合同信息
    @NameInMap("contract_info")
    public BclContractInfo contractInfo;

    // 承诺信息
    @NameInMap("promise_info")
    public BclPromiseInfo promiseInfo;

    // 履约详情
    @NameInMap("rental_infos")
    public java.util.List<BclRentalInfo> rentalInfos;

    // 物流信息
    @NameInMap("logistics_infos")
    public java.util.List<BclLogisticsInfo> logisticsInfos;

    // 存证信息
    @NameInMap("notary_infos")
    public java.util.List<BclNotaryInfo> notaryInfos;

    public static QueryBclOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBclOrderResponse self = new QueryBclOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryBclOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBclOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBclOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBclOrderResponse setOrderInfo(BclOrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public BclOrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public QueryBclOrderResponse setCertifyInfo(BclCertifyInfo certifyInfo) {
        this.certifyInfo = certifyInfo;
        return this;
    }
    public BclCertifyInfo getCertifyInfo() {
        return this.certifyInfo;
    }

    public QueryBclOrderResponse setRiskScore(String riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public String getRiskScore() {
        return this.riskScore;
    }

    public QueryBclOrderResponse setIdentityVerification(String identityVerification) {
        this.identityVerification = identityVerification;
        return this;
    }
    public String getIdentityVerification() {
        return this.identityVerification;
    }

    public QueryBclOrderResponse setContractInfo(BclContractInfo contractInfo) {
        this.contractInfo = contractInfo;
        return this;
    }
    public BclContractInfo getContractInfo() {
        return this.contractInfo;
    }

    public QueryBclOrderResponse setPromiseInfo(BclPromiseInfo promiseInfo) {
        this.promiseInfo = promiseInfo;
        return this;
    }
    public BclPromiseInfo getPromiseInfo() {
        return this.promiseInfo;
    }

    public QueryBclOrderResponse setRentalInfos(java.util.List<BclRentalInfo> rentalInfos) {
        this.rentalInfos = rentalInfos;
        return this;
    }
    public java.util.List<BclRentalInfo> getRentalInfos() {
        return this.rentalInfos;
    }

    public QueryBclOrderResponse setLogisticsInfos(java.util.List<BclLogisticsInfo> logisticsInfos) {
        this.logisticsInfos = logisticsInfos;
        return this;
    }
    public java.util.List<BclLogisticsInfo> getLogisticsInfos() {
        return this.logisticsInfos;
    }

    public QueryBclOrderResponse setNotaryInfos(java.util.List<BclNotaryInfo> notaryInfos) {
        this.notaryInfos = notaryInfos;
        return this;
    }
    public java.util.List<BclNotaryInfo> getNotaryInfos() {
        return this.notaryInfos;
    }

}
