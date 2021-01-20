<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\PaginationQuery;

class ListSidecarRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'paginationQuery' => 'pagination_query',
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->paginationQuery) {
            $res['pagination_query'] = null !== $this->paginationQuery ? $this->paginationQuery->toMap() : null;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListSidecarRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['pagination_query'])){
            $model->paginationQuery = PaginationQuery::fromMap($map['pagination_query']);
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['scope_identity'])){
            $model->scopeIdentity = $map['scope_identity'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 分页请求体
    /**
     * @var PaginationQuery
     */
    public $paginationQuery;

    // sidecar生效范围：workspace、workspace_group、region
    /**
     * @var string
     */
    public $scope;

    // scope对应的唯一标识符
    /**
     * @var string
     */
    public $scopeIdentity;

}
