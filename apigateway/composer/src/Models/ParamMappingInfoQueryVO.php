<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ParamMappingInfoQueryVO extends Model
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
     * @var ParamMappingInfoVO
     */
    public $query;

    // 支持模糊查询
    /**
     * @example true, false
     *
     * @var bool
     */
    public $fuzzySearch;
    protected $_name = [
        'pageInfo'    => 'page_info',
        'query'       => 'query',
        'fuzzySearch' => 'fuzzy_search',
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
        if (null !== $this->fuzzySearch) {
            $res['fuzzy_search'] = $this->fuzzySearch;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParamMappingInfoQueryVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page_info'])) {
            $model->pageInfo = PageInfo::fromMap($map['page_info']);
        }
        if (isset($map['query'])) {
            $model->query = ParamMappingInfoVO::fromMap($map['query']);
        }
        if (isset($map['fuzzy_search'])) {
            $model->fuzzySearch = $map['fuzzy_search'];
        }

        return $model;
    }
}
