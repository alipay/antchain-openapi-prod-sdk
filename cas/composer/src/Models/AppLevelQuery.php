<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppLevelQuery extends Model
{
    // appCountInclude
    /**
     * @example true, false
     *
     * @var bool
     */
    public $appCountInclude;

    // creator_id
    /**
     * @example creator_id
     *
     * @var string
     */
    public $creatorId;

    // is_one_party_request
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

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // utc_create
    /**
     * @example utc_create
     *
     * @var string
     */
    public $utcCreate;

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
    protected $_name = [
        'appCountInclude'   => 'app_count_include',
        'creatorId'         => 'creator_id',
        'isOnePartyRequest' => 'is_one_party_request',
        'name'              => 'name',
        'tenantId'          => 'tenant_id',
        'utcCreate'         => 'utc_create',
        'currentPage'       => 'current_page',
        'orders'            => 'orders',
        'pageSize'          => 'page_size',
        'queryType'         => 'query_type',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appCountInclude) {
            $res['app_count_include'] = $this->appCountInclude;
        }
        if (null !== $this->creatorId) {
            $res['creator_id'] = $this->creatorId;
        }
        if (null !== $this->isOnePartyRequest) {
            $res['is_one_party_request'] = $this->isOnePartyRequest;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppLevelQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_count_include'])) {
            $model->appCountInclude = $map['app_count_include'];
        }
        if (isset($map['creator_id'])) {
            $model->creatorId = $map['creator_id'];
        }
        if (isset($map['is_one_party_request'])) {
            $model->isOnePartyRequest = $map['is_one_party_request'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['orders'])) {
            if (!empty($map['orders'])) {
                $model->orders = $map['orders'];
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }

        return $model;
    }
}
