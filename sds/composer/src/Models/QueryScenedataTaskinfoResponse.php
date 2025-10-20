<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class QueryScenedataTaskinfoResponse extends Model
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

    // -1-无效，0-待处理，1-处理中，2-处理完成
    /**
     * @var string
     */
    public $taskStatus;

    // 业务日期
    /**
     * @var string
     */
    public $bizDate;

    // 场景
    /**
     * @var string
     */
    public $scene;

    // 任务类型
    /**
     * @var string
     */
    public $taskType;

    // 批次所属租户id
    /**
     * @var string
     */
    public $tenantId;

    // 来源标识
    /**
     * @var string
     */
    public $sourceMark;

    // 任务创建时间
    /**
     * @var string
     */
    public $createTime;

    // 批次统计结果信息
    /**
     * @var TaskDetailResult
     */
    public $result;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'taskStatus' => 'task_status',
        'bizDate'    => 'biz_date',
        'scene'      => 'scene',
        'taskType'   => 'task_type',
        'tenantId'   => 'tenant_id',
        'sourceMark' => 'source_mark',
        'createTime' => 'create_time',
        'result'     => 'result',
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
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->bizDate) {
            $res['biz_date'] = $this->bizDate;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->sourceMark) {
            $res['source_mark'] = $this->sourceMark;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryScenedataTaskinfoResponse
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
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }
        if (isset($map['biz_date'])) {
            $model->bizDate = $map['biz_date'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['source_mark'])) {
            $model->sourceMark = $map['source_mark'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['result'])) {
            $model->result = TaskDetailResult::fromMap($map['result']);
        }

        return $model;
    }
}
