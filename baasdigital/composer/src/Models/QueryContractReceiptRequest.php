<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class QueryContractReceiptRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 链id
    /**
     * @var string
     */
    public $bizid;

    // 业务方请求唯一标识，用于异步查询交易情况。 trace_id 和hash至少选择一种，都输入时，使用trace_id查询
    /**
     * @var string
     */
    public $traceId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 查询的交易hash
    /**
     * @var string
     */
    public $hash;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'traceId'           => 'trace_id',
        'tenantId'          => 'tenant_id',
        'hash'              => 'hash',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractReceiptRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }

        return $model;
    }
}
