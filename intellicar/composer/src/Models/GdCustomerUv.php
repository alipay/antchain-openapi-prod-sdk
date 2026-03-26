<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class GdCustomerUv extends Model
{
    // uv指数数量
    /**
     * @example 36
     *
     * @var int
     */
    public $total;

    // uv指数数量
    /**
     * @example 10
     *
     * @var int
     */
    public $count;

    // uv指数排序
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $sort;
    protected $_name = [
        'total' => 'total',
        'count' => 'count',
        'sort'  => 'sort',
    ];

    public function validate()
    {
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('sort', $this->sort, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->sort) {
            $res['sort'] = $this->sort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GdCustomerUv
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['sort'])) {
            $model->sort = $map['sort'];
        }

        return $model;
    }
}
