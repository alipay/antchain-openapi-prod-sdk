<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UserIssueId extends Model
{
    // 凭证id
    /**
     * @example 12123
     *
     * @var string
     */
    public $issueId;

    // 凭证余额
    /**
     * @example 87.09
     *
     * @var string
     */
    public $balanceAmt;
    protected $_name = [
        'issueId'    => 'issue_id',
        'balanceAmt' => 'balance_amt',
    ];

    public function validate()
    {
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validateRequired('balanceAmt', $this->balanceAmt, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->balanceAmt) {
            $res['balance_amt'] = $this->balanceAmt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserIssueId
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['balance_amt'])) {
            $model->balanceAmt = $map['balance_amt'];
        }

        return $model;
    }
}
