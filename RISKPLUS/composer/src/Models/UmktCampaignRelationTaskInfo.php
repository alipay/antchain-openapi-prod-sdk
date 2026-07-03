<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UmktCampaignRelationTaskInfo extends Model
{
    // 关联资源id
    /**
     * @example bizCode1
     *
     * @var string
     */
    public $resourceId;

    // 任务状态
    // WFE-待执行
    // D - 已完成
    // ECN - 执行中
    // C - 取消
    // F - 执行失败
    /**
     * @example D
     *
     * @var string
     */
    public $taskStatus;

    // 错误信息
    /**
     * @example odps2oss执行失败
     *
     * @var string
     */
    public $errMsg;
    protected $_name = [
        'resourceId' => 'resource_id',
        'taskStatus' => 'task_status',
        'errMsg'     => 'err_msg',
    ];

    public function validate()
    {
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('taskStatus', $this->taskStatus, true);
        Model::validateRequired('errMsg', $this->errMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UmktCampaignRelationTaskInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }
        if (isset($map['err_msg'])) {
            $model->errMsg = $map['err_msg'];
        }

        return $model;
    }
}
