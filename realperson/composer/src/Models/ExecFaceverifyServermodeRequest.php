<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class ExecFaceverifyServermodeRequest extends Model
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

    // 真实姓名
    /**
     * @var string
     */
    public $certName;

    // 证件号码
    /**
     * @var string
     */
    public $certNo;

    // cert_name、cert_no两个字段的传入模式0：明文 1：密文
    /**
     * @var string
     */
    public $encType;

    // 证件类型，如身份证
    /**
     * @var string
     */
    public $certType;

    // 预留扩展参数
    /**
     * @var string
     */
    public $externParam;

    // 自定义比对源人脸图像，base64编码格式
    /**
     * @var string
     */
    public $facialPictureRef;

    // 身份信息来源类型，如证件
    /**
     * @var string
     */
    public $identityType;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    /**
     * @var string
     */
    public $outerOrderNo;

    // 场景ID
    /**
     * @var string
     */
    public $sceneId;

    // 商户自定义的用户ID
    /**
     * @var string
     */
    public $userId;

    // 用户的IP
    /**
     * @var string
     */
    public $userIp;

    // 用户的手机号（或其哈希值）
    /**
     * @var string
     */
    public $userMobile;

    // 待认证的人脸图像，base64编码格式
    /**
     * @var string
     */
    public $facialPictureAuth;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'encType'           => 'enc_type',
        'certType'          => 'cert_type',
        'externParam'       => 'extern_param',
        'facialPictureRef'  => 'facial_picture_ref',
        'identityType'      => 'identity_type',
        'outerOrderNo'      => 'outer_order_no',
        'sceneId'           => 'scene_id',
        'userId'            => 'user_id',
        'userIp'            => 'user_ip',
        'userMobile'        => 'user_mobile',
        'facialPictureAuth' => 'facial_picture_auth',
        'fileId'            => 'file_id',
    ];

    public function validate()
    {
        Model::validateRequired('identityType', $this->identityType, true);
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
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
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->encType) {
            $res['enc_type'] = $this->encType;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->facialPictureRef) {
            $res['facial_picture_ref'] = $this->facialPictureRef;
        }
        if (null !== $this->identityType) {
            $res['identity_type'] = $this->identityType;
        }
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userIp) {
            $res['user_ip'] = $this->userIp;
        }
        if (null !== $this->userMobile) {
            $res['user_mobile'] = $this->userMobile;
        }
        if (null !== $this->facialPictureAuth) {
            $res['facial_picture_auth'] = $this->facialPictureAuth;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecFaceverifyServermodeRequest
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
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['enc_type'])) {
            $model->encType = $map['enc_type'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['facial_picture_ref'])) {
            $model->facialPictureRef = $map['facial_picture_ref'];
        }
        if (isset($map['identity_type'])) {
            $model->identityType = $map['identity_type'];
        }
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_ip'])) {
            $model->userIp = $map['user_ip'];
        }
        if (isset($map['user_mobile'])) {
            $model->userMobile = $map['user_mobile'];
        }
        if (isset($map['facial_picture_auth'])) {
            $model->facialPictureAuth = $map['facial_picture_auth'];
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

        return $model;
    }
}
