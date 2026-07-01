<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CheckWitnessSignaccessResponse extends Model
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

    // 有权限的印章id列表
    /**
     * @var string[]
     */
    public $accessSealIds;

    // 审批数据
    /**
     * @var WitnessApprovalData[]
     */
    public $approvalDatas;

    // 错误码
    /**
     * @var int
     */
    public $code;

    // 错误信息
    /**
     * @var string
     */
    public $message;

    // 签署票证
    /**
     * @var string
     */
    public $signTicket;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'accessSealIds' => 'access_seal_ids',
        'approvalDatas' => 'approval_datas',
        'code'          => 'code',
        'message'       => 'message',
        'signTicket'    => 'sign_ticket',
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
        if (null !== $this->accessSealIds) {
            $res['access_seal_ids'] = $this->accessSealIds;
        }
        if (null !== $this->approvalDatas) {
            $res['approval_datas'] = [];
            if (null !== $this->approvalDatas && \is_array($this->approvalDatas)) {
                $n = 0;
                foreach ($this->approvalDatas as $item) {
                    $res['approval_datas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->signTicket) {
            $res['sign_ticket'] = $this->signTicket;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckWitnessSignaccessResponse
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
        if (isset($map['access_seal_ids'])) {
            if (!empty($map['access_seal_ids'])) {
                $model->accessSealIds = $map['access_seal_ids'];
            }
        }
        if (isset($map['approval_datas'])) {
            if (!empty($map['approval_datas'])) {
                $model->approvalDatas = [];
                $n                    = 0;
                foreach ($map['approval_datas'] as $item) {
                    $model->approvalDatas[$n++] = null !== $item ? WitnessApprovalData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['sign_ticket'])) {
            $model->signTicket = $map['sign_ticket'];
        }

        return $model;
    }
}
