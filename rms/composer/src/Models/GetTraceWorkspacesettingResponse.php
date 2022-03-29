<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetTraceWorkspacesettingResponse extends Model
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

    // 工作空间配置
    /**
     * @var TraceWorkspaceSetting
     */
    public $traceWorkspaceSetting;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'traceWorkspaceSetting' => 'trace_workspace_setting',
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
        if (null !== $this->traceWorkspaceSetting) {
            $res['trace_workspace_setting'] = null !== $this->traceWorkspaceSetting ? $this->traceWorkspaceSetting->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetTraceWorkspacesettingResponse
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
        if (isset($map['trace_workspace_setting'])) {
            $model->traceWorkspaceSetting = TraceWorkspaceSetting::fromMap($map['trace_workspace_setting']);
        }

        return $model;
    }
}
