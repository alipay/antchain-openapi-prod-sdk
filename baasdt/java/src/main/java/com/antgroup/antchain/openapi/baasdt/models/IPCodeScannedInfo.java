// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeScannedInfo extends TeaModel {
    // 正版码ID
    @NameInMap("ip_code")
    @Validation(required = true)
    public String ipCode;

    // 用户的ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户的名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户头像地址
    @NameInMap("avatar")
    @Validation(required = true)
    public String avatar;

    // 用户的手机号
    @NameInMap("phone_number")
    public String phoneNumber;

    // 用户的位置信息
    @NameInMap("gps")
    public String gps;

    // 处理时间(毫秒时间戳)
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // IP ID
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 正版码商品信息配置列表
    @NameInMap("goods_info_list")
    public java.util.List<IPCodeGoodsInfo> goodsInfoList;

    // 正版码资源位配置信息列表
    @NameInMap("ad_info_list")
    public java.util.List<IPCodeAdvertisingInfo> adInfoList;

    public static IPCodeScannedInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCodeScannedInfo self = new IPCodeScannedInfo();
        return TeaModel.build(map, self);
    }

    public IPCodeScannedInfo setIpCode(String ipCode) {
        this.ipCode = ipCode;
        return this;
    }
    public String getIpCode() {
        return this.ipCode;
    }

    public IPCodeScannedInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IPCodeScannedInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public IPCodeScannedInfo setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public IPCodeScannedInfo setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public IPCodeScannedInfo setGps(String gps) {
        this.gps = gps;
        return this;
    }
    public String getGps() {
        return this.gps;
    }

    public IPCodeScannedInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public IPCodeScannedInfo setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public IPCodeScannedInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IPCodeScannedInfo setGoodsInfoList(java.util.List<IPCodeGoodsInfo> goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
        return this;
    }
    public java.util.List<IPCodeGoodsInfo> getGoodsInfoList() {
        return this.goodsInfoList;
    }

    public IPCodeScannedInfo setAdInfoList(java.util.List<IPCodeAdvertisingInfo> adInfoList) {
        this.adInfoList = adInfoList;
        return this;
    }
    public java.util.List<IPCodeAdvertisingInfo> getAdInfoList() {
        return this.adInfoList;
    }

}
