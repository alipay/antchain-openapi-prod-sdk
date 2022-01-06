<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class SyncCluster extends Model
{
    // 集群id
    /**
     * @example 1000
     *
     * @var string
     */
    public $id;

    // [{   //扩展参数，比如涉及到鉴权
    // "key": "user",
    // "value": "xx"
    // }, {
    // "key": "password",
    // "value": "xx"
    // }]
    /**
     * @example
     *
     * @var KeyValueModel[]
     */
    public $extraParams;

    // 集群描述信息
    /**
     * @example test-onekey-source
     *
     * @var string
     */
    public $name;

    // 集群类型
    /**
     * @example EUREKA
     *
     * @var string
     */
    public $type;

    // 集群所有的机器列表，；隔开
    /**
     * @example 10.2.4.1;10.45.14.56
     *
     * @var string
     */
    public $vip;
    protected $_name = [
        'id'          => 'id',
        'extraParams' => 'extra_params',
        'name'        => 'name',
        'type'        => 'type',
        'vip'         => 'vip',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('extraParams', $this->extraParams, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('vip', $this->vip, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->extraParams) {
            $res['extra_params'] = [];
            if (null !== $this->extraParams && \is_array($this->extraParams)) {
                $n = 0;
                foreach ($this->extraParams as $item) {
                    $res['extra_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->vip) {
            $res['vip'] = $this->vip;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncCluster
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['extra_params'])) {
            if (!empty($map['extra_params'])) {
                $model->extraParams = [];
                $n                  = 0;
                foreach ($map['extra_params'] as $item) {
                    $model->extraParams[$n++] = null !== $item ? KeyValueModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['vip'])) {
            $model->vip = $map['vip'];
        }

        return $model;
    }
}
