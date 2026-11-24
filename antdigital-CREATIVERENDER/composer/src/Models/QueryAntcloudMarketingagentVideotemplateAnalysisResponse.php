<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingagentVideotemplateAnalysisResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'taskId' => 'task_id',
        'status' => 'status',
        'analysisDetail' => 'analysis_detail',
        'originalStoryboards' => 'original_storyboards',
        'newStoryboardScript' => 'new_storyboard_script',
        'currentCredit' => 'current_credit',
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
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingagentVideotemplateAnalysisResponse
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

    // PENDING / PROCESSING / COMPLETED / FAILED
    /**
     * @var string
     */
    public $status;

    // 开场钩子/整体风格/整体节奏/BGM卡点/情绪曲线/字幕节奏/CTA/卡点时间轴(秒)/口播旁白，换行拼接；空项显示 -
    /**
     * @var string
     */
    public $analysisDetail;

    // 原片逐镜拆解
    /**
     * @var string
     */
    public $originalStoryboards;

    // 新分镜脚本
    /**
     * @var string
     */
    public $newStoryboardScript;

    // 本次费用
    /**
     * @var int
     */
    public $currentCredit;

    // FAILED 时返回的脱敏失败文案
    /**
     * @var string
     */
    public $errorMessage;

}
