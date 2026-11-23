<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingagentCreativeStoryboardResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'taskId' => 'task_id',
        'status' => 'status',
        'episodeId' => 'episode_id',
        'analysisDetail' => 'analysis_detail',
        'originalStoryboards' => 'original_storyboards',
        'newStoryboardScript' => 'new_storyboard_script',
        'currentCredit' => 'current_credit',
        'creditStatus' => 'credit_status',
        'taskDurationSeconds' => 'task_duration_seconds',
        'errorMessage' => 'error_message',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->episodeId) {
            $res['episode_id'] = $this->episodeId;
        }
        if (null !== $this->analysisDetail) {
            $res['analysis_detail'] = $this->analysisDetail;
        }
        if (null !== $this->originalStoryboards) {
            $res['original_storyboards'] = $this->originalStoryboards;
        }
        if (null !== $this->newStoryboardScript) {
            $res['new_storyboard_script'] = $this->newStoryboardScript;
        }
        if (null !== $this->currentCredit) {
            $res['current_credit'] = $this->currentCredit;
        }
        if (null !== $this->creditStatus) {
            $res['credit_status'] = $this->creditStatus;
        }
        if (null !== $this->taskDurationSeconds) {
            $res['task_duration_seconds'] = $this->taskDurationSeconds;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingagentCreativeStoryboardResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['episode_id'])){
            $model->episodeId = $map['episode_id'];
        }
        if(isset($map['analysis_detail'])){
            $model->analysisDetail = $map['analysis_detail'];
        }
        if(isset($map['original_storyboards'])){
            $model->originalStoryboards = $map['original_storyboards'];
        }
        if(isset($map['new_storyboard_script'])){
            $model->newStoryboardScript = $map['new_storyboard_script'];
        }
        if(isset($map['current_credit'])){
            $model->currentCredit = $map['current_credit'];
        }
        if(isset($map['credit_status'])){
            $model->creditStatus = $map['credit_status'];
        }
        if(isset($map['task_duration_seconds'])){
            $model->taskDurationSeconds = $map['task_duration_seconds'];
        }
        if(isset($map['error_message'])){
            $model->errorMessage = $map['error_message'];
        }
        return $model;
    }
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

    // 任务id回显
    /**
     * @var string
     */
    public $taskId;

    // PROCESSING/COMPLETED/FAILED
    /**
     * @var string
     */
    public $status;

    // 剧集id
    /**
     * @var string
     */
    public $episodeId;

    // 拆解详情
    /**
     * @var string
     */
    public $analysisDetail;

    // 原片分镜
    /**
     * @var string
     */
    public $originalStoryboards;

    // 新分镜脚本
    /**
     * @var string
     */
    public $newStoryboardScript;

    // 本阶段费用
    /**
     * @var int
     */
    public $currentCredit;

    // COMPLETE / PENDING / MISSING_USAGE / INVALID_USAGE / NOT_BILLABLE
    /**
     * @var string
     */
    public $creditStatus;

    // 终态任务耗时（秒）
    /**
     * @var int
     */
    public $taskDurationSeconds;

    // FAILED 时返回的失败原因（脱敏文案）
    /**
     * @var string
     */
    public $errorMessage;

}
