<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Control extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // rule
    /**
     * @example rule
     *
     * @var Rule[]
     */
    public $rules;

    // 名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'id'    => 'id',
        'rules' => 'rules',
        'name'  => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->rules) {
            $res['rules'] = [];
            if (null !== $this->rules && \is_array($this->rules)) {
                $n = 0;
                foreach ($this->rules as $item) {
                    $res['rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Control
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['rules'])) {
            if (!empty($map['rules'])) {
                $model->rules = [];
                $n            = 0;
                foreach ($map['rules'] as $item) {
                    $model->rules[$n++] = null !== $item ? Rule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
