<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class CreateGatewayFileapiTestRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'inputString' => 'input_string',
        'orderId' => 'order_id',
        'bizContent' => 'biz_content',
        'fileId' => 'file_id',
    ];
    public function validate() {
        Model::validateRequired('inputString', $this->inputString, true);
        Model::validateRequired('fileId', $this->fileId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->inputString) {
            $res['input_string'] = $this->inputString;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateGatewayFileapiTestRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['input_string'])){
            $model->inputString = $map['input_string'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['biz_content'])){
            $model->bizContent = $map['biz_content'];
        }
        if(isset($map['fileObject'])){
            $model->fileObject = $map['fileObject'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // OK
    /**
     * @var string
     */
    public $inputString;

    // 订单信息
    /**
     * @var string
     */
    public $orderId;

    // 业务字段
    /**
     * @var string
     */
    public $bizContent;

    // 文件id
    /**
     * @description 待上传文件
     * @var Stream
     */
    public $fileObject;

    /**
     * @var string
     */
    public $fileId;

}
