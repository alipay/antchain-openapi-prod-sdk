<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class GdCustomerInfo extends Model
{
    // 时间范围（查询年度数据时，返回该字段）
    /**
     * @example xxxx
     *
     * @var string
     */
    public $timeRange;

    // 数据总数
    /**
     * @example 638
     *
     * @var int
     */
    public $total;

    // 当前展示页
    /**
     * @example 1
     *
     * @var int
     */
    public $current;

    // 数据总页数
    /**
     * @example 638
     *
     * @var int
     */
    public $pages;

    // 每页显示数据条数
    /**
     * @example 1
     *
     * @var int
     */
    public $size;

    // 数据集合
    /**
     * @example
     *
     * @var GdCustomersRecord[]
     */
    public $records;
    protected $_name = [
        'timeRange' => 'time_range',
        'total'     => 'total',
        'current'   => 'current',
        'pages'     => 'pages',
        'size'      => 'size',
        'records'   => 'records',
    ];

    public function validate()
    {
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pages', $this->pages, true);
        Model::validateRequired('size', $this->size, true);
        Model::validateRequired('records', $this->records, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->timeRange) {
            $res['time_range'] = $this->timeRange;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pages) {
            $res['pages'] = $this->pages;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->records) {
            $res['records'] = [];
            if (null !== $this->records && \is_array($this->records)) {
                $n = 0;
                foreach ($this->records as $item) {
                    $res['records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GdCustomerInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['time_range'])) {
            $model->timeRange = $map['time_range'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['pages'])) {
            $model->pages = $map['pages'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['records'])) {
            if (!empty($map['records'])) {
                $model->records = [];
                $n              = 0;
                foreach ($map['records'] as $item) {
                    $model->records[$n++] = null !== $item ? GdCustomersRecord::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
