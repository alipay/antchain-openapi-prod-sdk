<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcLoanAppls extends Model
{
    // 客户ID
    /**
     * @example 232
     *
     * @var string
     */
    public $userId;

    // 申请单号 系统的申请单号
    /**
     * @example 1232
     *
     * @var string
     */
    public $orderNo;

    // 提款单状态
    /**
     * @example 1
     *
     * @var string
     */
    public $orderStatus;

    // 借据号
    /**
     * @example 123
     *
     * @var string
     */
    public $loanNo;
    protected $_name = [
        'userId'      => 'user_id',
        'orderNo'     => 'order_no',
        'orderStatus' => 'order_status',
        'loanNo'      => 'loan_no',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('loanNo', $this->loanNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->loanNo) {
            $res['loan_no'] = $this->loanNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcLoanAppls
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['loan_no'])) {
            $model->loanNo = $map['loan_no'];
        }

        return $model;
    }
}
