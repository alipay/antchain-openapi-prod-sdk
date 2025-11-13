<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class BatchLoanResultData extends Model
{
    // 流水号
    /**
     * @example 123123122134
     *
     * @var string
     */
    public $bizNo;

    // 状态
    /**
     * @example TODO
     *
     * @var string
     */
    public $status;

    // FUND_BATCH_LOAN: 批量放款
    /**
     * @example FUND_BATCH_LOAN
     *
     * @var string
     */
    public $type;

    // 任务创建时间
    /**
     * @example 2024-10-17 18:41:59
     *
     * @var string
     */
    public $createTime;

    // 同意放款数据
    /**
     * @example 10
     *
     * @var int
     */
    public $agreeLoanCount;

    // 拒绝放款数量
    /**
     * @example 10
     *
     * @var int
     */
    public $rejectLoanCount;

    // 放款失败数量
    /**
     * @example 10
     *
     * @var int
     */
    public $loanFailCount;

    // 放款失败结果文件
    /**
     * @example http://123456.com
     *
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'bizNo'           => 'biz_no',
        'status'          => 'status',
        'type'            => 'type',
        'createTime'      => 'create_time',
        'agreeLoanCount'  => 'agree_loan_count',
        'rejectLoanCount' => 'reject_loan_count',
        'loanFailCount'   => 'loan_fail_count',
        'fileUrl'         => 'file_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->agreeLoanCount) {
            $res['agree_loan_count'] = $this->agreeLoanCount;
        }
        if (null !== $this->rejectLoanCount) {
            $res['reject_loan_count'] = $this->rejectLoanCount;
        }
        if (null !== $this->loanFailCount) {
            $res['loan_fail_count'] = $this->loanFailCount;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchLoanResultData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['agree_loan_count'])) {
            $model->agreeLoanCount = $map['agree_loan_count'];
        }
        if (isset($map['reject_loan_count'])) {
            $model->rejectLoanCount = $map['reject_loan_count'];
        }
        if (isset($map['loan_fail_count'])) {
            $model->loanFailCount = $map['loan_fail_count'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
