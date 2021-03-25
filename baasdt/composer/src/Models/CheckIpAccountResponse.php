<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CheckIpAccountResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 申请状态(0:运营审核中, 1:运营审核失败, 2:进件审核中, 3:进件审核失败, 4:进件审核成功)
    /**
     * @var string
     */
    public $status;

    // 运营审核失败原因
    /**
     * @var string
     */
    public $rejectReason;

    // 是否需要支付宝签约(当为true,需要用户到支付宝进行签约) 签约引导说明: https://opendocs.alipay.com/open/00gfyb
    /**
     * @var bool
     */
    public $needSign;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'status'       => 'status',
        'rejectReason' => 'reject_reason',
        'needSign'     => 'need_sign',
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
        if (null !== $this->rejectReason) {
            $res['reject_reason'] = $this->rejectReason;
        }
        if (null !== $this->needSign) {
            $res['need_sign'] = $this->needSign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckIpAccountResponse
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
        if (isset($map['reject_reason'])) {
            $model->rejectReason = $map['reject_reason'];
        }
        if (isset($map['need_sign'])) {
            $model->needSign = $map['need_sign'];
        }

        return $model;
    }
}
