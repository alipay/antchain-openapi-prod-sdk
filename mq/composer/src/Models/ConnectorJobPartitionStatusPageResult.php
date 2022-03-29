<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConnectorJobPartitionStatusPageResult extends Model
{
    // 页码
    /**
     * @example
     *
     * @var int
     */
    public $pageNum;

    // 每页数量
    /**
     * @example
     *
     * @var int
     */
    public $pageSize;

    // 数据总数
    /**
     * @example 10
     *
     * @var int
     */
    public $totalSize;

    // 分区状态
    /**
     * @example
     *
     * @var ColumnsValue[]
     */
    public $content;
    protected $_name = [
        'pageNum'   => 'page_num',
        'pageSize'  => 'page_size',
        'totalSize' => 'total_size',
        'content'   => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->content) {
            $res['content'] = [];
            if (null !== $this->content && \is_array($this->content)) {
                $n = 0;
                foreach ($this->content as $item) {
                    $res['content'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConnectorJobPartitionStatusPageResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }
        if (isset($map['content'])) {
            if (!empty($map['content'])) {
                $model->content = [];
                $n              = 0;
                foreach ($map['content'] as $item) {
                    $model->content[$n++] = null !== $item ? ColumnsValue::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
