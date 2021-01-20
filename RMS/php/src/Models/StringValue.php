<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class StringValue extends Model {
    protected $_name = [
        'value' => 'value',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StringValue
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // value
    /**
     * @example value
     * @var string
     */
    public $value;

}
