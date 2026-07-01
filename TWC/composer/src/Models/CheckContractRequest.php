<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CheckContractRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 链路由字段，如：copyright、judicatory、contract
    /**
     * @var string
     */
    public $chain;

    // 是否跨链，目前仅支持跨链：true
    /**
     * @var bool
     */
    public $crossChain;

    // 业务合约id，当crossChain为false时，该字段必填
    /**
     * @var string
     */
    public $contractId;

    // 业务合约方法名称，当crossChain为false时，该字段必填
    /**
     * @var string
     */
    public $contractMethod;

    // 业务合约方法入参，当crossChain为false时，该字段必填
    /**
     * @var string
     */
    public $contractParam;

    // 业务合约方法的返回值类型
    /**
     * @var string
     */
    public $contractOutTypes;

    // 跨链的业务合约的contractId，contractMethod，contractParam，contractOutTypes的JSON组合。当crossChain为true时，该字段必填。
    /**
     * @var string
     */
    public $crossParam;

    // 是否本地执行
    /**
     * @var bool
     */
    public $local;

    // 链上账户名称
    /**
     * @var string
     */
    public $contractAccount;

    // 业务订单id
    /**
     * @var string
     */
    public $bizOrderId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chain'             => 'chain',
        'crossChain'        => 'cross_chain',
        'contractId'        => 'contract_id',
        'contractMethod'    => 'contract_method',
        'contractParam'     => 'contract_param',
        'contractOutTypes'  => 'contract_out_types',
        'crossParam'        => 'cross_param',
        'local'             => 'local',
        'contractAccount'   => 'contract_account',
        'bizOrderId'        => 'biz_order_id',
    ];

    public function validate()
    {
        Model::validateRequired('chain', $this->chain, true);
        Model::validateRequired('crossChain', $this->crossChain, true);
        Model::validateRequired('bizOrderId', $this->bizOrderId, true);
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
        if (null !== $this->chain) {
            $res['chain'] = $this->chain;
        }
        if (null !== $this->crossChain) {
            $res['cross_chain'] = $this->crossChain;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->contractMethod) {
            $res['contract_method'] = $this->contractMethod;
        }
        if (null !== $this->contractParam) {
            $res['contract_param'] = $this->contractParam;
        }
        if (null !== $this->contractOutTypes) {
            $res['contract_out_types'] = $this->contractOutTypes;
        }
        if (null !== $this->crossParam) {
            $res['cross_param'] = $this->crossParam;
        }
        if (null !== $this->local) {
            $res['local'] = $this->local;
        }
        if (null !== $this->contractAccount) {
            $res['contract_account'] = $this->contractAccount;
        }
        if (null !== $this->bizOrderId) {
            $res['biz_order_id'] = $this->bizOrderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckContractRequest
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
        if (isset($map['chain'])) {
            $model->chain = $map['chain'];
        }
        if (isset($map['cross_chain'])) {
            $model->crossChain = $map['cross_chain'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['contract_method'])) {
            $model->contractMethod = $map['contract_method'];
        }
        if (isset($map['contract_param'])) {
            $model->contractParam = $map['contract_param'];
        }
        if (isset($map['contract_out_types'])) {
            $model->contractOutTypes = $map['contract_out_types'];
        }
        if (isset($map['cross_param'])) {
            $model->crossParam = $map['cross_param'];
        }
        if (isset($map['local'])) {
            $model->local = $map['local'];
        }
        if (isset($map['contract_account'])) {
            $model->contractAccount = $map['contract_account'];
        }
        if (isset($map['biz_order_id'])) {
            $model->bizOrderId = $map['biz_order_id'];
        }

        return $model;
    }
}
