<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\PaginationQuery;

class ListSidecarInstanceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'instanceName' => 'instance_name',
        'paginationQuery' => 'pagination_query',
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
        'status' => 'status',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListSidecarInstanceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['instance_name'])){
            $model->instanceName = $map['instance_name'];
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
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 版本实例名称
    /**
     * @var string
     */
    public $instanceName;

    // 分页查询
    /**
     * @var PaginationQuery
     */
    public $paginationQuery;

    // sidecar生效范围：workspace、workspace_group、region
    // 
    /**
     * @var string
     */
    public $scope;

    // scope对应的唯一标识，例如workspace对应workspace id
    // 
    /**
     * @var string
     */
    public $scopeIdentity;

    // 版本实例状态
    /**
     * @var int
     */
    public $status;

}
