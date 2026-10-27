<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

class InitPacks extends Model {
    protected $_name = [
        'time' => 'time',
        'operator' => 'operator',
        'count' => 'count',
    ];
    public function validate() {
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('count', $this->count, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InitPacks
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['time'])){
            $model->time = $map['time'];
        }
        if(isset($map['operator'])){
            $model->operator = $map['operator'];
        }
        if(isset($map['count'])){
            $model->count = $map['count'];
        }
        return $model;
    }
    // 返回接收到请求的当前时间
    // 
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $time;

    // 1
    /**
     * @example 张三
     * @var string
     */
    public $operator;

    // 1
    /**
     * @example 1
     * @var int
     */
    public $count;

}
