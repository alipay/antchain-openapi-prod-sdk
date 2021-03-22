<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CommissionRuleResponse extends Model
{
    // 手续费到账方
    /**
     * @example account_id
     *
     * @var string
     */
    public $accountId;

    // 手续费周期列表
    /**
     * @example
     *
     * @var CommissionPeriod[]
     */
    public $commissionPeriods;
    protected $_name = [
        'accountId'         => 'account_id',
        'commissionPeriods' => 'commission_periods',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('commissionPeriods', $this->commissionPeriods, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->commissionPeriods) {
            $res['commission_periods'] = [];
            if (null !== $this->commissionPeriods && \is_array($this->commissionPeriods)) {
                $n = 0;
                foreach ($this->commissionPeriods as $item) {
                    $res['commission_periods'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommissionRuleResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['commission_periods'])) {
            if (!empty($map['commission_periods'])) {
                $model->commissionPeriods = [];
                $n                        = 0;
                foreach ($map['commission_periods'] as $item) {
                    $model->commissionPeriods[$n++] = null !== $item ? CommissionPeriod::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
