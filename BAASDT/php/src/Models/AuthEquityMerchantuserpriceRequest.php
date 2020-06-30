<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class AuthEquityMerchantuserpriceRequest extends Model {
    protected $_name = [
        'amount' => 'amount',
        'chainId' => 'chain_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'equityId' => 'equity_id',
        'optTenantId' => 'opt_tenant_id',
        'outTxId' => 'out_tx_id',
        'ratio' => 'ratio',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AuthEquityMerchantuserpriceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        return $model;
    }
    /**
     * @description 用户兑换价格（单位：元）。价格和比例二选一，且只能填写一个。
     * @example 10.0000
     * @var string
     */
    public $amount;

    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 代理操作专用，要代理操作的租户ID
     * @example tenant
     * @var string
     */
    public $delegatedTenantId;

    /**
     * @description 权益商品ID
     * @example 7f1be9108651f97513b5b59030f5b059e58a59d263ab426cbf26337f91642caa
     * @var string
     */
    public $equityId;

    /**
     * @description 操作用户
     * @example tenant
     * @var string
     */
    public $optTenantId;

    /**
     * @description 外部交易ID
     * @example 253645873
     * @var string
     */
    public $outTxId;

    /**
     * @description 比例。价格和比例二选一，且只能填写一个。
     * @example 1.1
     * @var string
     */
    public $ratio;

}
