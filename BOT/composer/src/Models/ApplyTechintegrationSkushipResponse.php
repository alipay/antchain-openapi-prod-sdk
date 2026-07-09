<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ApplyTechintegrationSkushipResponse extends Model
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

    // 支付芯证书列表
    /**
     * @var string[]
     */
    public $data;

    // 证书拉取任务ID
    /**
     * @var string
     */
    public $taskId;

    // 证书拉取任务批次
    /**
     * @var string
     */
    public $taskBatchNum;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'data'         => 'data',
        'taskId'       => 'task_id',
        'taskBatchNum' => 'task_batch_num',
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->taskBatchNum) {
            $res['task_batch_num'] = $this->taskBatchNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyTechintegrationSkushipResponse
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
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = $map['data'];
            }
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['task_batch_num'])) {
            $model->taskBatchNum = $map['task_batch_num'];
        }

        return $model;
    }
}
