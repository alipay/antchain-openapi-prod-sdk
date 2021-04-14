// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseRentalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资租赁业务id，由资方控制台生成返回
    @NameInMap("application_id")
    public String applicationId;

    // 手续费，如通过预授权、代扣的方式规划，必填
    @NameInMap("charge")
    @Validation(required = true)
    public Long charge;

    // 融资租赁用户还款额外字段
    @NameInMap("extra_info")
    public String extraInfo;

    // 是否本订单所有租金还款状态结束
    @NameInMap("is_finish")
    @Validation(required = true)
    public Boolean isFinish;

    // 租期编号，从1开始
    @NameInMap("lease_term_index")
    @Validation(required = true)
    public Long leaseTermIndex;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 剩余租金总数,会核验剩余租金与承诺等额
    @NameInMap("remain_rental")
    @Validation(required = true)
    public Long remainRental;

    // 剩余归还期数
    @NameInMap("remain_term")
    @Validation(required = true)
    public Long remainTerm;

    // 租金归还金额,精确到毫厘，即123400表示12.34元
    @NameInMap("rental_money")
    @Validation(required = true)
    public Long rentalMoney;

    // 租金归还状态，1.足额归还2.部分归还3.未归还
    @NameInMap("rental_return_state")
    @Validation(required = true)
    public Long rentalReturnState;

    // 归还时间，格式为"2019-07-31 12:00:00"
    @NameInMap("return_time")
    @Validation(required = true)
    public String returnTime;

    // 还款凭证编号，不超过128字符，1.支付宝流水号
    @NameInMap("return_voucher_serial")
    @Validation(required = true)
    public String returnVoucherSerial;

    // 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
    @NameInMap("return_voucher_type")
    @Validation(required = true)
    public Long returnVoucherType;

    // 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他
    @NameInMap("return_way")
    @Validation(required = true)
    public Long returnWay;

    // 是否启动订单的异步处理
    @NameInMap("async")
    public Long async;

    public static CreateLeaseRentalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseRentalRequest self = new CreateLeaseRentalRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseRentalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseRentalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseRentalRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseRentalRequest setCharge(Long charge) {
        this.charge = charge;
        return this;
    }
    public Long getCharge() {
        return this.charge;
    }

    public CreateLeaseRentalRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeaseRentalRequest setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
        return this;
    }
    public Boolean getIsFinish() {
        return this.isFinish;
    }

    public CreateLeaseRentalRequest setLeaseTermIndex(Long leaseTermIndex) {
        this.leaseTermIndex = leaseTermIndex;
        return this;
    }
    public Long getLeaseTermIndex() {
        return this.leaseTermIndex;
    }

    public CreateLeaseRentalRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseRentalRequest setRemainRental(Long remainRental) {
        this.remainRental = remainRental;
        return this;
    }
    public Long getRemainRental() {
        return this.remainRental;
    }

    public CreateLeaseRentalRequest setRemainTerm(Long remainTerm) {
        this.remainTerm = remainTerm;
        return this;
    }
    public Long getRemainTerm() {
        return this.remainTerm;
    }

    public CreateLeaseRentalRequest setRentalMoney(Long rentalMoney) {
        this.rentalMoney = rentalMoney;
        return this;
    }
    public Long getRentalMoney() {
        return this.rentalMoney;
    }

    public CreateLeaseRentalRequest setRentalReturnState(Long rentalReturnState) {
        this.rentalReturnState = rentalReturnState;
        return this;
    }
    public Long getRentalReturnState() {
        return this.rentalReturnState;
    }

    public CreateLeaseRentalRequest setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        return this;
    }
    public String getReturnTime() {
        return this.returnTime;
    }

    public CreateLeaseRentalRequest setReturnVoucherSerial(String returnVoucherSerial) {
        this.returnVoucherSerial = returnVoucherSerial;
        return this;
    }
    public String getReturnVoucherSerial() {
        return this.returnVoucherSerial;
    }

    public CreateLeaseRentalRequest setReturnVoucherType(Long returnVoucherType) {
        this.returnVoucherType = returnVoucherType;
        return this;
    }
    public Long getReturnVoucherType() {
        return this.returnVoucherType;
    }

    public CreateLeaseRentalRequest setReturnWay(Long returnWay) {
        this.returnWay = returnWay;
        return this;
    }
    public Long getReturnWay() {
        return this.returnWay;
    }

    public CreateLeaseRentalRequest setAsync(Long async) {
        this.async = async;
        return this;
    }
    public Long getAsync() {
        return this.async;
    }

}
