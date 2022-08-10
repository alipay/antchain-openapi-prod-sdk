<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_82ffffda241e4bae94aada878f384539\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class EchoDemoGatewayCheckRequest extends Model
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

    // input_array
    /**
     * @var TestStruct[]
     */
    public $inputArray;

    // file_id
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

    // 1
    /**
     * @var int
     */
    public $inputInt;

    // 测试一下
    /**
     * @var string
     */
    public $fileName;

    // output_demo
    /**
     * @var DemoClass
     */
    public $outputDemo;

    // output_string
    /**
     * @var string
     */
    public $outputString;

    // file_url
    /**
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'inputDemo'         => 'input_demo',
        'inputString'       => 'input_string',
        'inputArray'        => 'input_array',
        'fileId'            => 'file_id',
        'inputInt'          => 'input_int',
        'fileName'          => 'file_name',
        'outputDemo'        => 'output_demo',
        'outputString'      => 'output_string',
        'fileUrl'           => 'file_url',
    ];

    public function validate()
    {
        Model::validateMaxLength('inputString', $this->inputString, 20);
        Model::validateMinLength('inputString', $this->inputString, 1);
        Model::validateRequired('inputArray', $this->inputArray, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('inputInt', $this->inputInt, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateMaximum('inputInt', $this->inputInt, 40);
        Model::validateMinimum('inputInt', $this->inputInt, 10);
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
        if (null !== $this->inputDemo) {
            $res['input_demo'] = null !== $this->inputDemo ? $this->inputDemo->toMap() : null;
        }
        if (null !== $this->inputString) {
            $res['input_string'] = $this->inputString;
        }
        if (null !== $this->inputArray) {
            $res['input_array'] = [];
            if (null !== $this->inputArray && \is_array($this->inputArray)) {
                $n = 0;
                foreach ($this->inputArray as $item) {
                    $res['input_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->outputDemo) {
            $res['output_demo'] = null !== $this->outputDemo ? $this->outputDemo->toMap() : null;
        }
        if (null !== $this->outputString) {
            $res['output_string'] = $this->outputString;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EchoDemoGatewayCheckRequest
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
        if (isset($map['input_demo'])) {
            $model->inputDemo = DemoClass::fromMap($map['input_demo']);
        }
        if (isset($map['input_string'])) {
            $model->inputString = $map['input_string'];
        }
        if (isset($map['input_array'])) {
            if (!empty($map['input_array'])) {
                $model->inputArray = [];
                $n                 = 0;
                foreach ($map['input_array'] as $item) {
                    $model->inputArray[$n++] = null !== $item ? TestStruct::fromMap($item) : $item;
                }
            }
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
        if (isset($map['input_int'])) {
            $model->inputInt = $map['input_int'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['output_demo'])) {
            $model->outputDemo = DemoClass::fromMap($map['output_demo']);
        }
        if (isset($map['output_string'])) {
            $model->outputString = $map['output_string'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
