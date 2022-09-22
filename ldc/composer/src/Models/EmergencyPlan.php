<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class EmergencyPlan extends Model
{
    // 预案id
    /**
     * @example EP202201101723224858
     *
     * @var string
     */
    public $id;

    // 预案名称
    /**
     * @example wlftest
     *
     * @var string
     */
    public $name;

    // 预案参数，只有传预案id时才返回预案参数
    /**
     * @example []
     *
     * @var TemplateParam[]
     */
    public $params;
    protected $_name = [
        'id'     => 'id',
        'name'   => 'name',
        'params' => 'params',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
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
     * @return EmergencyPlan
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
        if (isset($map['params'])) {
            if (!empty($map['params'])) {
                $model->params = [];
                $n             = 0;
                foreach ($map['params'] as $item) {
                    $model->params[$n++] = null !== $item ? TemplateParam::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
