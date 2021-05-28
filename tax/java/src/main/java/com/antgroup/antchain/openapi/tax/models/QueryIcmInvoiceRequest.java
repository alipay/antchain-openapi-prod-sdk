// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryIcmInvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ISV名称，用于标识合作的企业
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 授权类型
    // 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    //  数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
    // 
    @NameInMap("callback_url")
    public String callbackUrl;

    // java long型
    // 起始金额，当type=03（报销查询）时必填
    @NameInMap("end_amount")
    public Long endAmount;

    // 查询起始时间(当auth_type=02或者03时必填)
    // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
    // 最大查询范围为6.1-6.30
    @NameInMap("end_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endDate;

    // 非必填，不填则查询所有类型发票
    // "01": "增值税专用发票"
    // "04": "增值税普通发票"
    // "10": "增值税电子普通发票"
    @NameInMap("invoice_type")
    public String invoiceType;

    // 查询的企业纳税人识别号
    @NameInMap("nsrsbh")
    @Validation(required = true)
    public String nsrsbh;

    // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // java long型
    // 起始金额，当type=03（报销查询）时必填
    @NameInMap("start_amount")
    public Long startAmount;

    // 查询起始时间(当auth_type=02或者03时必填)
    // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
    // 最大查询范围为6.1-6.30
    @NameInMap("start_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startDate;

    // 地区编码
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    public static QueryIcmInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIcmInvoiceRequest self = new QueryIcmInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryIcmInvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIcmInvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIcmInvoiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryIcmInvoiceRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryIcmInvoiceRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public QueryIcmInvoiceRequest setEndAmount(Long endAmount) {
        this.endAmount = endAmount;
        return this;
    }
    public Long getEndAmount() {
        return this.endAmount;
    }

    public QueryIcmInvoiceRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryIcmInvoiceRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public QueryIcmInvoiceRequest setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
        return this;
    }
    public String getNsrsbh() {
        return this.nsrsbh;
    }

    public QueryIcmInvoiceRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIcmInvoiceRequest setStartAmount(Long startAmount) {
        this.startAmount = startAmount;
        return this;
    }
    public Long getStartAmount() {
        return this.startAmount;
    }

    public QueryIcmInvoiceRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryIcmInvoiceRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

}
