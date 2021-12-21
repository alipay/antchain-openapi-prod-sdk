// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpCodeinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单ID
    @NameInMap("order_id")
    public String orderId;

    // 额外功能，包括基础功能，是否允许收藏等
    @NameInMap("features")
    public java.util.List<Long> features;

    // 正版码商品信息配置列表
    @NameInMap("goods_info_list")
    public java.util.List<IPCodeGoodsInfo> goodsInfoList;

    // 正版码资源位配置信息列表
    @NameInMap("ad_info_list")
    public java.util.List<IPCodeAdvertisingInfo> adInfoList;

    // ip版权方信息
    @NameInMap("ipowner_info")
    public IPCodeIpOwnerInfo ipownerInfo;

    // 0:未配置，1:配置成功可展示，9:下架【本期不实现】
    @NameInMap("ip_code_status")
    public Long ipCodeStatus;

    // 正版码前缀
    // 
    @NameInMap("show_code_prefix")
    public String showCodePrefix;

    // 正版码配置附加信息，信息内容由调用方自定义。
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryIpCodeinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpCodeinfoResponse self = new QueryIpCodeinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpCodeinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpCodeinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpCodeinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpCodeinfoResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryIpCodeinfoResponse setFeatures(java.util.List<Long> features) {
        this.features = features;
        return this;
    }
    public java.util.List<Long> getFeatures() {
        return this.features;
    }

    public QueryIpCodeinfoResponse setGoodsInfoList(java.util.List<IPCodeGoodsInfo> goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
        return this;
    }
    public java.util.List<IPCodeGoodsInfo> getGoodsInfoList() {
        return this.goodsInfoList;
    }

    public QueryIpCodeinfoResponse setAdInfoList(java.util.List<IPCodeAdvertisingInfo> adInfoList) {
        this.adInfoList = adInfoList;
        return this;
    }
    public java.util.List<IPCodeAdvertisingInfo> getAdInfoList() {
        return this.adInfoList;
    }

    public QueryIpCodeinfoResponse setIpownerInfo(IPCodeIpOwnerInfo ipownerInfo) {
        this.ipownerInfo = ipownerInfo;
        return this;
    }
    public IPCodeIpOwnerInfo getIpownerInfo() {
        return this.ipownerInfo;
    }

    public QueryIpCodeinfoResponse setIpCodeStatus(Long ipCodeStatus) {
        this.ipCodeStatus = ipCodeStatus;
        return this;
    }
    public Long getIpCodeStatus() {
        return this.ipCodeStatus;
    }

    public QueryIpCodeinfoResponse setShowCodePrefix(String showCodePrefix) {
        this.showCodePrefix = showCodePrefix;
        return this;
    }
    public String getShowCodePrefix() {
        return this.showCodePrefix;
    }

    public QueryIpCodeinfoResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
