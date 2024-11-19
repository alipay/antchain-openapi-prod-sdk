// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateWithholdActivepayRequest extends TeaModel {
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
    @NameInMap("pay_amount")
    public Long payAmount;

    // 经营分账标识Y/N
    // 当pay_type=BUYOUT、PENALTY必填。
    @NameInMap("operation_divide_flag")
    @Validation(maxLength = 1, minLength = 1)
    public String operationDivideFlag;

    // 当operation_divide_flag=Y 必填
    // 经营分账收入列表，最多10条，分账比例与正常限制一致。
    @NameInMap("operation_divide_trans_in_list")
    public java.util.List<OperationDivideTransInModel> operationDivideTransInList;

    public static CreateWithholdActivepayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdActivepayRequest self = new CreateWithholdActivepayRequest();
        return TeaModel.build(map, self);
    }

    public CreateWithholdActivepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWithholdActivepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWithholdActivepayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateWithholdActivepayRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public CreateWithholdActivepayRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateWithholdActivepayRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public CreateWithholdActivepayRequest setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public Long getPayAmount() {
        return this.payAmount;
    }

    public CreateWithholdActivepayRequest setOperationDivideFlag(String operationDivideFlag) {
        this.operationDivideFlag = operationDivideFlag;
        return this;
    }
    public String getOperationDivideFlag() {
        return this.operationDivideFlag;
    }

    public CreateWithholdActivepayRequest setOperationDivideTransInList(java.util.List<OperationDivideTransInModel> operationDivideTransInList) {
        this.operationDivideTransInList = operationDivideTransInList;
        return this;
    }
    public java.util.List<OperationDivideTransInModel> getOperationDivideTransInList() {
        return this.operationDivideTransInList;
    }

}
