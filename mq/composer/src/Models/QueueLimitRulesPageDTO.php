<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueueLimitRulesPageDTO extends Model
{
    // 总页数
    /**
     * @example 1
     *
     * @var int
     */
    public $pageCount;

    // 当前页
    /**
     * @example 1
     *
     * @var int
     */
    public $pageCurrent;

    // 每页条数
    /**
     * @example 1
     *
     * @var int
     */
    public $pageSize;

    // 总记录数
    /**
     * @example 1
     *
     * @var int
     */
    public $rowCount;

    // 队列规则信息
    /**
     * @example
     *
     * @var QueueLimitRulesDTO[]
     */
    public $records;
    protected $_name = [
        'pageCount'   => 'page_count',
        'pageCurrent' => 'page_current',
        'pageSize'    => 'page_size',
        'rowCount'    => 'row_count',
        'records'     => 'records',
    ];

    public function validate()
    {
        Model::validateRequired('pageCount', $this->pageCount, true);
        Model::validateRequired('pageCurrent', $this->pageCurrent, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('rowCount', $this->rowCount, true);
        Model::validateRequired('records', $this->records, true);
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
        if (null !== $this->rowCount) {
            $res['row_count'] = $this->rowCount;
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
     * @return QueueLimitRulesPageDTO
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
        if (isset($map['row_count'])) {
            $model->rowCount = $map['row_count'];
        }
        if (isset($map['records'])) {
            if (!empty($map['records'])) {
                $model->records = [];
                $n              = 0;
                foreach ($map['records'] as $item) {
                    $model->records[$n++] = null !== $item ? QueueLimitRulesDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
