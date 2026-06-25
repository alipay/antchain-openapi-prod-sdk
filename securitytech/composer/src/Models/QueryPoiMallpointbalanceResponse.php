<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryPoiMallpointbalanceResponse extends Model
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

    // 支付宝小程序用户唯一ID
    /**
     * @var string
     */
    public $openId;

    // 门店ID
    /**
     * @var string
     */
    public $storeId;

    // 分期主订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 商城可用余额金额
    /**
     * @var string
     */
    public $availableBalance;

    // 商城已消费金额
    /**
     * @var string
     */
    public $consumedAmount;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'openId'           => 'open_id',
        'storeId'          => 'store_id',
        'bizOrderNo'       => 'biz_order_no',
        'availableBalance' => 'available_balance',
        'consumedAmount'   => 'consumed_amount',
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
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->availableBalance) {
            $res['available_balance'] = $this->availableBalance;
        }
        if (null !== $this->consumedAmount) {
            $res['consumed_amount'] = $this->consumedAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPoiMallpointbalanceResponse
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
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['available_balance'])) {
            $model->availableBalance = $map['available_balance'];
        }
        if (isset($map['consumed_amount'])) {
            $model->consumedAmount = $map['consumed_amount'];
        }

        return $model;
    }
}
