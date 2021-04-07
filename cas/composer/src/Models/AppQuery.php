<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppQuery extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // tenantId
    /**
     * @example tenantId
     *
     * @var string
     */
    public $tenantId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // chineseName
    /**
     * @example chineseName
     *
     * @var string
     */
    public $chineseName;

    // stackId
    /**
     * @example stackId
     *
     * @var string
     */
    public $stackId;

    // startVersion
    /**
     * @example startVersion
     *
     * @var string
     */
    public $startVersion;

    // endVersion
    /**
     * @example endVersion
     *
     * @var string
     */
    public $endVersion;

    // appIds
    /**
     * @example appIds
     *
     * @var string[]
     */
    public $appIds;

    // appDomainId
    /**
     * @example appDomainId
     *
     * @var string
     */
    public $appDomainId;

    // appDomainIds
    /**
     * @example appDomainIds
     *
     * @var string[]
     */
    public $appDomainIds;

    // appDomainName
    /**
     * @example appDomainName
     *
     * @var string
     */
    public $appDomainName;

    // appLevelId
    /**
     * @example appLevelId
     *
     * @var string
     */
    public $appLevelId;

    // ownerId
    /**
     * @example ownerId
     *
     * @var string
     */
    public $ownerId;

    // isComponent
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isComponent;

    // simpleQuery
    /**
     * @example simpleQuery
     *
     * @var bool
     */
    public $simpleQuery;

    // workspaceId
    /**
     * @example workspaceId
     *
     * @var string
     */
    public $workspaceId;

    // containerCount
    /**
     * @example containerCount
     *
     * @var string
     */
    public $containerCount;

    // databaseCount
    /**
     * @example databaseCount
     *
     * @var string
     */
    public $databaseCount;

    // slbCount
    /**
     * @example slbCount
     *
     * @var string
     */
    public $slbCount;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // isOnePartyRequest
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isOnePartyRequest;

    // 分页大小
    /**
     * @example
     *
     * @var int
     */
    public $pageSize;

    // 当前页数
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

    // queryType
    /**
     * @example FUZZY, ACCURATE, START_WITH
     *
     * @var string
     */
    public $queryType;
    protected $_name = [
        'id'                => 'id',
        'tenantId'          => 'tenant_id',
        'name'              => 'name',
        'chineseName'       => 'chinese_name',
        'stackId'           => 'stack_id',
        'startVersion'      => 'start_version',
        'endVersion'        => 'end_version',
        'appIds'            => 'app_ids',
        'appDomainId'       => 'app_domain_id',
        'appDomainIds'      => 'app_domain_ids',
        'appDomainName'     => 'app_domain_name',
        'appLevelId'        => 'app_level_id',
        'ownerId'           => 'owner_id',
        'isComponent'       => 'is_component',
        'simpleQuery'       => 'simple_query',
        'workspaceId'       => 'workspace_id',
        'containerCount'    => 'container_count',
        'databaseCount'     => 'database_count',
        'slbCount'          => 'slb_count',
        'utcCreate'         => 'utc_create',
        'isOnePartyRequest' => 'is_one_party_request',
        'pageSize'          => 'page_size',
        'currentPage'       => 'current_page',
        'orders'            => 'orders',
        'queryType'         => 'query_type',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->chineseName) {
            $res['chinese_name'] = $this->chineseName;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->startVersion) {
            $res['start_version'] = $this->startVersion;
        }
        if (null !== $this->endVersion) {
            $res['end_version'] = $this->endVersion;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->appDomainId) {
            $res['app_domain_id'] = $this->appDomainId;
        }
        if (null !== $this->appDomainIds) {
            $res['app_domain_ids'] = $this->appDomainIds;
        }
        if (null !== $this->appDomainName) {
            $res['app_domain_name'] = $this->appDomainName;
        }
        if (null !== $this->appLevelId) {
            $res['app_level_id'] = $this->appLevelId;
        }
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }
        if (null !== $this->isComponent) {
            $res['is_component'] = $this->isComponent;
        }
        if (null !== $this->simpleQuery) {
            $res['simple_query'] = $this->simpleQuery;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->containerCount) {
            $res['container_count'] = $this->containerCount;
        }
        if (null !== $this->databaseCount) {
            $res['database_count'] = $this->databaseCount;
        }
        if (null !== $this->slbCount) {
            $res['slb_count'] = $this->slbCount;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->isOnePartyRequest) {
            $res['is_one_party_request'] = $this->isOnePartyRequest;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['chinese_name'])) {
            $model->chineseName = $map['chinese_name'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }
        if (isset($map['start_version'])) {
            $model->startVersion = $map['start_version'];
        }
        if (isset($map['end_version'])) {
            $model->endVersion = $map['end_version'];
        }
        if (isset($map['app_ids'])) {
            if (!empty($map['app_ids'])) {
                $model->appIds = $map['app_ids'];
            }
        }
        if (isset($map['app_domain_id'])) {
            $model->appDomainId = $map['app_domain_id'];
        }
        if (isset($map['app_domain_ids'])) {
            if (!empty($map['app_domain_ids'])) {
                $model->appDomainIds = $map['app_domain_ids'];
            }
        }
        if (isset($map['app_domain_name'])) {
            $model->appDomainName = $map['app_domain_name'];
        }
        if (isset($map['app_level_id'])) {
            $model->appLevelId = $map['app_level_id'];
        }
        if (isset($map['owner_id'])) {
            $model->ownerId = $map['owner_id'];
        }
        if (isset($map['is_component'])) {
            $model->isComponent = $map['is_component'];
        }
        if (isset($map['simple_query'])) {
            $model->simpleQuery = $map['simple_query'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['container_count'])) {
            $model->containerCount = $map['container_count'];
        }
        if (isset($map['database_count'])) {
            $model->databaseCount = $map['database_count'];
        }
        if (isset($map['slb_count'])) {
            $model->slbCount = $map['slb_count'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['is_one_party_request'])) {
            $model->isOnePartyRequest = $map['is_one_party_request'];
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

        return $model;
    }
}
