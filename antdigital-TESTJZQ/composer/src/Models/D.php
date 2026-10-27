<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TESTJZQ\Models\S;

class D extends Model {
    protected $_name = [
        'a' => 'a',
        'b' => 'b',
    ];
    public function validate() {
        Model::validateRequired('a', $this->a, true);
        Model::validateRequired('b', $this->b, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->a) {
            $res['a'] = $this->a;
        }
        if (null !== $this->b) {
            $res['b'] = [];
            if(null !== $this->b && is_array($this->b)){
                $n = 0;
                foreach($this->b as $item){
                    $res['b'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return D
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['a'])){
            $model->a = $map['a'];
        }
        if(isset($map['b'])){
            if(!empty($map['b'])){
                $model->b = [];
                $n = 0;
                foreach($map['b'] as $item) {
                    $model->b[$n++] = null !== $item ? S::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // a
    /**
     * @example a
     * @var string
     */
    public $a;

    // s
    /**
     * @example undefined
     * @var S[]
     */
    public $b;

}
