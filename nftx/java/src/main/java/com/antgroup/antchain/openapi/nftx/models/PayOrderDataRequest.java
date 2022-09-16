// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class PayOrderDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接入方测订单号，保证全局唯一
    @NameInMap("external_order_no")
    @Validation(required = true)
    public String externalOrderNo;

    // 订单金额，单位为分
    @NameInMap("amount_cent")
    @Validation(required = true)
    public Long amountCent;

    // ALIPAY 表示小程序支付，ALIPAY_APP表示App支付, ALIPAY_WAP表示手机网站支付
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    // 订单标题，支付宝账单会展示
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 订单超时时间，秒级
    @NameInMap("timeout_expire_second")
    @Validation(required = true)
    public Long timeoutExpireSecond;

    // 接入方存储的accessToken
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 支付完成后的回跳地址
    @NameInMap("return_url")
    public String returnUrl;

    // AC编码
    @NameInMap("nft_id")
    public String nftId;

    // 鲸探测分配的实物规格编码
    @NameInMap("item_code")
    public String itemCode;

    // 用户购买的商品个数
    @NameInMap("item_num")
    public Long itemNum;

    // 商品单价，单位分
    @NameInMap("item_price_cent")
    public Long itemPriceCent;

    public static PayOrderDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PayOrderDataRequest self = new PayOrderDataRequest();
        return TeaModel.build(map, self);
    }

    public PayOrderDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PayOrderDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PayOrderDataRequest setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
        return this;
    }
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    public PayOrderDataRequest setAmountCent(Long amountCent) {
        this.amountCent = amountCent;
        return this;
    }
    public Long getAmountCent() {
        return this.amountCent;
    }

    public PayOrderDataRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public PayOrderDataRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public PayOrderDataRequest setTimeoutExpireSecond(Long timeoutExpireSecond) {
        this.timeoutExpireSecond = timeoutExpireSecond;
        return this;
    }
    public Long getTimeoutExpireSecond() {
        return this.timeoutExpireSecond;
    }

    public PayOrderDataRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public PayOrderDataRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public PayOrderDataRequest setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

    public PayOrderDataRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public PayOrderDataRequest setItemNum(Long itemNum) {
        this.itemNum = itemNum;
        return this;
    }
    public Long getItemNum() {
        return this.itemNum;
    }

    public PayOrderDataRequest setItemPriceCent(Long itemPriceCent) {
        this.itemPriceCent = itemPriceCent;
        return this;
    }
    public Long getItemPriceCent() {
        return this.itemPriceCent;
    }

}
