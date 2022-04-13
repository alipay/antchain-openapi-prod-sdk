<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetDeploymentRollbackResponse extends Model
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

    //
    // 应用当前部署状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败
    //
    /**
     * @var string
     */
    public $status;

    // 应用回滚版本
    /**
     * @var string
     */
    public $version;

    // 此应用下所有计算容器分组部署状态详情
    /**
     * @var OpsGroup[]
     */
    public $groups;

    // 应用前置任务
    /**
     * @var OpsPrePostTask[]
     */
    public $preTasks;

    // 应用后置任务
    /**
     * @var OpsPrePostTask[]
     */
    public $postTasks;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'status'     => 'status',
        'version'    => 'version',
        'groups'     => 'groups',
        'preTasks'   => 'pre_tasks',
        'postTasks'  => 'post_tasks',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('groups', $this->groups, true);
        Model::validateRequired('preTasks', $this->preTasks, true);
        Model::validateRequired('postTasks', $this->postTasks, true);
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->groups) {
            $res['groups'] = [];
            if (null !== $this->groups && \is_array($this->groups)) {
                $n = 0;
                foreach ($this->groups as $item) {
                    $res['groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->preTasks) {
            $res['pre_tasks'] = [];
            if (null !== $this->preTasks && \is_array($this->preTasks)) {
                $n = 0;
                foreach ($this->preTasks as $item) {
                    $res['pre_tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->postTasks) {
            $res['post_tasks'] = [];
            if (null !== $this->postTasks && \is_array($this->postTasks)) {
                $n = 0;
                foreach ($this->postTasks as $item) {
                    $res['post_tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDeploymentRollbackResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['groups'])) {
            if (!empty($map['groups'])) {
                $model->groups = [];
                $n             = 0;
                foreach ($map['groups'] as $item) {
                    $model->groups[$n++] = null !== $item ? OpsGroup::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pre_tasks'])) {
            if (!empty($map['pre_tasks'])) {
                $model->preTasks = [];
                $n               = 0;
                foreach ($map['pre_tasks'] as $item) {
                    $model->preTasks[$n++] = null !== $item ? OpsPrePostTask::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['post_tasks'])) {
            if (!empty($map['post_tasks'])) {
                $model->postTasks = [];
                $n                = 0;
                foreach ($map['post_tasks'] as $item) {
                    $model->postTasks[$n++] = null !== $item ? OpsPrePostTask::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
