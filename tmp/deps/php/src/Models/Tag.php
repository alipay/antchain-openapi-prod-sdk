<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Tag extends Model {
    protected $_name = [
        'displayName' => 'display_name',
        'key' => 'key',
        'type' => 'type',
        'value' => 'value',
    ];
    public function validate() {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('value', $this->value, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Tag
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // 可读键名
    /**
     * @example 技术栈
     * @var string
     */
    public $displayName;

    // 键名
    /**
     * @example techstack
     * @var string
     */
    public $key;

    // 映射类型，可选
    /**
     * @example 系统标签
     * @var string
     */
    public $type;

    // 键值
    /**
     * @example Spring Boot
     * @var string
     */
    public $value;

}
