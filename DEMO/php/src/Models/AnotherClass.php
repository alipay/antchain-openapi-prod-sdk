<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DEMO\Models\DemoClass;

class AnotherClass extends Model {
    protected $_name = [
        'bar' => 'bar',
        'ref' => 'ref',
        'refList' => 'refList',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->bar) {
            $res['bar'] = $this->bar;
        }
        if (null !== $this->ref) {
            $res['ref'] = null !== $this->ref ? $this->ref->toMap() : null;
        }
        if (null !== $this->refList) {
            $res['refList'] = [];
            if(null !== $this->refList && is_array($this->refList)){
                $n = 0;
                foreach($this->refList as $item){
                    $res['refList'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
            $model->ref = DemoClass::fromMap($map['ref']);
        }
        if(isset($map['refList'])){
            if(!empty($map['refList'])){
                $model->refList = [];
                $n = 0;
                foreach($map['refList'] as $item) {
                    $model->refList[$n++] = null !== $item ? DemoClass::fromMap($item) : $item;
                }
            }
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
     * @var DemoClass
     */
    public $ref;

    // 列表引用Struct
    /**
     * @example 
     * @var DemoClass[]
     */
    public $refList;

}
