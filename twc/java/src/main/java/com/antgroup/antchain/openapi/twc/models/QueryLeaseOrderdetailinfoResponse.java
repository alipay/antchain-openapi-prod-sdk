// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseOrderdetailinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 融资租赁订单id
    @NameInMap("order_id")
    public String orderId;

    // 订单创建时间 
    @NameInMap("order_create_time")
    public String orderCreateTime;

    // 订单支付时间 格式为
    @NameInMap("order_pay_time")
    public String orderPayTime;

    // 支付订单id
    @NameInMap("order_pay_id")
    public String orderPayId;

    // 订单支付类型 1 预授权，2信用套餐，3支付宝代扣，4其他，5网商直付通代扣
    @NameInMap("order_pay_type")
    public Long orderPayType;

    // 免押金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
    @NameInMap("deposit_free")
    public Long depositFree;

    // 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
    @NameInMap("acutal_pre_auth_free")
    public Long acutalPreAuthFree;

    // 租期单位月
    @NameInMap("rent_term")
    public Long rentTerm;

    // 月租金 精确到毫厘，即123400表示12.34元
    @NameInMap("rent_price_per_month")
    public Long rentPricePerMonth;

    // 到期买断价
    @NameInMap("buy_out_price")
    public Long buyOutPrice;

    // 承租人收货地址
    @NameInMap("user_address")
    public String userAddress;

    // 省份编码
    @NameInMap("province_code")
    public String provinceCode;

    // 城市编码
    @NameInMap("city_code")
    public String cityCode;

    // 地区编码
    @NameInMap("district_code")
    public String districtCode;

    // 租赁合同链接
    @NameInMap("rent_contract_url")
    public String rentContractUrl;

    // 保险单号
    @NameInMap("insurance_number")
    public String insuranceNumber;

    // 保险链接
    @NameInMap("insurance_url")
    public String insuranceUrl;

    // 采购合同协议
    @NameInMap("purchase_contract_url")
    public String purchaseContractUrl;

    // 蚁盾分数
    @NameInMap("yidun_score")
    public Long yidunScore;

    // 物流订单id
    @NameInMap("out_store_deliver_number")
    public String outStoreDeliverNumber;

    // 物流发货时间
    @NameInMap("out_store_time")
    public String outStoreTime;

    public static QueryLeaseOrderdetailinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseOrderdetailinfoResponse self = new QueryLeaseOrderdetailinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseOrderdetailinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseOrderdetailinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseOrderdetailinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseOrderdetailinfoResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseOrderdetailinfoResponse setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public QueryLeaseOrderdetailinfoResponse setOrderPayTime(String orderPayTime) {
        this.orderPayTime = orderPayTime;
        return this;
    }
    public String getOrderPayTime() {
        return this.orderPayTime;
    }

    public QueryLeaseOrderdetailinfoResponse setOrderPayId(String orderPayId) {
        this.orderPayId = orderPayId;
        return this;
    }
    public String getOrderPayId() {
        return this.orderPayId;
    }

    public QueryLeaseOrderdetailinfoResponse setOrderPayType(Long orderPayType) {
        this.orderPayType = orderPayType;
        return this;
    }
    public Long getOrderPayType() {
        return this.orderPayType;
    }

    public QueryLeaseOrderdetailinfoResponse setDepositFree(Long depositFree) {
        this.depositFree = depositFree;
        return this;
    }
    public Long getDepositFree() {
        return this.depositFree;
    }

    public QueryLeaseOrderdetailinfoResponse setAcutalPreAuthFree(Long acutalPreAuthFree) {
        this.acutalPreAuthFree = acutalPreAuthFree;
        return this;
    }
    public Long getAcutalPreAuthFree() {
        return this.acutalPreAuthFree;
    }

    public QueryLeaseOrderdetailinfoResponse setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public QueryLeaseOrderdetailinfoResponse setRentPricePerMonth(Long rentPricePerMonth) {
        this.rentPricePerMonth = rentPricePerMonth;
        return this;
    }
    public Long getRentPricePerMonth() {
        return this.rentPricePerMonth;
    }

    public QueryLeaseOrderdetailinfoResponse setBuyOutPrice(Long buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
        return this;
    }
    public Long getBuyOutPrice() {
        return this.buyOutPrice;
    }

    public QueryLeaseOrderdetailinfoResponse setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public QueryLeaseOrderdetailinfoResponse setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public QueryLeaseOrderdetailinfoResponse setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public QueryLeaseOrderdetailinfoResponse setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public QueryLeaseOrderdetailinfoResponse setRentContractUrl(String rentContractUrl) {
        this.rentContractUrl = rentContractUrl;
        return this;
    }
    public String getRentContractUrl() {
        return this.rentContractUrl;
    }

    public QueryLeaseOrderdetailinfoResponse setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
        return this;
    }
    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public QueryLeaseOrderdetailinfoResponse setInsuranceUrl(String insuranceUrl) {
        this.insuranceUrl = insuranceUrl;
        return this;
    }
    public String getInsuranceUrl() {
        return this.insuranceUrl;
    }

    public QueryLeaseOrderdetailinfoResponse setPurchaseContractUrl(String purchaseContractUrl) {
        this.purchaseContractUrl = purchaseContractUrl;
        return this;
    }
    public String getPurchaseContractUrl() {
        return this.purchaseContractUrl;
    }

    public QueryLeaseOrderdetailinfoResponse setYidunScore(Long yidunScore) {
        this.yidunScore = yidunScore;
        return this;
    }
    public Long getYidunScore() {
        return this.yidunScore;
    }

    public QueryLeaseOrderdetailinfoResponse setOutStoreDeliverNumber(String outStoreDeliverNumber) {
        this.outStoreDeliverNumber = outStoreDeliverNumber;
        return this;
    }
    public String getOutStoreDeliverNumber() {
        return this.outStoreDeliverNumber;
    }

    public QueryLeaseOrderdetailinfoResponse setOutStoreTime(String outStoreTime) {
        this.outStoreTime = outStoreTime;
        return this;
    }
    public String getOutStoreTime() {
        return this.outStoreTime;
    }

}
