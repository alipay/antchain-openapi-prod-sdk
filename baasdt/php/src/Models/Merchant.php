<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Merchant extends Model {
    protected $_name = [
        'adminId' => 'admin_id',
        'description' => 'description',
        'did' => 'did',
        'fundManagerId' => 'fund_manager_id',
        'isAssetIssuer' => 'is_asset_issuer',
        'isEquityConsumer' => 'is_equity_consumer',
        'isEquityProvider' => 'is_equity_provider',
        'profitLossBalance' => 'profit_loss_balance',
        'provision' => 'provision',
        'status' => 'status',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->adminId) {
            $res['admin_id'] = $this->adminId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->fundManagerId) {
            $res['fund_manager_id'] = $this->fundManagerId;
        }
        if (null !== $this->isAssetIssuer) {
            $res['is_asset_issuer'] = $this->isAssetIssuer;
        }
        if (null !== $this->isEquityConsumer) {
            $res['is_equity_consumer'] = $this->isEquityConsumer;
        }
        if (null !== $this->isEquityProvider) {
            $res['is_equity_provider'] = $this->isEquityProvider;
        }
        if (null !== $this->profitLossBalance) {
            $res['profit_loss_balance'] = $this->profitLossBalance;
        }
        if (null !== $this->provision) {
            $res['provision'] = null !== $this->provision ? $this->provision->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Merchant
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['admin_id'])){
            $model->adminId = $map['admin_id'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['did'])){
            $model->did = $map['did'];
        }
        if(isset($map['fund_manager_id'])){
            $model->fundManagerId = $map['fund_manager_id'];
        }
        if(isset($map['is_asset_issuer'])){
            $model->isAssetIssuer = $map['is_asset_issuer'];
        }
        if(isset($map['is_equity_consumer'])){
            $model->isEquityConsumer = $map['is_equity_consumer'];
        }
        if(isset($map['is_equity_provider'])){
            $model->isEquityProvider = $map['is_equity_provider'];
        }
        if(isset($map['profit_loss_balance'])){
            $model->profitLossBalance = $map['profit_loss_balance'];
        }
        if(isset($map['provision'])){
            $model->provision = Provision::fromMap($map['provision']);
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    // 商户管理员ID
    /**
     * @example ed7b3acb718eef475454e973b8b
     * @var string
     */
    public $adminId;

    // 商户描述
    /**
     * @example 商户描述
     * @var string
     */
    public $description;

    // 商户分布式身份ID
    /**
     * @example did:mychain:ct
     * @var string
     */
    public $did;

    // 资金管理员ID
    /**
     * @example b7ecd55bde0481bfc8c972b7ef
     * @var string
     */
    public $fundManagerId;

    // 是否可以发行资产
    /**
     * @example true, false
     * @var bool
     */
    public $isAssetIssuer;

    // 是否可以采购权益
    /**
     * @example true, false
     * @var bool
     */
    public $isEquityConsumer;

    // 是否可以发行权益
    /**
     * @example true, false
     * @var bool
     */
    public $isEquityProvider;

    // 商户的损益账户
    /**
     * @example 0.0050000000000000
     * @var string
     */
    public $profitLossBalance;

    // 备付金数据
    /**
     * @example 
     * @var Provision
     */
    public $provision;

    // 商户状态: 0可用, 1下线, 2冻结
    /**
     * @example 0 | 1 | 2
     * @var integer
     */
    public $status;

    // 租户ID
    /**
     * @example DBYG
     * @var string
     */
    public $tenantId;

}
