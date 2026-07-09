<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OnlinePressureTestTask extends Model
{
    // DATE
    /**
     * @example
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 产线场景码
    //
    /**
     * @example MAYI-0001
     *
     * @var string
     */
    public $scene;

    // 压测的目标设备可信信根设备的唯一标识，JSONArray字符串
    //
    /**
     * @example [ {"componentId": "864964060327592"} {"componentId": "864964060327592"} ]
     *
     * @var string
     */
    public $componentIdList;

    // 客户侧的压测报告
    //
    /**
     * @example [ { "name":"流量消耗", "consumption":"100KB", "asExpected":true }, { "name":"功耗", "consumption":"25mA", "asExpected":true }, { "name":"OTA升级" "asExpected":true } ] }
     *
     * @var string
     */
    public $customerPtReport;

    // 压测开始时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $ptStartTime;

    // 压测结束时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $ptEndTime;

    // RUNNING: 正在执行 SUCCESS : 测试通过 FAILED : 测试不通过
    //
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $ptStatus;

    // 关联SIT环境的工单ID
    //
    /**
     * @example 1122
     *
     * @var string
     */
    public $workOrderId;

    // 关联SIT环境的项目ID
    //
    /**
     * @example 11223344
     *
     * @var string
     */
    public $projectId;

    // 产线压测任务ID
    /**
     * @example 11223344566
     *
     * @var string
     */
    public $ptTaskId;

    // 压测不通过的原因
    /**
     * @example 数据验签失败
     *
     * @var string
     */
    public $failureReason;

    // 拓展信息
    /**
     * @example {...}
     *
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'scene'            => 'scene',
        'componentIdList'  => 'component_id_list',
        'customerPtReport' => 'customer_pt_report',
        'ptStartTime'      => 'pt_start_time',
        'ptEndTime'        => 'pt_end_time',
        'ptStatus'         => 'pt_status',
        'workOrderId'      => 'work_order_id',
        'projectId'        => 'project_id',
        'ptTaskId'         => 'pt_task_id',
        'failureReason'    => 'failure_reason',
        'extraInfo'        => 'extra_info',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('ptStartTime', $this->ptStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('ptEndTime', $this->ptEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('componentIdList', $this->componentIdList, true);
        Model::validateRequired('ptStartTime', $this->ptStartTime, true);
        Model::validateRequired('ptEndTime', $this->ptEndTime, true);
        Model::validateRequired('ptStatus', $this->ptStatus, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('ptTaskId', $this->ptTaskId, true);
        Model::validateRequired('failureReason', $this->failureReason, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->componentIdList) {
            $res['component_id_list'] = $this->componentIdList;
        }
        if (null !== $this->customerPtReport) {
            $res['customer_pt_report'] = $this->customerPtReport;
        }
        if (null !== $this->ptStartTime) {
            $res['pt_start_time'] = $this->ptStartTime;
        }
        if (null !== $this->ptEndTime) {
            $res['pt_end_time'] = $this->ptEndTime;
        }
        if (null !== $this->ptStatus) {
            $res['pt_status'] = $this->ptStatus;
        }
        if (null !== $this->workOrderId) {
            $res['work_order_id'] = $this->workOrderId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->ptTaskId) {
            $res['pt_task_id'] = $this->ptTaskId;
        }
        if (null !== $this->failureReason) {
            $res['failure_reason'] = $this->failureReason;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OnlinePressureTestTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['component_id_list'])) {
            $model->componentIdList = $map['component_id_list'];
        }
        if (isset($map['customer_pt_report'])) {
            $model->customerPtReport = $map['customer_pt_report'];
        }
        if (isset($map['pt_start_time'])) {
            $model->ptStartTime = $map['pt_start_time'];
        }
        if (isset($map['pt_end_time'])) {
            $model->ptEndTime = $map['pt_end_time'];
        }
        if (isset($map['pt_status'])) {
            $model->ptStatus = $map['pt_status'];
        }
        if (isset($map['work_order_id'])) {
            $model->workOrderId = $map['work_order_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['pt_task_id'])) {
            $model->ptTaskId = $map['pt_task_id'];
        }
        if (isset($map['failure_reason'])) {
            $model->failureReason = $map['failure_reason'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
