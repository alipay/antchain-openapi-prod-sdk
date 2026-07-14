// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotxProductResponse extends TeaModel {
    // 主键id
    /**
     * <strong>example:</strong>
     * <p>636804107650338816</p>
     */
    @NameInMap("id")
    public String id;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>POPVPRVV</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 行业id
    /**
     * <strong>example:</strong>
     * <p>607848084638142464</p>
     */
    @NameInMap("industry_id")
    public String industryId;

    // 行业名称
    /**
     * <strong>example:</strong>
     * <p>行业名称</p>
     */
    @NameInMap("industry_name")
    public String industryName;

    // 品类id
    /**
     * <strong>example:</strong>
     * <p>607848648444874752</p>
     */
    @NameInMap("category_id")
    public String categoryId;

    // 品类名称
    /**
     * <strong>example:</strong>
     * <p>品类名称</p>
     */
    @NameInMap("category_name")
    public String categoryName;

    // 可信物联唯一产品标识
    /**
     * <strong>example:</strong>
     * <p>B7uwSpw2dAaxhZ8nJt</p>
     */
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 三方物联网平台产品productKey
    /**
     * <strong>example:</strong>
     * <p>k03iddJl20m</p>
     */
    @NameInMap("product_key")
    public String productKey;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>产品名称</p>
     */
    @NameInMap("product_name")
    public String productName;

    // 产品秘钥
    /**
     * <strong>example:</strong>
     * <p>1wugvASuxxxxxxxxxx</p>
     */
    @NameInMap("product_secret")
    public String productSecret;

    // 节点类型：0-直连设备、1-网关设备、2-网关子设备
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("node_type")
    public Long nodeType;

    // 联网方式：0-wifi、1-蜂窝、2-以太网、3-蓝牙、4-蓝牙+蜂窝网络
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("net_type")
    public Long netType;

    // 产品协议：MQTT\CoAP
    /**
     * <strong>example:</strong>
     * <p>MQTT</p>
     */
    @NameInMap("product_protocol")
    public String productProtocol;

    // 接入网关协议:0-ZigBee协议、1-BLE协议、2-Modbus
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("protocol_type")
    public String protocolType;

    // 数据格式：0-Alink Json、1-自定义透传
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("data_format")
    public String dataFormat;

    // 认证类型：默认不认证
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("auth_type")
    public Long authType;

    // 数据校验级别：0-免校验、1-弱校验
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("validate_type")
    public Long validateType;

    // 发布状态：0-未发布、1-已发布
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("publish_status")
    public Long publishStatus;

    // 业务来源：ekyt-数字钥匙、trust-可信上链、ai_hardware-AI硬件
    /**
     * <strong>example:</strong>
     * <p>ekyt</p>
     */
    @NameInMap("biz_source")
    public String bizSource;

    // 产品的状态：0-开发中、1-已发布
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("product_status")
    public Long productStatus;

    // 关联客户id
    /**
     * <strong>example:</strong>
     * <p>SAIGE</p>
     */
    @NameInMap("customer_id")
    public String customerId;

    // 可信物联实例Id
    /**
     * <strong>example:</strong>
     * <p>8ws7jeelei</p>
     */
    @NameInMap("trust_instance_id")
    public String trustInstanceId;

    // 平台类型：0-alicloud、1-tuyaAli、2-自管
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("iot_platform")
    public Long iotPlatform;

    // 产品描述
    /**
     * <strong>example:</strong>
     * <p>产品描述</p>
     */
    @NameInMap("description")
    public String description;

    // 产品物模型
    /**
     * <strong>example:</strong>
     * <p>产品物模型</p>
     */
    @NameInMap("thing_model")
    public String thingModel;

    // 是否启用动态注册：0-关闭动态注册、1-启用动态注册(仅支持涂鸦平台)
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("enable_dyn_reg")
    public Long enableDynReg;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1783389225000</p>
     */
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>1783389225000</p>
     */
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 租户名称
    /**
     * <strong>example:</strong>
     * <p>租户名称</p>
     */
    @NameInMap("tenant_name")
    public String tenantName;

    public static IotxProductResponse build(java.util.Map<String, ?> map) throws Exception {
        IotxProductResponse self = new IotxProductResponse();
        return TeaModel.build(map, self);
    }

    public IotxProductResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IotxProductResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public IotxProductResponse setIndustryId(String industryId) {
        this.industryId = industryId;
        return this;
    }
    public String getIndustryId() {
        return this.industryId;
    }

    public IotxProductResponse setIndustryName(String industryName) {
        this.industryName = industryName;
        return this;
    }
    public String getIndustryName() {
        return this.industryName;
    }

    public IotxProductResponse setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public IotxProductResponse setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public IotxProductResponse setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public IotxProductResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public IotxProductResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public IotxProductResponse setProductSecret(String productSecret) {
        this.productSecret = productSecret;
        return this;
    }
    public String getProductSecret() {
        return this.productSecret;
    }

    public IotxProductResponse setNodeType(Long nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public Long getNodeType() {
        return this.nodeType;
    }

    public IotxProductResponse setNetType(Long netType) {
        this.netType = netType;
        return this;
    }
    public Long getNetType() {
        return this.netType;
    }

    public IotxProductResponse setProductProtocol(String productProtocol) {
        this.productProtocol = productProtocol;
        return this;
    }
    public String getProductProtocol() {
        return this.productProtocol;
    }

    public IotxProductResponse setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public IotxProductResponse setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public IotxProductResponse setAuthType(Long authType) {
        this.authType = authType;
        return this;
    }
    public Long getAuthType() {
        return this.authType;
    }

    public IotxProductResponse setValidateType(Long validateType) {
        this.validateType = validateType;
        return this;
    }
    public Long getValidateType() {
        return this.validateType;
    }

    public IotxProductResponse setPublishStatus(Long publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public Long getPublishStatus() {
        return this.publishStatus;
    }

    public IotxProductResponse setBizSource(String bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public String getBizSource() {
        return this.bizSource;
    }

    public IotxProductResponse setProductStatus(Long productStatus) {
        this.productStatus = productStatus;
        return this;
    }
    public Long getProductStatus() {
        return this.productStatus;
    }

    public IotxProductResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public IotxProductResponse setTrustInstanceId(String trustInstanceId) {
        this.trustInstanceId = trustInstanceId;
        return this;
    }
    public String getTrustInstanceId() {
        return this.trustInstanceId;
    }

    public IotxProductResponse setIotPlatform(Long iotPlatform) {
        this.iotPlatform = iotPlatform;
        return this;
    }
    public Long getIotPlatform() {
        return this.iotPlatform;
    }

    public IotxProductResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IotxProductResponse setThingModel(String thingModel) {
        this.thingModel = thingModel;
        return this;
    }
    public String getThingModel() {
        return this.thingModel;
    }

    public IotxProductResponse setEnableDynReg(Long enableDynReg) {
        this.enableDynReg = enableDynReg;
        return this;
    }
    public Long getEnableDynReg() {
        return this.enableDynReg;
    }

    public IotxProductResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public IotxProductResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public IotxProductResponse setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
