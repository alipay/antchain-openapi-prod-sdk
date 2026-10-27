<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

class S extends Model {
    protected $_name = [
        'a' => 'a',
        'b' => 'b',
        'c' => 'c',
    ];
    public function validate() {
        Model::validateRequired('a', $this->a, true);
        Model::validateRequired('b', $this->b, true);
        Model::validateRequired('c', $this->c, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->a) {
            $res['a'] = $this->a;
        }
        if (null !== $this->b) {
            $res['b'] = $this->b;
        }
        if (null !== $this->c) {
            $res['c'] = $this->c;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return S
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['a'])){
            $model->a = $map['a'];
        }
        if(isset($map['b'])){
            $model->b = $map['b'];
        }
        if(isset($map['c'])){
            $model->c = $map['c'];
        }
        return $model;
    }
    // a
    /**
     * @example a
     * @var string
     */
    public $a;

    // b
    /**
     * @example b
     * @var string
     */
    public $b;

    // c
    /**
     * @example c
     * @var string
     */
    public $c;

}
