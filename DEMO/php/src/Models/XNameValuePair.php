<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class XNameValuePair extends Model {
    protected $_name = [
        'name' => 'name',
        'value' => 'value',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return XNameValuePair
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // 键名
    /**
     * @example key
     * @var string
     */
    public $name;

    // 键值
    /**
     * @example value
     * @var string
     */
    public $value;

}
