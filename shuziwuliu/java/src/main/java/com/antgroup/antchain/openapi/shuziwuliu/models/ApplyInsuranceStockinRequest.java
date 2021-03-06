// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceStockinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入库交易流水号，保持唯一；
    // 格式为 yyyyMMdd_身份标识_其他编码。
    // 系统会根据该流水号做防重、幂等判断逻辑。
    // 当极端场景中（接口超时），客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 入库单号，可参考格式：年月日+唯一字符
    @NameInMap("stockin_no")
    @Validation(required = true, maxLength = 50)
    public String stockinNo;

    // 入库时间，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("stockin_date")
    @Validation(required = true)
    public String stockinDate;

    // 时区	
    @NameInMap("timezone")
    @Validation(required = true, maxLength = 16)
    public String timezone;

    // 仓库代码
    @NameInMap("repository_code")
    @Validation(required = true, maxLength = 50)
    public String repositoryCode;

    // 客户代码
    @NameInMap("customer_code")
    @Validation(required = true, maxLength = 50)
    public String customerCode;

    // 保单号,国内起运时投保产生的保单号
    @NameInMap("policy_no")
    @Validation(maxLength = 64)
    public String policyNo;

    // 入库货物列表
    @NameInMap("stockin_cargos")
    @Validation(required = true)
    public java.util.List<StockinCargo> stockinCargos;

    public static ApplyInsuranceStockinRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceStockinRequest self = new ApplyInsuranceStockinRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceStockinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceStockinRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceStockinRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsuranceStockinRequest setStockinNo(String stockinNo) {
        this.stockinNo = stockinNo;
        return this;
    }
    public String getStockinNo() {
        return this.stockinNo;
    }

    public ApplyInsuranceStockinRequest setStockinDate(String stockinDate) {
        this.stockinDate = stockinDate;
        return this;
    }
    public String getStockinDate() {
        return this.stockinDate;
    }

    public ApplyInsuranceStockinRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public ApplyInsuranceStockinRequest setRepositoryCode(String repositoryCode) {
        this.repositoryCode = repositoryCode;
        return this;
    }
    public String getRepositoryCode() {
        return this.repositoryCode;
    }

    public ApplyInsuranceStockinRequest setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }
    public String getCustomerCode() {
        return this.customerCode;
    }

    public ApplyInsuranceStockinRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public ApplyInsuranceStockinRequest setStockinCargos(java.util.List<StockinCargo> stockinCargos) {
        this.stockinCargos = stockinCargos;
        return this;
    }
    public java.util.List<StockinCargo> getStockinCargos() {
        return this.stockinCargos;
    }

}
