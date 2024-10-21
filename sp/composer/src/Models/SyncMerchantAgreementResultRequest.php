<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class SyncMerchantAgreementResultRequest extends Model
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

    /**
     * @var string
     */
    public $productAccessCode;

    // 签约请求单据号
    /**
     * @var string
     */
    public $requestId;

    // 代扣产品码
    // 代扣：GENERAL_WITHHOLDING_P
    /**
     * @var string
     */
    public $personalProductCode;

    // 代扣签约主体2088号(即代扣收款方)
    /**
     * @var string
     */
    public $merchantUserId;

    // 签约客户支付宝uid
    /**
     * @var string
     */
    public $customerAlipayUserId;

    // 实际生效时间
    /**
     * @var string
     */
    public $validTime;

    // 失效时间
    /**
     * @var string
     */
    public $invalidTime;

    // 签约时间
    /**
     * @var string
     */
    public $signTime;

    // 签约状态
    // TEMP-暂存
    // NORMAL-正常
    // STOP-暂停
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'productAccessCode'    => 'product_access_code',
        'requestId'            => 'request_id',
        'personalProductCode'  => 'personal_product_code',
        'merchantUserId'       => 'merchant_user_id',
        'customerAlipayUserId' => 'customer_alipay_user_id',
        'validTime'            => 'valid_time',
        'invalidTime'          => 'invalid_time',
        'signTime'             => 'sign_time',
        'status'               => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('personalProductCode', $this->personalProductCode, true);
        Model::validateRequired('merchantUserId', $this->merchantUserId, true);
        Model::validateRequired('customerAlipayUserId', $this->customerAlipayUserId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validatePattern('validTime', $this->validTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('invalidTime', $this->invalidTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('signTime', $this->signTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->personalProductCode) {
            $res['personal_product_code'] = $this->personalProductCode;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->customerAlipayUserId) {
            $res['customer_alipay_user_id'] = $this->customerAlipayUserId;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->invalidTime) {
            $res['invalid_time'] = $this->invalidTime;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncMerchantAgreementResultRequest
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
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['personal_product_code'])) {
            $model->personalProductCode = $map['personal_product_code'];
        }
        if (isset($map['merchant_user_id'])) {
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if (isset($map['customer_alipay_user_id'])) {
            $model->customerAlipayUserId = $map['customer_alipay_user_id'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['invalid_time'])) {
            $model->invalidTime = $map['invalid_time'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
