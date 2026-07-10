<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateDirectmonitorTaskResponse extends Model
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

    // 监测任务id
    /**
     * @var string
     */
    public $monitorTaskId;

    // 是否存在相似结果
    /**
     * @var bool
     */
    public $isExistSimilar;

    // 监测结果总数量
    /**
     * @var int
     */
    public $monitorResultCount;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'monitorTaskId'      => 'monitor_task_id',
        'isExistSimilar'     => 'is_exist_similar',
        'monitorResultCount' => 'monitor_result_count',
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
        if (null !== $this->monitorTaskId) {
            $res['monitor_task_id'] = $this->monitorTaskId;
        }
        if (null !== $this->isExistSimilar) {
            $res['is_exist_similar'] = $this->isExistSimilar;
        }
        if (null !== $this->monitorResultCount) {
            $res['monitor_result_count'] = $this->monitorResultCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDirectmonitorTaskResponse
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
        if (isset($map['monitor_task_id'])) {
            $model->monitorTaskId = $map['monitor_task_id'];
        }
        if (isset($map['is_exist_similar'])) {
            $model->isExistSimilar = $map['is_exist_similar'];
        }
        if (isset($map['monitor_result_count'])) {
            $model->monitorResultCount = $map['monitor_result_count'];
        }

        return $model;
    }
}
