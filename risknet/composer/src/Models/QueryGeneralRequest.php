<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKNET\Models;

use AlibabaCloud\Tea\Model;

class QueryGeneralRequest extends Model
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

    // test
    /**
     * @var string
     */
    public $service;

    // 用于标记是否获得用户授权  1:获得授权（默认）
    // 0:未获得授权
    /**
     * @var string
     */
    public $userAuthorization;

    // 经过RSA加密的用于AES加密的随机数密钥
    /**
     * @var string
     */
    public $encryptedRandomNo;

    // 服务模式
    /**
     * @var string
     */
    public $serviceMode;

    // 记录外部调用ISV
    /**
     * @var string
     */
    public $externalId;

    // 银行卡号（加密）
    /**
     * @var string
     */
    public $bankCardNo;

    // 支付宝id	用于输入用户支付宝的 2088 账号
    /**
     * @var string
     */
    public $userId;

    // 电话号码
    /**
     * @var string
     */
    public $mobileNo;

    // 身份证
    /**
     * @var string
     */
    public $certNo;

    // 用于输入用户产生交易时的地理位置信息
    /**
     * @var string
     */
    public $lbs;

    // 用户购买或使用服务时产生的具体金额
    /**
     * @var string
     */
    public $salesAmount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'service'           => 'service',
        'userAuthorization' => 'user_authorization',
        'encryptedRandomNo' => 'encrypted_random_no',
        'serviceMode'       => 'service_mode',
        'externalId'        => 'external_id',
        'bankCardNo'        => 'bank_card_no',
        'userId'            => 'user_id',
        'mobileNo'          => 'mobile_no',
        'certNo'            => 'cert_no',
        'lbs'               => 'lbs',
        'salesAmount'       => 'sales_amount',
    ];

    public function validate()
    {
        Model::validateRequired('service', $this->service, true);
        Model::validateRequired('userAuthorization', $this->userAuthorization, true);
        Model::validateRequired('encryptedRandomNo', $this->encryptedRandomNo, true);
        Model::validateRequired('serviceMode', $this->serviceMode, true);
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
        if (null !== $this->service) {
            $res['service'] = $this->service;
        }
        if (null !== $this->userAuthorization) {
            $res['user_authorization'] = $this->userAuthorization;
        }
        if (null !== $this->encryptedRandomNo) {
            $res['encrypted_random_no'] = $this->encryptedRandomNo;
        }
        if (null !== $this->serviceMode) {
            $res['service_mode'] = $this->serviceMode;
        }
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->lbs) {
            $res['lbs'] = $this->lbs;
        }
        if (null !== $this->salesAmount) {
            $res['sales_amount'] = $this->salesAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGeneralRequest
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
        if (isset($map['service'])) {
            $model->service = $map['service'];
        }
        if (isset($map['user_authorization'])) {
            $model->userAuthorization = $map['user_authorization'];
        }
        if (isset($map['encrypted_random_no'])) {
            $model->encryptedRandomNo = $map['encrypted_random_no'];
        }
        if (isset($map['service_mode'])) {
            $model->serviceMode = $map['service_mode'];
        }
        if (isset($map['external_id'])) {
            $model->externalId = $map['external_id'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['mobile_no'])) {
            $model->mobileNo = $map['mobile_no'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['lbs'])) {
            $model->lbs = $map['lbs'];
        }
        if (isset($map['sales_amount'])) {
            $model->salesAmount = $map['sales_amount'];
        }

        return $model;
    }
}
