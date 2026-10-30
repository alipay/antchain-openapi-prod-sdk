<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DEMOSDK\Models\ResultTest;

class McpTestStruct extends Model {
    protected $_name = [
        'structString' => 'struct_string',
        'structNumber' => 'struct_number',
        'structBoolean' => 'struct_boolean',
        'structDate' => 'struct_date',
        'structList' => 'struct_list',
        'structStruct' => 'struct_struct',
    ];
    public function validate() {
        Model::validateRequired('structString', $this->structString, true);
        Model::validateRequired('structNumber', $this->structNumber, true);
        Model::validateRequired('structBoolean', $this->structBoolean, true);
        Model::validateRequired('structDate', $this->structDate, true);
        Model::validateRequired('structList', $this->structList, true);
        Model::validateRequired('structStruct', $this->structStruct, true);
        Model::validatePattern('structDate', $this->structDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->structString) {
            $res['struct_string'] = $this->structString;
        }
        if (null !== $this->structNumber) {
            $res['struct_number'] = $this->structNumber;
        }
        if (null !== $this->structBoolean) {
            $res['struct_boolean'] = $this->structBoolean;
        }
        if (null !== $this->structDate) {
            $res['struct_date'] = $this->structDate;
        }
        if (null !== $this->structList) {
            $res['struct_list'] = $this->structList;
        }
        if (null !== $this->structStruct) {
            $res['struct_struct'] = null !== $this->structStruct ? $this->structStruct->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return McpTestStruct
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['struct_string'])){
            $model->structString = $map['struct_string'];
        }
        if(isset($map['struct_number'])){
            $model->structNumber = $map['struct_number'];
        }
        if(isset($map['struct_boolean'])){
            $model->structBoolean = $map['struct_boolean'];
        }
        if(isset($map['struct_date'])){
            $model->structDate = $map['struct_date'];
        }
        if(isset($map['struct_list'])){
            if(!empty($map['struct_list'])){
                $model->structList = $map['struct_list'];
            }
        }
        if(isset($map['struct_struct'])){
            $model->structStruct = ResultTest::fromMap($map['struct_struct']);
        }
        return $model;
    }
    // string入参
    /**
     * @example string入参
     * @var string
     */
    public $structString;

    // number入参
    /**
     * @example 100
     * @var int
     */
    public $structNumber;

    // boolean入参
    /**
     * @example true
     * @var bool
     */
    public $structBoolean;

    // date入参
    /**
     * @example 2026-09-16 10:00:00
     * @var string
     */
    public $structDate;

    // list_string入参
    /**
     * @example ["VIP","新用户"]
     * @var string[]
     */
    public $structList;

    // struct入参
    /**
     * @example undefined
     * @var ResultTest
     */
    public $structStruct;

}
