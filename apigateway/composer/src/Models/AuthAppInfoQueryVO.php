<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class AuthAppInfoQueryVO extends Model
{
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
     * @var AuthAppInfoVO
     */
    public $query;

    // 自定义查询条件
    /**
     * @example API_MOUNT_APP_AUTH
     *
     * @var string
     */
    public $queryCondition;

    // 是否支持模糊查询
    /**
     * @example true, false
     *
     * @var bool
     */
    public $fuzzySearch;
    protected $_name = [
        'pageInfo'       => 'page_info',
        'query'          => 'query',
        'queryCondition' => 'query_condition',
        'fuzzySearch'    => 'fuzzy_search',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->query) {
            $res['query'] = null !== $this->query ? $this->query->toMap() : null;
        }
        if (null !== $this->queryCondition) {
            $res['query_condition'] = $this->queryCondition;
        }
        if (null !== $this->fuzzySearch) {
            $res['fuzzy_search'] = $this->fuzzySearch;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthAppInfoQueryVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page_info'])) {
            $model->pageInfo = PageInfo::fromMap($map['page_info']);
        }
        if (isset($map['query'])) {
            $model->query = AuthAppInfoVO::fromMap($map['query']);
        }
        if (isset($map['query_condition'])) {
            $model->queryCondition = $map['query_condition'];
        }
        if (isset($map['fuzzy_search'])) {
            $model->fuzzySearch = $map['fuzzy_search'];
        }

        return $model;
    }
}
