<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TRITESTDEMO\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TRITESTDEMO\Models\DemoClass;

class ResultTest extends Model {
    protected $_name = [
        'name' => 'name',
        'list' => 'list',
    ];
    public function validate() {
        Model::validateRequired('list', $this->list, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->list) {
            $res['list'] = null !== $this->list ? $this->list->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResultTest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['list'])){
            $model->list = DemoClass::fromMap($map['list']);
        }
        return $model;
    }
    // 姓名
    /**
     * @example 张三
     * @var string
     */
    public $name;

    // test
    /**
     * @example undefined
     * @var DemoClass
     */
    public $list;

}
