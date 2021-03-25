<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CommissionRule extends Model
{
    // 一级分账方的账户ID
    /**
     * @example 3d95ea95740377c6b69678f0dab9de1cf09a3dc4a487374a402db8ee7b02a89f
     *
     * @var string
     */
    public $accountId;

    // 手续费规则
    /**
     * @example
     *
     * @var CommissionPeriod
     */
    public $commissionPeriod;
    protected $_name = [
        'accountId'        => 'account_id',
        'commissionPeriod' => 'commission_period',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('commissionPeriod', $this->commissionPeriod, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->commissionPeriod) {
            $res['commission_period'] = null !== $this->commissionPeriod ? $this->commissionPeriod->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommissionRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['commission_period'])) {
            $model->commissionPeriod = CommissionPeriod::fromMap($map['commission_period']);
        }

        return $model;
    }
}
