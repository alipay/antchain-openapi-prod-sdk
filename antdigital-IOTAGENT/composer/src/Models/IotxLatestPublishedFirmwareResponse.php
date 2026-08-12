<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class IotxLatestPublishedFirmwareResponse extends Model {
    protected $_name = [
        'trustProductKey' => 'trust_product_key',
        'productName' => 'product_name',
        'moduleName' => 'module_name',
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
        'needToVerify' => 'need_to_verify',
        'verifyStatus' => 'verify_status',
        'udi' => 'udi',
        'publishStatus' => 'publish_status',
        'supportChannels' => 'support_channels',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
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
        if (null !== $this->needToVerify) {
            $res['need_to_verify'] = $this->needToVerify;
        }
        if (null !== $this->verifyStatus) {
            $res['verify_status'] = $this->verifyStatus;
        }
        if (null !== $this->udi) {
            $res['udi'] = $this->udi;
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
     * @return IotxLatestPublishedFirmwareResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['module_name'])){
            $model->moduleName = $map['module_name'];
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
        if(isset($map['need_to_verify'])){
            $model->needToVerify = $map['need_to_verify'];
        }
        if(isset($map['verify_status'])){
            $model->verifyStatus = $map['verify_status'];
        }
        if(isset($map['udi'])){
            $model->udi = $map['udi'];
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
    // 可信产品唯一标识
    /**
     * @example 可信产品唯一标识
     * @var string
     */
    public $trustProductKey;

    // 产品名称
    /**
     * @example 产品名称
     * @var string
     */
    public $productName;

    // OTA 模块名称
    /**
     * @example OTA 模块名称
     * @var string
     */
    public $moduleName;

    // OTA 固件包唯一标识
    /**
     * @example OTA 固件包唯一标识
     * @var string
     */
    public $firmwareId;

    // OTA 固件包名称
    /**
     * @example OTA 固件包名称
     * @var string
     */
    public $firmwareName;

    // OTA 固件包下载地址
    /**
     * @example OTA 固件包下载地址
     * @var string
     */
    public $firmwareUrl;

    // 目标版本号
    /**
     * @example 目标版本号
     * @var string
     */
    public $destVersion;

    // OTA 固件包内容签名
    /**
     * @example OTA 固件包内容签名
     * @var string
     */
    public $firmwareSign;

    // 签名算法
    /**
     * @example 签名算法
     * @var string
     */
    public $signMethod;

    // OTA 固件包描述
    /**
     * @example OTA 固件包描述
     * @var string
     */
    public $firmwareDesc;

    // 固件包文件大小，单位为字节
    /**
     * @example 固件包文件大小，单位为字节
     * @var string
     */
    public $firmwareSize;

    // 固件包类型编码
    /**
     * @example 固件包类型编码
     * @var string
     */
    public $firmwareType;

    // 差分固件源版本号
    /**
     * @example 差分固件源版本号
     * @var string
     */
    public $srcVersion;

    // 是否需要验证，0 表示不需要，1 表示需要
    /**
     * @example 是否需要验证，0 表示不需要，1 表示需要
     * @var string
     */
    public $needToVerify;

    // 固件包验证状态编码
    /**
     * @example 固件包验证状态编码
     * @var string
     */
    public $verifyStatus;

    // 推送给设备的自定义信息
    /**
     * @example 推送给设备的自定义信息
     * @var string
     */
    public $udi;

    // 发布状态，固定为 1
    /**
     * @example 发布状态，固定为 1
     * @var string
     */
    public $publishStatus;

    // 固件包支持的升级通道列表
    /**
     * @example undefined
     * @var string[]
     */
    public $supportChannels;

}
