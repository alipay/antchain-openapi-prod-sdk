<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

use AntChain\DEMO\Models\DemoClass;
use AntChain\DEMO\Models\TestStruct;

class EchoGatewayCheckRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'inputDemo' => 'input_demo',
        'inputString' => 'input_string',
        'fileId' => 'file_id',
        'inputArray' => 'input_array',
    ];
    public function validate() {
        Model::validateMaxLength('inputString', $this->inputString, 20);
        Model::validateMinLength('inputString', $this->inputString, 1);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('inputArray', $this->inputArray, true);
    }
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
        if (null !== $this->inputArray) {
            $res['input_array'] = null !== $this->inputArray ? $this->inputArray->toMap() : null;
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
        if(isset($map['input_array'])){
            $model->inputArray = TestStruct::fromMap($map['input_array']);
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

    // input_array
    /**
     * @var TestStruct
     */
    public $inputArray;

}
