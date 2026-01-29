<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncFundCreditgrantingRequest extends Model
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

    // 授信授权id
    /**
     * @var string
     */
    public $authId;

    // 资方社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 授信额度，单位为分
    /**
     * @var int
     */
    public $grantingLine;

    // 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
    /**
     * @var string
     */
    public $effectStartTime;

    // 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
    /**
     * @var string
     */
    public $effectEndTime;

    // 审核结果
    /**
     * @var string
     */
    public $reviewResult;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'grantingId'        => 'granting_id',
        'authId'            => 'auth_id',
        'fundId'            => 'fund_id',
        'merchantId'        => 'merchant_id',
        'tenantId'          => 'tenant_id',
        'grantingLine'      => 'granting_line',
        'effectStartTime'   => 'effect_start_time',
        'effectEndTime'     => 'effect_end_time',
        'reviewResult'      => 'review_result',
    ];

    public function validate()
    {
        Model::validateRequired('grantingId', $this->grantingId, true);
        Model::validateRequired('authId', $this->authId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateMaxLength('grantingId', $this->grantingId, 20);
        Model::validateMaxLength('authId', $this->authId, 20);
        Model::validateMaxLength('fundId', $this->fundId, 32);
        Model::validateMaxLength('merchantId', $this->merchantId, 32);
        Model::validateMaxLength('tenantId', $this->tenantId, 32);
        Model::validateMaxLength('effectStartTime', $this->effectStartTime, 20);
        Model::validateMaxLength('effectEndTime', $this->effectEndTime, 20);
        Model::validateMinLength('grantingId', $this->grantingId, 10);
        Model::validateMinLength('authId', $this->authId, 10);
        Model::validateMinLength('fundId', $this->fundId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('tenantId', $this->tenantId, 1);
        Model::validateMinLength('effectStartTime', $this->effectStartTime, 10);
        Model::validateMinLength('effectEndTime', $this->effectEndTime, 10);
        Model::validateMinimum('grantingLine', $this->grantingLine, 1);
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
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->grantingLine) {
            $res['granting_line'] = $this->grantingLine;
        }
        if (null !== $this->effectStartTime) {
            $res['effect_start_time'] = $this->effectStartTime;
        }
        if (null !== $this->effectEndTime) {
            $res['effect_end_time'] = $this->effectEndTime;
        }
        if (null !== $this->reviewResult) {
            $res['review_result'] = $this->reviewResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncFundCreditgrantingRequest
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
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['granting_line'])) {
            $model->grantingLine = $map['granting_line'];
        }
        if (isset($map['effect_start_time'])) {
            $model->effectStartTime = $map['effect_start_time'];
        }
        if (isset($map['effect_end_time'])) {
            $model->effectEndTime = $map['effect_end_time'];
        }
        if (isset($map['review_result'])) {
            $model->reviewResult = $map['review_result'];
        }

        return $model;
    }
}
