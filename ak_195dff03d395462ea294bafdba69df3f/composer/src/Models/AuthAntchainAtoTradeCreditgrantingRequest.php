<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class AuthAntchainAtoTradeCreditgrantingRequest extends Model
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

    // merchant_id
    /**
     * @var string
     */
    public $merchantId;

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

    // apply_role
    /**
     * @var string
     */
    public $applyRole;

    // auth_sign_type
    /**
     * @var string
     */
    public $authSignType;

    // auth_begin_date
    // 授权开始时间
    // yyyy-MM-dd HH:mm:ss
    // 非空，不可早于当前时间
    // 为空，设置为当前时间
    /**
     * @var string
     */
    public $authBeginDate;

    // 授权结束时间
    // yyyy-MM-dd HH:mm:ss
    // 非空，不可早于authBeginDate
    /**
     * @var string
     */
    public $authEndDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId'        => 'merchant_id',
        'fundId'            => 'fund_id',
        'authId'            => 'auth_id',
        'applyRole'         => 'apply_role',
        'authSignType'      => 'auth_sign_type',
        'authBeginDate'     => 'auth_begin_date',
        'authEndDate'       => 'auth_end_date',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('authId', $this->authId, true);
        Model::validateRequired('applyRole', $this->applyRole, true);
        Model::validateRequired('authSignType', $this->authSignType, true);
        Model::validateMaxLength('merchantId', $this->merchantId, 64);
        Model::validateMaxLength('fundId', $this->fundId, 64);
        Model::validateMaxLength('authId', $this->authId, 20);
        Model::validateMaxLength('applyRole', $this->applyRole, 32);
        Model::validateMaxLength('authSignType', $this->authSignType, 32);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('fundId', $this->fundId, 1);
        Model::validateMinLength('authId', $this->authId, 10);
        Model::validateMinLength('applyRole', $this->applyRole, 1);
        Model::validateMinLength('authSignType', $this->authSignType, 1);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->applyRole) {
            $res['apply_role'] = $this->applyRole;
        }
        if (null !== $this->authSignType) {
            $res['auth_sign_type'] = $this->authSignType;
        }
        if (null !== $this->authBeginDate) {
            $res['auth_begin_date'] = $this->authBeginDate;
        }
        if (null !== $this->authEndDate) {
            $res['auth_end_date'] = $this->authEndDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthAntchainAtoTradeCreditgrantingRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['apply_role'])) {
            $model->applyRole = $map['apply_role'];
        }
        if (isset($map['auth_sign_type'])) {
            $model->authSignType = $map['auth_sign_type'];
        }
        if (isset($map['auth_begin_date'])) {
            $model->authBeginDate = $map['auth_begin_date'];
        }
        if (isset($map['auth_end_date'])) {
            $model->authEndDate = $map['auth_end_date'];
        }

        return $model;
    }
}
