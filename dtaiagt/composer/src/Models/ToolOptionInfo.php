<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ToolOptionInfo extends Model
{
    // plugin = 工具；workflow = 工作流
    /**
     * @example plugin
     *
     * @var string
     */
    public $type;

    // 对应的工具/工作流名称
    /**
     * @example 123
     *
     * @var string
     */
    public $name;

    // 对应的工具/工作流名称
    /**
     * @example 对应的工具/工作流名称
     *
     * @var string
     */
    public $code;

    // 对应的工具/工作流参数列表
    /**
     * @example []
     *
     * @var ToolOptionParam[]
     */
    public $params;
    protected $_name = [
        'type'   => 'type',
        'name'   => 'name',
        'code'   => 'code',
        'params' => 'params',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('params', $this->params, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->params) {
            $res['params'] = [];
            if (null !== $this->params && \is_array($this->params)) {
                $n = 0;
                foreach ($this->params as $item) {
                    $res['params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ToolOptionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['params'])) {
            if (!empty($map['params'])) {
                $model->params = [];
                $n             = 0;
                foreach ($map['params'] as $item) {
                    $model->params[$n++] = null !== $item ? ToolOptionParam::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
