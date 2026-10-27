<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

class B extends Model {
    protected $_name = [
        'q' => 'q',
        'w' => 'w',
        'e' => 'e',
    ];
    public function validate() {
        Model::validateRequired('q', $this->q, true);
        Model::validateRequired('w', $this->w, true);
        Model::validateRequired('e', $this->e, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->q) {
            $res['q'] = $this->q;
        }
        if (null !== $this->w) {
            $res['w'] = $this->w;
        }
        if (null !== $this->e) {
            $res['e'] = $this->e;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return B
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['q'])){
            $model->q = $map['q'];
        }
        if(isset($map['w'])){
            $model->w = $map['w'];
        }
        if(isset($map['e'])){
            $model->e = $map['e'];
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
     * @example w
     * @var string
     */
    public $w;

    // e
    /**
     * @example e
     * @var string
     */
    public $e;

}
