<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class StsActor extends Model
{
    // 虚拟身份受信关系集合，通常只包含一个
    /**
     * @example
     *
     * @var StsActorBinding[]
     */
    public $bindings;

    // 针对虚拟身份的描述
    /**
     * @example 测试描述
     *
     * @var string
     */
    public $description;

    // 虚拟身份名称，租户内唯一
    /**
     * @example testName
     *
     * @var string
     */
    public $name;

    // 虚拟身份所在租户
    /**
     * @example EZVNUJCN
     *
     * @var string
     */
    public $tenant;
    protected $_name = [
        'bindings'    => 'bindings',
        'description' => 'description',
        'name'        => 'name',
        'tenant'      => 'tenant',
    ];

    public function validate()
    {
        Model::validateRequired('bindings', $this->bindings, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('tenant', $this->tenant, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bindings) {
            $res['bindings'] = [];
            if (null !== $this->bindings && \is_array($this->bindings)) {
                $n = 0;
                foreach ($this->bindings as $item) {
                    $res['bindings'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StsActor
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bindings'])) {
            if (!empty($map['bindings'])) {
                $model->bindings = [];
                $n               = 0;
                foreach ($map['bindings'] as $item) {
                    $model->bindings[$n++] = null !== $item ? StsActorBinding::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }

        return $model;
    }
}
