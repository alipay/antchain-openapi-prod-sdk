<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppExtraInfo extends Model {
    protected $_name = [
        'name' => 'name',
        'type' => 'type',
        'value' => 'value',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
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
     * @return AppExtraInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // 应用额外元数据名称
    /**
     * @example xx
     * @var string
     */
    public $name;

    // 元数据类型为 TEXT, USER 类型
    /**
     * @example 元数据类型
     * @var string
     */
    public $type;

    // 元数据值
    /**
     * @example oo
     * @var string
     */
    public $value;

}
