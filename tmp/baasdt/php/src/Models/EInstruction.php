<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class EInstruction extends Model {
    protected $_name = [
        'assetId' => 'asset_id',
        'assetRate' => 'asset_rate',
        'deductAssetAmount' => 'deduct_asset_amount',
        'deductCreditAmount' => 'deduct_credit_amount',
        'deductDebitAmount' => 'deduct_debit_amount',
        'deductTenantId' => 'deduct_tenant_id',
        'equityId' => 'equity_id',
        'equityName' => 'equity_name',
        'equityPrice' => 'equity_price',
        'equityValue' => 'equity_value',
        'memo' => 'memo',
        'optTenantId' => 'opt_tenant_id',
        'outTxId' => 'out_tx_id',
        'status' => 'status',
        'tenantId' => 'tenant_id',
        'timeStamp' => 'time_stamp',
        'type' => 'type',
        'userId' => 'user_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->assetRate) {
            $res['asset_rate'] = $this->assetRate;
        }
        if (null !== $this->deductAssetAmount) {
            $res['deduct_asset_amount'] = $this->deductAssetAmount;
        }
        if (null !== $this->deductCreditAmount) {
            $res['deduct_credit_amount'] = $this->deductCreditAmount;
        }
        if (null !== $this->deductDebitAmount) {
            $res['deduct_debit_amount'] = $this->deductDebitAmount;
        }
        if (null !== $this->deductTenantId) {
            $res['deduct_tenant_id'] = $this->deductTenantId;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->equityName) {
            $res['equity_name'] = $this->equityName;
        }
        if (null !== $this->equityPrice) {
            $res['equity_price'] = $this->equityPrice;
        }
        if (null !== $this->equityValue) {
            $res['equity_value'] = $this->equityValue;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->timeStamp) {
            $res['time_stamp'] = $this->timeStamp;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return EInstruction
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['asset_id'])){
            $model->assetId = $map['asset_id'];
        }
        if(isset($map['asset_rate'])){
            $model->assetRate = $map['asset_rate'];
        }
        if(isset($map['deduct_asset_amount'])){
            $model->deductAssetAmount = $map['deduct_asset_amount'];
        }
        if(isset($map['deduct_credit_amount'])){
            $model->deductCreditAmount = $map['deduct_credit_amount'];
        }
        if(isset($map['deduct_debit_amount'])){
            $model->deductDebitAmount = $map['deduct_debit_amount'];
        }
        if(isset($map['deduct_tenant_id'])){
            $model->deductTenantId = $map['deduct_tenant_id'];
        }
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
        }
        if(isset($map['equity_name'])){
            $model->equityName = $map['equity_name'];
        }
        if(isset($map['equity_price'])){
            $model->equityPrice = $map['equity_price'];
        }
        if(isset($map['equity_value'])){
            $model->equityValue = $map['equity_value'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['time_stamp'])){
            $model->timeStamp = $map['time_stamp'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        return $model;
    }
    // 资产ID
    /**
     * @example assetID
     * @var string
     */
    public $assetId;

    // 资产的汇率
    /**
     * @example 1
     * @var string
     */
    public $assetRate;

    // 资产扣减数量(单位:个)
    /**
     * @example 100
     * @var string
     */
    public $deductAssetAmount;

    // 扣减商户备付金授信额(单位:元)
    /**
     * @example 100.0000
     * @var string
     */
    public $deductCreditAmount;

    // 扣减商户备付金余额(单位:元)
    /**
     * @example 10.0000
     * @var string
     */
    public $deductDebitAmount;

    // 被扣减备付金的租户ID
    /**
     * @example id
     * @var string
     */
    public $deductTenantId;

    // 权益ID
    /**
     * @example equity
     * @var string
     */
    public $equityId;

    // 权益名称
    /**
     * @example card01
     * @var string
     */
    public $equityName;

    // 权益对用户价格(单位:元)
    /**
     * @example 10.0000
     * @var string
     */
    public $equityPrice;

    // 权益面值(单位:元)
    /**
     * @example 10.0000
     * @var string
     */
    public $equityValue;

    // 附言Deliver/Complete/OutOfStore/WriteOff)
    /**
     * @example memo
     * @var string
     */
    public $memo;

    // 发起操作的租户ID
    /**
     * @example JHG
     * @var string
     */
    public $optTenantId;

    // 业务交易ID
    /**
     * @example 1246354
     * @var string
     */
    public $outTxId;

    // 对换单流水状态：
    // 0        // 权益兑换单创建
    // 1        // 权益兑换单接单
    // 2        // 权益兑换单发货
    // 3        // 权益兑换单确认收货
    // 4        // 权益兑换单缺货
    // 5        // 权益兑换单核销
    /**
     * @example 1
     * @var integer
     */
    public $status;

    // 权益归属租户ID
    /**
     * @example id
     * @var string
     */
    public $tenantId;

    // 交易时间戳
    /**
     * @example 123456
     * @var integer
     */
    public $timeStamp;

    // 兑换类型(商户身份/用户身份)
    /**
     * @example 0
     * @var integer
     */
    public $type;

    // 用户身份兑换/商户兑换的受益用户
    /**
     * @example userid
     * @var string
     */
    public $userId;

}
