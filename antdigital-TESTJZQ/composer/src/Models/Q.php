<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TESTJZQ\Models\W;

class Q extends Model {
    protected $_name = [
        'q' => 'q',
        'w' => 'w',
    ];
    public function validate() {
        Model::validateRequired('q', $this->q, true);
        Model::validateRequired('w', $this->w, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->q) {
            $res['q'] = $this->q;
        }
        if (null !== $this->w) {
            $res['w'] = [];
            if(null !== $this->w && is_array($this->w)){
                $n = 0;
                foreach($this->w as $item){
                    $res['w'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Q
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['q'])){
            $model->q = $map['q'];
        }
        if(isset($map['w'])){
            if(!empty($map['w'])){
                $model->w = [];
                $n = 0;
                foreach($map['w'] as $item) {
                    $model->w[$n++] = null !== $item ? W::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // q
    /**
     * @example q
     * @var string
     */
    public $q;

    // w
    /**
     * @example undefined
     * @var W[]
     */
    public $w;

}
