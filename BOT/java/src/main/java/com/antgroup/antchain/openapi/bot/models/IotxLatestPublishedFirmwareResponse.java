// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotxLatestPublishedFirmwareResponse extends TeaModel {
    // 可信产品唯一标识
    /**
     * <strong>example:</strong>
     * <p>可信产品唯一标识</p>
     */
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>产品名称</p>
     */
    @NameInMap("product_name")
    public String productName;

    // OTA 模块名称
    /**
     * <strong>example:</strong>
     * <p>OTA 模块名称</p>
     */
    @NameInMap("module_name")
    public String moduleName;

    // OTA 固件包唯一标识
    /**
     * <strong>example:</strong>
     * <p>OTA 固件包唯一标识</p>
     */
    @NameInMap("firmware_id")
    public String firmwareId;

    // OTA 固件包名称
    /**
     * <strong>example:</strong>
     * <p>OTA 固件包名称</p>
     */
    @NameInMap("firmware_name")
    public String firmwareName;

    // OTA 固件包下载地址
    /**
     * <strong>example:</strong>
     * <p>OTA 固件包下载地址</p>
     */
    @NameInMap("firmware_url")
    public String firmwareUrl;

    // 目标版本号
    /**
     * <strong>example:</strong>
     * <p>目标版本号</p>
     */
    @NameInMap("dest_version")
    public String destVersion;

    // OTA 固件包内容签名
    /**
     * <strong>example:</strong>
     * <p>OTA 固件包内容签名</p>
     */
    @NameInMap("firmware_sign")
    public String firmwareSign;

    // 签名算法
    /**
     * <strong>example:</strong>
     * <p>签名算法</p>
     */
    @NameInMap("sign_method")
    public String signMethod;

    // OTA 固件包描述
    /**
     * <strong>example:</strong>
     * <p>OTA 固件包描述</p>
     */
    @NameInMap("firmware_desc")
    public String firmwareDesc;

    // 固件包文件大小，单位为字节
    /**
     * <strong>example:</strong>
     * <p>固件包文件大小，单位为字节</p>
     */
    @NameInMap("firmware_size")
    public String firmwareSize;

    // 固件包类型编码
    /**
     * <strong>example:</strong>
     * <p>固件包类型编码</p>
     */
    @NameInMap("firmware_type")
    public String firmwareType;

    // 差分固件源版本号
    /**
     * <strong>example:</strong>
     * <p>差分固件源版本号</p>
     */
    @NameInMap("src_version")
    public String srcVersion;

    // 是否需要验证，0 表示不需要，1 表示需要
    /**
     * <strong>example:</strong>
     * <p>是否需要验证，0 表示不需要，1 表示需要</p>
     */
    @NameInMap("need_to_verify")
    public String needToVerify;

    // 固件包验证状态编码
    /**
     * <strong>example:</strong>
     * <p>固件包验证状态编码</p>
     */
    @NameInMap("verify_status")
    public String verifyStatus;

    // 推送给设备的自定义信息
    /**
     * <strong>example:</strong>
     * <p>推送给设备的自定义信息</p>
     */
    @NameInMap("udi")
    public String udi;

    // 发布状态，固定为 1
    /**
     * <strong>example:</strong>
     * <p>发布状态，固定为 1</p>
     */
    @NameInMap("publish_status")
    public String publishStatus;

    // 固件包支持的升级通道列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("support_channels")
    public java.util.List<String> supportChannels;

    public static IotxLatestPublishedFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        IotxLatestPublishedFirmwareResponse self = new IotxLatestPublishedFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public IotxLatestPublishedFirmwareResponse setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public IotxLatestPublishedFirmwareResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public IotxLatestPublishedFirmwareResponse setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public IotxLatestPublishedFirmwareResponse setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public IotxLatestPublishedFirmwareResponse setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }
    public String getFirmwareName() {
        return this.firmwareName;
    }

    public IotxLatestPublishedFirmwareResponse setFirmwareUrl(String firmwareUrl) {
        this.firmwareUrl = firmwareUrl;
        return this;
    }
    public String getFirmwareUrl() {
        return this.firmwareUrl;
    }

    public IotxLatestPublishedFirmwareResponse setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public IotxLatestPublishedFirmwareResponse setFirmwareSign(String firmwareSign) {
        this.firmwareSign = firmwareSign;
        return this;
    }
    public String getFirmwareSign() {
        return this.firmwareSign;
    }

    public IotxLatestPublishedFirmwareResponse setSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }
    public String getSignMethod() {
        return this.signMethod;
    }

    public IotxLatestPublishedFirmwareResponse setFirmwareDesc(String firmwareDesc) {
        this.firmwareDesc = firmwareDesc;
        return this;
    }
    public String getFirmwareDesc() {
        return this.firmwareDesc;
    }

    public IotxLatestPublishedFirmwareResponse setFirmwareSize(String firmwareSize) {
        this.firmwareSize = firmwareSize;
        return this;
    }
    public String getFirmwareSize() {
        return this.firmwareSize;
    }

    public IotxLatestPublishedFirmwareResponse setFirmwareType(String firmwareType) {
        this.firmwareType = firmwareType;
        return this;
    }
    public String getFirmwareType() {
        return this.firmwareType;
    }

    public IotxLatestPublishedFirmwareResponse setSrcVersion(String srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public String getSrcVersion() {
        return this.srcVersion;
    }

    public IotxLatestPublishedFirmwareResponse setNeedToVerify(String needToVerify) {
        this.needToVerify = needToVerify;
        return this;
    }
    public String getNeedToVerify() {
        return this.needToVerify;
    }

    public IotxLatestPublishedFirmwareResponse setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public String getVerifyStatus() {
        return this.verifyStatus;
    }

    public IotxLatestPublishedFirmwareResponse setUdi(String udi) {
        this.udi = udi;
        return this;
    }
    public String getUdi() {
        return this.udi;
    }

    public IotxLatestPublishedFirmwareResponse setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public IotxLatestPublishedFirmwareResponse setSupportChannels(java.util.List<String> supportChannels) {
        this.supportChannels = supportChannels;
        return this;
    }
    public java.util.List<String> getSupportChannels() {
        return this.supportChannels;
    }

}
