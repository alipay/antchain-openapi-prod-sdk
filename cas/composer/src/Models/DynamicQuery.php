<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DynamicQuery extends Model
{
    // 分页规则-currentPage
    /**
     * @example
     *
     * @var int
     */
    public $currentPage;

    // 字段过滤
    /**
     * @example 字段过滤
     *
     * @var string
     */
    public $filter;

    // 分页规则-pageSize
    /**
     * @example
     *
     * @var int
     */
    public $pageSize;

    // 具体的查询条件字符串
    /**
     * @example 具体的查询条件字符串
     *
     * @var string
     */
    public $query;

    // 查询结果的排序规则
    /**
     * @example 查询结果的排序规则
     *
     * @var string
     */
    public $sort;
    protected $_name = [
        'currentPage' => 'current_page',
        'filter'      => 'filter',
        'pageSize'    => 'page_size',
        'query'       => 'query',
        'sort'        => 'sort',
    ];

    public function validate()
    {
        Model::validateRequired('query', $this->query, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->filter) {
            $res['filter'] = $this->filter;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->sort) {
            $res['sort'] = $this->sort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DynamicQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['filter'])) {
            $model->filter = $map['filter'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }
        if (isset($map['sort'])) {
            $model->sort = $map['sort'];
        }

        return $model;
    }
}
