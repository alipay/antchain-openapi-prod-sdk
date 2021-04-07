<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListApplevelRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 动态查询
    /**
     * @var DynamicQuery
     */
    public $dynamicQuery;

    // 应用分级查询
    /**
     * @var AppLevelQuery
     */
    public $query;
    protected $_name = [
        'authToken'    => 'auth_token',
        'dynamicQuery' => 'dynamic_query',
        'query'        => 'query',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->dynamicQuery) {
            $res['dynamic_query'] = null !== $this->dynamicQuery ? $this->dynamicQuery->toMap() : null;
        }
        if (null !== $this->query) {
            $res['query'] = null !== $this->query ? $this->query->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListApplevelRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['dynamic_query'])) {
            $model->dynamicQuery = DynamicQuery::fromMap($map['dynamic_query']);
        }
        if (isset($map['query'])) {
            $model->query = AppLevelQuery::fromMap($map['query']);
        }

        return $model;
    }
}
