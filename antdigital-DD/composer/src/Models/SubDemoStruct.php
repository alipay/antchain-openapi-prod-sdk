<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class SubDemoStruct extends Model {
    protected $_name = [
        'name' => 'name',
        'value' => 'value',
        'a' => 'a',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('a', $this->a, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->a) {
            $res['a'] = $this->a;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SubDemoStruct
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        if(isset($map['a'])){
            $model->a = $map['a'];
        }
        return $model;
    }
    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // value
    /**
     * @example value
     * @var string
     */
    public $value;

    // a
    /**
     * @example a
     * @var string
     */
    public $a;

}
