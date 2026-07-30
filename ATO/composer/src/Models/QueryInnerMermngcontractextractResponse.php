<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerMermngcontractextractResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'taskCode' => 'task_code',
        'taskInstantId' => 'task_instant_id',
        'bizId' => 'biz_id',
        'status' => 'status',
        'extractResult' => 'extract_result',
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
        if (null !== $this->taskCode) {
            $res['task_code'] = $this->taskCode;
        }
        if (null !== $this->taskInstantId) {
            $res['task_instant_id'] = $this->taskInstantId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->extractResult) {
            $res['extract_result'] = $this->extractResult;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerMermngcontractextractResponse
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
        if(isset($map['task_code'])){
            $model->taskCode = $map['task_code'];
        }
        if(isset($map['task_instant_id'])){
            $model->taskInstantId = $map['task_instant_id'];
        }
        if(isset($map['biz_id'])){
            $model->bizId = $map['biz_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['extract_result'])){
            $model->extractResult = $map['extract_result'];
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

    // 任务code
    /**
     * @var string
     */
    public $taskCode;

    // 任务id
    /**
     * @var string
     */
    public $taskInstantId;

    // 业务id
    /**
     * @var string
     */
    public $bizId;

    // 任务实例状态 PROCESSING/SUCCESS/FAILED
    /**
     * @var string
     */
    public $status;

    // 提取结果
    /**
     * @var string
     */
    public $extractResult;

}
