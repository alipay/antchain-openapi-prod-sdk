<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class FundInfo extends Model
{
    // 资金方编号
    /**
     * @example D20250701000000001
     *
     * @var string
     */
    public $fundCode;

    // 资金方简称
    /**
     * @example 科融
     *
     * @var string
     */
    public $abbreFundName;

    // 额度状态
    /**
     * @example 0
     *
     * @var string
     */
    public $creditStatus;

    // 授信总额度
    /**
     * @example 200000
     *
     * @var string
     */
    public $creditAmount;

    // 剩余可用余额
    /**
     * @example 200000
     *
     * @var string
     */
    public $restAmount;

    // 年利率
    /**
     * @example 0.1250
     *
     * @var string
     */
    public $yearInterestRate;
    protected $_name = [
        'fundCode'         => 'fund_code',
        'abbreFundName'    => 'abbre_fund_name',
        'creditStatus'     => 'credit_status',
        'creditAmount'     => 'credit_amount',
        'restAmount'       => 'rest_amount',
        'yearInterestRate' => 'year_interest_rate',
    ];

    public function validate()
    {
        Model::validateRequired('fundCode', $this->fundCode, true);
        Model::validateRequired('abbreFundName', $this->abbreFundName, true);
        Model::validateRequired('creditStatus', $this->creditStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        if (null !== $this->abbreFundName) {
            $res['abbre_fund_name'] = $this->abbreFundName;
        }
        if (null !== $this->creditStatus) {
            $res['credit_status'] = $this->creditStatus;
        }
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->restAmount) {
            $res['rest_amount'] = $this->restAmount;
        }
        if (null !== $this->yearInterestRate) {
            $res['year_interest_rate'] = $this->yearInterestRate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FundInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }
        if (isset($map['abbre_fund_name'])) {
            $model->abbreFundName = $map['abbre_fund_name'];
        }
        if (isset($map['credit_status'])) {
            $model->creditStatus = $map['credit_status'];
        }
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['rest_amount'])) {
            $model->restAmount = $map['rest_amount'];
        }
        if (isset($map['year_interest_rate'])) {
            $model->yearInterestRate = $map['year_interest_rate'];
        }

        return $model;
    }
}
