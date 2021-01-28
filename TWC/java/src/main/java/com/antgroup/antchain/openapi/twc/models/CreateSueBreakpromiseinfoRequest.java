// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateSueBreakpromiseinfoRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同唯一标识
    // 
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 当事人身份证号
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 当事人姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 当事人手机号
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 当事人邮箱地址
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 诉前Id
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
    // 
    @NameInMap("sue_date")
    @Validation(required = true)
    public String sueDate;

    // 商户统一社会信用代码或个人身份证
    @NameInMap("initiator_id")
    @Validation(required = true)
    public String initiatorId;

    // 商户或个人名称
    // 
    @NameInMap("initiator_name")
    @Validation(required = true)
    public String initiatorName;

    // 管辖法院名称
    @NameInMap("court_name")
    @Validation(required = true)
    public String courtName;

    // 法院唯一标识
    @NameInMap("court_id")
    @Validation(required = true)
    public String courtId;

    // 违约金额，精确到毫厘，即123400表示12.34元
    @NameInMap("break_promise_money")
    @Validation(required = true)
    public Long breakPromiseMoney;

    // 所属行业
    @NameInMap("business_class")
    @Validation(required = true)
    public String businessClass;

    public static CreateSueBreakpromiseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSueBreakpromiseinfoRequest self = new CreateSueBreakpromiseinfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateSueBreakpromiseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSueBreakpromiseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSueBreakpromiseinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSueBreakpromiseinfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateSueBreakpromiseinfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateSueBreakpromiseinfoRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreateSueBreakpromiseinfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateSueBreakpromiseinfoRequest setPreSueId(String preSueId) {
        this.preSueId = preSueId;
        return this;
    }
    public String getPreSueId() {
        return this.preSueId;
    }

    public CreateSueBreakpromiseinfoRequest setPromiseDate(String promiseDate) {
        this.promiseDate = promiseDate;
        return this;
    }
    public String getPromiseDate() {
        return this.promiseDate;
    }

    public CreateSueBreakpromiseinfoRequest setPromiseLimit(Long promiseLimit) {
        this.promiseLimit = promiseLimit;
        return this;
    }
    public Long getPromiseLimit() {
        return this.promiseLimit;
    }

    public CreateSueBreakpromiseinfoRequest setSueDate(String sueDate) {
        this.sueDate = sueDate;
        return this;
    }
    public String getSueDate() {
        return this.sueDate;
    }

    public CreateSueBreakpromiseinfoRequest setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
        return this;
    }
    public String getInitiatorId() {
        return this.initiatorId;
    }

    public CreateSueBreakpromiseinfoRequest setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }
    public String getInitiatorName() {
        return this.initiatorName;
    }

    public CreateSueBreakpromiseinfoRequest setCourtName(String courtName) {
        this.courtName = courtName;
        return this;
    }
    public String getCourtName() {
        return this.courtName;
    }

    public CreateSueBreakpromiseinfoRequest setCourtId(String courtId) {
        this.courtId = courtId;
        return this;
    }
    public String getCourtId() {
        return this.courtId;
    }

    public CreateSueBreakpromiseinfoRequest setBreakPromiseMoney(Long breakPromiseMoney) {
        this.breakPromiseMoney = breakPromiseMoney;
        return this;
    }
    public Long getBreakPromiseMoney() {
        return this.breakPromiseMoney;
    }

    public CreateSueBreakpromiseinfoRequest setBusinessClass(String businessClass) {
        this.businessClass = businessClass;
        return this;
    }
    public String getBusinessClass() {
        return this.businessClass;
    }

}
