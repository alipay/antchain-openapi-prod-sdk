<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

use AntChain\DEMO\Models\DemoClass;

class EchoGatewayCheckRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'inputDemo' => 'input_demo',
        'inputString' => 'input_string',
        'fileId' => 'file_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->inputDemo) {
            $res['input_demo'] = null !== $this->inputDemo ? $this->inputDemo->toMap() : null;
        }
        if (null !== $this->inputString) {
            $res['input_string'] = $this->inputString;
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
     * @return EchoGatewayCheckRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['input_demo'])){
            $model->inputDemo = DemoClass::fromMap($map['input_demo']);
        }
        if(isset($map['input_string'])){
            $model->inputString = $map['input_string'];
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

    // demo
    /**
     * @var DemoClass
     */
    public $inputDemo;

    // echo
    /**
     * @var string
     */
    public $inputString;

    // file_id
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
