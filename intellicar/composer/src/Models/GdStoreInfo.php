<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class GdStoreInfo extends Model
{
    // 数据总数
    /**
     * @example
     *
     * @var int
     */
    public $total;

    // 当前展示页
    /**
     * @example
     *
     * @var int
     */
    public $current;

    // 数据总页数
    /**
     * @example
     *
     * @var int
     */
    public $pages;

    // 每页显示数据条数
    /**
     * @example
     *
     * @var int
     */
    public $size;

    // 数据集合
    /**
     * @example
     *
     * @var GdStoreRecord[]
     */
    public $records;
    protected $_name = [
        'total'   => 'total',
        'current' => 'current',
        'pages'   => 'pages',
        'size'    => 'size',
        'records' => 'records',
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
     * @return GdStoreInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
                    $model->records[$n++] = null !== $item ? GdStoreRecord::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
