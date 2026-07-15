<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotxOTAFirmwareResponse extends Model {
    protected $_name = [
        'id' => 'id',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'tenantId' => 'tenant_id',
        'trustProductKey' => 'trust_product_key',
        'productName' => 'product_name',
        'firmwareId' => 'firmware_id',
        'firmwareName' => 'firmware_name',
        'firmwareUrl' => 'firmware_url',
        'destVersion' => 'dest_version',
        'firmwareSign' => 'firmware_sign',
        'signMethod' => 'sign_method',
        'firmwareDesc' => 'firmware_desc',
        'firmwareSize' => 'firmware_size',
        'firmwareType' => 'firmware_type',
        'srcVersion' => 'src_version',
        'moduleName' => 'module_name',
        'needToVerify' => 'need_to_verify',
        'udi' => 'udi',
        'verifyStatus' => 'verify_status',
        'publishStatus' => 'publish_status',
        'supportChannels' => 'support_channels',
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
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->firmwareId) {
            $res['firmware_id'] = $this->firmwareId;
        }
        if (null !== $this->firmwareName) {
            $res['firmware_name'] = $this->firmwareName;
        }
        if (null !== $this->firmwareUrl) {
            $res['firmware_url'] = $this->firmwareUrl;
        }
        if (null !== $this->destVersion) {
            $res['dest_version'] = $this->destVersion;
        }
        if (null !== $this->firmwareSign) {
            $res['firmware_sign'] = $this->firmwareSign;
        }
        if (null !== $this->signMethod) {
            $res['sign_method'] = $this->signMethod;
        }
        if (null !== $this->firmwareDesc) {
            $res['firmware_desc'] = $this->firmwareDesc;
        }
        if (null !== $this->firmwareSize) {
            $res['firmware_size'] = $this->firmwareSize;
        }
        if (null !== $this->firmwareType) {
            $res['firmware_type'] = $this->firmwareType;
        }
        if (null !== $this->srcVersion) {
            $res['src_version'] = $this->srcVersion;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->needToVerify) {
            $res['need_to_verify'] = $this->needToVerify;
        }
        if (null !== $this->udi) {
            $res['udi'] = $this->udi;
        }
        if (null !== $this->verifyStatus) {
            $res['verify_status'] = $this->verifyStatus;
        }
        if (null !== $this->publishStatus) {
            $res['publish_status'] = $this->publishStatus;
        }
        if (null !== $this->supportChannels) {
            $res['support_channels'] = $this->supportChannels;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IotxOTAFirmwareResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['firmware_id'])){
            $model->firmwareId = $map['firmware_id'];
        }
        if(isset($map['firmware_name'])){
            $model->firmwareName = $map['firmware_name'];
        }
        if(isset($map['firmware_url'])){
            $model->firmwareUrl = $map['firmware_url'];
        }
        if(isset($map['dest_version'])){
            $model->destVersion = $map['dest_version'];
        }
        if(isset($map['firmware_sign'])){
            $model->firmwareSign = $map['firmware_sign'];
        }
        if(isset($map['sign_method'])){
            $model->signMethod = $map['sign_method'];
        }
        if(isset($map['firmware_desc'])){
            $model->firmwareDesc = $map['firmware_desc'];
        }
        if(isset($map['firmware_size'])){
            $model->firmwareSize = $map['firmware_size'];
        }
        if(isset($map['firmware_type'])){
            $model->firmwareType = $map['firmware_type'];
        }
        if(isset($map['src_version'])){
            $model->srcVersion = $map['src_version'];
        }
        if(isset($map['module_name'])){
            $model->moduleName = $map['module_name'];
        }
        if(isset($map['need_to_verify'])){
            $model->needToVerify = $map['need_to_verify'];
        }
        if(isset($map['udi'])){
            $model->udi = $map['udi'];
        }
        if(isset($map['verify_status'])){
            $model->verifyStatus = $map['verify_status'];
        }
        if(isset($map['publish_status'])){
            $model->publishStatus = $map['publish_status'];
        }
        if(isset($map['support_channels'])){
            if(!empty($map['support_channels'])){
                $model->supportChannels = $map['support_channels'];
            }
        }
        return $model;
    }
    // 主键id
    /**
     * @example 632909854293495808
     * @var string
     */
    public $id;

    // 创建时间
    /**
     * @example 1783934538000
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 1783934538000
     * @var string
     */
    public $gmtModified;

    // 租户id
    /**
     * @example POPVPRVV
     * @var string
     */
    public $tenantId;

    // 可信物联唯一产品标识
    /**
     * @example FuPsO4bwFbyLSrQIiL
     * @var string
     */
    public $trustProductKey;

    // 产品名称
    /**
     * @example 产品名称
     * @var string
     */
    public $productName;

    // 固件包id
    /**
     * @example kzDuv4OzIInE0VH5z2x5030100
     * @var string
     */
    public $firmwareId;

    // OTA升级包名称
    /**
     * @example OTA升级包名称
     * @var string
     */
    public $firmwareName;

    // 固件包URL
    /**
     * @example two_wheel_car/ota/GdzHGreIr4yBhJYHEg/jf_V1.0.65_hws-26-04-23_636999bb.bin
     * @var string
     */
    public $firmwareUrl;

    // 当前OTA升级包版本号
    /**
     * @example 1.0.0
     * @var string
     */
    public $destVersion;

    // OTA升级包内容的签名值
    /**
     * @example -
     * @var string
     */
    public $firmwareSign;

    // 升级包签名方法
    /**
     * @example MD5
     * @var string
     */
    public $signMethod;

    // OTA升级包描述信息
    /**
     * @example OTA升级包描述信息
     * @var string
     */
    public $firmwareDesc;

    // 升级包文件大小
    /**
     * @example 2204591
     * @var int
     */
    public $firmwareSize;

    // 升级包类型  0：整包升级包, 1: 差分升级包
    /**
     * @example 0
     * @var int
     */
    public $firmwareType;

    // 待升级OTA模块版本号
    /**
     * @example 1.0.0
     * @var string
     */
    public $srcVersion;

    // OTA模块名称
    /**
     * @example CAT1_OTA
     * @var string
     */
    public $moduleName;

    // 是否需要在创建批量升级任务前通过升级包验证：0-不需要；1-需要
    /**
     * @example 0
     * @var int
     */
    public $needToVerify;

    // 推送给设备的自定义信息
    /**
     * @example 推送给设备的自定义信息
     * @var string
     */
    public $udi;

    // 升级包验证状态：0-未验证、1-已验证
    /**
     * @example 1
     * @var int
     */
    public $verifyStatus;

    // 发布状态：0-未发布、1-已发布
    /**
     * @example 1
     * @var int
     */
    public $publishStatus;

    // 固件包支持通道列表
    /**
     * @example undefined
     * @var string[]
     */
    public $supportChannels;

}
