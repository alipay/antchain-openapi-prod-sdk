<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class BaselineScanResult extends Model
{
    // 类型
    /**
     * @example Pod
     *
     * @var string
     */
    public $kind;

    // 资源名称
    /**
     * @example catronus
     *
     * @var string
     */
    public $name;

    // 命名空间
    /**
     * @example prod
     *
     * @var string
     */
    public $namespace;

    // 资源id
    /**
     * @example resourceid
     *
     * @var string
     */
    public $resourceId;

    // 紧急control
    /**
     * @example
     *
     * @var Control[]
     */
    public $criticals;

    // 高危control
    /**
     * @example
     *
     * @var Control[]
     */
    public $highs;

    // 中危controls
    /**
     * @example
     *
     * @var Control[]
     */
    public $mids;

    // 低危controls
    /**
     * @example
     *
     * @var Control[]
     */
    public $lows;

    // 资源内容
    /**
     * @example myobject
     *
     * @var string
     */
    public $object;
    protected $_name = [
        'kind'       => 'kind',
        'name'       => 'name',
        'namespace'  => 'namespace',
        'resourceId' => 'resource_id',
        'criticals'  => 'criticals',
        'highs'      => 'highs',
        'mids'       => 'mids',
        'lows'       => 'lows',
        'object'     => 'object',
    ];

    public function validate()
    {
        Model::validateRequired('kind', $this->kind, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->kind) {
            $res['kind'] = $this->kind;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->criticals) {
            $res['criticals'] = [];
            if (null !== $this->criticals && \is_array($this->criticals)) {
                $n = 0;
                foreach ($this->criticals as $item) {
                    $res['criticals'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->highs) {
            $res['highs'] = [];
            if (null !== $this->highs && \is_array($this->highs)) {
                $n = 0;
                foreach ($this->highs as $item) {
                    $res['highs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->mids) {
            $res['mids'] = [];
            if (null !== $this->mids && \is_array($this->mids)) {
                $n = 0;
                foreach ($this->mids as $item) {
                    $res['mids'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->lows) {
            $res['lows'] = [];
            if (null !== $this->lows && \is_array($this->lows)) {
                $n = 0;
                foreach ($this->lows as $item) {
                    $res['lows'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->object) {
            $res['object'] = $this->object;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaselineScanResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['kind'])) {
            $model->kind = $map['kind'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['criticals'])) {
            if (!empty($map['criticals'])) {
                $model->criticals = [];
                $n                = 0;
                foreach ($map['criticals'] as $item) {
                    $model->criticals[$n++] = null !== $item ? Control::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['highs'])) {
            if (!empty($map['highs'])) {
                $model->highs = [];
                $n            = 0;
                foreach ($map['highs'] as $item) {
                    $model->highs[$n++] = null !== $item ? Control::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['mids'])) {
            if (!empty($map['mids'])) {
                $model->mids = [];
                $n           = 0;
                foreach ($map['mids'] as $item) {
                    $model->mids[$n++] = null !== $item ? Control::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['lows'])) {
            if (!empty($map['lows'])) {
                $model->lows = [];
                $n           = 0;
                foreach ($map['lows'] as $item) {
                    $model->lows[$n++] = null !== $item ? Control::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['object'])) {
            $model->object = $map['object'];
        }

        return $model;
    }
}
