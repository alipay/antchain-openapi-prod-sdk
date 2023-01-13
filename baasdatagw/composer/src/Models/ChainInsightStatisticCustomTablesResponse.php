<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightStatisticCustomTablesResponse extends Model
{
    // 页大小
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;

    // 当前页码
    /**
     * @example 1
     *
     * @var int
     */
    public $current;

    // 总条数
    /**
     * @example 123
     *
     * @var int
     */
    public $total;

    // 表格每一行内容，    Key 为列名，    Value，列的取值
    /**
     * @example
     *
     * @var ChainInsightStatisticCustomTableRow[]
     */
    public $list;
    protected $_name = [
        'pageSize' => 'page_size',
        'current'  => 'current',
        'total'    => 'total',
        'list'     => 'list',
    ];

    public function validate()
    {
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('list', $this->list, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightStatisticCustomTablesResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? ChainInsightStatisticCustomTableRow::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
