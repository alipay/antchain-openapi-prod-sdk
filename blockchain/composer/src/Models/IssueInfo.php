<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class IssueInfo extends Model
{
    // 信用流转批次号
    /**
     * @example 001abc
     *
     * @var string
     */
    public $batchId;

    // 合同编号
    /**
     * @example 8888888
     *
     * @var string
     */
    public $contractId;

    // 信用凭证额度
    /**
     * @example 1898.98
     *
     * @var string
     */
    public $creditLimit;

    // 失败原因信息
    /**
     * @example 发行额度不足
     *
     * @var string
     */
    public $errMsg;

    // 信用凭证到期时间
    /**
     * @example 20191212
     *
     * @var string
     */
    public $expireDate;

    // 信用凭证发起时间
    /**
     * @example 20190101
     *
     * @var string
     */
    public $issueDate;

    // 信用流转凭证
    /**
     * @example 002abc
     *
     * @var string
     */
    public $issueId;

    // 发行结果状态
    // -1:发行失败状态， 0:未完成状态， 1:已发行状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 发行信用流转的运单号
    /**
     * @example 003abc
     *
     * @var string
     */
    public $waybillId;
    protected $_name = [
        'batchId'     => 'batch_id',
        'contractId'  => 'contract_id',
        'creditLimit' => 'credit_limit',
        'errMsg'      => 'err_msg',
        'expireDate'  => 'expire_date',
        'issueDate'   => 'issue_date',
        'issueId'     => 'issue_id',
        'status'      => 'status',
        'waybillId'   => 'waybill_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->creditLimit) {
            $res['credit_limit'] = $this->creditLimit;
        }
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->issueDate) {
            $res['issue_date'] = $this->issueDate;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->waybillId) {
            $res['waybill_id'] = $this->waybillId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IssueInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['credit_limit'])) {
            $model->creditLimit = $map['credit_limit'];
        }
        if (isset($map['err_msg'])) {
            $model->errMsg = $map['err_msg'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['issue_date'])) {
            $model->issueDate = $map['issue_date'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['waybill_id'])) {
            $model->waybillId = $map['waybill_id'];
        }

        return $model;
    }
}
