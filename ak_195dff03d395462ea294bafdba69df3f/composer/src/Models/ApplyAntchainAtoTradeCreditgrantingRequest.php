<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class ApplyAntchainAtoTradeCreditgrantingRequest extends Model
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

    // 授信id
    /**
     * @var string
     */
    public $grantingId;

    // merchant_id
    /**
     * @var string
     */
    public $merchantId;

    // merchant_name
    /**
     * @var string
     */
    public $merchantName;

    // fund_id
    /**
     * @var string
     */
    public $fundId;

    // auth_id
    /**
     * @var string
     */
    public $authId;

    // 授信附加信息
    /**
     * @var string
     */
    public $creditExtraData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'grantingId'        => 'granting_id',
        'merchantId'        => 'merchant_id',
        'merchantName'      => 'merchant_name',
        'fundId'            => 'fund_id',
        'authId'            => 'auth_id',
        'creditExtraData'   => 'credit_extra_data',
    ];

    public function validate()
    {
        Model::validateRequired('grantingId', $this->grantingId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('authId', $this->authId, true);
        Model::validateMaxLength('grantingId', $this->grantingId, 49);
        Model::validateMaxLength('merchantId', $this->merchantId, 63);
        Model::validateMaxLength('merchantName', $this->merchantName, 199);
        Model::validateMaxLength('fundId', $this->fundId, 63);
        Model::validateMaxLength('authId', $this->authId, 63);
        Model::validateMinLength('grantingId', $this->grantingId, 6);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('merchantName', $this->merchantName, 1);
        Model::validateMinLength('fundId', $this->fundId, 1);
        Model::validateMinLength('authId', $this->authId, 1);
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
        if (null !== $this->grantingId) {
            $res['granting_id'] = $this->grantingId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->creditExtraData) {
            $res['credit_extra_data'] = $this->creditExtraData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyAntchainAtoTradeCreditgrantingRequest
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
        if (isset($map['granting_id'])) {
            $model->grantingId = $map['granting_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['credit_extra_data'])) {
            $model->creditExtraData = $map['credit_extra_data'];
        }

        return $model;
    }
}
