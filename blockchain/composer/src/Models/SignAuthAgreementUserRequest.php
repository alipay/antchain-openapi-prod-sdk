<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SignAuthAgreementUserRequest extends Model
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

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 协议id
    /**
     * @var string
     */
    public $agreementId;

    // 签约时间
    /**
     * @var string
     */
    public $signDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'agreementId'       => 'agreement_id',
        'signDate'          => 'sign_date',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('agreementId', $this->agreementId, true);
        Model::validateRequired('signDate', $this->signDate, true);
        Model::validatePattern('signDate', $this->signDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->agreementId) {
            $res['agreement_id'] = $this->agreementId;
        }
        if (null !== $this->signDate) {
            $res['sign_date'] = $this->signDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignAuthAgreementUserRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['agreement_id'])) {
            $model->agreementId = $map['agreement_id'];
        }
        if (isset($map['sign_date'])) {
            $model->signDate = $map['sign_date'];
        }

        return $model;
    }
}
