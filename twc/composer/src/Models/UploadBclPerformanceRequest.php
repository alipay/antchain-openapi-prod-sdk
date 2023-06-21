<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UploadBclPerformanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 订单编号ID,长度不超过32位
    /**
     * @var string
     */
    public $orderId;

    // 租期编号，如：1表示第一期
    /**
     * @var int
     */
    public $period;

    // 租金归还金额，单位精确到分。如：56309表示563.09元
    /**
     * @var int
     */
    public $amount;

    // 租金归还时间(格式为"2019-07-31 12:00:00")
    /**
     * @var string
     */
    public $time;

    // 归还方式，取值范围如下：
    // ACTIVE_REPAYMENT：主动还款，
    // MY_BANK_PROXY_WITHHOLDING：网商委托代扣
    /**
     * @var string
     */
    public $way;

    // 还款凭证类型，取值范围如下：
    // PLATFORM_COLLECTION：平台代收（客户主动还款），
    // MY_BANK：网商银行
    /**
     * @var string
     */
    public $voucherType;

    // 还款凭证编号,
    // 如支付宝还款时，为支付宝流水编号
    /**
     * @var string
     */
    public $voucherSerial;

    // 手续费，单位分。如：128则表示手续费为12.8元；
    // 说明：如通过预授权、代扣的方式归还，该值必填
    /**
     * @var int
     */
    public $premium;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'period'            => 'period',
        'amount'            => 'amount',
        'time'              => 'time',
        'way'               => 'way',
        'voucherType'       => 'voucher_type',
        'voucherSerial'     => 'voucher_serial',
        'premium'           => 'premium',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('way', $this->way, true);
        Model::validateRequired('voucherType', $this->voucherType, true);
        Model::validateRequired('voucherSerial', $this->voucherSerial, true);
        Model::validateMaxLength('orderId', $this->orderId, 32);
        Model::validateMaxLength('way', $this->way, 32);
        Model::validateMaxLength('voucherType', $this->voucherType, 32);
        Model::validateMaxLength('voucherSerial', $this->voucherSerial, 64);
        Model::validateMinimum('period', $this->period, 1);
        Model::validateMinimum('amount', $this->amount, 1);
        Model::validateMinimum('premium', $this->premium, 1);
        Model::validatePattern('time', $this->time, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
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
     * @return UploadBclPerformanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
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
