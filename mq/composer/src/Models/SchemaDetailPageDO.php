<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SchemaDetailPageDO extends Model
{
    // 页面数量
    /**
     * @example 10
     *
     * @var int
     */
    public $pageNum;

    // 页大小
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;

    // 总数
    /**
     * @example 10001
     *
     * @var int
     */
    public $total;

    // 内容
    /**
     * @example
     *
     * @var SchemaDetailDO[]
     */
    public $content;
    protected $_name = [
        'pageNum'  => 'page_num',
        'pageSize' => 'page_size',
        'total'    => 'total',
        'content'  => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('total', $this->total, true);
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
        if (null !== $this->total) {
            $res['total'] = $this->total;
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
     * @return SchemaDetailPageDO
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
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['content'])) {
            if (!empty($map['content'])) {
                $model->content = [];
                $n              = 0;
                foreach ($map['content'] as $item) {
                    $model->content[$n++] = null !== $item ? SchemaDetailDO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
