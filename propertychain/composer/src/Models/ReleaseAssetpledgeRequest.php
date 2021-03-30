<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ReleaseAssetpledgeRequest extends Model
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

    // 资金方的id
    /**
     * @var string
     */
    public $userId;

    // 质押Id
    /**
     * @var string
     */
    public $pledgeId;

    // 放款时间
    /**
     * @var int
     */
    public $lendDate;

    // 放款金额
    /**
     * @var int
     */
    public $value;

    // 收款方名称
    /**
     * @var string
     */
    public $borrowerName;

    // 收款方账号
    /**
     * @var string
     */
    public $borrowerAccount;

    // 收款方银行
    /**
     * @var string
     */
    public $borrowerBankInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'pledgeId'          => 'pledge_id',
        'lendDate'          => 'lend_date',
        'value'             => 'value',
        'borrowerName'      => 'borrower_name',
        'borrowerAccount'   => 'borrower_account',
        'borrowerBankInfo'  => 'borrower_bank_info',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('pledgeId', $this->pledgeId, true);
        Model::validateRequired('lendDate', $this->lendDate, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('borrowerName', $this->borrowerName, true);
        Model::validateRequired('borrowerAccount', $this->borrowerAccount, true);
        Model::validateRequired('borrowerBankInfo', $this->borrowerBankInfo, true);
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
        if (null !== $this->lendDate) {
            $res['lend_date'] = $this->lendDate;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->borrowerName) {
            $res['borrower_name'] = $this->borrowerName;
        }
        if (null !== $this->borrowerAccount) {
            $res['borrower_account'] = $this->borrowerAccount;
        }
        if (null !== $this->borrowerBankInfo) {
            $res['borrower_bank_info'] = $this->borrowerBankInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReleaseAssetpledgeRequest
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
        if (isset($map['lend_date'])) {
            $model->lendDate = $map['lend_date'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['borrower_name'])) {
            $model->borrowerName = $map['borrower_name'];
        }
        if (isset($map['borrower_account'])) {
            $model->borrowerAccount = $map['borrower_account'];
        }
        if (isset($map['borrower_bank_info'])) {
            $model->borrowerBankInfo = $map['borrower_bank_info'];
        }

        return $model;
    }
}
