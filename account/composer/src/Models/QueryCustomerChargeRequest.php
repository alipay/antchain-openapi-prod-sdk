<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class QueryCustomerChargeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 若有，则返回相应的状态，INIT/SUCCESS/FAIL
    /**
     * @var string
     */
    public $status;

    // 访问的页码数
    /**
     * @var int
     */
    public $pageNo;

    // 每页的数量
    /**
     * @var int
     */
    public $pageSize;

    // 调用系统来源
    /**
     * @var string
     */
    public $source;

    // 1- 按时间升序
    // 2-按时间倒序
    // 不填默认2
    /**
     * @var int
     */
    public $sortType;
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId'  => 'tenant_id',
        'status'    => 'status',
        'pageNo'    => 'page_no',
        'pageSize'  => 'page_size',
        'source'    => 'source',
        'sortType'  => 'sort_type',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('source', $this->source, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->sortType) {
            $res['sort_type'] = $this->sortType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCustomerChargeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['sort_type'])) {
            $model->sortType = $map['sort_type'];
        }

        return $model;
    }
}
