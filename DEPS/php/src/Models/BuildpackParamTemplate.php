<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BuildpackParamTemplate extends Model {
    protected $_name = [
        'buildpackId' => 'buildpack_id',
        'defaultValue' => 'default_value',
        'description' => 'description',
        'id' => 'id',
        'key' => 'key',
        'readonly' => 'readonly',
        'required' => 'required',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackParamTemplate
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['default_value'])){
            $model->defaultValue = $map['default_value'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
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
        return $model;
    }
    // 技术栈版本的id
    /**
     * @example 
     * @var string
     */
    public $buildpackId;

    // 技术栈版本参数的默认值
    /**
     * @example 
     * @var string
     */
    public $defaultValue;

    // 技术栈版本参数的描述
    /**
     * @example 
     * @var string
     */
    public $description;

    // id
    /**
     * @example 
     * @var string
     */
    public $id;

    // 技术栈版本参数的key
    /**
     * @example 
     * @var string
     */
    public $key;

    // 该技术栈版本参数是否是只读的
    /**
     * @example 
     * @var bool
     */
    public $readonly;

    // 该技术栈版本参数是否是必须的
    /**
     * @example 
     * @var bool
     */
    public $required;

}
