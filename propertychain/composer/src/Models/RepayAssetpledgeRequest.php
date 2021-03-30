<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RepayAssetpledgeRequest extends Model
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

    // 申请方
    /**
     * @var string
     */
    public $userId;

    // 质押id
    /**
     * @var string
     */
    public $pledgeId;

    // 收款方银行
    /**
     * @var string
     */
    public $recipientBank;

    // 收款方账号
    /**
     * @var string
     */
    public $recipientAccount;

    // 金额
    /**
     * @var int
     */
    public $value;

    // 还款时间
    /**
     * @var int
     */
    public $repayDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'pledgeId'          => 'pledge_id',
        'recipientBank'     => 'recipient_bank',
        'recipientAccount'  => 'recipient_account',
        'value'             => 'value',
        'repayDate'         => 'repay_date',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('pledgeId', $this->pledgeId, true);
        Model::validateRequired('recipientBank', $this->recipientBank, true);
        Model::validateRequired('recipientAccount', $this->recipientAccount, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('repayDate', $this->repayDate, true);
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
        if (null !== $this->pledgeId) {
            $res['pledge_id'] = $this->pledgeId;
        }
        if (null !== $this->recipientBank) {
            $res['recipient_bank'] = $this->recipientBank;
        }
        if (null !== $this->recipientAccount) {
            $res['recipient_account'] = $this->recipientAccount;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->repayDate) {
            $res['repay_date'] = $this->repayDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayAssetpledgeRequest
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
        if (isset($map['pledge_id'])) {
            $model->pledgeId = $map['pledge_id'];
        }
        if (isset($map['recipient_bank'])) {
            $model->recipientBank = $map['recipient_bank'];
        }
        if (isset($map['recipient_account'])) {
            $model->recipientAccount = $map['recipient_account'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['repay_date'])) {
            $model->repayDate = $map['repay_date'];
        }

        return $model;
    }
}
