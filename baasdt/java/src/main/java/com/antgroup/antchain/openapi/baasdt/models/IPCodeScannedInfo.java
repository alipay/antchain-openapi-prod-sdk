// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeScannedInfo extends TeaModel {
    // 正版码ID
    @NameInMap("ip_code")
    @Validation(required = true)
    public String ipCode;

    // 正版码所在批次已申请的正版码总数
    @NameInMap("batch_used_count")
    public Long batchUsedCount;

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

    // 领取正版码的交易哈希
    @NameInMap("hash")
    public String hash;

    // 领取正版码交易所在的区块高度
    @NameInMap("block_number")
    public Long blockNumber;

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

    // ip版权方信息
    @NameInMap("ipowner_info")
    public IPCodeIpOwnerInfo ipownerInfo;

    // 0:未配置, 1:配置成功可展示, 4:已经失效, 9:下架【本期不实现】
    @NameInMap("ip_code_status")
    public Long ipCodeStatus;

    // 额外功能，包括是否允许收藏等
    @NameInMap("features")
    public java.util.List<Long> features;

    // 核验次数，配置生效后的核验次数统计
    @NameInMap("check_counts")
    public Long checkCounts;

    // 正版码关联的I IP信息
    @NameInMap("ip_info")
    public IPCodeIpGoodInfo ipInfo;

    // UNI码
    @NameInMap("uni_code")
    public String uniCode;

    // 正版码配置附加信息，信息内容由调用方自定义
    @NameInMap("ext_info")
    public String extInfo;

    // 收藏时间(UNIX时间戳)0表示未被收藏
    @NameInMap("receive_time")
    public Long receiveTime;

    // 同一批次存在失效UNI码的场景下,指示更新后的下标
    @NameInMap("fixed_index")
    public Long fixedIndex;

    // 同一批次存在失效UNI码的场景下,指示更新后的总量
    @NameInMap("fixed_count")
    public Long fixedCount;

    // 小龙坎有限公司
    @NameInMap("account_external_name")
    public String accountExternalName;

    // 码失效时间（毫秒时间戳）
    @NameInMap("disabled_date")
    public Long disabledDate;

    // 核验记录清空时间戳
    @NameInMap("check_empty_time")
    public Long checkEmptyTime;

    // 同一批次已被领取的数量
    @NameInMap("receive_count")
    public Long receiveCount;

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

    public IPCodeScannedInfo setBatchUsedCount(Long batchUsedCount) {
        this.batchUsedCount = batchUsedCount;
        return this;
    }
    public Long getBatchUsedCount() {
        return this.batchUsedCount;
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

    public IPCodeScannedInfo setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public IPCodeScannedInfo setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
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

    public IPCodeScannedInfo setIpownerInfo(IPCodeIpOwnerInfo ipownerInfo) {
        this.ipownerInfo = ipownerInfo;
        return this;
    }
    public IPCodeIpOwnerInfo getIpownerInfo() {
        return this.ipownerInfo;
    }

    public IPCodeScannedInfo setIpCodeStatus(Long ipCodeStatus) {
        this.ipCodeStatus = ipCodeStatus;
        return this;
    }
    public Long getIpCodeStatus() {
        return this.ipCodeStatus;
    }

    public IPCodeScannedInfo setFeatures(java.util.List<Long> features) {
        this.features = features;
        return this;
    }
    public java.util.List<Long> getFeatures() {
        return this.features;
    }

    public IPCodeScannedInfo setCheckCounts(Long checkCounts) {
        this.checkCounts = checkCounts;
        return this;
    }
    public Long getCheckCounts() {
        return this.checkCounts;
    }

    public IPCodeScannedInfo setIpInfo(IPCodeIpGoodInfo ipInfo) {
        this.ipInfo = ipInfo;
        return this;
    }
    public IPCodeIpGoodInfo getIpInfo() {
        return this.ipInfo;
    }

    public IPCodeScannedInfo setUniCode(String uniCode) {
        this.uniCode = uniCode;
        return this;
    }
    public String getUniCode() {
        return this.uniCode;
    }

    public IPCodeScannedInfo setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public IPCodeScannedInfo setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
        return this;
    }
    public Long getReceiveTime() {
        return this.receiveTime;
    }

    public IPCodeScannedInfo setFixedIndex(Long fixedIndex) {
        this.fixedIndex = fixedIndex;
        return this;
    }
    public Long getFixedIndex() {
        return this.fixedIndex;
    }

    public IPCodeScannedInfo setFixedCount(Long fixedCount) {
        this.fixedCount = fixedCount;
        return this;
    }
    public Long getFixedCount() {
        return this.fixedCount;
    }

    public IPCodeScannedInfo setAccountExternalName(String accountExternalName) {
        this.accountExternalName = accountExternalName;
        return this;
    }
    public String getAccountExternalName() {
        return this.accountExternalName;
    }

    public IPCodeScannedInfo setDisabledDate(Long disabledDate) {
        this.disabledDate = disabledDate;
        return this;
    }
    public Long getDisabledDate() {
        return this.disabledDate;
    }

    public IPCodeScannedInfo setCheckEmptyTime(Long checkEmptyTime) {
        this.checkEmptyTime = checkEmptyTime;
        return this;
    }
    public Long getCheckEmptyTime() {
        return this.checkEmptyTime;
    }

    public IPCodeScannedInfo setReceiveCount(Long receiveCount) {
        this.receiveCount = receiveCount;
        return this;
    }
    public Long getReceiveCount() {
        return this.receiveCount;
    }

}
