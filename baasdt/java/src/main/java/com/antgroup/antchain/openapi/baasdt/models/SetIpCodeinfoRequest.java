// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetIpCodeinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 数字凭证对应的订单上版权方的账户链上ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 数字凭证商品信息配置列表
    @NameInMap("goods_info_list")
    public java.util.List<IPCodeGoodsInfo> goodsInfoList;

    // 数字凭证资源位配置信息列表
    @NameInMap("ad_info_list")
    public java.util.List<IPCodeAdvertisingInfo> adInfoList;

    // ip版权方信息
    @NameInMap("ipowner_info")
    public IPCodeIpOwnerInfo ipownerInfo;

    // (商家)配置数字凭证时间
    @NameInMap("code_set_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String codeSetTime;

    // 数字凭证配置附加信息，信息内容由调用方自定义。可以从配置查询和数字凭证详情接口上获取。
    @NameInMap("ext_info")
    public String extInfo;

    // 数字凭证前缀，本期暂不支持
    @NameInMap("show_code_prefix")
    public String showCodePrefix;

    public static SetIpCodeinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpCodeinfoRequest self = new SetIpCodeinfoRequest();
        return TeaModel.build(map, self);
    }

    public SetIpCodeinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetIpCodeinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetIpCodeinfoRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SetIpCodeinfoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SetIpCodeinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SetIpCodeinfoRequest setGoodsInfoList(java.util.List<IPCodeGoodsInfo> goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
        return this;
    }
    public java.util.List<IPCodeGoodsInfo> getGoodsInfoList() {
        return this.goodsInfoList;
    }

    public SetIpCodeinfoRequest setAdInfoList(java.util.List<IPCodeAdvertisingInfo> adInfoList) {
        this.adInfoList = adInfoList;
        return this;
    }
    public java.util.List<IPCodeAdvertisingInfo> getAdInfoList() {
        return this.adInfoList;
    }

    public SetIpCodeinfoRequest setIpownerInfo(IPCodeIpOwnerInfo ipownerInfo) {
        this.ipownerInfo = ipownerInfo;
        return this;
    }
    public IPCodeIpOwnerInfo getIpownerInfo() {
        return this.ipownerInfo;
    }

    public SetIpCodeinfoRequest setCodeSetTime(String codeSetTime) {
        this.codeSetTime = codeSetTime;
        return this;
    }
    public String getCodeSetTime() {
        return this.codeSetTime;
    }

    public SetIpCodeinfoRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SetIpCodeinfoRequest setShowCodePrefix(String showCodePrefix) {
        this.showCodePrefix = showCodePrefix;
        return this;
    }
    public String getShowCodePrefix() {
        return this.showCodePrefix;
    }

}
