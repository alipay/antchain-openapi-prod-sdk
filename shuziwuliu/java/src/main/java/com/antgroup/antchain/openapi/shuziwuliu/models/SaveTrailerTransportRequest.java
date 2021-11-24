// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveTrailerTransportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 企业统一社会信用代码
    @NameInMap("social_credit_code")
    @Validation(required = true)
    public String socialCreditCode;

    // 运营数据.月份
    @NameInMap("transport_month")
    @Validation(required = true)
    public String transportMonth;

    // 运营数据.运输箱量
    @NameInMap("transport_container_quantity")
    public Long transportContainerQuantity;

    // 运营数据.运费总额
    @NameInMap("freight_total_amount")
    @Validation(required = true)
    public String freightTotalAmount;

    // 运营数据.运输司机量
    @NameInMap("transport_driver_quantity")
    public Long transportDriverQuantity;

    public static SaveTrailerTransportRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTrailerTransportRequest self = new SaveTrailerTransportRequest();
        return TeaModel.build(map, self);
    }

    public SaveTrailerTransportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveTrailerTransportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveTrailerTransportRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SaveTrailerTransportRequest setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

    public SaveTrailerTransportRequest setTransportMonth(String transportMonth) {
        this.transportMonth = transportMonth;
        return this;
    }
    public String getTransportMonth() {
        return this.transportMonth;
    }

    public SaveTrailerTransportRequest setTransportContainerQuantity(Long transportContainerQuantity) {
        this.transportContainerQuantity = transportContainerQuantity;
        return this;
    }
    public Long getTransportContainerQuantity() {
        return this.transportContainerQuantity;
    }

    public SaveTrailerTransportRequest setFreightTotalAmount(String freightTotalAmount) {
        this.freightTotalAmount = freightTotalAmount;
        return this;
    }
    public String getFreightTotalAmount() {
        return this.freightTotalAmount;
    }

    public SaveTrailerTransportRequest setTransportDriverQuantity(Long transportDriverQuantity) {
        this.transportDriverQuantity = transportDriverQuantity;
        return this;
    }
    public Long getTransportDriverQuantity() {
        return this.transportDriverQuantity;
    }

}
