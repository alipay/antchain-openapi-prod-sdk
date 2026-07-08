<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class SubmitEcarLcaorderwithcustomerResponse extends Model
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

    // 订单编号
    /**
     * @var string
     */
    public $orderNo;

    // 来源于三方平台的订单编号
    /**
     * @var string
     */
    public $sourceOrderNo;

    // 碳账户编号，碳矩阵为客户分配的碳账户编号
    /**
     * @var string
     */
    public $carbonAccountNo;

    // 订单状态，Pending——处理中，Closed——已关闭，Finished——已完成
    /**
     * @var string
     */
    public $orderStatus;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'orderNo'         => 'order_no',
        'sourceOrderNo'   => 'source_order_no',
        'carbonAccountNo' => 'carbon_account_no',
        'orderStatus'     => 'order_status',
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->sourceOrderNo) {
            $res['source_order_no'] = $this->sourceOrderNo;
        }
        if (null !== $this->carbonAccountNo) {
            $res['carbon_account_no'] = $this->carbonAccountNo;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitEcarLcaorderwithcustomerResponse
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['source_order_no'])) {
            $model->sourceOrderNo = $map['source_order_no'];
        }
        if (isset($map['carbon_account_no'])) {
            $model->carbonAccountNo = $map['carbon_account_no'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }

        return $model;
    }
}
