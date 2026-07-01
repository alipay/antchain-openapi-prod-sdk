<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryBclComplainResponse extends Model
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

    // 租赁订单id
    /**
     * @var string
     */
    public $orderId;

    // 投诉订单号
    /**
     * @var string
     */
    public $complainEventId;

    // 投诉单状态
    /**
     * @var string
     */
    public $status;

    // 支付宝交易号
    /**
     * @var string
     */
    public $alipayTradeNo;

    // 投诉单创建时间
    /**
     * @var string
     */
    public $gmtCreate;

    // 投诉单修改时间
    /**
     * @var string
     */
    public $gmtModified;

    // 投诉单修改时间
    /**
     * @var string
     */
    public $gmtFinished;

    // 用户投诉诉求
    /**
     * @var string
     */
    public $leafCategoryName;

    // 用户投诉原因
    /**
     * @var string
     */
    public $complainReason;

    // 投诉人电话号码
    /**
     * @var string
     */
    public $phoneNo;

    // 交易金额，单位元
    /**
     * @var string
     */
    public $tradeAmount;

    // 用户与商家之间的协商记录
    /**
     * @var ReplyDetailInfo[]
     */
    public $replyDetailInfos;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'orderId'          => 'order_id',
        'complainEventId'  => 'complain_event_id',
        'status'           => 'status',
        'alipayTradeNo'    => 'alipay_trade_no',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'gmtFinished'      => 'gmt_finished',
        'leafCategoryName' => 'leaf_category_name',
        'complainReason'   => 'complain_reason',
        'phoneNo'          => 'phone_no',
        'tradeAmount'      => 'trade_amount',
        'replyDetailInfos' => 'reply_detail_infos',
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
        if (null !== $this->complainEventId) {
            $res['complain_event_id'] = $this->complainEventId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->alipayTradeNo) {
            $res['alipay_trade_no'] = $this->alipayTradeNo;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->gmtFinished) {
            $res['gmt_finished'] = $this->gmtFinished;
        }
        if (null !== $this->leafCategoryName) {
            $res['leaf_category_name'] = $this->leafCategoryName;
        }
        if (null !== $this->complainReason) {
            $res['complain_reason'] = $this->complainReason;
        }
        if (null !== $this->phoneNo) {
            $res['phone_no'] = $this->phoneNo;
        }
        if (null !== $this->tradeAmount) {
            $res['trade_amount'] = $this->tradeAmount;
        }
        if (null !== $this->replyDetailInfos) {
            $res['reply_detail_infos'] = [];
            if (null !== $this->replyDetailInfos && \is_array($this->replyDetailInfos)) {
                $n = 0;
                foreach ($this->replyDetailInfos as $item) {
                    $res['reply_detail_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBclComplainResponse
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
        if (isset($map['complain_event_id'])) {
            $model->complainEventId = $map['complain_event_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['alipay_trade_no'])) {
            $model->alipayTradeNo = $map['alipay_trade_no'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['gmt_finished'])) {
            $model->gmtFinished = $map['gmt_finished'];
        }
        if (isset($map['leaf_category_name'])) {
            $model->leafCategoryName = $map['leaf_category_name'];
        }
        if (isset($map['complain_reason'])) {
            $model->complainReason = $map['complain_reason'];
        }
        if (isset($map['phone_no'])) {
            $model->phoneNo = $map['phone_no'];
        }
        if (isset($map['trade_amount'])) {
            $model->tradeAmount = $map['trade_amount'];
        }
        if (isset($map['reply_detail_infos'])) {
            if (!empty($map['reply_detail_infos'])) {
                $model->replyDetailInfos = [];
                $n                       = 0;
                foreach ($map['reply_detail_infos'] as $item) {
                    $model->replyDetailInfos[$n++] = null !== $item ? ReplyDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
