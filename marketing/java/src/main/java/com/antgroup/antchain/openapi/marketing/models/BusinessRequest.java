// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class BusinessRequest extends TeaModel {
    // 客户名称
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 客户id
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 商机名称
    @NameInMap("business_name")
    @Validation(required = true)
    public String businessName;

    // 商机ID
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
    @NameInMap("business_status")
    @Validation(required = true)
    public String businessStatus;

    // 商机说明
    @NameInMap("business_explain")
    public String businessExplain;

    // 线索来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 商机时间
    @NameInMap("business_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String businessDate;

    // 租户
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 创建人工号
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    // 创建人花名
    @NameInMap("creator_nick")
    @Validation(required = true)
    public String creatorNick;

    public static BusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        BusinessRequest self = new BusinessRequest();
        return TeaModel.build(map, self);
    }

    public BusinessRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public BusinessRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public BusinessRequest setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public BusinessRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public BusinessRequest setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public BusinessRequest setBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
        return this;
    }
    public String getBusinessExplain() {
        return this.businessExplain;
    }

    public BusinessRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public BusinessRequest setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
        return this;
    }
    public String getBusinessDate() {
        return this.businessDate;
    }

    public BusinessRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public BusinessRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BusinessRequest setCreatorNick(String creatorNick) {
        this.creatorNick = creatorNick;
        return this;
    }
    public String getCreatorNick() {
        return this.creatorNick;
    }

}
