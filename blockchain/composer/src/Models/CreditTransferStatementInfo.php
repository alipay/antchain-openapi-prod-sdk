<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreditTransferStatementInfo extends Model
{
    // 信用凭证额度
    /**
     * @example 1989.76
     *
     * @var string
     */
    public $creditLimit;

    // 信用凭证到期时间
    /**
     * @example 20191212
     *
     * @var string
     */
    public $expireDate;

    // 凭证来源方did
    /**
     * @example did:mychain:1b8b30228ec99cb5de99b2265538f3c505b274e0bef98fb9cee7aabd8f5f47eb
     *
     * @var string
     */
    public $fromDid;

    // 信用凭证发起时间
    /**
     * @example 20190101
     *
     * @var string
     */
    public $issueDate;

    // 信用流转凭证
    /**
     * @example 000abc
     *
     * @var string
     */
    public $issueId;

    // 流水类型
    /**
     * @example 融资提现
     *
     * @var string
     */
    public $stateType;

    // 凭证流转方did
    /**
     * @example did:mychain:1b8b30228ec99cb5de99b2265538f3c505b274e0bef98fb9cee7aabd8f5f47eb
     *
     * @var string
     */
    public $toDid;
    protected $_name = [
        'creditLimit' => 'credit_limit',
        'expireDate'  => 'expire_date',
        'fromDid'     => 'from_did',
        'issueDate'   => 'issue_date',
        'issueId'     => 'issue_id',
        'stateType'   => 'state_type',
        'toDid'       => 'to_did',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creditLimit) {
            $res['credit_limit'] = $this->creditLimit;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->fromDid) {
            $res['from_did'] = $this->fromDid;
        }
        if (null !== $this->issueDate) {
            $res['issue_date'] = $this->issueDate;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->stateType) {
            $res['state_type'] = $this->stateType;
        }
        if (null !== $this->toDid) {
            $res['to_did'] = $this->toDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreditTransferStatementInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['credit_limit'])) {
            $model->creditLimit = $map['credit_limit'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['from_did'])) {
            $model->fromDid = $map['from_did'];
        }
        if (isset($map['issue_date'])) {
            $model->issueDate = $map['issue_date'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['state_type'])) {
            $model->stateType = $map['state_type'];
        }
        if (isset($map['to_did'])) {
            $model->toDid = $map['to_did'];
        }

        return $model;
    }
}
