<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class SaveSchema extends Model {
    protected $_name = [
        'capacity' => 'capacity',
        'reserved' => 'reserved',
        'maxKeySize' => 'max_key_size',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->reserved) {
            $res['reserved'] = $this->reserved;
        }
        if (null !== $this->maxKeySize) {
            $res['max_key_size'] = $this->maxKeySize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveSchema
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['capacity'])){
            $model->capacity = $map['capacity'];
        }
        if(isset($map['reserved'])){
            $model->reserved = $map['reserved'];
        }
        if(isset($map['max_key_size'])){
            $model->maxKeySize = $map['max_key_size'];
        }
        return $model;
    }
    // capacity
    /**
     * @example capacity
     * @var int
     */
    public $capacity;

    // reserved
    /**
     * @example reserved
     * @var string
     */
    public $reserved;

    // max_key_size
    /**
     * @example max_key_size
     * @var int
     */
    public $maxKeySize;

}
