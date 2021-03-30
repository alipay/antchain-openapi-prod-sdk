<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class MonitorTask extends Model
{
    // 内容表述
    //
    //
    /**
     * @example wert
     *
     * @var string
     */
    public $contentDesc;

    // 监测任务标题
    //
    //
    /**
     * @example awe
     *
     * @var string
     */
    public $contentTitle;

    // 监测文件时长，主要用于视频监测、音频监测的时长记录
    /**
     * @example 200
     *
     * @var int
     */
    public $fileLengthInSecond;

    // 监测关键字
    //
    //
    /**
     * @example 111111111111111111
     *
     * @var string[]
     */
    public $keywords;

    // 监测任务ID
    //
    /**
     * @example 111111111111111111
     *
     * @var string
     */
    public $monitorTaskId;

    // 任务名称
    //
    //
    /**
     * @example 111111111111111111
     *
     * @var string
     */
    public $name;

    // 监测供应商id
    /**
     * @example GOODEYE
     *
     * @var string
     */
    public $providerId;

    // 监测结果数量
    //
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $resultCount;

    // 监测范围
    //
    //
    /**
     * @example 111111111111111111
     *
     * @var string[]
     */
    public $scopes;

    // 任务状态
    //
    // INIT
    //
    // WORKING
    //
    // FINISH
    //
    // FAILURE
    //
    // DELETE
    /**
     * @example WORKING
     *
     * @var string
     */
    public $status;

    // 监测时长(天)
    //
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $taskDuration;

    // 任务结束时间
    //
    //
    /**
     * @example 1592807928
     *
     * @var int
     */
    public $taskEnd;

    // 任务开始时间
    //
    //
    /**
     * @example 1592807928
     *
     * @var int
     */
    public $taskStart;

    // 文件类别
    //
    // IMAGE
    //
    // TEXT
    //
    // VIDEO
    /**
     * @example IMAGE
     *
     * @var string
     */
    public $fileType;

    // 文件大小
    /**
     * @example 111111
     *
     * @var int
     */
    public $fileSize;

    // submitType是url就是url地址 submitType 是file就是oss fileId
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $submitContent;

    // 提交任务的类型:FILE/URL
    // 不填为FILE
    // FILE表示文件上传素材，URL表示上传URL
    /**
     * @example FILE
     *
     * @var string
     */
    public $submitType;

    // 当status为failure时的具体错误信息
    /**
     * @example error
     *
     * @var string
     */
    public $failureMsg;
    protected $_name = [
        'contentDesc'        => 'content_desc',
        'contentTitle'       => 'content_title',
        'fileLengthInSecond' => 'file_length_in_second',
        'keywords'           => 'keywords',
        'monitorTaskId'      => 'monitor_task_id',
        'name'               => 'name',
        'providerId'         => 'provider_id',
        'resultCount'        => 'result_count',
        'scopes'             => 'scopes',
        'status'             => 'status',
        'taskDuration'       => 'task_duration',
        'taskEnd'            => 'task_end',
        'taskStart'          => 'task_start',
        'fileType'           => 'file_type',
        'fileSize'           => 'file_size',
        'submitContent'      => 'submit_content',
        'submitType'         => 'submit_type',
        'failureMsg'         => 'failure_msg',
    ];

    public function validate()
    {
        Model::validateRequired('keywords', $this->keywords, true);
        Model::validateRequired('monitorTaskId', $this->monitorTaskId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('scopes', $this->scopes, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('taskDuration', $this->taskDuration, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('submitContent', $this->submitContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contentDesc) {
            $res['content_desc'] = $this->contentDesc;
        }
        if (null !== $this->contentTitle) {
            $res['content_title'] = $this->contentTitle;
        }
        if (null !== $this->fileLengthInSecond) {
            $res['file_length_in_second'] = $this->fileLengthInSecond;
        }
        if (null !== $this->keywords) {
            $res['keywords'] = $this->keywords;
        }
        if (null !== $this->monitorTaskId) {
            $res['monitor_task_id'] = $this->monitorTaskId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->resultCount) {
            $res['result_count'] = $this->resultCount;
        }
        if (null !== $this->scopes) {
            $res['scopes'] = $this->scopes;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->taskDuration) {
            $res['task_duration'] = $this->taskDuration;
        }
        if (null !== $this->taskEnd) {
            $res['task_end'] = $this->taskEnd;
        }
        if (null !== $this->taskStart) {
            $res['task_start'] = $this->taskStart;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->submitContent) {
            $res['submit_content'] = $this->submitContent;
        }
        if (null !== $this->submitType) {
            $res['submit_type'] = $this->submitType;
        }
        if (null !== $this->failureMsg) {
            $res['failure_msg'] = $this->failureMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitorTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content_desc'])) {
            $model->contentDesc = $map['content_desc'];
        }
        if (isset($map['content_title'])) {
            $model->contentTitle = $map['content_title'];
        }
        if (isset($map['file_length_in_second'])) {
            $model->fileLengthInSecond = $map['file_length_in_second'];
        }
        if (isset($map['keywords'])) {
            if (!empty($map['keywords'])) {
                $model->keywords = $map['keywords'];
            }
        }
        if (isset($map['monitor_task_id'])) {
            $model->monitorTaskId = $map['monitor_task_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['result_count'])) {
            $model->resultCount = $map['result_count'];
        }
        if (isset($map['scopes'])) {
            if (!empty($map['scopes'])) {
                $model->scopes = $map['scopes'];
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['task_duration'])) {
            $model->taskDuration = $map['task_duration'];
        }
        if (isset($map['task_end'])) {
            $model->taskEnd = $map['task_end'];
        }
        if (isset($map['task_start'])) {
            $model->taskStart = $map['task_start'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['file_size'])) {
            $model->fileSize = $map['file_size'];
        }
        if (isset($map['submit_content'])) {
            $model->submitContent = $map['submit_content'];
        }
        if (isset($map['submit_type'])) {
            $model->submitType = $map['submit_type'];
        }
        if (isset($map['failure_msg'])) {
            $model->failureMsg = $map['failure_msg'];
        }

        return $model;
    }
}
