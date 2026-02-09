<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class QueryRiskServerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备信息
    /**
     * @var DeviceInfo
     */
    public $deviceInfo;

    // 设备风险信息
    /**
     * @var DeviceRiskInfo
     */
    public $deviceRiskInfo;

    // 视频文件
    /**
     * @description 待上传文件
     *
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     *
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // base64编码最佳人脸图，可加密
    /**
     * @var string
     */
    public $faceImage;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    /**
     * @var string
     */
    public $outOrderNo;

    // 标识应用程序名称
    /**
     * @var string
     */
    public $appName;

    // 标识应用程序版本
    /**
     * @var string
     */
    public $appVersion;

    // 标识业务场景
    /**
     * @var string
     */
    public $sceneId;

    // 姓名，可加密
    /**
     * @var string
     */
    public $certName;

    // 身份证号，可加密
    /**
     * @var string
     */
    public $certNo;

    // 表示用户唯一id
    /**
     * @var string
     */
    public $uid;

    // cert_name、cert_no两个字段的传入模式0：明文 1：密文
    /**
     * @var string
     */
    public $encType;

    // 图片的传入加密模式 0：明文 1：AES加密
    /**
     * @var string
     */
    public $materialEncType;

    // 公钥加密后的密钥，用于传入的加密图片/视频
    /**
     * @var string
     */
    public $materialEncToken;

    // 端安全产品名
    /**
     * @var string
     */
    public $securityProductName;

    // 调用蚂蚁终端安全或人脸保镖的token
    /**
     * @var string
     */
    public $securityProductToken;

    // 端安全SDK版本
    /**
     * @var string
     */
    public $securityVersion;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'deviceInfo'           => 'device_info',
        'deviceRiskInfo'       => 'device_risk_info',
        'fileId'               => 'file_id',
        'faceImage'            => 'face_image',
        'outOrderNo'           => 'out_order_no',
        'appName'              => 'app_name',
        'appVersion'           => 'app_version',
        'sceneId'              => 'scene_id',
        'certName'             => 'cert_name',
        'certNo'               => 'cert_no',
        'uid'                  => 'uid',
        'encType'              => 'enc_type',
        'materialEncType'      => 'material_enc_type',
        'materialEncToken'     => 'material_enc_token',
        'securityProductName'  => 'security_product_name',
        'securityProductToken' => 'security_product_token',
        'securityVersion'      => 'security_version',
    ];

    public function validate()
    {
        Model::validateRequired('faceImage', $this->faceImage, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('securityProductName', $this->securityProductName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceInfo) {
            $res['device_info'] = null !== $this->deviceInfo ? $this->deviceInfo->toMap() : null;
        }
        if (null !== $this->deviceRiskInfo) {
            $res['device_risk_info'] = null !== $this->deviceRiskInfo ? $this->deviceRiskInfo->toMap() : null;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->faceImage) {
            $res['face_image'] = $this->faceImage;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->encType) {
            $res['enc_type'] = $this->encType;
        }
        if (null !== $this->materialEncType) {
            $res['material_enc_type'] = $this->materialEncType;
        }
        if (null !== $this->materialEncToken) {
            $res['material_enc_token'] = $this->materialEncToken;
        }
        if (null !== $this->securityProductName) {
            $res['security_product_name'] = $this->securityProductName;
        }
        if (null !== $this->securityProductToken) {
            $res['security_product_token'] = $this->securityProductToken;
        }
        if (null !== $this->securityVersion) {
            $res['security_version'] = $this->securityVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskServerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['device_info'])) {
            $model->deviceInfo = DeviceInfo::fromMap($map['device_info']);
        }
        if (isset($map['device_risk_info'])) {
            $model->deviceRiskInfo = DeviceRiskInfo::fromMap($map['device_risk_info']);
        }
        if (isset($map['fileObject'])) {
            $model->fileObject = $map['fileObject'];
        }
        if (isset($map['fileObjectName'])) {
            $model->fileObjectName = $map['fileObjectName'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['face_image'])) {
            $model->faceImage = $map['face_image'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['enc_type'])) {
            $model->encType = $map['enc_type'];
        }
        if (isset($map['material_enc_type'])) {
            $model->materialEncType = $map['material_enc_type'];
        }
        if (isset($map['material_enc_token'])) {
            $model->materialEncToken = $map['material_enc_token'];
        }
        if (isset($map['security_product_name'])) {
            $model->securityProductName = $map['security_product_name'];
        }
        if (isset($map['security_product_token'])) {
            $model->securityProductToken = $map['security_product_token'];
        }
        if (isset($map['security_version'])) {
            $model->securityVersion = $map['security_version'];
        }

        return $model;
    }
}
