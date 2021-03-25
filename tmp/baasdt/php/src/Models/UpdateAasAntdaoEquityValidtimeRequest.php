<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateAasAntdaoEquityValidtimeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'chainId' => 'chain_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'equityId' => 'equity_id',
        'outTxId' => 'out_tx_id',
        'useValidNotAfter' => 'use_valid_not_after',
        'useValidNotBefore' => 'use_valid_not_before',
        'validNotAfter' => 'valid_not_after',
        'validNotBefore' => 'valid_not_before',
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
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->useValidNotAfter) {
            $res['use_valid_not_after'] = $this->useValidNotAfter;
        }
        if (null !== $this->useValidNotBefore) {
            $res['use_valid_not_before'] = $this->useValidNotBefore;
        }
        if (null !== $this->validNotAfter) {
            $res['valid_not_after'] = $this->validNotAfter;
        }
        if (null !== $this->validNotBefore) {
            $res['valid_not_before'] = $this->validNotBefore;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateAasAntdaoEquityValidtimeRequest
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
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        if(isset($map['use_valid_not_after'])){
            $model->useValidNotAfter = $map['use_valid_not_after'];
        }
        if(isset($map['use_valid_not_before'])){
            $model->useValidNotBefore = $map['use_valid_not_before'];
        }
        if(isset($map['valid_not_after'])){
            $model->validNotAfter = $map['valid_not_after'];
        }
        if(isset($map['valid_not_before'])){
            $model->validNotBefore = $map['valid_not_before'];
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

    // 要代理的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;

    // 权益商品ID
    /**
     * @var string
     */
    public $equityId;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;

    // 权益商品使用有效期右闭区间
    /**
     * @var string
     */
    public $useValidNotAfter;

    // 权益商品使用有效期左闭区间
    /**
     * @var string
     */
    public $useValidNotBefore;

    // 权益商品兑换有效期右闭区间
    /**
     * @var string
     */
    public $validNotAfter;

    // 权益商品兑换有效期左闭区间
    /**
     * @var string
     */
    public $validNotBefore;

}
