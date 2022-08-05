<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class MatchDidAssetsRequest extends Model
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

    // 场景码(YYX)
    /**
     * @var string
     */
    public $bizCode;

    // 支付宝uid
    /**
     * @var string
     */
    public $uid;

    // 分布式id ，双向check
    /**
     * @var string
     */
    public $did;

    // 链id
    /**
     * @var string
     */
    public $chainId;

    // 链账户
    /**
     * @var string
     */
    public $chainAccount;

    // 链资产地址 HASH
    /**
     * @var string
     */
    public $contract;

    // 合约类型 0-WASM
    /**
     * @var int
     */
    public $contractType;

    // 资产类型
    /**
     * @var string
     */
    public $assertType;

    // 上次资产发生变更的区块高度
    /**
     * @var string
     */
    public $blockNumber;

    // 上次资产发生变更的序号
    /**
     * @var string
     */
    public $txIndex;

    // 上次资产发生变更的交易序列号
    /**
     * @var string
     */
    public $longIndex;

    // 资产名称
    /**
     * @var string
     */
    public $assertName;

    // 资产信息（资产描述信息）
    /**
     * @var string
     */
    public $assertData;

    // 资产ID
    /**
     * @var string
     */
    public $assertId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'uid'               => 'uid',
        'did'               => 'did',
        'chainId'           => 'chain_id',
        'chainAccount'      => 'chain_account',
        'contract'          => 'contract',
        'contractType'      => 'contract_type',
        'assertType'        => 'assert_type',
        'blockNumber'       => 'block_number',
        'txIndex'           => 'tx_index',
        'longIndex'         => 'long_index',
        'assertName'        => 'assert_name',
        'assertData'        => 'assert_data',
        'assertId'          => 'assert_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('uid', $this->uid, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('chainAccount', $this->chainAccount, true);
        Model::validateRequired('contract', $this->contract, true);
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('assertType', $this->assertType, true);
        Model::validateRequired('txIndex', $this->txIndex, true);
        Model::validateRequired('longIndex', $this->longIndex, true);
        Model::validateRequired('assertName', $this->assertName, true);
        Model::validateRequired('assertData', $this->assertData, true);
        Model::validateRequired('assertId', $this->assertId, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->chainAccount) {
            $res['chain_account'] = $this->chainAccount;
        }
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->assertType) {
            $res['assert_type'] = $this->assertType;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->txIndex) {
            $res['tx_index'] = $this->txIndex;
        }
        if (null !== $this->longIndex) {
            $res['long_index'] = $this->longIndex;
        }
        if (null !== $this->assertName) {
            $res['assert_name'] = $this->assertName;
        }
        if (null !== $this->assertData) {
            $res['assert_data'] = $this->assertData;
        }
        if (null !== $this->assertId) {
            $res['assert_id'] = $this->assertId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MatchDidAssetsRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['chain_account'])) {
            $model->chainAccount = $map['chain_account'];
        }
        if (isset($map['contract'])) {
            $model->contract = $map['contract'];
        }
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['assert_type'])) {
            $model->assertType = $map['assert_type'];
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['tx_index'])) {
            $model->txIndex = $map['tx_index'];
        }
        if (isset($map['long_index'])) {
            $model->longIndex = $map['long_index'];
        }
        if (isset($map['assert_name'])) {
            $model->assertName = $map['assert_name'];
        }
        if (isset($map['assert_data'])) {
            $model->assertData = $map['assert_data'];
        }
        if (isset($map['assert_id'])) {
            $model->assertId = $map['assert_id'];
        }

        return $model;
    }
}
