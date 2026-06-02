<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIGC\Models;

use AlibabaCloud\Tea\Model;

class SubTasks extends Model
{
    // 子任务ID
    /**
     * @example 子任务ID
     *
     * @var int
     */
    public $subTaskId;

    // 子任务名称
    /**
     * @example 子任务名称
     *
     * @var string
     */
    public $subTaskName;

    // 目标翻译语言
    /**
     * @example 目标翻译语言
     *
     * @var string
     */
    public $targetLanguage;

    // 子任务状态包括：PENDING（待执行）、EXECUTING（执行中）、FAILED（失败）、COMPLETED（已完成）
    /**
     * @example 子任务状态
     *
     * @var string
     */
    public $status;

    // 源语言
    /**
     * @example 源语言
     *
     * @var string
     */
    public $sourceLanguage;

    // 翻译后视频地址
    /**
     * @example 翻译后视频地址
     *
     * @var string
     */
    public $outputVideoUrl;

    // 翻译前字幕文件地址
    /**
     * @example 翻译前字幕文件地址
     *
     * @var string
     */
    public $originalSubtitleUrl;

    // 翻译后字幕文件地址
    /**
     * @example 翻译后字幕文件地址
     *
     * @var string
     */
    public $translatedSubtitleUrl;

    // 视频时长（秒）
    /**
     * @example 视频时长（秒）
     *
     * @var int
     */
    public $durationSeconds;

    // 错误信息
    /**
     * @example 错误信息
     *
     * @var string
     */
    public $errorMessage;
    protected $_name = [
        'subTaskId'             => 'sub_task_id',
        'subTaskName'           => 'sub_task_name',
        'targetLanguage'        => 'target_language',
        'status'                => 'status',
        'sourceLanguage'        => 'source_language',
        'outputVideoUrl'        => 'output_video_url',
        'originalSubtitleUrl'   => 'original_subtitle_url',
        'translatedSubtitleUrl' => 'translated_subtitle_url',
        'durationSeconds'       => 'duration_seconds',
        'errorMessage'          => 'error_message',
    ];

    public function validate()
    {
        Model::validateRequired('subTaskId', $this->subTaskId, true);
        Model::validateRequired('subTaskName', $this->subTaskName, true);
        Model::validateRequired('targetLanguage', $this->targetLanguage, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('sourceLanguage', $this->sourceLanguage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subTaskId) {
            $res['sub_task_id'] = $this->subTaskId;
        }
        if (null !== $this->subTaskName) {
            $res['sub_task_name'] = $this->subTaskName;
        }
        if (null !== $this->targetLanguage) {
            $res['target_language'] = $this->targetLanguage;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->sourceLanguage) {
            $res['source_language'] = $this->sourceLanguage;
        }
        if (null !== $this->outputVideoUrl) {
            $res['output_video_url'] = $this->outputVideoUrl;
        }
        if (null !== $this->originalSubtitleUrl) {
            $res['original_subtitle_url'] = $this->originalSubtitleUrl;
        }
        if (null !== $this->translatedSubtitleUrl) {
            $res['translated_subtitle_url'] = $this->translatedSubtitleUrl;
        }
        if (null !== $this->durationSeconds) {
            $res['duration_seconds'] = $this->durationSeconds;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubTasks
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_task_id'])) {
            $model->subTaskId = $map['sub_task_id'];
        }
        if (isset($map['sub_task_name'])) {
            $model->subTaskName = $map['sub_task_name'];
        }
        if (isset($map['target_language'])) {
            $model->targetLanguage = $map['target_language'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['source_language'])) {
            $model->sourceLanguage = $map['source_language'];
        }
        if (isset($map['output_video_url'])) {
            $model->outputVideoUrl = $map['output_video_url'];
        }
        if (isset($map['original_subtitle_url'])) {
            $model->originalSubtitleUrl = $map['original_subtitle_url'];
        }
        if (isset($map['translated_subtitle_url'])) {
            $model->translatedSubtitleUrl = $map['translated_subtitle_url'];
        }
        if (isset($map['duration_seconds'])) {
            $model->durationSeconds = $map['duration_seconds'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }

        return $model;
    }
}
