<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingagentCreativeImageeditResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'messageId' => 'message_id',
        'segmentVersionId' => 'segment_version_id',
        'status' => 'status',
        'resultUrl' => 'result_url',
        'failReason' => 'fail_reason',
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
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->segmentVersionId) {
            $res['segment_version_id'] = $this->segmentVersionId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->resultUrl) {
            $res['result_url'] = $this->resultUrl;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingagentCreativeImageeditResponse
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
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        if(isset($map['segment_version_id'])){
            $model->segmentVersionId = $map['segment_version_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['result_url'])){
            $model->resultUrl = $map['result_url'];
        }
        if(isset($map['fail_reason'])){
            $model->failReason = $map['fail_reason'];
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

    // 本次子图编辑任务的独立消息 ID。
    /**
     * @var string
     */
    public $messageId;

    // 本次编辑生成的新版本 ID，任务成功后可作为下一轮编辑的来源版本。
    /**
     * @var string
     */
    public $segmentVersionId;

    // 任务状态：PROCESSING（处理中）、COMPLETED（成功）、FAILED（失败）。查询接口调用成功不代表任务生成成功。
    /**
     * @var string
     */
    public $status;

    // 编辑成功后的图片地址，仅在 status 为 COMPLETED 时返回。
    /**
     * @var string
     */
    public $resultUrl;

    // 编辑失败原因，在 status 为 FAILED 时返回。
    /**
     * @var string
     */
    public $failReason;

}
