<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecElectrocarBatchpubResponse extends Model
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

    // 批次ID
    /**
     * @var string
     */
    public $batchId;

    // 总设备数
    /**
     * @var int
     */
    public $totalCount;

    // 触发模式
    /**
     * @var string
     */
    public $triggerMode;

    // 定时执行时间戳
    /**
     * @var int
     */
    public $scheduledTime;

    // 状态
    /**
     * @var bool
     */
    public $success;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'batchId'       => 'batch_id',
        'totalCount'    => 'total_count',
        'triggerMode'   => 'trigger_mode',
        'scheduledTime' => 'scheduled_time',
        'success'       => 'success',
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->triggerMode) {
            $res['trigger_mode'] = $this->triggerMode;
        }
        if (null !== $this->scheduledTime) {
            $res['scheduled_time'] = $this->scheduledTime;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecElectrocarBatchpubResponse
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
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['trigger_mode'])) {
            $model->triggerMode = $map['trigger_mode'];
        }
        if (isset($map['scheduled_time'])) {
            $model->scheduledTime = $map['scheduled_time'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
