<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVESERVICE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RESOLVESERVICE\Models\CallTags;
use AntChain\RESOLVESERVICE\Models\Transcript;

class CallbackLvRobotcallRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId' => 'request_id',
        'caseId' => 'case_id',
        'callStatus' => 'call_status',
        'callStartTime' => 'call_start_time',
        'callDuration' => 'call_duration',
        'callSummary' => 'call_summary',
        'callTags' => 'call_tags',
        'recordingUrl' => 'recording_url',
        'transcript' => 'transcript',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('caseId', $this->caseId, true);
        Model::validateRequired('callStatus', $this->callStatus, true);
        Model::validateRequired('callStartTime', $this->callStartTime, true);
        Model::validateRequired('callDuration', $this->callDuration, true);
        Model::validateRequired('callSummary', $this->callSummary, true);
        Model::validateRequired('callTags', $this->callTags, true);
        Model::validateRequired('recordingUrl', $this->recordingUrl, true);
        Model::validateRequired('transcript', $this->transcript, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->caseId) {
            $res['case_id'] = $this->caseId;
        }
        if (null !== $this->callStatus) {
            $res['call_status'] = $this->callStatus;
        }
        if (null !== $this->callStartTime) {
            $res['call_start_time'] = $this->callStartTime;
        }
        if (null !== $this->callDuration) {
            $res['call_duration'] = $this->callDuration;
        }
        if (null !== $this->callSummary) {
            $res['call_summary'] = $this->callSummary;
        }
        if (null !== $this->callTags) {
            $res['call_tags'] = null !== $this->callTags ? $this->callTags->toMap() : null;
        }
        if (null !== $this->recordingUrl) {
            $res['recording_url'] = $this->recordingUrl;
        }
        if (null !== $this->transcript) {
            $res['transcript'] = [];
            if(null !== $this->transcript && is_array($this->transcript)){
                $n = 0;
                foreach($this->transcript as $item){
                    $res['transcript'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackLvRobotcallRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['case_id'])){
            $model->caseId = $map['case_id'];
        }
        if(isset($map['call_status'])){
            $model->callStatus = $map['call_status'];
        }
        if(isset($map['call_start_time'])){
            $model->callStartTime = $map['call_start_time'];
        }
        if(isset($map['call_duration'])){
            $model->callDuration = $map['call_duration'];
        }
        if(isset($map['call_summary'])){
            $model->callSummary = $map['call_summary'];
        }
        if(isset($map['call_tags'])){
            $model->callTags = CallTags::fromMap($map['call_tags']);
        }
        if(isset($map['recording_url'])){
            $model->recordingUrl = $map['recording_url'];
        }
        if(isset($map['transcript'])){
            if(!empty($map['transcript'])){
                $model->transcript = [];
                $n = 0;
                foreach($map['transcript'] as $item) {
                    $model->transcript[$n++] = null !== $item ? Transcript::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 关联发起呼叫时的请求ID（唯一关联键）
    /**
     * @var string
     */
    public $requestId;

    // 案件唯一标识
    /**
     * @var string
     */
    public $caseId;

    // 通话状态。示例： connected （已接通）、no_answer （无人接听）
    /**
     * @var string
     */
    public $callStatus;

    // 外呼开始时间，ISO 8601格式
    /**
     * @var string
     */
    public $callStartTime;

    // 外呼时长，单位：秒
    /**
     * @var int
     */
    public $callDuration;

    // 通话总结
    /**
     * @var string
     */
    public $callSummary;

    // 通话标签。一通通话仅返回一组标签
    /**
     * @var CallTags
     */
    public $callTags;

    // 通话录音下载地址
    /**
     * @var string
     */
    public $recordingUrl;

    // 录音全文，按对话轮次组织
    /**
     * @var Transcript[]
     */
    public $transcript;

}
