<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class ExecAntcloudMarketingagentCreativeImageeditResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'messageId' => 'message_id',
        'segmentVersionId' => 'segment_version_id',
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
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentCreativeImageeditResponse
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

    // 本次子图编辑任务的独立消息 ID，用于调用子图编辑查询接口获取进度和结果。
    /**
     * @var string
     */
    public $messageId;

    // 本次编辑新建的版本 ID。任务提交成功不代表图片生成成功；查询确认成功后可作为下一轮修改来源。
    /**
     * @var string
     */
    public $segmentVersionId;

}
