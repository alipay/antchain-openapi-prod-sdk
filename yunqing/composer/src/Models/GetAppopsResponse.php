<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class GetAppopsResponse extends Model
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

    // 执行失败的节点
    /**
     * @var NodeExecutionLog[]
     */
    public $failedNodes;

    // 运维单执行日志。
    /**
     * @var string
     */
    public $log;

    // 运维单状态。取值列表：UNINITIALIZED:待初始化；ININTIALIZING:初始化中；INITIALIZED:初始化完成；EXECUTING:执行中；SUCCEEDED：执行成功；FAILED：执行失败；其他待补充。
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'failedNodes' => 'failed_nodes',
        'log'         => 'log',
        'status'      => 'status',
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
        if (null !== $this->failedNodes) {
            $res['failed_nodes'] = [];
            if (null !== $this->failedNodes && \is_array($this->failedNodes)) {
                $n = 0;
                foreach ($this->failedNodes as $item) {
                    $res['failed_nodes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->log) {
            $res['log'] = $this->log;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAppopsResponse
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
        if (isset($map['failed_nodes'])) {
            if (!empty($map['failed_nodes'])) {
                $model->failedNodes = [];
                $n                  = 0;
                foreach ($map['failed_nodes'] as $item) {
                    $model->failedNodes[$n++] = null !== $item ? NodeExecutionLog::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['log'])) {
            $model->log = $map['log'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
