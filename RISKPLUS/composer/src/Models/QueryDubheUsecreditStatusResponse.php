<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubheUsecreditStatusResponse extends Model
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

    // 用信状态（0-通过/1-不通过2-处理中）
    /**
     * @var string
     */
    public $status;

    // 拒绝原因
    /**
     * @var string
     */
    public $msg;

    // 借据信息
    /**
     * @var ReceiptInfo
     */
    public $receiptInfo;

    // 还款计划列表
    /**
     * @var RepayRef[]
     */
    public $repayRef;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'status'      => 'status',
        'msg'         => 'msg',
        'receiptInfo' => 'receipt_info',
        'repayRef'    => 'repay_ref',
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
        if (null !== $this->receiptInfo) {
            $res['receipt_info'] = null !== $this->receiptInfo ? $this->receiptInfo->toMap() : null;
        }
        if (null !== $this->repayRef) {
            $res['repay_ref'] = [];
            if (null !== $this->repayRef && \is_array($this->repayRef)) {
                $n = 0;
                foreach ($this->repayRef as $item) {
                    $res['repay_ref'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubheUsecreditStatusResponse
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
        if (isset($map['receipt_info'])) {
            $model->receiptInfo = ReceiptInfo::fromMap($map['receipt_info']);
        }
        if (isset($map['repay_ref'])) {
            if (!empty($map['repay_ref'])) {
                $model->repayRef = [];
                $n               = 0;
                foreach ($map['repay_ref'] as $item) {
                    $model->repayRef[$n++] = null !== $item ? RepayRef::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
