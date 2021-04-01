<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetMydidcommunTaskTaskresultResponse extends Model
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

    // 任务ID
    /**
     * @var string
     */
    public $taskId;

    // FINISH 执行成功
    // CANCEL 执行失败
    // 只有FINISH 和CANCEL为最终状态，其他均为中间状态
    /**
     * @var string
     */
    public $status;

    // json序列化后的，任务执行结果，对不同的任务格式会有不同
    // 如：
    // - 代理VC的任务，返回值结构为{"vc":"1111111"}
    // - 获取数据的任务，返回值结构为{"response":{"output":"xxxx","status":"FINISH"}}
    /**
     * @var string
     */
    public $dataResult;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'taskId'     => 'task_id',
        'status'     => 'status',
        'dataResult' => 'data_result',
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
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->dataResult) {
            $res['data_result'] = $this->dataResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMydidcommunTaskTaskresultResponse
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
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['data_result'])) {
            $model->dataResult = $map['data_result'];
        }

        return $model;
    }
}
