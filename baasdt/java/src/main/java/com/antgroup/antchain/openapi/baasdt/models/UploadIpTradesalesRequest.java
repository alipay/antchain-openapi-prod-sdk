// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadIpTradesalesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 上传记录的用户的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // true 只上链不走真实支付，false 上链并链下真实支付账单
    @NameInMap("only_call_blockchain")
    @Validation(required = true)
    public Boolean onlyCallBlockchain;

    // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
    @NameInMap("pay_return_url")
    public String payReturnUrl;

    // 授权佣金比例
    @NameInMap("auth_rate")
    public String authRate;

    // 定向授权按量付费单价
    @NameInMap("auth_price")
    public String authPrice;

    // 商品销售数量
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 销售金额
    @NameInMap("total_sales")
    @Validation(required = true)
    public String totalSales;

    // 实付金额（授权交易）
    @NameInMap("total_payment")
    @Validation(required = true)
    public String totalPayment;

    // 销售数据列表
    @NameInMap("ip_sales_info_list")
    @Validation(required = true)
    public java.util.List<IPSalesInfo> ipSalesInfoList;

    public static UploadIpTradesalesRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadIpTradesalesRequest self = new UploadIpTradesalesRequest();
        return TeaModel.build(map, self);
    }

    public UploadIpTradesalesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadIpTradesalesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadIpTradesalesRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UploadIpTradesalesRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UploadIpTradesalesRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public UploadIpTradesalesRequest setOnlyCallBlockchain(Boolean onlyCallBlockchain) {
        this.onlyCallBlockchain = onlyCallBlockchain;
        return this;
    }
    public Boolean getOnlyCallBlockchain() {
        return this.onlyCallBlockchain;
    }

    public UploadIpTradesalesRequest setPayReturnUrl(String payReturnUrl) {
        this.payReturnUrl = payReturnUrl;
        return this;
    }
    public String getPayReturnUrl() {
        return this.payReturnUrl;
    }

    public UploadIpTradesalesRequest setAuthRate(String authRate) {
        this.authRate = authRate;
        return this;
    }
    public String getAuthRate() {
        return this.authRate;
    }

    public UploadIpTradesalesRequest setAuthPrice(String authPrice) {
        this.authPrice = authPrice;
        return this;
    }
    public String getAuthPrice() {
        return this.authPrice;
    }

    public UploadIpTradesalesRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public UploadIpTradesalesRequest setTotalSales(String totalSales) {
        this.totalSales = totalSales;
        return this;
    }
    public String getTotalSales() {
        return this.totalSales;
    }

    public UploadIpTradesalesRequest setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
        return this;
    }
    public String getTotalPayment() {
        return this.totalPayment;
    }

    public UploadIpTradesalesRequest setIpSalesInfoList(java.util.List<IPSalesInfo> ipSalesInfoList) {
        this.ipSalesInfoList = ipSalesInfoList;
        return this;
    }
    public java.util.List<IPSalesInfo> getIpSalesInfoList() {
        return this.ipSalesInfoList;
    }

}
