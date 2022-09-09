<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CertIssueProgressDTO extends Model
{
    // 证书实例id
    /**
     * @example b99e641b2d6d45ac90600fd958e8bc3a
     *
     * @var string
     */
    public $bizId;

    // 存证ID，如果颁发失败，此值为null
    /**
     * @example vc:mychain:xxxxxx
     *
     * @var string
     */
    public $vcId;

    // 因校验异常停止任务（不会继续校验文件内容和颁发证书） -3
    // 因校验内容不正确停止颁发任务(会校验完所有的行但不执行颁发) -2
    // 已手动取消（可重试状态下手动取消任务，取消状态下可以启动新的颁发任务） -1
    // 可重试 0
    // 执行中（初始状态） 1
    // 已成功完成 2
    /**
     * @example 2
     *
     * @var int
     */
    public $status;

    // is_error=true时的错误描述
    /**
     * @example 标题格式不正确
     *
     * @var string
     */
    public $errorMessage;

    // 证书的字段标题列表
    /**
     * @example [身份证号,姓名,证书字段1]
     *
     * @var string[]
     */
    public $titles;

    // 颁发进度百分比
    /**
     * @example 0-100
     *
     * @var int
     */
    public $progressPercent;

    // 当前批次数据总行数（不含标题）
    /**
     * @example 0-5000
     *
     * @var string
     */
    public $totalNum;

    // 颁发证书当前执行的阶段，VERIFY：校验文件中，ISSUE：颁发中
    /**
     * @example VERIFY、ISSUE
     *
     * @var string
     */
    public $curTaskType;

    // 颁发开始的时间戳
    /**
     * @example 18123123123123
     *
     * @var int
     */
    public $startTimeMillis;

    // 颁发结束的时间戳
    /**
     * @example 182371293192831
     *
     * @var int
     */
    public $endTimeMillis;

    // 校验错误描述列表
    /**
     * @example
     *
     * @var TemplateInstanceErrorDetailDTO[]
     */
    public $errorDetails;
    protected $_name = [
        'bizId'           => 'biz_id',
        'vcId'            => 'vc_id',
        'status'          => 'status',
        'errorMessage'    => 'error_message',
        'titles'          => 'titles',
        'progressPercent' => 'progress_percent',
        'totalNum'        => 'total_num',
        'curTaskType'     => 'cur_task_type',
        'startTimeMillis' => 'start_time_millis',
        'endTimeMillis'   => 'end_time_millis',
        'errorDetails'    => 'error_details',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('vcId', $this->vcId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
        Model::validateRequired('titles', $this->titles, true);
        Model::validateRequired('progressPercent', $this->progressPercent, true);
        Model::validateRequired('totalNum', $this->totalNum, true);
        Model::validateRequired('curTaskType', $this->curTaskType, true);
        Model::validateRequired('startTimeMillis', $this->startTimeMillis, true);
        Model::validateRequired('endTimeMillis', $this->endTimeMillis, true);
        Model::validateRequired('errorDetails', $this->errorDetails, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->titles) {
            $res['titles'] = $this->titles;
        }
        if (null !== $this->progressPercent) {
            $res['progress_percent'] = $this->progressPercent;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        if (null !== $this->curTaskType) {
            $res['cur_task_type'] = $this->curTaskType;
        }
        if (null !== $this->startTimeMillis) {
            $res['start_time_millis'] = $this->startTimeMillis;
        }
        if (null !== $this->endTimeMillis) {
            $res['end_time_millis'] = $this->endTimeMillis;
        }
        if (null !== $this->errorDetails) {
            $res['error_details'] = [];
            if (null !== $this->errorDetails && \is_array($this->errorDetails)) {
                $n = 0;
                foreach ($this->errorDetails as $item) {
                    $res['error_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertIssueProgressDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['titles'])) {
            if (!empty($map['titles'])) {
                $model->titles = $map['titles'];
            }
        }
        if (isset($map['progress_percent'])) {
            $model->progressPercent = $map['progress_percent'];
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }
        if (isset($map['cur_task_type'])) {
            $model->curTaskType = $map['cur_task_type'];
        }
        if (isset($map['start_time_millis'])) {
            $model->startTimeMillis = $map['start_time_millis'];
        }
        if (isset($map['end_time_millis'])) {
            $model->endTimeMillis = $map['end_time_millis'];
        }
        if (isset($map['error_details'])) {
            if (!empty($map['error_details'])) {
                $model->errorDetails = [];
                $n                   = 0;
                foreach ($map['error_details'] as $item) {
                    $model->errorDetails[$n++] = null !== $item ? TemplateInstanceErrorDetailDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
