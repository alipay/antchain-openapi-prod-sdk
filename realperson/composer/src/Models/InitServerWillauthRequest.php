<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class InitServerWillauthRequest extends Model
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

    // string
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
    public $facePictureRef;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId'            => 'file_id',
        'sceneId'           => 'scene_id',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'encType'           => 'enc_type',
        'facePictureRef'    => 'face_picture_ref',
        'returnUrl'         => 'return_url',
        'outerOrderNo'      => 'outer_order_no',
        'externParam'       => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
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
        if (null !== $this->facePictureRef) {
            $res['face_picture_ref'] = $this->facePictureRef;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitServerWillauthRequest
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
        if (isset($map['fileObject'])) {
            $model->fileObject = $map['fileObject'];
        }
        if (isset($map['fileObjectName'])) {
            $model->fileObjectName = $map['fileObjectName'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
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
        if (isset($map['enc_type'])) {
            $model->encType = $map['enc_type'];
        }
        if (isset($map['face_picture_ref'])) {
            $model->facePictureRef = $map['face_picture_ref'];
        }
        if (isset($map['return_url'])) {
            $model->returnUrl = $map['return_url'];
        }
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
