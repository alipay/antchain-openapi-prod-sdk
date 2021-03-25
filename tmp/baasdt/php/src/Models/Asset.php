<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Asset extends Model {
    protected $_name = [
        'adminId' => 'admin_id',
        'assetExtInfo' => 'asset_ext_info',
        'assetId' => 'asset_id',
        'assetName' => 'asset_name',
        'assetRate' => 'asset_rate',
        'currency' => 'currency',
        'issueAccountBalance' => 'issue_account_balance',
        'overdueRecoveryAccountBalance' => 'overdue_recovery_account_balance',
        'receivePaymentAccountBalance' => 'receive_payment_account_balance',
        'relayAccountBalance' => 'relay_account_balance',
        'status' => 'status',
        'tenantId' => 'tenant_id',
        'totalIssueBalance' => 'total_issue_balance',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->adminId) {
            $res['admin_id'] = $this->adminId;
        }
        if (null !== $this->assetExtInfo) {
            $res['asset_ext_info'] = null !== $this->assetExtInfo ? $this->assetExtInfo->toMap() : null;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->assetName) {
            $res['asset_name'] = $this->assetName;
        }
        if (null !== $this->assetRate) {
            $res['asset_rate'] = $this->assetRate;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->issueAccountBalance) {
            $res['issue_account_balance'] = $this->issueAccountBalance;
        }
        if (null !== $this->overdueRecoveryAccountBalance) {
            $res['overdue_recovery_account_balance'] = $this->overdueRecoveryAccountBalance;
        }
        if (null !== $this->receivePaymentAccountBalance) {
            $res['receive_payment_account_balance'] = $this->receivePaymentAccountBalance;
        }
        if (null !== $this->relayAccountBalance) {
            $res['relay_account_balance'] = $this->relayAccountBalance;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->totalIssueBalance) {
            $res['total_issue_balance'] = $this->totalIssueBalance;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Asset
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['admin_id'])){
            $model->adminId = $map['admin_id'];
        }
        if(isset($map['asset_ext_info'])){
            $model->assetExtInfo = AssetExtInfo::fromMap($map['asset_ext_info']);
        }
        if(isset($map['asset_id'])){
            $model->assetId = $map['asset_id'];
        }
        if(isset($map['asset_name'])){
            $model->assetName = $map['asset_name'];
        }
        if(isset($map['asset_rate'])){
            $model->assetRate = $map['asset_rate'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['issue_account_balance'])){
            $model->issueAccountBalance = $map['issue_account_balance'];
        }
        if(isset($map['overdue_recovery_account_balance'])){
            $model->overdueRecoveryAccountBalance = $map['overdue_recovery_account_balance'];
        }
        if(isset($map['receive_payment_account_balance'])){
            $model->receivePaymentAccountBalance = $map['receive_payment_account_balance'];
        }
        if(isset($map['relay_account_balance'])){
            $model->relayAccountBalance = $map['relay_account_balance'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['total_issue_balance'])){
            $model->totalIssueBalance = $map['total_issue_balance'];
        }
        return $model;
    }
    // 资产管理员ID
    /**
     * @example f46857d8
     * @var string
     */
    public $adminId;

    // 资产附属信息
    /**
     * @example 
     * @var AssetExtInfo
     */
    public $assetExtInfo;

    // 资产ID
    /**
     * @example CT::Asset001
     * @var string
     */
    public $assetId;

    // 资产名称
    /**
     * @example CTPoints
     * @var string
     */
    public $assetName;

    // 资产汇率
    /**
     * @example 1000.0000
     * @var string
     */
    public $assetRate;

    // 币种
    /**
     * @example CNY
     * @var string
     */
    public $currency;

    // 发行账户余额
    /**
     * @example 0.000
     * @var string
     */
    public $issueAccountBalance;

    // 过期回收账户余额
    /**
     * @example 0.000
     * @var string
     */
    public $overdueRecoveryAccountBalance;

    // 支付收款账户余额
    /**
     * @example 0.000
     * @var string
     */
    public $receivePaymentAccountBalance;

    // 中继账户余额
    /**
     * @example 0.000
     * @var string
     */
    public $relayAccountBalance;

    // 资产状态
    /**
     * @example 0
     * @var integer
     */
    public $status;

    // 租户ID
    /**
     * @example ORE
     * @var string
     */
    public $tenantId;

    // 资产总发行量
    /**
     * @example 11111111.0000
     * @var string
     */
    public $totalIssueBalance;

}
