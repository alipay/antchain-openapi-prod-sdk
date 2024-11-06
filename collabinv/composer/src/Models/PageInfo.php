<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class PageInfo extends Model
{
    // 总数量
    /**
     * @example 50
     *
     * @var int
     */
    public $total;

    // 当前页
    /**
     * @example 1
     *
     * @var int
     */
    public $pageIndex;

    // 页容量
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'total'     => 'total',
        'pageIndex' => 'page_index',
        'pageSize'  => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PageInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
