// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CreateAntchainAtoWithholdActivepayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50)
    public String orderId;

    // 第几期,当支付类型为PERFORMANCE或为空必填
    @NameInMap("period_num")
    public Long periodNum;

    // 支付类型
    @NameInMap("pay_type")
    @Validation(maxLength = 64, minLength = 1)
    public String payType;

    // 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
    @NameInMap("pay_channel")
    @Validation(maxLength = 64, minLength = 1)
    public String payChannel;

    // 支付金额，单位为分
    // 当支付类型非PERFORMANCE或为空必填
    @NameInMap("pay_amount")
    public Long payAmount;

    // 经营分账标识Y/N
    // 当pay_type=BUYOUT、PENALTY、MULTI_PAY必填。
    @NameInMap("operation_divide_flag")
    @Validation(maxLength = 1, minLength = 1)
    public String operationDivideFlag;

    // 当operation_divide_flag=Y 必填
    // 经营分账收入列表，最多10条，分账比例与正常限制一致。
    @NameInMap("operation_divide_trans_in_list")
    public java.util.List<OperationDivideTransInModel> operationDivideTransInList;

    // 单期支付明细列表
    // 当pay_type=MULTI_PAY必填。
    @NameInMap("multi_pay_detail")
    public java.util.List<SingleTermDetail> multiPayDetail;

    public static CreateAntchainAtoWithholdActivepayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainAtoWithholdActivepayRequest self = new CreateAntchainAtoWithholdActivepayRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntchainAtoWithholdActivepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntchainAtoWithholdActivepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntchainAtoWithholdActivepayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateAntchainAtoWithholdActivepayRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public CreateAntchainAtoWithholdActivepayRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateAntchainAtoWithholdActivepayRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public CreateAntchainAtoWithholdActivepayRequest setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public Long getPayAmount() {
        return this.payAmount;
    }

    public CreateAntchainAtoWithholdActivepayRequest setOperationDivideFlag(String operationDivideFlag) {
        this.operationDivideFlag = operationDivideFlag;
        return this;
    }
    public String getOperationDivideFlag() {
        return this.operationDivideFlag;
    }

    public CreateAntchainAtoWithholdActivepayRequest setOperationDivideTransInList(java.util.List<OperationDivideTransInModel> operationDivideTransInList) {
        this.operationDivideTransInList = operationDivideTransInList;
        return this;
    }
    public java.util.List<OperationDivideTransInModel> getOperationDivideTransInList() {
        return this.operationDivideTransInList;
    }

    public CreateAntchainAtoWithholdActivepayRequest setMultiPayDetail(java.util.List<SingleTermDetail> multiPayDetail) {
        this.multiPayDetail = multiPayDetail;
        return this;
    }
    public java.util.List<SingleTermDetail> getMultiPayDetail() {
        return this.multiPayDetail;
    }

}
