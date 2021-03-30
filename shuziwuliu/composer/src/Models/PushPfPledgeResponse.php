<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PushPfPledgeResponse extends Model
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

    // 质押标识，用于账单质押推送状态查询
    /**
     * @var string
     */
    public $pledgeId;

    // 已提交  COMMIT
    // 推送中 PUSHING
    // 推送成功 PUSH_SUC
    // 推送失败 PUSH_FAIL
    /**
     * @var string
     */
    public $status;

    // 描述
    /**
     * @var string
     */
    public $desc;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'pledgeId'   => 'pledge_id',
        'status'     => 'status',
        'desc'       => 'desc',
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
        if (null !== $this->pledgeId) {
            $res['pledge_id'] = $this->pledgeId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushPfPledgeResponse
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
        if (isset($map['pledge_id'])) {
            $model->pledgeId = $map['pledge_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
