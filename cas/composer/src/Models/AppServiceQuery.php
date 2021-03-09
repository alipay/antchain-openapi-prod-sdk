<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppServiceQuery extends Model
{
    // 根据 id 查询
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // workspaceId
    /**
     * @example workspaceId
     *
     * @var string
     */
    public $workspaceId;

    // appId
    /**
     * @example appId
     *
     * @var string
     */
    public $appId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // deployStatus
    /**
     * @example deployStatus
     *
     * @var string
     */
    public $deployStatus;

    // ownerId
    /**
     * @example ownerId
     *
     * @var string
     */
    public $ownerId;

    // workspaceIds
    /**
     * @example
     *
     * @var string[]
     */
    public $workspaceIds;

    // appIds
    /**
     * @example
     *
     * @var string[]
     */
    public $appIds;

    // 是否为一方化查询请求
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isOnePartyRequest;

    // startIndex
    /**
     * @example
     *
     * @var int
     */
    public $startIndex;

    // pageSize
    /**
     * @example
     *
     * @var int
     */
    public $pageSize;

    // currentPage
    /**
     * @example
     *
     * @var int
     */
    public $currentPage;

    // orders
    /**
     * @example
     *
     * @var string[]
     */
    public $orders;

    // 查询类型
    /**
     * @example FUZZY,  ACCURATE, START_WITH
     *
     * @var string
     */
    public $queryType;

    // Map<String, String>
    /**
     * @example "{}"
     *
     * @var string
     */
    public $conditions;
    protected $_name = [
        'id'                => 'id',
        'workspaceId'       => 'workspace_id',
        'appId'             => 'app_id',
        'name'              => 'name',
        'deployStatus'      => 'deploy_status',
        'ownerId'           => 'owner_id',
        'workspaceIds'      => 'workspace_ids',
        'appIds'            => 'app_ids',
        'isOnePartyRequest' => 'is_one_party_request',
        'startIndex'        => 'start_index',
        'pageSize'          => 'page_size',
        'currentPage'       => 'current_page',
        'orders'            => 'orders',
        'queryType'         => 'query_type',
        'conditions'        => 'conditions',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->deployStatus) {
            $res['deploy_status'] = $this->deployStatus;
        }
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }
        if (null !== $this->workspaceIds) {
            $res['workspace_ids'] = $this->workspaceIds;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->isOnePartyRequest) {
            $res['is_one_party_request'] = $this->isOnePartyRequest;
        }
        if (null !== $this->startIndex) {
            $res['start_index'] = $this->startIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = $this->conditions;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppServiceQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['deploy_status'])) {
            $model->deployStatus = $map['deploy_status'];
        }
        if (isset($map['owner_id'])) {
            $model->ownerId = $map['owner_id'];
        }
        if (isset($map['workspace_ids'])) {
            if (!empty($map['workspace_ids'])) {
                $model->workspaceIds = $map['workspace_ids'];
            }
        }
        if (isset($map['app_ids'])) {
            if (!empty($map['app_ids'])) {
                $model->appIds = $map['app_ids'];
            }
        }
        if (isset($map['is_one_party_request'])) {
            $model->isOnePartyRequest = $map['is_one_party_request'];
        }
        if (isset($map['start_index'])) {
            $model->startIndex = $map['start_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['orders'])) {
            if (!empty($map['orders'])) {
                $model->orders = $map['orders'];
            }
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['conditions'])) {
            $model->conditions = $map['conditions'];
        }

        return $model;
    }
}
