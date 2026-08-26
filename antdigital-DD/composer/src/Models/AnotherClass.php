<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\QueryMap;

class AnotherClass extends Model {
    protected $_name = [
        'bar' => 'bar',
        'ref' => 'ref',
        'newStruct' => 'new_struct',
    ];
    public function validate() {
        Model::validateRequired('bar', $this->bar, true);
        Model::validateRequired('ref', $this->ref, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->bar) {
            $res['bar'] = $this->bar;
        }
        if (null !== $this->ref) {
            $res['ref'] = null !== $this->ref ? $this->ref->toMap() : null;
        }
        if (null !== $this->newStruct) {
            $res['new_struct'] = $this->newStruct;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AnotherClass
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['bar'])){
            $model->bar = $map['bar'];
        }
        if(isset($map['ref'])){
            $model->ref = QueryMap::fromMap($map['ref']);
        }
        if(isset($map['new_struct'])){
            $model->newStruct = $map['new_struct'];
        }
        return $model;
    }
    // 测试字段
    /**
     * @example some string
     * @var string
     */
    public $bar;

    // 引用字段
    /**
     * @example 
     * @var QueryMap
     */
    public $ref;

    // 新增结构体
    /**
     * @example new structs
     * @var string
     */
    public $newStruct;

}
