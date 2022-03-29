<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ListTraceWorkspacesettingResponse extends Model
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
     * @var TraceWorkspaceSetting[]
     */
    public $traceWorkspaceSettings;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'traceWorkspaceSettings' => 'trace_workspace_settings',
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
        if (null !== $this->traceWorkspaceSettings) {
            $res['trace_workspace_settings'] = [];
            if (null !== $this->traceWorkspaceSettings && \is_array($this->traceWorkspaceSettings)) {
                $n = 0;
                foreach ($this->traceWorkspaceSettings as $item) {
                    $res['trace_workspace_settings'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListTraceWorkspacesettingResponse
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
        if (isset($map['trace_workspace_settings'])) {
            if (!empty($map['trace_workspace_settings'])) {
                $model->traceWorkspaceSettings = [];
                $n                             = 0;
                foreach ($map['trace_workspace_settings'] as $item) {
                    $model->traceWorkspaceSettings[$n++] = null !== $item ? TraceWorkspaceSetting::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
