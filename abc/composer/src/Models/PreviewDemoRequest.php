<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABC\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class PreviewDemoRequest extends Model
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

    // 字符串入参
    /**
     * @var string
     */
    public $inputString;

    // Long型入参
    /**
     * @var int
     */
    public $inputNumber;

    // 布尔型入参
    /**
     * @var bool
     */
    public $inputBoolean;

    // ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
    /**
     * @var string
     */
    public $inputDate;

    // 字符串列表入参
    /**
     * @var string[]
     */
    public $inputStringList;

    // 示例结构体入参
    /**
     * @var AbcDemoStruct
     */
    public $inputStruct;

    // 结构体数组入参
    /**
     * @var AbcDemoStruct[]
     */
    public $inputStructList;

    // 123
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
        'inputString'       => 'input_string',
        'inputNumber'       => 'input_number',
        'inputBoolean'      => 'input_boolean',
        'inputDate'         => 'input_date',
        'inputStringList'   => 'input_string_list',
        'inputStruct'       => 'input_struct',
        'inputStructList'   => 'input_struct_list',
        'fileId'            => 'file_id',
    ];

    public function validate()
    {
        Model::validateRequired('inputString', $this->inputString, true);
        Model::validateRequired('inputBoolean', $this->inputBoolean, true);
        Model::validateRequired('inputStruct', $this->inputStruct, true);
        Model::validateRequired('inputStructList', $this->inputStructList, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateMaxLength('inputString', $this->inputString, 1000);
        Model::validateMinLength('inputString', $this->inputString, 10);
        Model::validatePattern('inputDate', $this->inputDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->inputString) {
            $res['input_string'] = $this->inputString;
        }
        if (null !== $this->inputNumber) {
            $res['input_number'] = $this->inputNumber;
        }
        if (null !== $this->inputBoolean) {
            $res['input_boolean'] = $this->inputBoolean;
        }
        if (null !== $this->inputDate) {
            $res['input_date'] = $this->inputDate;
        }
        if (null !== $this->inputStringList) {
            $res['input_string_list'] = $this->inputStringList;
        }
        if (null !== $this->inputStruct) {
            $res['input_struct'] = null !== $this->inputStruct ? $this->inputStruct->toMap() : null;
        }
        if (null !== $this->inputStructList) {
            $res['input_struct_list'] = [];
            if (null !== $this->inputStructList && \is_array($this->inputStructList)) {
                $n = 0;
                foreach ($this->inputStructList as $item) {
                    $res['input_struct_list'][$n++] = null !== $item ? $item->toMap() : $item;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreviewDemoRequest
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
        if (isset($map['input_string'])) {
            $model->inputString = $map['input_string'];
        }
        if (isset($map['input_number'])) {
            $model->inputNumber = $map['input_number'];
        }
        if (isset($map['input_boolean'])) {
            $model->inputBoolean = $map['input_boolean'];
        }
        if (isset($map['input_date'])) {
            $model->inputDate = $map['input_date'];
        }
        if (isset($map['input_string_list'])) {
            if (!empty($map['input_string_list'])) {
                $model->inputStringList = $map['input_string_list'];
            }
        }
        if (isset($map['input_struct'])) {
            $model->inputStruct = AbcDemoStruct::fromMap($map['input_struct']);
        }
        if (isset($map['input_struct_list'])) {
            if (!empty($map['input_struct_list'])) {
                $model->inputStructList = [];
                $n                      = 0;
                foreach ($map['input_struct_list'] as $item) {
                    $model->inputStructList[$n++] = null !== $item ? AbcDemoStruct::fromMap($item) : $item;
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

        return $model;
    }
}
