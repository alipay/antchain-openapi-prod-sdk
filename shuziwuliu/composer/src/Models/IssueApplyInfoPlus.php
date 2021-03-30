<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class IssueApplyInfoPlus extends Model
{
    // 订单中的BookingNo，以英文逗号分割
    /**
     * @example booking_no_A,booking_no_B,booking_no_C
     *
     * @var string
     */
    public $bookingNo;

    // 船公司did
    /**
     * @example 123123
     *
     * @var string
     */
    public $carrierDid;

    // BookingNo中的箱号，以英文逗号分割
    /**
     * @example booking_no_A:container_no_1,booking_no_A:container_no_2,booking_no_B:container_no_1
     *
     * @var string
     */
    public $containerNo;

    // 到期时间戳
    /**
     * @example 1595381053000
     *
     * @var string
     */
    public $expireDate;

    // 发行金额，精确到小数点后2位
    /**
     * @example 32.65
     *
     * @var string
     */
    public $issueAmt;

    // 全局唯一业务号
    /**
     * @example 123123
     *
     * @var string
     */
    public $outBizNo;

    // 支付单号
    /**
     * @example 123123
     *
     * @var string
     */
    public $outOrderNo;

    // 运单订单id
    /**
     * @example 123123
     *
     * @var string
     */
    public $waybillId;
    protected $_name = [
        'bookingNo'   => 'booking_no',
        'carrierDid'  => 'carrier_did',
        'containerNo' => 'container_no',
        'expireDate'  => 'expire_date',
        'issueAmt'    => 'issue_amt',
        'outBizNo'    => 'out_biz_no',
        'outOrderNo'  => 'out_order_no',
        'waybillId'   => 'waybill_id',
    ];

    public function validate()
    {
        Model::validateRequired('bookingNo', $this->bookingNo, true);
        Model::validateRequired('carrierDid', $this->carrierDid, true);
        Model::validateRequired('containerNo', $this->containerNo, true);
        Model::validateRequired('expireDate', $this->expireDate, true);
        Model::validateRequired('issueAmt', $this->issueAmt, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('waybillId', $this->waybillId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->carrierDid) {
            $res['carrier_did'] = $this->carrierDid;
        }
        if (null !== $this->containerNo) {
            $res['container_no'] = $this->containerNo;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->issueAmt) {
            $res['issue_amt'] = $this->issueAmt;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->waybillId) {
            $res['waybill_id'] = $this->waybillId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IssueApplyInfoPlus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['booking_no'])) {
            $model->bookingNo = $map['booking_no'];
        }
        if (isset($map['carrier_did'])) {
            $model->carrierDid = $map['carrier_did'];
        }
        if (isset($map['container_no'])) {
            $model->containerNo = $map['container_no'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['issue_amt'])) {
            $model->issueAmt = $map['issue_amt'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['waybill_id'])) {
            $model->waybillId = $map['waybill_id'];
        }

        return $model;
    }
}
