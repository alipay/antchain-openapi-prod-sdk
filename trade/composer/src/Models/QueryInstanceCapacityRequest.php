<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class QueryInstanceCapacityRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户ID，和租户名称二选一必填
    /**
     * @var string
     */
    public $tenantId;

    // 8位租户名，和租户ID二选一必填
    /**
     * @var string
     */
    public $tenantName;

    // 资源包状态，不传则默认查询有效；Valid：有效；Closed：已用完；Expired：已到期
    //
    /**
     * @var string
     */
    public $status;

    // 资源包商品码
    /**
     * @var string
     */
    public $commodityCode;
    protected $_name = [
        'authToken'     => 'auth_token',
        'tenantId'      => 'tenant_id',
        'tenantName'    => 'tenant_name',
        'status'        => 'status',
        'commodityCode' => 'commodity_code',
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInstanceCapacityRequest
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
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }

        return $model;
    }
}
