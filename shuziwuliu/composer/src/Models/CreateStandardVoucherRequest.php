<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateStandardVoucherRequest extends Model
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

    // 数据标识
    /**
     * @var string
     */
    public $businessCode;

    // 资产类型
    /**
     * @var string
     */
    public $assetType;

    // 发行金额
    /**
     * @var string
     */
    public $amountProof;

    // 发行金额
    /**
     * @var string
     */
    public $amount;

    // 余额
    /**
     * @var string
     */
    public $balanceProof;

    // 余额
    /**
     * @var string
     */
    public $balance;

    // 币种
    /**
     * @var string
     */
    public $currency;

    // 发行时间
    /**
     * @var int
     */
    public $issueTime;

    // 到期时间
    /**
     * @var int
     */
    public $expireTime;

    // 清分时间
    /**
     * @var int
     */
    public $clearingTime;

    // 发布者
    /**
     * @var string
     */
    public $issuer;

    // 资本者
    /**
     * @var string
     */
    public $capital;

    // 所属账户
    /**
     * @var string
     */
    public $voucherOwner;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessCode'      => 'business_code',
        'assetType'         => 'asset_type',
        'amountProof'       => 'amount_proof',
        'amount'            => 'amount',
        'balanceProof'      => 'balance_proof',
        'balance'           => 'balance',
        'currency'          => 'currency',
        'issueTime'         => 'issue_time',
        'expireTime'        => 'expire_time',
        'clearingTime'      => 'clearing_time',
        'issuer'            => 'issuer',
        'capital'           => 'capital',
        'voucherOwner'      => 'voucher_owner',
    ];

    public function validate()
    {
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('assetType', $this->assetType, true);
        Model::validateRequired('amountProof', $this->amountProof, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('balanceProof', $this->balanceProof, true);
        Model::validateRequired('balance', $this->balance, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('issueTime', $this->issueTime, true);
        Model::validateRequired('expireTime', $this->expireTime, true);
        Model::validateRequired('clearingTime', $this->clearingTime, true);
        Model::validateRequired('issuer', $this->issuer, true);
        Model::validateRequired('capital', $this->capital, true);
        Model::validateRequired('voucherOwner', $this->voucherOwner, true);
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
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->assetType) {
            $res['asset_type'] = $this->assetType;
        }
        if (null !== $this->amountProof) {
            $res['amount_proof'] = $this->amountProof;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->balanceProof) {
            $res['balance_proof'] = $this->balanceProof;
        }
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->issueTime) {
            $res['issue_time'] = $this->issueTime;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->clearingTime) {
            $res['clearing_time'] = $this->clearingTime;
        }
        if (null !== $this->issuer) {
            $res['issuer'] = $this->issuer;
        }
        if (null !== $this->capital) {
            $res['capital'] = $this->capital;
        }
        if (null !== $this->voucherOwner) {
            $res['voucher_owner'] = $this->voucherOwner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateStandardVoucherRequest
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
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['asset_type'])) {
            $model->assetType = $map['asset_type'];
        }
        if (isset($map['amount_proof'])) {
            $model->amountProof = $map['amount_proof'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['balance_proof'])) {
            $model->balanceProof = $map['balance_proof'];
        }
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['issue_time'])) {
            $model->issueTime = $map['issue_time'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['clearing_time'])) {
            $model->clearingTime = $map['clearing_time'];
        }
        if (isset($map['issuer'])) {
            $model->issuer = $map['issuer'];
        }
        if (isset($map['capital'])) {
            $model->capital = $map['capital'];
        }
        if (isset($map['voucher_owner'])) {
            $model->voucherOwner = $map['voucher_owner'];
        }

        return $model;
    }
}
