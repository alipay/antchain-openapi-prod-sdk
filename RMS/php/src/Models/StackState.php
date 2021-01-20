<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class StackState extends Model {
    protected $_name = [
        'state' => 'state',
        'values' => 'values',
        'isBlack' => 'is_black',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->values) {
            $res['values'] = $this->values;
        }
        if (null !== $this->isBlack) {
            $res['is_black'] = $this->isBlack;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StackState
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['values'])){
            if(!empty($map['values'])){
                $model->values = $map['values'];
            }
        }
        if(isset($map['is_black'])){
            $model->isBlack = $map['is_black'];
        }
        return $model;
    }
    // state
    /**
     * @example state
     * @var string
     */
    public $state;

    // values
    /**
     * @example values
     * @var string[]
     */
    public $values;

    // is_black
    /**
     * @example true,false
     * @var bool
     */
    public $isBlack;

}
