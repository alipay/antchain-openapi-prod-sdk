<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class InitServerWillauthRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId' => 'file_id',
        'sceneId' => 'scene_id',
        'certName' => 'cert_name',
        'certNo' => 'cert_no',
        'encType' => 'enc_type',
        'facialPictureRef' => 'facial_picture_ref',
        'returnUrl' => 'return_url',
        'outerOrderNo' => 'outer_order_no',
        'externParam' => 'extern_param',
        'identityType' => 'identity_type',
        'certType' => 'cert_type',
        'model' => 'model',
        'materialEncType' => 'material_enc_type',
        'materialEncToken' => 'material_enc_token',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
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
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->encType) {
            $res['enc_type'] = $this->encType;
        }
        if (null !== $this->facialPictureRef) {
            $res['facial_picture_ref'] = $this->facialPictureRef;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->identityType) {
            $res['identity_type'] = $this->identityType;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->materialEncType) {
            $res['material_enc_type'] = $this->materialEncType;
        }
        if (null !== $this->materialEncToken) {
            $res['material_enc_token'] = $this->materialEncToken;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InitServerWillauthRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['fileObject'])){
            $model->fileObject = $map['fileObject'];
        }
        if(isset($map['fileObjectName'])){
            $model->fileObjectName = $map['fileObjectName'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['scene_id'])){
            $model->sceneId = $map['scene_id'];
        }
        if(isset($map['cert_name'])){
            $model->certName = $map['cert_name'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['enc_type'])){
            $model->encType = $map['enc_type'];
        }
        if(isset($map['facial_picture_ref'])){
            $model->facialPictureRef = $map['facial_picture_ref'];
        }
        if(isset($map['return_url'])){
            $model->returnUrl = $map['return_url'];
        }
        if(isset($map['outer_order_no'])){
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if(isset($map['extern_param'])){
            $model->externParam = $map['extern_param'];
        }
        if(isset($map['identity_type'])){
            $model->identityType = $map['identity_type'];
        }
        if(isset($map['cert_type'])){
            $model->certType = $map['cert_type'];
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['material_enc_type'])){
            $model->materialEncType = $map['material_enc_type'];
        }
        if(isset($map['material_enc_token'])){
            $model->materialEncToken = $map['material_enc_token'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // string
    /**
     * @description 待上传文件
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 场景id
    /**
     * @var string
     */
    public $sceneId;

    // 身份证姓名
    /**
     * @var string
     */
    public $certName;

    // 身份证号
    /**
     * @var string
     */
    public $certNo;

    // 加密方式
    /**
     * @var string
     */
    public $encType;

    // 无源比对图片base64
    /**
     * @var string
     */
    public $facialPictureRef;

    // 业务回跳地址
    /**
     * @var string
     */
    public $returnUrl;

    // 业务请求唯一标识
    /**
     * @var string
     */
    public $outerOrderNo;

    // 扩展参数
    /**
     * @var string
     */
    public $externParam;

    // 身份信息来源类型，当前仅支持证件（CERT_INFO）
    /**
     * @var string
     */
    public $identityType;

    // 证件类型，当前仅支持身份证类型证件，包括：二代身份证、港澳居住证、台湾居住证（IDENTITY_CARD）
    /**
     * @var string
     */
    public $certType;

    // 要进行活体检测的类型
    /**
     * @var string
     */
    public $model;

    // 图片/视频的传入加密模式
    /**
     * @var string
     */
    public $materialEncType;

    // RSA/SM2公钥加密后的AES/SM4密钥（Base64编码），用于传入的加密图片/视频。
    /**
     * @var string
     */
    public $materialEncToken;

}
