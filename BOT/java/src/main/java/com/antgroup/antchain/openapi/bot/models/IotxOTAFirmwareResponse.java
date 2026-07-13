// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotxOTAFirmwareResponse extends TeaModel {
    // 主键id
    /**
     * <strong>example:</strong>
     * <p>632909854293495808</p>
     */
    @NameInMap("id")
    public String id;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1783934538000</p>
     */
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>1783934538000</p>
     */
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>POPVPRVV</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 可信物联唯一产品标识
    /**
     * <strong>example:</strong>
     * <p>FuPsO4bwFbyLSrQIiL</p>
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

    // 固件包id
    /**
     * <strong>example:</strong>
     * <p>kzDuv4OzIInE0VH5z2x5030100</p>
     */
    @NameInMap("firmware_id")
    public String firmwareId;

    // OTA升级包名称
    /**
     * <strong>example:</strong>
     * <p>OTA升级包名称</p>
     */
    @NameInMap("firmware_name")
    public String firmwareName;

    // 固件包URL
    /**
     * <strong>example:</strong>
     * <p>two_wheel_car/ota/GdzHGreIr4yBhJYHEg/jf_V1.0.65_hws-26-04-23_636999bb.bin</p>
     */
    @NameInMap("firmware_url")
    public String firmwareUrl;

    // 当前OTA升级包版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("dest_version")
    public String destVersion;

    // OTA升级包内容的签名值
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("firmware_sign")
    public String firmwareSign;

    // 升级包签名方法
    /**
     * <strong>example:</strong>
     * <p>MD5</p>
     */
    @NameInMap("sign_method")
    public String signMethod;

    // OTA升级包描述信息
    /**
     * <strong>example:</strong>
     * <p>OTA升级包描述信息</p>
     */
    @NameInMap("firmware_desc")
    public String firmwareDesc;

    // 升级包文件大小
    /**
     * <strong>example:</strong>
     * <p>2204591</p>
     */
    @NameInMap("firmware_size")
    public Long firmwareSize;

    // 升级包类型  0：整包升级包, 1: 差分升级包
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("firmware_type")
    public Long firmwareType;

    // 待升级OTA模块版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("src_version")
    public String srcVersion;

    // OTA模块名称
    /**
     * <strong>example:</strong>
     * <p>CAT1_OTA</p>
     */
    @NameInMap("module_name")
    public String moduleName;

    // 是否需要在创建批量升级任务前通过升级包验证：0-不需要；1-需要
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("need_to_verify")
    public Long needToVerify;

    // 推送给设备的自定义信息
    /**
     * <strong>example:</strong>
     * <p>推送给设备的自定义信息</p>
     */
    @NameInMap("udi")
    public String udi;

    // 升级包验证状态：0-未验证、1-已验证
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("verify_status")
    public Long verifyStatus;

    // 发布状态：0-未发布、1-已发布
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("publish_status")
    public Long publishStatus;

    // 固件包支持通道列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("support_channels")
    public java.util.List<String> supportChannels;

    public static IotxOTAFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        IotxOTAFirmwareResponse self = new IotxOTAFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public IotxOTAFirmwareResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IotxOTAFirmwareResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public IotxOTAFirmwareResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public IotxOTAFirmwareResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public IotxOTAFirmwareResponse setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public IotxOTAFirmwareResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public IotxOTAFirmwareResponse setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public IotxOTAFirmwareResponse setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }
    public String getFirmwareName() {
        return this.firmwareName;
    }

    public IotxOTAFirmwareResponse setFirmwareUrl(String firmwareUrl) {
        this.firmwareUrl = firmwareUrl;
        return this;
    }
    public String getFirmwareUrl() {
        return this.firmwareUrl;
    }

    public IotxOTAFirmwareResponse setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public IotxOTAFirmwareResponse setFirmwareSign(String firmwareSign) {
        this.firmwareSign = firmwareSign;
        return this;
    }
    public String getFirmwareSign() {
        return this.firmwareSign;
    }

    public IotxOTAFirmwareResponse setSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }
    public String getSignMethod() {
        return this.signMethod;
    }

    public IotxOTAFirmwareResponse setFirmwareDesc(String firmwareDesc) {
        this.firmwareDesc = firmwareDesc;
        return this;
    }
    public String getFirmwareDesc() {
        return this.firmwareDesc;
    }

    public IotxOTAFirmwareResponse setFirmwareSize(Long firmwareSize) {
        this.firmwareSize = firmwareSize;
        return this;
    }
    public Long getFirmwareSize() {
        return this.firmwareSize;
    }

    public IotxOTAFirmwareResponse setFirmwareType(Long firmwareType) {
        this.firmwareType = firmwareType;
        return this;
    }
    public Long getFirmwareType() {
        return this.firmwareType;
    }

    public IotxOTAFirmwareResponse setSrcVersion(String srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public String getSrcVersion() {
        return this.srcVersion;
    }

    public IotxOTAFirmwareResponse setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public IotxOTAFirmwareResponse setNeedToVerify(Long needToVerify) {
        this.needToVerify = needToVerify;
        return this;
    }
    public Long getNeedToVerify() {
        return this.needToVerify;
    }

    public IotxOTAFirmwareResponse setUdi(String udi) {
        this.udi = udi;
        return this;
    }
    public String getUdi() {
        return this.udi;
    }

    public IotxOTAFirmwareResponse setVerifyStatus(Long verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public Long getVerifyStatus() {
        return this.verifyStatus;
    }

    public IotxOTAFirmwareResponse setPublishStatus(Long publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public Long getPublishStatus() {
        return this.publishStatus;
    }

    public IotxOTAFirmwareResponse setSupportChannels(java.util.List<String> supportChannels) {
        this.supportChannels = supportChannels;
        return this;
    }
    public java.util.List<String> getSupportChannels() {
        return this.supportChannels;
    }

}
