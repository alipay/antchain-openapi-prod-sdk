<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QuerySidecarOperationResponse extends Model
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

    // 是否成功
    /**
     * @var bool
     */
    public $success;

    // 是否结束
    /**
     * @var bool
     */
    public $finished;

    // 执行状态
    /**
     * @var string
     */
    public $operationStatus;

    // 执行详情
    /**
     * @var string[]
     */
    public $targetProcesses;

    // 发布分组执行详情
    /**
     * @var SidecarOpsMachineGroup[]
     */
    public $processDetailList;

    // 扩展信息
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'success'           => 'success',
        'finished'          => 'finished',
        'operationStatus'   => 'operation_status',
        'targetProcesses'   => 'target_processes',
        'processDetailList' => 'process_detail_list',
        'properties'        => 'properties',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->finished) {
            $res['finished'] = $this->finished;
        }
        if (null !== $this->operationStatus) {
            $res['operation_status'] = $this->operationStatus;
        }
        if (null !== $this->targetProcesses) {
            $res['target_processes'] = $this->targetProcesses;
        }
        if (null !== $this->processDetailList) {
            $res['process_detail_list'] = [];
            if (null !== $this->processDetailList && \is_array($this->processDetailList)) {
                $n = 0;
                foreach ($this->processDetailList as $item) {
                    $res['process_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySidecarOperationResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['finished'])) {
            $model->finished = $map['finished'];
        }
        if (isset($map['operation_status'])) {
            $model->operationStatus = $map['operation_status'];
        }
        if (isset($map['target_processes'])) {
            if (!empty($map['target_processes'])) {
                $model->targetProcesses = $map['target_processes'];
            }
        }
        if (isset($map['process_detail_list'])) {
            if (!empty($map['process_detail_list'])) {
                $model->processDetailList = [];
                $n                        = 0;
                foreach ($map['process_detail_list'] as $item) {
                    $model->processDetailList[$n++] = null !== $item ? SidecarOpsMachineGroup::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
