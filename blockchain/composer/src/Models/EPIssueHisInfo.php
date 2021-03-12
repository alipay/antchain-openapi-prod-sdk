<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class EPIssueHisInfo extends Model
{
    // 版通发行日期时间戳
    /**
     * @example 1560827725
     *
     * @var int
     */
    public $issueDate;

    // 版通线下发行量
    /**
     * @example 1000
     *
     * @var int
     */
    public $offlineIssueAmount;

    // 版通线上发行量
    /**
     * @example 1000
     *
     * @var int
     */
    public $onlineIssueAmount;

    // 版通自持发行量
    /**
     * @example 1000
     *
     * @var int
     */
    public $selfIssueAmount;
    protected $_name = [
        'issueDate'          => 'issue_date',
        'offlineIssueAmount' => 'offline_issue_amount',
        'onlineIssueAmount'  => 'online_issue_amount',
        'selfIssueAmount'    => 'self_issue_amount',
    ];

    public function validate()
    {
        Model::validateRequired('issueDate', $this->issueDate, true);
        Model::validateRequired('offlineIssueAmount', $this->offlineIssueAmount, true);
        Model::validateRequired('onlineIssueAmount', $this->onlineIssueAmount, true);
        Model::validateRequired('selfIssueAmount', $this->selfIssueAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->issueDate) {
            $res['issue_date'] = $this->issueDate;
        }
        if (null !== $this->offlineIssueAmount) {
            $res['offline_issue_amount'] = $this->offlineIssueAmount;
        }
        if (null !== $this->onlineIssueAmount) {
            $res['online_issue_amount'] = $this->onlineIssueAmount;
        }
        if (null !== $this->selfIssueAmount) {
            $res['self_issue_amount'] = $this->selfIssueAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EPIssueHisInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['issue_date'])) {
            $model->issueDate = $map['issue_date'];
        }
        if (isset($map['offline_issue_amount'])) {
            $model->offlineIssueAmount = $map['offline_issue_amount'];
        }
        if (isset($map['online_issue_amount'])) {
            $model->onlineIssueAmount = $map['online_issue_amount'];
        }
        if (isset($map['self_issue_amount'])) {
            $model->selfIssueAmount = $map['self_issue_amount'];
        }

        return $model;
    }
}
