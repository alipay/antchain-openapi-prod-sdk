// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class StubCommonInfo extends TeaModel {
    // 项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 客户名称（三方合约中甲方名称：景区或服务商）
    @NameInMap("scene_name")
    @Validation(required = true)
    public String sceneName;

    // 业务类型。目前只有数字票根这一个情景，枚举为：TICKET_STUB
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务来源；Alipay：支付宝，Scene：景区
    @NameInMap("biz_source")
    @Validation(required = true)
    public String bizSource;

    // 订单id。若bizSource为支付宝情况下传支付宝流水号（业务系统的出票流水号）；若bizSource为景区时传上游生成的订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单名称
    @NameInMap("order_name")
    public String orderName;

    // 订单总金额，单位：分。如传100，即为100分，1元
    @NameInMap("order_amount")
    @Validation(required = true)
    public Long orderAmount;

    // 下单时间
    @NameInMap("order_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderTime;

    // 待分账金额，单位：分。如传100，即为100分，1元
    @NameInMap("stub_amount")
    @Validation(required = true)
    public Long stubAmount;

    // 客户id。支付宝情况下传支付宝id，2088打头；景区时可传自定义的客户id
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    public static StubCommonInfo build(java.util.Map<String, ?> map) throws Exception {
        StubCommonInfo self = new StubCommonInfo();
        return TeaModel.build(map, self);
    }

    public StubCommonInfo setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public StubCommonInfo setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public StubCommonInfo setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StubCommonInfo setBizSource(String bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public String getBizSource() {
        return this.bizSource;
    }

    public StubCommonInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public StubCommonInfo setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public StubCommonInfo setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    public Long getOrderAmount() {
        return this.orderAmount;
    }

    public StubCommonInfo setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public StubCommonInfo setStubAmount(Long stubAmount) {
        this.stubAmount = stubAmount;
        return this;
    }
    public Long getStubAmount() {
        return this.stubAmount;
    }

    public StubCommonInfo setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

}
