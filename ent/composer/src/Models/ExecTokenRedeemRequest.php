<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class ExecTokenRedeemRequest extends Model
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

    // 业务单号
    /**
     * @var string
     */
    public $bizId;

    // 链 ID
    /**
     * @var string
     */
    public $chainId;

    // 合约 ID
    /**
     * @var string
     */
    public $contractId;

    // 币种，目前仅支持 CNY
    /**
     * @var string
     */
    public $currency;

    // 调用方
    /**
     * @var string
     */
    public $source;

    // 要兑现的用户VID
    /**
     * @var string
     */
    public $targetUser;

    // Token总金额，token_price*token_number 的结果，单位为分
    /**
     * @var int
     */
    public $tokenAmount;

    // 兑现的Token数目
    /**
     * @var int
     */
    public $tokenNumber;

    // 兑现的Token单价，单位为分
    /**
     * @var int
     */
    public $tokenPrice;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'chainId'           => 'chain_id',
        'contractId'        => 'contract_id',
        'currency'          => 'currency',
        'source'            => 'source',
        'targetUser'        => 'target_user',
        'tokenAmount'       => 'token_amount',
        'tokenNumber'       => 'token_number',
        'tokenPrice'        => 'token_price',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('contractId', $this->contractId, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('targetUser', $this->targetUser, true);
        Model::validateRequired('tokenAmount', $this->tokenAmount, true);
        Model::validateRequired('tokenNumber', $this->tokenNumber, true);
        Model::validateRequired('tokenPrice', $this->tokenPrice, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->targetUser) {
            $res['target_user'] = $this->targetUser;
        }
        if (null !== $this->tokenAmount) {
            $res['token_amount'] = $this->tokenAmount;
        }
        if (null !== $this->tokenNumber) {
            $res['token_number'] = $this->tokenNumber;
        }
        if (null !== $this->tokenPrice) {
            $res['token_price'] = $this->tokenPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecTokenRedeemRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['target_user'])) {
            $model->targetUser = $map['target_user'];
        }
        if (isset($map['token_amount'])) {
            $model->tokenAmount = $map['token_amount'];
        }
        if (isset($map['token_number'])) {
            $model->tokenNumber = $map['token_number'];
        }
        if (isset($map['token_price'])) {
            $model->tokenPrice = $map['token_price'];
        }

        return $model;
    }
}
