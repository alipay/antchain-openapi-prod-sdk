<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class VerifyDciCertRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId' => 'file_id',
        'clientToken' => 'client_token',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return VerifyDciCertRequest
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
        if(isset($map['client_token'])){
            $model->clientToken = $map['client_token'];
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

    // 通过上传文件接口上传文件后返回的fileId
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

    // 幂等号，用来保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    /**
     * @var string
     */
    public $clientToken;

}
