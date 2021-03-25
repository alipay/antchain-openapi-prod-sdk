// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateConsumecardBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 账单标价(单位:元,精确到分)
    @NameInMap("bill_display_price")
    @Validation(required = true)
    public String billDisplayPrice;

    // 账单名称
    @NameInMap("bill_name")
    @Validation(required = true)
    public String billName;

    // 账单实际支付金额(单位:元,精确到分)
    @NameInMap("bill_token_price")
    @Validation(required = true)
    public String billTokenPrice;

    // 账单类型
    @NameInMap("bill_type")
    @Validation(required = true)
    public String billType;

    // 交易发起方的链上账户Id
    @NameInMap("buyer_account_id")
    @Validation(required = true)
    public String buyerAccountId;

    // 支付方证件号
    @NameInMap("buyer_id_number")
    @Validation(required = true)
    public String buyerIdNumber;

    // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
    @NameInMap("buyer_id_type")
    @Validation(required = true)
    public Long buyerIdType;

    // 支付方发起ip
    @NameInMap("buyer_ip")
    @Validation(required = true)
    public String buyerIp;

    // 支付方姓名
    @NameInMap("buyer_name")
    @Validation(required = true)
    public String buyerName;

    // 支付方手机号
    @NameInMap("buyer_phone")
    @Validation(required = true)
    public String buyerPhone;

    // 外部系统创建时间
    @NameInMap("origin_create_time")
    @Validation(required = true)
    public Long originCreateTime;

    // 外部系统订单号
    @NameInMap("origin_order_id")
    @Validation(required = true)
    public String originOrderId;

    // 附言（不必填）
    @NameInMap("remark")
    public String remark;

    // 交易接收方的链上账户Id
    @NameInMap("seller_account_id")
    @Validation(required = true)
    public String sellerAccountId;

    public static CreateConsumecardBillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumecardBillRequest self = new CreateConsumecardBillRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumecardBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConsumecardBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConsumecardBillRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public CreateConsumecardBillRequest setBillDisplayPrice(String billDisplayPrice) {
        this.billDisplayPrice = billDisplayPrice;
        return this;
    }
    public String getBillDisplayPrice() {
        return this.billDisplayPrice;
    }

    public CreateConsumecardBillRequest setBillName(String billName) {
        this.billName = billName;
        return this;
    }
    public String getBillName() {
        return this.billName;
    }

    public CreateConsumecardBillRequest setBillTokenPrice(String billTokenPrice) {
        this.billTokenPrice = billTokenPrice;
        return this;
    }
    public String getBillTokenPrice() {
        return this.billTokenPrice;
    }

    public CreateConsumecardBillRequest setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public CreateConsumecardBillRequest setBuyerAccountId(String buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
        return this;
    }
    public String getBuyerAccountId() {
        return this.buyerAccountId;
    }

    public CreateConsumecardBillRequest setBuyerIdNumber(String buyerIdNumber) {
        this.buyerIdNumber = buyerIdNumber;
        return this;
    }
    public String getBuyerIdNumber() {
        return this.buyerIdNumber;
    }

    public CreateConsumecardBillRequest setBuyerIdType(Long buyerIdType) {
        this.buyerIdType = buyerIdType;
        return this;
    }
    public Long getBuyerIdType() {
        return this.buyerIdType;
    }

    public CreateConsumecardBillRequest setBuyerIp(String buyerIp) {
        this.buyerIp = buyerIp;
        return this;
    }
    public String getBuyerIp() {
        return this.buyerIp;
    }

    public CreateConsumecardBillRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public CreateConsumecardBillRequest setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
        return this;
    }
    public String getBuyerPhone() {
        return this.buyerPhone;
    }

    public CreateConsumecardBillRequest setOriginCreateTime(Long originCreateTime) {
        this.originCreateTime = originCreateTime;
        return this;
    }
    public Long getOriginCreateTime() {
        return this.originCreateTime;
    }

    public CreateConsumecardBillRequest setOriginOrderId(String originOrderId) {
        this.originOrderId = originOrderId;
        return this;
    }
    public String getOriginOrderId() {
        return this.originOrderId;
    }

    public CreateConsumecardBillRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateConsumecardBillRequest setSellerAccountId(String sellerAccountId) {
        this.sellerAccountId = sellerAccountId;
        return this;
    }
    public String getSellerAccountId() {
        return this.sellerAccountId;
    }

}
