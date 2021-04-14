// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateSueBreakpromiseinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同唯一标识，不可更新
    // 
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 当事人手机号
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 当事人电子邮箱地址
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 诉前Id，不可更新
    // 
    @NameInMap("pre_sue_id")
    @Validation(required = true)
    public String preSueId;

    // 应履约日期，格式为"2019-07-31 12:00:00"
    @NameInMap("promise_date")
    @Validation(required = true)
    public String promiseDate;

    // 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
    @NameInMap("promise_limit")
    @Validation(required = true)
    public Long promiseLimit;

    // 起诉期，格式为"2019-07-31 12:00:00"
    @NameInMap("sue_date")
    @Validation(required = true)
    public String sueDate;

    // 违约金额，精确到毫厘，即123400表示12.34元
    @NameInMap("break_promise_money")
    @Validation(required = true)
    public Long breakPromiseMoney;

    // 所属行业
    // 
    @NameInMap("business_class")
    @Validation(required = true)
    public String businessClass;

    public static UpdateSueBreakpromiseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSueBreakpromiseinfoRequest self = new UpdateSueBreakpromiseinfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSueBreakpromiseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSueBreakpromiseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSueBreakpromiseinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateSueBreakpromiseinfoRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateSueBreakpromiseinfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateSueBreakpromiseinfoRequest setPreSueId(String preSueId) {
        this.preSueId = preSueId;
        return this;
    }
    public String getPreSueId() {
        return this.preSueId;
    }

    public UpdateSueBreakpromiseinfoRequest setPromiseDate(String promiseDate) {
        this.promiseDate = promiseDate;
        return this;
    }
    public String getPromiseDate() {
        return this.promiseDate;
    }

    public UpdateSueBreakpromiseinfoRequest setPromiseLimit(Long promiseLimit) {
        this.promiseLimit = promiseLimit;
        return this;
    }
    public Long getPromiseLimit() {
        return this.promiseLimit;
    }

    public UpdateSueBreakpromiseinfoRequest setSueDate(String sueDate) {
        this.sueDate = sueDate;
        return this;
    }
    public String getSueDate() {
        return this.sueDate;
    }

    public UpdateSueBreakpromiseinfoRequest setBreakPromiseMoney(Long breakPromiseMoney) {
        this.breakPromiseMoney = breakPromiseMoney;
        return this;
    }
    public Long getBreakPromiseMoney() {
        return this.breakPromiseMoney;
    }

    public UpdateSueBreakpromiseinfoRequest setBusinessClass(String businessClass) {
        this.businessClass = businessClass;
        return this;
    }
    public String getBusinessClass() {
        return this.businessClass;
    }

}
