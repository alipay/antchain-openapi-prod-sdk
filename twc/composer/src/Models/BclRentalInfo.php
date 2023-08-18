<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclRentalInfo extends Model
{
    // 期数
    /**
     * @example 1
     *
     * @var int
     */
    public $period;

    // 金额 单位分
    /**
     * @example 123123
     *
     * @var int
     */
    public $amount;

    // 租金归还时间
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $time;

    // 是	归还方式
    // 1.租赁代扣: PROXY_WITHHOLDING
    // 2.主动还款：ACTIVE_REPAYMENT
    // 3.网商委托代扣：MY_BANK_DIRECT_PAYMENT
    // 4.预授权代扣：PRE_AUTHORIZATION_WITHHOLDING
    /**
     * @example ALIPAY_WITHHOLDING
     *
     * @var string
     */
    public $way;

    // 还款渠道
    // 1.支付宝：ALIPAY
    // 2.平台代收（客户主动还款）：PLATFORM_COLLECTION
    // 3.网商银行：MY_BANK
    // 4.其他：OTHER
    /**
     * @example ALIPAY
     *
     * @var string
     */
    public $voucherType;

    // 还款凭证编号
    /**
     * @example asdqw23e123sd
     *
     * @var string
     */
    public $voucherSerial;

    // 手续费 如通过预授权、代扣的方式规划，必填
    /**
     * @example 12321
     *
     * @var int
     */
    public $premium;
    protected $_name = [
        'period'        => 'period',
        'amount'        => 'amount',
        'time'          => 'time',
        'way'           => 'way',
        'voucherType'   => 'voucher_type',
        'voucherSerial' => 'voucher_serial',
        'premium'       => 'premium',
    ];

    public function validate()
    {
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('way', $this->way, true);
        Model::validateRequired('voucherType', $this->voucherType, true);
        Model::validateRequired('voucherSerial', $this->voucherSerial, true);
        Model::validateRequired('premium', $this->premium, true);
        Model::validatePattern('time', $this->time, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->way) {
            $res['way'] = $this->way;
        }
        if (null !== $this->voucherType) {
            $res['voucher_type'] = $this->voucherType;
        }
        if (null !== $this->voucherSerial) {
            $res['voucher_serial'] = $this->voucherSerial;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclRentalInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['way'])) {
            $model->way = $map['way'];
        }
        if (isset($map['voucher_type'])) {
            $model->voucherType = $map['voucher_type'];
        }
        if (isset($map['voucher_serial'])) {
            $model->voucherSerial = $map['voucher_serial'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }

        return $model;
    }
}
