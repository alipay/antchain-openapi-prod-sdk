<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueueRouteEditionDTO extends Model
{
    // 版本
    /**
     * @example edition
     *
     * @var string
     */
    public $edition;

    // 路由版本（插入时可不填）
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 路由规则id（插入时可不填）
    /**
     * @example 1
     *
     * @var int
     */
    public $routeId;

    // 权重
    /**
     * @example 20
     *
     * @var int
     */
    public $scale;
    protected $_name = [
        'edition' => 'edition',
        'id'      => 'id',
        'routeId' => 'route_id',
        'scale'   => 'scale',
    ];

    public function validate()
    {
        Model::validateRequired('edition', $this->edition, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('routeId', $this->routeId, true);
        Model::validateRequired('scale', $this->scale, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->edition) {
            $res['edition'] = $this->edition;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->routeId) {
            $res['route_id'] = $this->routeId;
        }
        if (null !== $this->scale) {
            $res['scale'] = $this->scale;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueueRouteEditionDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['edition'])) {
            $model->edition = $map['edition'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['route_id'])) {
            $model->routeId = $map['route_id'];
        }
        if (isset($map['scale'])) {
            $model->scale = $map['scale'];
        }

        return $model;
    }
}
