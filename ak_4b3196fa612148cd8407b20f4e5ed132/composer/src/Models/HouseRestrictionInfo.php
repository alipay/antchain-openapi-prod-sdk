<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_4b3196fa612148cd8407b20f4e5ed132\Models;

use AlibabaCloud\Tea\Model;

class HouseRestrictionInfo extends Model
{
    // 申请人
    //
    /**
     * @example XXX机构或XX人名称
     *
     * @var string
     */
    public $applicant;

    // 限制结束日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $restrictionEndDate;

    // 限制起始日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $restrictionStartDate;

    // 来文单位
    /**
     * @example xx中级人民法院
     *
     * @var string
     */
    public $fromOrgName;

    // 登记时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $registerTime;

    // 限制金额，人民币默认单位元，保留两位小数点
    /**
     * @example 5000000.00
     *
     * @var string
     */
    public $restrictedAmount;

    // 限制金额货币类型，比如：CNY=人民币
    /**
     * @example CNY
     *
     * @var string
     */
    public $restrictedAmountCurrency;

    // 限制文号
    /**
     * @example 法第232323号
     *
     * @var string
     */
    public $restrictionNo;

    // 房产链内部房产编号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $houseNo;
    protected $_name = [
        'applicant'                => 'applicant',
        'restrictionEndDate'       => 'restriction_end_date',
        'restrictionStartDate'     => 'restriction_start_date',
        'fromOrgName'              => 'from_org_name',
        'registerTime'             => 'register_time',
        'restrictedAmount'         => 'restricted_amount',
        'restrictedAmountCurrency' => 'restricted_amount_currency',
        'restrictionNo'            => 'restriction_no',
        'houseNo'                  => 'house_no',
    ];

    public function validate()
    {
        Model::validatePattern('restrictionEndDate', $this->restrictionEndDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('restrictionStartDate', $this->restrictionStartDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('registerTime', $this->registerTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applicant) {
            $res['applicant'] = $this->applicant;
        }
        if (null !== $this->restrictionEndDate) {
            $res['restriction_end_date'] = $this->restrictionEndDate;
        }
        if (null !== $this->restrictionStartDate) {
            $res['restriction_start_date'] = $this->restrictionStartDate;
        }
        if (null !== $this->fromOrgName) {
            $res['from_org_name'] = $this->fromOrgName;
        }
        if (null !== $this->registerTime) {
            $res['register_time'] = $this->registerTime;
        }
        if (null !== $this->restrictedAmount) {
            $res['restricted_amount'] = $this->restrictedAmount;
        }
        if (null !== $this->restrictedAmountCurrency) {
            $res['restricted_amount_currency'] = $this->restrictedAmountCurrency;
        }
        if (null !== $this->restrictionNo) {
            $res['restriction_no'] = $this->restrictionNo;
        }
        if (null !== $this->houseNo) {
            $res['house_no'] = $this->houseNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HouseRestrictionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['applicant'])) {
            $model->applicant = $map['applicant'];
        }
        if (isset($map['restriction_end_date'])) {
            $model->restrictionEndDate = $map['restriction_end_date'];
        }
        if (isset($map['restriction_start_date'])) {
            $model->restrictionStartDate = $map['restriction_start_date'];
        }
        if (isset($map['from_org_name'])) {
            $model->fromOrgName = $map['from_org_name'];
        }
        if (isset($map['register_time'])) {
            $model->registerTime = $map['register_time'];
        }
        if (isset($map['restricted_amount'])) {
            $model->restrictedAmount = $map['restricted_amount'];
        }
        if (isset($map['restricted_amount_currency'])) {
            $model->restrictedAmountCurrency = $map['restricted_amount_currency'];
        }
        if (isset($map['restriction_no'])) {
            $model->restrictionNo = $map['restriction_no'];
        }
        if (isset($map['house_no'])) {
            $model->houseNo = $map['house_no'];
        }

        return $model;
    }
}
