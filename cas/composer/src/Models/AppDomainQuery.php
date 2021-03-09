<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppDomainQuery extends Model
{
    // creatorId
    /**
     * @example creatorId
     *
     * @var string
     */
    public $creatorId;

    // 是否为一方化请求
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isOnePartyRequest;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // parentId
    /**
     * @example parentId
     *
     * @var string
     */
    public $parentId;

    // tenantId
    /**
     * @example tenantId
     *
     * @var string
     */
    public $tenantId;

    // utcCreate
    /**
     * @example utcCreate
     *
     * @var string
     */
    public $utcCreate;

    // 分页大小
    /**
     * @example
     *
     * @var int
     */
    public $pageSize;

    // query_type
    /**
     * @example FUZZY, ACCURATE, START_WITH
     *
     * @var string
     */
    public $queryType;

    // orders
    /**
     * @example
     *
     * @var string[]
     */
    public $orders;

    // 当前页数
    /**
     * @example
     *
     * @var int
     */
    public $currentPage;
    protected $_name = [
        'creatorId'         => 'creator_id',
        'isOnePartyRequest' => 'is_one_party_request',
        'name'              => 'name',
        'parentId'          => 'parent_id',
        'tenantId'          => 'tenant_id',
        'utcCreate'         => 'utc_create',
        'pageSize'          => 'page_size',
        'queryType'         => 'query_type',
        'orders'            => 'orders',
        'currentPage'       => 'current_page',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creatorId) {
            $res['creator_id'] = $this->creatorId;
        }
        if (null !== $this->isOnePartyRequest) {
            $res['is_one_party_request'] = $this->isOnePartyRequest;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppDomainQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['creator_id'])) {
            $model->creatorId = $map['creator_id'];
        }
        if (isset($map['is_one_party_request'])) {
            $model->isOnePartyRequest = $map['is_one_party_request'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['orders'])) {
            if (!empty($map['orders'])) {
                $model->orders = $map['orders'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }

        return $model;
    }
}
