<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMONRCSMART\Models;

use AlibabaCloud\Tea\Model;

class ConfirmRcApprovalImageResponse extends Model
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

    // 审核结果基类
    /**
     * @var RcSmartResponse
     */
    public $rcSmartResponse;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'rcSmartResponse' => 'rc_smart_response',
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
        if (null !== $this->rcSmartResponse) {
            $res['rc_smart_response'] = null !== $this->rcSmartResponse ? $this->rcSmartResponse->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmRcApprovalImageResponse
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
        if (isset($map['rc_smart_response'])) {
            $model->rcSmartResponse = RcSmartResponse::fromMap($map['rc_smart_response']);
        }

        return $model;
    }
}
