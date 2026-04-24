<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcLoanQuery extends Model
{
    // 总条数
    /**
     * @example 25
     *
     * @var string
     */
    public $totalCount;

    // 订单数组
    /**
     * @example
     *
     * @var EcLoanAppls[]
     */
    public $loanAppls;
    protected $_name = [
        'totalCount' => 'total_count',
        'loanAppls'  => 'loan_appls',
    ];

    public function validate()
    {
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('loanAppls', $this->loanAppls, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->loanAppls) {
            $res['loan_appls'] = [];
            if (null !== $this->loanAppls && \is_array($this->loanAppls)) {
                $n = 0;
                foreach ($this->loanAppls as $item) {
                    $res['loan_appls'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcLoanQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['loan_appls'])) {
            if (!empty($map['loan_appls'])) {
                $model->loanAppls = [];
                $n                = 0;
                foreach ($map['loan_appls'] as $item) {
                    $model->loanAppls[$n++] = null !== $item ? EcLoanAppls::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
