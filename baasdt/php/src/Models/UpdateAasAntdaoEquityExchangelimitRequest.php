<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateAasAntdaoEquityExchangelimitRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
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
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
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
     * @return UpdateAasAntdaoEquityExchangelimitRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
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
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 代理操作专用，要代理操作的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;

    // 权益商品ID
    /**
     * @var string
     */
    public $equityId;

    // 商户每日兑换上限
    /**
     * @var integer
     */
    public $limitPerMerchantAndDay;

    // 商户每月兑换上限
    /**
     * @var integer
     */
    public $limitPerMerchantAndMontn;

    // 用户每日兑换上限
    /**
     * @var integer
     */
    public $limitPerUserAndDay;

    // 用户每月兑换上限
    /**
     * @var integer
     */
    public $limitPerUserAndMonth;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;

}
