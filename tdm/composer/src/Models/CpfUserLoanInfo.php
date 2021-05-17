<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CpfUserLoanInfo extends Model
{
    // 用户证件号码
    /**
     * @example 用户证件号码
     *
     * @var string
     */
    public $userId;

    // 证件类型
    /**
     * @example 01 身份证
     *
     * @var string
     */
    public $userIdType;

    // 配偶证件号码
    /**
     * @example 370101199601022014
     *
     * @var string
     */
    public $poId;

    // 配偶姓名
    /**
     * @example 小敏
     *
     * @var string
     */
    public $poName;

    // 贷款合同编号
    /**
     * @example 20201125010000RD831500012865
     *
     * @var string
     */
    public $loanId;

    // 贷款余额
    /**
     * @example "123.56"
     *
     * @var string
     */
    public $loanBalance;

    // 贷款合同状态
    /**
     * @example 贷款结清
     *
     * @var string
     */
    public $loanStatus;
    protected $_name = [
        'userId'      => 'user_id',
        'userIdType'  => 'user_id_type',
        'poId'        => 'po_id',
        'poName'      => 'po_name',
        'loanId'      => 'loan_id',
        'loanBalance' => 'loan_balance',
        'loanStatus'  => 'loan_status',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userIdType', $this->userIdType, true);
        Model::validateRequired('poId', $this->poId, true);
        Model::validateRequired('poName', $this->poName, true);
        Model::validateRequired('loanId', $this->loanId, true);
        Model::validateRequired('loanBalance', $this->loanBalance, true);
        Model::validateRequired('loanStatus', $this->loanStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userIdType) {
            $res['user_id_type'] = $this->userIdType;
        }
        if (null !== $this->poId) {
            $res['po_id'] = $this->poId;
        }
        if (null !== $this->poName) {
            $res['po_name'] = $this->poName;
        }
        if (null !== $this->loanId) {
            $res['loan_id'] = $this->loanId;
        }
        if (null !== $this->loanBalance) {
            $res['loan_balance'] = $this->loanBalance;
        }
        if (null !== $this->loanStatus) {
            $res['loan_status'] = $this->loanStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CpfUserLoanInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_id_type'])) {
            $model->userIdType = $map['user_id_type'];
        }
        if (isset($map['po_id'])) {
            $model->poId = $map['po_id'];
        }
        if (isset($map['po_name'])) {
            $model->poName = $map['po_name'];
        }
        if (isset($map['loan_id'])) {
            $model->loanId = $map['loan_id'];
        }
        if (isset($map['loan_balance'])) {
            $model->loanBalance = $map['loan_balance'];
        }
        if (isset($map['loan_status'])) {
            $model->loanStatus = $map['loan_status'];
        }

        return $model;
    }
}
