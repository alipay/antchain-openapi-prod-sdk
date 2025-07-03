<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class PageQuery extends Model
{
    // 页大小
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;

    // 当前页
    /**
     * @example 2
     *
     * @var int
     */
    public $pageIndex;
    protected $_name = [
        'pageSize'  => 'page_size',
        'pageIndex' => 'page_index',
    ];

    public function validate()
    {
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PageQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }

        return $model;
    }
}
