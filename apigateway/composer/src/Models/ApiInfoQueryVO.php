<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiInfoQueryVO extends Model
{
    // 是否模糊搜索
    /**
     * @example true, false
     *
     * @var bool
     */
    public $fuzzySearch;

    // pageInfo
    /**
     * @example
     *
     * @var PageInfo
     */
    public $pageInfo;

    // query
    /**
     * @example
     *
     * @var ApiInfoVO
     */
    public $query;

    // 自定义查询条件
    /**
     * @example queryCondition
     *
     * @var string
     */
    public $queryCondition;
    protected $_name = [
        'fuzzySearch'    => 'fuzzy_search',
        'pageInfo'       => 'page_info',
        'query'          => 'query',
        'queryCondition' => 'query_condition',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fuzzySearch) {
            $res['fuzzy_search'] = $this->fuzzySearch;
        }
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->query) {
            $res['query'] = null !== $this->query ? $this->query->toMap() : null;
        }
        if (null !== $this->queryCondition) {
            $res['query_condition'] = $this->queryCondition;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiInfoQueryVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fuzzy_search'])) {
            $model->fuzzySearch = $map['fuzzy_search'];
        }
        if (isset($map['page_info'])) {
            $model->pageInfo = PageInfo::fromMap($map['page_info']);
        }
        if (isset($map['query'])) {
            $model->query = ApiInfoVO::fromMap($map['query']);
        }
        if (isset($map['query_condition'])) {
            $model->queryCondition = $map['query_condition'];
        }

        return $model;
    }
}
