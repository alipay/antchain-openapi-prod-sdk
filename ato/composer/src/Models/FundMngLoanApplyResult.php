<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class FundMngLoanApplyResult extends Model
{
    // 放款状态
    /**
     * @example REJECTED_LOAN
     *
     * @var string
     */
    public $loanApplyStatus;

    // 融资申请失败原因
    /**
     * @example xxx原因
     *
     * @var string
     */
    public $loanFailReason;
    protected $_name = [
        'loanApplyStatus' => 'loan_apply_status',
        'loanFailReason'  => 'loan_fail_reason',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->loanApplyStatus) {
            $res['loan_apply_status'] = $this->loanApplyStatus;
        }
        if (null !== $this->loanFailReason) {
            $res['loan_fail_reason'] = $this->loanFailReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FundMngLoanApplyResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['loan_apply_status'])) {
            $model->loanApplyStatus = $map['loan_apply_status'];
        }
        if (isset($map['loan_fail_reason'])) {
            $model->loanFailReason = $map['loan_fail_reason'];
        }

        return $model;
    }
}
