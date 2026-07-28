<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MDIP\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class CallbackRiskplusMdipFileRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId' => 'file_id',
        'serviceCode' => 'service_code',
        'caller' => 'caller',
        'extend' => 'extend',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('serviceCode', $this->serviceCode, true);
        Model::validateRequired('caller', $this->caller, true);
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
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->caller) {
            $res['caller'] = $this->caller;
        }
        if (null !== $this->extend) {
            $res['extend'] = $this->extend;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackRiskplusMdipFileRequest
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
        if(isset($map['service_code'])){
            $model->serviceCode = $map['service_code'];
        }
        if(isset($map['caller'])){
            $model->caller = $map['caller'];
        }
        if(isset($map['extend'])){
            $model->extend = $map['extend'];
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

    // 数据服务code
    /**
     * @var string
     */
    public $serviceCode;

    // 业务调用方
    /**
     * @var string
     */
    public $caller;

    // 扩展字段
    /**
     * @var string
     */
    public $extend;

}
