<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsCmdArg extends Model {
    protected $_name = [
        'name' => 'name',
        'value' => 'value',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('value', $this->value, true);
    }
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
     * @return OpsCmdArg
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
    // 指令参数名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // 指令参数值
    /**
     * @example 
     * @var string
     */
    public $value;

}
