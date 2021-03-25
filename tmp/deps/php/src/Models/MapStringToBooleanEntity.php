<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class MapStringToBooleanEntity extends Model {
    protected $_name = [
        'key' => 'key',
        'value' => 'value',
    ];
    public function validate() {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('value', $this->value, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MapStringToBooleanEntity
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // key
    /**
     * @example key
     * @var string
     */
    public $key;

    // value
    /**
     * @example true, false
     * @var bool
     */
    public $value;

}
