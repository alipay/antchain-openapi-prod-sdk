<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecExchangeReceivebyuserRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'memo' => 'memo',
        'originTxId' => 'origin_tx_id',
        'outTxId' => 'out_tx_id',
        'userId' => 'user_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
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
     * @return ExecExchangeReceivebyuserRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['origin_tx_id'])){
            $model->originTxId = $map['origin_tx_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 要代理操作的租户ID
     * @example tenant
     * @var string
     */
    public $delegatedTenantId;

    /**
     * @description 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
     * @example 用户收货
     * @var string
     */
    public $memo;

    /**
     * @description 关联交易ID
     * @example 72341375271356
     * @var string
     */
    public $originTxId;

    /**
     * @description 外部交易ID
     * @example 12543526
     * @var string
     */
    public $outTxId;

    /**
     * @description 用户ID
     * @example user001
     * @var string
     */
    public $userId;

}
