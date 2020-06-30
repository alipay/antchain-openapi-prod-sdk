<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetMerchantFundmanagerRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'fundManagerTenantId' => 'fund_manager_tenant_id',
        'optTenantId' => 'opt_tenant_id',
        'outTxId' => 'out_tx_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->fundManagerTenantId) {
            $res['fund_manager_tenant_id'] = $this->fundManagerTenantId;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SetMerchantFundmanagerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['fund_manager_tenant_id'])){
            $model->fundManagerTenantId = $map['fund_manager_tenant_id'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
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
     * @description 资金管理员所属的租户ID
     * @example IJUYHTGR
     * @var string
     */
    public $fundManagerTenantId;

    /**
     * @description 要进行资金管理员设置的租户ID
     * @example ASFGYHDJ
     * @var string
     */
    public $optTenantId;

    /**
     * @description 外部交易ID
     * @example 1234567890
     * @var string
     */
    public $outTxId;

}
