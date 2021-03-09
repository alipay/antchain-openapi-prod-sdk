<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class PaginationQuery extends Model
{
    // 当前页数
    /**
     * @example 1
     *
     * @var int
     */
    public $currentPage;

    // isLocaleEnabled
    /**
     * @example isLocaleEnabled
     *
     * @var bool
     */
    public $isLocaleEnabled;

    // local
    /**
     * @example local
     *
     * @var string
     */
    public $local;

    // 分页大小
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;

    // paging
    /**
     * @example true, false
     *
     * @var bool
     */
    public $paging;

    // 查询类型
    /**
     * @example FUZZY
     *
     * @var string
     */
    public $queryType;

    // search
    /**
     * @example true, false
     *
     * @var bool
     */
    public $search;

    // 排序关键字列表
    /**
     * @example
     *
     * @var string[]
     */
    public $orders;
    protected $_name = [
        'currentPage'     => 'current_page',
        'isLocaleEnabled' => 'is_locale_enabled',
        'local'           => 'local',
        'pageSize'        => 'page_size',
        'paging'          => 'paging',
        'queryType'       => 'query_type',
        'search'          => 'search',
        'orders'          => 'orders',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->isLocaleEnabled) {
            $res['is_locale_enabled'] = $this->isLocaleEnabled;
        }
        if (null !== $this->local) {
            $res['local'] = $this->local;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->paging) {
            $res['paging'] = $this->paging;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->search) {
            $res['search'] = $this->search;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
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
        if (isset($map['is_locale_enabled'])) {
            $model->isLocaleEnabled = $map['is_locale_enabled'];
        }
        if (isset($map['local'])) {
            $model->local = $map['local'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['paging'])) {
            $model->paging = $map['paging'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['search'])) {
            $model->search = $map['search'];
        }
        if (isset($map['orders'])) {
            if (!empty($map['orders'])) {
                $model->orders = $map['orders'];
            }
        }

        return $model;
    }
}
