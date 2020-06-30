<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateEquityExchangelimitRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'equityId' => 'equity_id',
        'limitPerMerchantAndDay' => 'limit_per_merchant_and_day',
        'limitPerMerchantAndMontn' => 'limit_per_merchant_and_montn',
        'limitPerUserAndDay' => 'limit_per_user_and_day',
        'limitPerUserAndMonth' => 'limit_per_user_and_month',
        'outTxId' => 'out_tx_id',
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
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->limitPerMerchantAndDay) {
            $res['limit_per_merchant_and_day'] = $this->limitPerMerchantAndDay;
        }
        if (null !== $this->limitPerMerchantAndMontn) {
            $res['limit_per_merchant_and_montn'] = $this->limitPerMerchantAndMontn;
        }
        if (null !== $this->limitPerUserAndDay) {
            $res['limit_per_user_and_day'] = $this->limitPerUserAndDay;
        }
        if (null !== $this->limitPerUserAndMonth) {
            $res['limit_per_user_and_month'] = $this->limitPerUserAndMonth;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateEquityExchangelimitRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
        }
        if(isset($map['limit_per_merchant_and_day'])){
            $model->limitPerMerchantAndDay = $map['limit_per_merchant_and_day'];
        }
        if(isset($map['limit_per_merchant_and_montn'])){
            $model->limitPerMerchantAndMontn = $map['limit_per_merchant_and_montn'];
        }
        if(isset($map['limit_per_user_and_day'])){
            $model->limitPerUserAndDay = $map['limit_per_user_and_day'];
        }
        if(isset($map['limit_per_user_and_month'])){
            $model->limitPerUserAndMonth = $map['limit_per_user_and_month'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
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
     * @description 代理操作专用，要代理操作的租户ID
     * @example tenant
     * @var string
     */
    public $delegatedTenantId;

    /**
     * @description 权益商品ID
     * @example 000c7312bf8ba777ccbbfb0df8e965cd5fa67a72bb6f142136b96dc0b2364f19
     * @var string
     */
    public $equityId;

    /**
     * @description 商户每日兑换上限
     * @example 1000
     * @var integer
     */
    public $limitPerMerchantAndDay;

    /**
     * @description 商户每月兑换上限
     * @example 10000
     * @var integer
     */
    public $limitPerMerchantAndMontn;

    /**
     * @description 用户每日兑换上限
     * @example 10
     * @var integer
     */
    public $limitPerUserAndDay;

    /**
     * @description 用户每月兑换上限
     * @example 100
     * @var integer
     */
    public $limitPerUserAndMonth;

    /**
     * @description 外部交易ID
     * @example 26384236487
     * @var string
     */
    public $outTxId;

}
