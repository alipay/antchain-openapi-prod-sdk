<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class PsiJob extends Model
{
    // 项目ID
    /**
     * @example "PROJ_test001"
     *
     * @var string
     */
    public $projectId;

    // 执行任务ID
    /**
     * @example "JOB_test00"
     *
     * @var string
     */
    public $jobId;

    // 发起任务的租户ID
    /**
     * @example "testTenant00"
     *
     * @var string
     */
    public $tenantId;

    // 任务提交时间（毫秒）
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 任务真正开始执行的unix 时间戳（毫秒）
    /**
     * @example
     *
     * @var int
     */
    public $gmtExecStart;

    // 任务最终执行完成时间（毫秒）
    /**
     * @example
     *
     * @var int
     */
    public $gmtExecEnd;

    // 任务名称
    /**
     * @example "测试psi任务"
     *
     * @var string
     */
    public $name;

    // 任务类型
    /**
     * @example "PSI"
     *
     * @var string
     */
    public $type;

    // 项目类型
    /**
     * @example "FATE"
     *
     * @var string
     */
    public $projectType;

    // 项目描述信息
    /**
     * @example "测试项目"
     *
     * @var string
     */
    public $description;

    // 任务执行状态，EXECUTING执行中，SUCCESS执行成功，FAILED执行失败
    /**
     * @example "EXECUTING"
     *
     * @var string
     */
    public $status;

    // 任务执行结果信息，若执行失败则返回错误日志
    /**
     * @example ""
     *
     * @var string
     */
    public $resultMsg;

    // 参与方配置参数，参考结构体定义
    /**
     * @example
     *
     * @var PsiParticipantConfig[]
     */
    public $participantList;
    protected $_name = [
        'projectId'       => 'project_id',
        'jobId'           => 'job_id',
        'tenantId'        => 'tenant_id',
        'gmtCreate'       => 'gmt_create',
        'gmtExecStart'    => 'gmt_exec_start',
        'gmtExecEnd'      => 'gmt_exec_end',
        'name'            => 'name',
        'type'            => 'type',
        'projectType'     => 'project_type',
        'description'     => 'description',
        'status'          => 'status',
        'resultMsg'       => 'result_msg',
        'participantList' => 'participant_list',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('jobId', $this->jobId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtExecStart', $this->gmtExecStart, true);
        Model::validateRequired('gmtExecEnd', $this->gmtExecEnd, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('projectType', $this->projectType, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('participantList', $this->participantList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtExecStart) {
            $res['gmt_exec_start'] = $this->gmtExecStart;
        }
        if (null !== $this->gmtExecEnd) {
            $res['gmt_exec_end'] = $this->gmtExecEnd;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->projectType) {
            $res['project_type'] = $this->projectType;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->participantList) {
            $res['participant_list'] = [];
            if (null !== $this->participantList && \is_array($this->participantList)) {
                $n = 0;
                foreach ($this->participantList as $item) {
                    $res['participant_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PsiJob
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['job_id'])) {
            $model->jobId = $map['job_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_exec_start'])) {
            $model->gmtExecStart = $map['gmt_exec_start'];
        }
        if (isset($map['gmt_exec_end'])) {
            $model->gmtExecEnd = $map['gmt_exec_end'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['project_type'])) {
            $model->projectType = $map['project_type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['participant_list'])) {
            if (!empty($map['participant_list'])) {
                $model->participantList = [];
                $n                      = 0;
                foreach ($map['participant_list'] as $item) {
                    $model->participantList[$n++] = null !== $item ? PsiParticipantConfig::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
