// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class StartConsumecardPurchaseRequest extends TeaModel {
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

    // 商品ID
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 外部系统交易创建时间，毫秒时间戳
    @NameInMap("origin_create_time")
    @Validation(required = true)
    public Long originCreateTime;

    // 外部系统订单号
    @NameInMap("origin_order_id")
    @Validation(required = true)
    public String originOrderId;

    // 附言
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    // 期望支付的商品价格(单位:元,精确到分)
    @NameInMap("token_price")
    @Validation(required = true)
    public String tokenPrice;

    public static StartConsumecardPurchaseRequest build(java.util.Map<String, ?> map) throws Exception {
        StartConsumecardPurchaseRequest self = new StartConsumecardPurchaseRequest();
        return TeaModel.build(map, self);
    }

    public StartConsumecardPurchaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartConsumecardPurchaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartConsumecardPurchaseRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public StartConsumecardPurchaseRequest setBuyerIdNumber(String buyerIdNumber) {
        this.buyerIdNumber = buyerIdNumber;
        return this;
    }
    public String getBuyerIdNumber() {
        return this.buyerIdNumber;
    }

    public StartConsumecardPurchaseRequest setBuyerIdType(Long buyerIdType) {
        this.buyerIdType = buyerIdType;
        return this;
    }
    public Long getBuyerIdType() {
        return this.buyerIdType;
    }

    public StartConsumecardPurchaseRequest setBuyerIp(String buyerIp) {
        this.buyerIp = buyerIp;
        return this;
    }
    public String getBuyerIp() {
        return this.buyerIp;
    }

    public StartConsumecardPurchaseRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public StartConsumecardPurchaseRequest setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
        return this;
    }
    public String getBuyerPhone() {
        return this.buyerPhone;
    }

    public StartConsumecardPurchaseRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public StartConsumecardPurchaseRequest setOriginCreateTime(Long originCreateTime) {
        this.originCreateTime = originCreateTime;
        return this;
    }
    public Long getOriginCreateTime() {
        return this.originCreateTime;
    }

    public StartConsumecardPurchaseRequest setOriginOrderId(String originOrderId) {
        this.originOrderId = originOrderId;
        return this;
    }
    public String getOriginOrderId() {
        return this.originOrderId;
    }

    public StartConsumecardPurchaseRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public StartConsumecardPurchaseRequest setTokenPrice(String tokenPrice) {
        this.tokenPrice = tokenPrice;
        return this;
    }
    public String getTokenPrice() {
        return this.tokenPrice;
    }

}
