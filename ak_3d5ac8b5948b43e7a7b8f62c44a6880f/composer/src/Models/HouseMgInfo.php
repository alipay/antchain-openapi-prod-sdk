<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_3d5ac8b5948b43e7a7b8f62c44a6880f\Models;

use AlibabaCloud\Tea\Model;

class HouseMgInfo extends Model
{
    // 债权金额，人民币默认单位元，保留两位小数点
    /**
     * @example 350000.00
     *
     * @var string
     */
    public $debtAmount;

    // 债权金额货币类型，比如：CNY=人民币
    /**
     * @example CNY
     *
     * @var string
     */
    public $debtAmountCurrency;

    // 抵押权人证件号码
    /**
     * @example 3332XC23232
     *
     * @var string
     */
    public $mortgageeCertNo;

    // 抵押权人证件类型,比如：UNIFIED_SOCIAL_CODE=统一社会信用代码
    /**
     * @example UNIFIED_SOCIAL_CODE
     *
     * @var string
     */
    public $mortgageeCertType;

    // 抵押权人名称
    /**
     * @example XX银行xx分行
     *
     * @var string
     */
    public $mortgageeName;

    // 履债结束日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $debtEndDate;

    // 履债起始日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $debtStartDate;

    // 登记时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $registeredDate;

    // 房产链内部房产编号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $houseNo;
    protected $_name = [
        'debtAmount'         => 'debt_amount',
        'debtAmountCurrency' => 'debt_amount_currency',
        'mortgageeCertNo'    => 'mortgagee_cert_no',
        'mortgageeCertType'  => 'mortgagee_cert_type',
        'mortgageeName'      => 'mortgagee_name',
        'debtEndDate'        => 'debt_end_date',
        'debtStartDate'      => 'debt_start_date',
        'registeredDate'     => 'registered_date',
        'houseNo'            => 'house_no',
    ];

    public function validate()
    {
        Model::validatePattern('debtEndDate', $this->debtEndDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('debtStartDate', $this->debtStartDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('registeredDate', $this->registeredDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->debtAmount) {
            $res['debt_amount'] = $this->debtAmount;
        }
        if (null !== $this->debtAmountCurrency) {
            $res['debt_amount_currency'] = $this->debtAmountCurrency;
        }
        if (null !== $this->mortgageeCertNo) {
            $res['mortgagee_cert_no'] = $this->mortgageeCertNo;
        }
        if (null !== $this->mortgageeCertType) {
            $res['mortgagee_cert_type'] = $this->mortgageeCertType;
        }
        if (null !== $this->mortgageeName) {
            $res['mortgagee_name'] = $this->mortgageeName;
        }
        if (null !== $this->debtEndDate) {
            $res['debt_end_date'] = $this->debtEndDate;
        }
        if (null !== $this->debtStartDate) {
            $res['debt_start_date'] = $this->debtStartDate;
        }
        if (null !== $this->registeredDate) {
            $res['registered_date'] = $this->registeredDate;
        }
        if (null !== $this->houseNo) {
            $res['house_no'] = $this->houseNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HouseMgInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['debt_amount'])) {
            $model->debtAmount = $map['debt_amount'];
        }
        if (isset($map['debt_amount_currency'])) {
            $model->debtAmountCurrency = $map['debt_amount_currency'];
        }
        if (isset($map['mortgagee_cert_no'])) {
            $model->mortgageeCertNo = $map['mortgagee_cert_no'];
        }
        if (isset($map['mortgagee_cert_type'])) {
            $model->mortgageeCertType = $map['mortgagee_cert_type'];
        }
        if (isset($map['mortgagee_name'])) {
            $model->mortgageeName = $map['mortgagee_name'];
        }
        if (isset($map['debt_end_date'])) {
            $model->debtEndDate = $map['debt_end_date'];
        }
        if (isset($map['debt_start_date'])) {
            $model->debtStartDate = $map['debt_start_date'];
        }
        if (isset($map['registered_date'])) {
            $model->registeredDate = $map['registered_date'];
        }
        if (isset($map['house_no'])) {
            $model->houseNo = $map['house_no'];
        }

        return $model;
    }
}
