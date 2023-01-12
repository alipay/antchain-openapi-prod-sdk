<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class PaginationQuery extends Model
{
    // 当前页码
    /**
     * @example 1
     *
     * @var int
     */
    public $currentPage;

    // 分页大小
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;

    // 模糊搜索
    /**
     * @example mosn
     *
     * @var string
     */
    public $fuzzyName;
    protected $_name = [
        'currentPage' => 'current_page',
        'pageSize'    => 'page_size',
        'fuzzyName'   => 'fuzzy_name',
    ];

    public function validate()
    {
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('fuzzyName', $this->fuzzyName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->fuzzyName) {
            $res['fuzzy_name'] = $this->fuzzyName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PaginationQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['fuzzy_name'])) {
            $model->fuzzyName = $map['fuzzy_name'];
        }

        return $model;
    }
}
