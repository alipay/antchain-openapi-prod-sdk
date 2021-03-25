<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecExchangeReceivebyuserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 要代理操作的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;

    // 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    /**
     * @var string
     */
    public $memo;

    // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    /**
     * @var string
     */
    public $originTxId;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'memo'              => 'memo',
        'originTxId'        => 'origin_tx_id',
        'outTxId'           => 'out_tx_id',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('originTxId', $this->originTxId, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->originTxId) {
            $res['origin_tx_id'] = $this->originTxId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecExchangeReceivebyuserRequest
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
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['delegated_tenant_id'])) {
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['origin_tx_id'])) {
            $model->originTxId = $map['origin_tx_id'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
