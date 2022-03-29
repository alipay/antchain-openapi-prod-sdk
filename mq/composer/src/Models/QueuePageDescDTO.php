<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueuePageDescDTO extends Model
{
    // 总页数
    /**
     * @example 1
     *
     * @var int
     */
    public $pageCount;

    // 当前页面
    /**
     * @example 1
     *
     * @var int
     */
    public $pageCurrent;

    // 页面大小
    /**
     * @example 1
     *
     * @var int
     */
    public $pageSize;

    // 队列详情信息
    /**
     * @example
     *
     * @var QueueDescDTO[]
     */
    public $records;

    // 总记录数
    /**
     * @example 1
     *
     * @var int
     */
    public $rowCount;
    protected $_name = [
        'pageCount'   => 'page_count',
        'pageCurrent' => 'page_current',
        'pageSize'    => 'page_size',
        'records'     => 'records',
        'rowCount'    => 'row_count',
    ];

    public function validate()
    {
        Model::validateRequired('pageCount', $this->pageCount, true);
        Model::validateRequired('pageCurrent', $this->pageCurrent, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('records', $this->records, true);
        Model::validateRequired('rowCount', $this->rowCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pageCount) {
            $res['page_count'] = $this->pageCount;
        }
        if (null !== $this->pageCurrent) {
            $res['page_current'] = $this->pageCurrent;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
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
        if (null !== $this->rowCount) {
            $res['row_count'] = $this->rowCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueuePageDescDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page_count'])) {
            $model->pageCount = $map['page_count'];
        }
        if (isset($map['page_current'])) {
            $model->pageCurrent = $map['page_current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['records'])) {
            if (!empty($map['records'])) {
                $model->records = [];
                $n              = 0;
                foreach ($map['records'] as $item) {
                    $model->records[$n++] = null !== $item ? QueueDescDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['row_count'])) {
            $model->rowCount = $map['row_count'];
        }

        return $model;
    }
}
