<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotxProductResponse extends Model {
    protected $_name = [
        'id' => 'id',
        'tenantId' => 'tenant_id',
        'industryId' => 'industry_id',
        'industryName' => 'industry_name',
        'categoryId' => 'category_id',
        'categoryName' => 'category_name',
        'trustProductKey' => 'trust_product_key',
        'productKey' => 'product_key',
        'productName' => 'product_name',
        'productSecret' => 'product_secret',
        'nodeType' => 'node_type',
        'netType' => 'net_type',
        'productProtocol' => 'product_protocol',
        'protocolType' => 'protocol_type',
        'dataFormat' => 'data_format',
        'authType' => 'auth_type',
        'validateType' => 'validate_type',
        'publishStatus' => 'publish_status',
        'bizSource' => 'biz_source',
        'productStatus' => 'product_status',
        'customerId' => 'customer_id',
        'trustInstanceId' => 'trust_instance_id',
        'iotPlatform' => 'iot_platform',
        'description' => 'description',
        'thingModel' => 'thing_model',
        'enableDynReg' => 'enable_dyn_reg',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'tenantName' => 'tenant_name',
    ];
    public function validate() {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->industryId) {
            $res['industry_id'] = $this->industryId;
        }
        if (null !== $this->industryName) {
            $res['industry_name'] = $this->industryName;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productSecret) {
            $res['product_secret'] = $this->productSecret;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->netType) {
            $res['net_type'] = $this->netType;
        }
        if (null !== $this->productProtocol) {
            $res['product_protocol'] = $this->productProtocol;
        }
        if (null !== $this->protocolType) {
            $res['protocol_type'] = $this->protocolType;
        }
        if (null !== $this->dataFormat) {
            $res['data_format'] = $this->dataFormat;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->validateType) {
            $res['validate_type'] = $this->validateType;
        }
        if (null !== $this->publishStatus) {
            $res['publish_status'] = $this->publishStatus;
        }
        if (null !== $this->bizSource) {
            $res['biz_source'] = $this->bizSource;
        }
        if (null !== $this->productStatus) {
            $res['product_status'] = $this->productStatus;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->trustInstanceId) {
            $res['trust_instance_id'] = $this->trustInstanceId;
        }
        if (null !== $this->iotPlatform) {
            $res['iot_platform'] = $this->iotPlatform;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->thingModel) {
            $res['thing_model'] = $this->thingModel;
        }
        if (null !== $this->enableDynReg) {
            $res['enable_dyn_reg'] = $this->enableDynReg;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IotxProductResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['industry_id'])){
            $model->industryId = $map['industry_id'];
        }
        if(isset($map['industry_name'])){
            $model->industryName = $map['industry_name'];
        }
        if(isset($map['category_id'])){
            $model->categoryId = $map['category_id'];
        }
        if(isset($map['category_name'])){
            $model->categoryName = $map['category_name'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['product_secret'])){
            $model->productSecret = $map['product_secret'];
        }
        if(isset($map['node_type'])){
            $model->nodeType = $map['node_type'];
        }
        if(isset($map['net_type'])){
            $model->netType = $map['net_type'];
        }
        if(isset($map['product_protocol'])){
            $model->productProtocol = $map['product_protocol'];
        }
        if(isset($map['protocol_type'])){
            $model->protocolType = $map['protocol_type'];
        }
        if(isset($map['data_format'])){
            $model->dataFormat = $map['data_format'];
        }
        if(isset($map['auth_type'])){
            $model->authType = $map['auth_type'];
        }
        if(isset($map['validate_type'])){
            $model->validateType = $map['validate_type'];
        }
        if(isset($map['publish_status'])){
            $model->publishStatus = $map['publish_status'];
        }
        if(isset($map['biz_source'])){
            $model->bizSource = $map['biz_source'];
        }
        if(isset($map['product_status'])){
            $model->productStatus = $map['product_status'];
        }
        if(isset($map['customer_id'])){
            $model->customerId = $map['customer_id'];
        }
        if(isset($map['trust_instance_id'])){
            $model->trustInstanceId = $map['trust_instance_id'];
        }
        if(isset($map['iot_platform'])){
            $model->iotPlatform = $map['iot_platform'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['thing_model'])){
            $model->thingModel = $map['thing_model'];
        }
        if(isset($map['enable_dyn_reg'])){
            $model->enableDynReg = $map['enable_dyn_reg'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['tenant_name'])){
            $model->tenantName = $map['tenant_name'];
        }
        return $model;
    }
    // 主键id
    /**
     * @example 636804107650338816
     * @var string
     */
    public $id;

    // 租户id
    /**
     * @example POPVPRVV
     * @var string
     */
    public $tenantId;

    // 行业id
    /**
     * @example 607848084638142464
     * @var string
     */
    public $industryId;

    // 行业名称
    /**
     * @example 行业名称
     * @var string
     */
    public $industryName;

    // 品类id
    /**
     * @example 607848648444874752
     * @var string
     */
    public $categoryId;

    // 品类名称
    /**
     * @example 品类名称
     * @var string
     */
    public $categoryName;

    // 可信物联唯一产品标识
    /**
     * @example B7uwSpw2dAaxhZ8nJt
     * @var string
     */
    public $trustProductKey;

    // 三方物联网平台产品productKey
    /**
     * @example k03iddJl20m
     * @var string
     */
    public $productKey;

    // 产品名称
    /**
     * @example 产品名称
     * @var string
     */
    public $productName;

    // 产品秘钥
    /**
     * @example 1wugvASuxxxxxxxxxx
     * @var string
     */
    public $productSecret;

    // 节点类型：0-直连设备、1-网关设备、2-网关子设备
    /**
     * @example 0
     * @var int
     */
    public $nodeType;

    // 联网方式：0-wifi、1-蜂窝、2-以太网、3-蓝牙、4-蓝牙+蜂窝网络
    /**
     * @example 0
     * @var int
     */
    public $netType;

    // 产品协议：MQTT\CoAP
    /**
     * @example MQTT
     * @var string
     */
    public $productProtocol;

    // 接入网关协议:0-ZigBee协议、1-BLE协议、2-Modbus
    /**
     * @example 0
     * @var string
     */
    public $protocolType;

    // 数据格式：0-Alink Json、1-自定义透传
    /**
     * @example 0
     * @var string
     */
    public $dataFormat;

    // 认证类型：默认不认证
    /**
     * @example 0
     * @var int
     */
    public $authType;

    // 数据校验级别：0-免校验、1-弱校验
    /**
     * @example 0
     * @var int
     */
    public $validateType;

    // 发布状态：0-未发布、1-已发布
    /**
     * @example 0
     * @var int
     */
    public $publishStatus;

    // 业务来源：ekyt-数字钥匙、trust-可信上链、ai_hardware-AI硬件
    /**
     * @example ekyt
     * @var string
     */
    public $bizSource;

    // 产品的状态：0-开发中、1-已发布
    /**
     * @example 0
     * @var int
     */
    public $productStatus;

    // 关联客户id
    /**
     * @example SAIGE
     * @var string
     */
    public $customerId;

    // 可信物联实例Id
    /**
     * @example 8ws7jeelei
     * @var string
     */
    public $trustInstanceId;

    // 平台类型：0-alicloud、1-tuyaAli、2-自管
    /**
     * @example 1
     * @var int
     */
    public $iotPlatform;

    // 产品描述
    /**
     * @example 产品描述
     * @var string
     */
    public $description;

    // 产品物模型
    /**
     * @example 产品物模型
     * @var string
     */
    public $thingModel;

    // 是否启用动态注册：0-关闭动态注册、1-启用动态注册(仅支持涂鸦平台)
    /**
     * @example 0
     * @var int
     */
    public $enableDynReg;

    // 创建时间
    /**
     * @example 1783389225000
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 1783389225000
     * @var string
     */
    public $gmtModified;

    // 租户名称
    /**
     * @example 租户名称
     * @var string
     */
    public $tenantName;

}
