<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class GetAntchainAtoFundRepaymentplanResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 宽限期，精确到毫秒
    /**
     * @var int
     */
    public $limit;

    // 应付租金时间，格式为yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $payDateList;

    // 租期
    /**
     * @var int
     */
    public $payPeriod;

    // 应付租金，精确到分，即1234表示12.34元
    /**
     * @var string
     */
    public $payMoneyList;

    // 租赁公司支付宝UID
    /**
     * @var string
     */
    public $leaseAlipayUid;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'orderId'        => 'order_id',
        'limit'          => 'limit',
        'payDateList'    => 'pay_date_list',
        'payPeriod'      => 'pay_period',
        'payMoneyList'   => 'pay_money_list',
        'leaseAlipayUid' => 'lease_alipay_uid',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        if (null !== $this->payDateList) {
            $res['pay_date_list'] = $this->payDateList;
        }
        if (null !== $this->payPeriod) {
            $res['pay_period'] = $this->payPeriod;
        }
        if (null !== $this->payMoneyList) {
            $res['pay_money_list'] = $this->payMoneyList;
        }
        if (null !== $this->leaseAlipayUid) {
            $res['lease_alipay_uid'] = $this->leaseAlipayUid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAntchainAtoFundRepaymentplanResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }
        if (isset($map['pay_date_list'])) {
            $model->payDateList = $map['pay_date_list'];
        }
        if (isset($map['pay_period'])) {
            $model->payPeriod = $map['pay_period'];
        }
        if (isset($map['pay_money_list'])) {
            $model->payMoneyList = $map['pay_money_list'];
        }
        if (isset($map['lease_alipay_uid'])) {
            $model->leaseAlipayUid = $map['lease_alipay_uid'];
        }

        return $model;
    }
}
