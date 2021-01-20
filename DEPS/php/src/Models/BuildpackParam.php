<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BuildpackParam extends Model {
    protected $_name = [
        'defaultValue' => 'default_value',
        'key' => 'key',
        'readonly' => 'readonly',
        'required' => 'required',
        'description' => 'description',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->readonly) {
            $res['readonly'] = $this->readonly;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackParam
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['default_value'])){
            $model->defaultValue = $map['default_value'];
        }
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['readonly'])){
            $model->readonly = $map['readonly'];
        }
        if(isset($map['required'])){
            $model->required = $map['required'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        return $model;
    }
    // default_value
    /**
     * @example default_value
     * @var string
     */
    public $defaultValue;

    // key
    /**
     * @example key
     * @var string
     */
    public $key;

    // readonly
    /**
     * @example true, false
     * @var bool
     */
    public $readonly;

    // required
    /**
     * @example true, false
     * @var bool
     */
    public $required;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

}
