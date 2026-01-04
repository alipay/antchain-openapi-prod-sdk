<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class AgentVariable extends Model
{
    // 变量对应的id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 变量名称
    /**
     * @example 变量名称
     *
     * @var string
     */
    public $name;

    // 变量code
    /**
     * @example 变量code
     *
     * @var string
     */
    public $code;

    // 变量描述
    /**
     * @example 变量描述
     *
     * @var string
     */
    public $desc;

    // 变量值
    /**
     * @example 变量值
     *
     * @var string
     */
    public $value;

    // 变量值更新时间
    /**
     * @example updateTime
     *
     * @var string
     */
    public $updateTime;

    // "business", "业务参数"
    // "memory", "记忆参数"
    /**
     * @example business
     *
     * @var string
     */
    public $type;

    // 是否模型可见
    /**
     * @example
     *
     * @var bool
     */
    public $showToModel;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'code'        => 'code',
        'desc'        => 'desc',
        'value'       => 'value',
        'updateTime'  => 'update_time',
        'type'        => 'type',
        'showToModel' => 'show_to_model',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('showToModel', $this->showToModel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->showToModel) {
            $res['show_to_model'] = $this->showToModel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentVariable
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['show_to_model'])) {
            $model->showToModel = $map['show_to_model'];
        }

        return $model;
    }
}
