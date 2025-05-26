<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryCyclinginsuranceOrderdetailResponse extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderId;

    // 订单账号
    /**
     * @var string
     */
    public $acoountId;

    // 商品码
    /**
     * @var string
     */
    public $itemCode;

    // 商品属性
    /**
     * @var string
     */
    public $itemAttributes;

    // 订单履约流程信息
    /**
     * @var string
     */
    public $fulfillmentProcessInfo;

    // 附件
    /**
     * @var string
     */
    public $attachments;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'orderId'                => 'order_id',
        'acoountId'              => 'acoount_id',
        'itemCode'               => 'item_code',
        'itemAttributes'         => 'item_attributes',
        'fulfillmentProcessInfo' => 'fulfillment_process_info',
        'attachments'            => 'attachments',
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
        if (null !== $this->acoountId) {
            $res['acoount_id'] = $this->acoountId;
        }
        if (null !== $this->itemCode) {
            $res['item_code'] = $this->itemCode;
        }
        if (null !== $this->itemAttributes) {
            $res['item_attributes'] = $this->itemAttributes;
        }
        if (null !== $this->fulfillmentProcessInfo) {
            $res['fulfillment_process_info'] = $this->fulfillmentProcessInfo;
        }
        if (null !== $this->attachments) {
            $res['attachments'] = $this->attachments;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCyclinginsuranceOrderdetailResponse
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
        if (isset($map['acoount_id'])) {
            $model->acoountId = $map['acoount_id'];
        }
        if (isset($map['item_code'])) {
            $model->itemCode = $map['item_code'];
        }
        if (isset($map['item_attributes'])) {
            $model->itemAttributes = $map['item_attributes'];
        }
        if (isset($map['fulfillment_process_info'])) {
            $model->fulfillmentProcessInfo = $map['fulfillment_process_info'];
        }
        if (isset($map['attachments'])) {
            $model->attachments = $map['attachments'];
        }

        return $model;
    }
}
