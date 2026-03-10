<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRepaywithholdLxResponse extends Model
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

    // 代扣状态，
    // 1、代扣成功
    // 2、代扣失败
    // 3. 代扣处理中
    // 4. 未收到代扣请求（交易侧可以重复发起代扣）
    /**
     * @var int
     */
    public $status;

    // 代扣描述，失败时，需给出的错误描述
    /**
     * @var string
     */
    public $msg;

    // 资金方扣款交易流水号，受理流水号(资金方)
    /**
     * @var string
     */
    public $orderNum;

    // 支付通道交易流水号
    /**
     * @var string
     */
    public $transNum;

    // 代扣明细
    /**
     * @var WithholdDetailItem[]
     */
    public $withholdDetail;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'status'         => 'status',
        'msg'            => 'msg',
        'orderNum'       => 'order_num',
        'transNum'       => 'trans_num',
        'withholdDetail' => 'withhold_detail',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->orderNum) {
            $res['order_num'] = $this->orderNum;
        }
        if (null !== $this->transNum) {
            $res['trans_num'] = $this->transNum;
        }
        if (null !== $this->withholdDetail) {
            $res['withhold_detail'] = [];
            if (null !== $this->withholdDetail && \is_array($this->withholdDetail)) {
                $n = 0;
                foreach ($this->withholdDetail as $item) {
                    $res['withhold_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRepaywithholdLxResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['order_num'])) {
            $model->orderNum = $map['order_num'];
        }
        if (isset($map['trans_num'])) {
            $model->transNum = $map['trans_num'];
        }
        if (isset($map['withhold_detail'])) {
            if (!empty($map['withhold_detail'])) {
                $model->withholdDetail = [];
                $n                     = 0;
                foreach ($map['withhold_detail'] as $item) {
                    $model->withholdDetail[$n++] = null !== $item ? WithholdDetailItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
