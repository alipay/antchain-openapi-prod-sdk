<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class TokenOperationDetail extends Model
{
    // 粉丝粒操作流水状态，pending：发放中，confirmed：已到账，canceled：已取消
    /**
     * @example pending | confirmed | canceled
     *
     * @var string
     */
    public $status;

    // 粉丝粒数量，单位分个
    /**
     * @example 100
     *
     * @var int
     */
    public $tokenAmount;

    // 明细发生时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $time;

    // 明细信息
    /**
     * @example 购票发放
     *
     * @var string
     */
    public $info;

    // 唯一业务单号
    /**
     * @example 23452356345634
     *
     * @var string
     */
    public $bizId;

    // 订单编号
    /**
     * @example 202008241504423487681310
     *
     * @var string
     */
    public $orderNo;
    protected $_name = [
        'status'      => 'status',
        'tokenAmount' => 'token_amount',
        'time'        => 'time',
        'info'        => 'info',
        'bizId'       => 'biz_id',
        'orderNo'     => 'order_no',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('tokenAmount', $this->tokenAmount, true);
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('info', $this->info, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validatePattern('time', $this->time, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tokenAmount) {
            $res['token_amount'] = $this->tokenAmount;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->info) {
            $res['info'] = $this->info;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TokenOperationDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['token_amount'])) {
            $model->tokenAmount = $map['token_amount'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['info'])) {
            $model->info = $map['info'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }

        return $model;
    }
}
