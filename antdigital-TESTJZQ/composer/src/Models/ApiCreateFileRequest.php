<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

use AntChain\TESTJZQ\Models\TestStruct;

class ApiCreateFileRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId' => 'file_id',
        'inputInt' => 'input_int',
        'fileName' => 'file_name',
        'inputArray' => 'input_array',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('inputInt', $this->inputInt, true);
        Model::validateRequired('fileName', $this->fileName, true);
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
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->inputInt) {
            $res['input_int'] = $this->inputInt;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->inputArray) {
            $res['input_array'] = [];
            if(null !== $this->inputArray && is_array($this->inputArray)){
                $n = 0;
                foreach($this->inputArray as $item){
                    $res['input_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApiCreateFileRequest
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
        if(isset($map['input_int'])){
            $model->inputInt = $map['input_int'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['input_array'])){
            if(!empty($map['input_array'])){
                $model->inputArray = [];
                $n = 0;
                foreach($map['input_array'] as $item) {
                    $model->inputArray[$n++] = null !== $item ? TestStruct::fromMap($item) : $item;
                }
            }
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

    // 1
    /**
     * @var int
     */
    public $inputInt;

    // 文件名
    /**
     * @var string
     */
    public $fileName;

    // input_array
    /**
     * @var TestStruct[]
     */
    public $inputArray;

}
