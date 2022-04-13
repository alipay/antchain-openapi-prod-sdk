<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsPrePostTask extends Model
{
    //
    // 任务类型。
    // 中间件任务：
    // MESSAGE_BROKER_TOPIC：消息中间件TOPIC；
    // MESSAGE_BROKER_TOPIC_SUB：消息中间件绑定关系；
    // DRM_RESOURCE：DRM资源；
    // SCHEDULER_TASK：定时任务；
    // 其他类型任务待定。
    //
    /**
     * @example
     *
     * @var string
     */
    public $type;

    //
    // 操作类型。取值列表：
    // CREATE：新建；
    // UPDATE：更新；
    // DELETE：删除；
    // UNDEFINED：未定义；
    //
    /**
     * @example
     *
     * @var string
     */
    public $operationType;

    //
    // 任务详情，JSON字符串
    //
    /**
     * @example
     *
     * @var string
     */
    public $detail;

    //
    // 任务状态。取值列表：EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败；IGNORED：已忽略
    //
    /**
     * @example
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'type'          => 'type',
        'operationType' => 'operation_type',
        'detail'        => 'detail',
        'status'        => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->detail) {
            $res['detail'] = $this->detail;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsPrePostTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['detail'])) {
            $model->detail = $map['detail'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
