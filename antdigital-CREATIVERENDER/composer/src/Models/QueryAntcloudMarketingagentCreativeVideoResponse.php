<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\VideoOutput;

class QueryAntcloudMarketingagentCreativeVideoResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'taskId' => 'task_id',
        'status' => 'status',
        'outputs' => 'outputs',
        'script' => 'script',
        'credits' => 'credits',
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
        if (null !== $this->outputs) {
            $res['outputs'] = [];
            if(null !== $this->outputs && is_array($this->outputs)){
                $n = 0;
                foreach($this->outputs as $item){
                    $res['outputs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->script) {
            $res['script'] = $this->script;
        }
        if (null !== $this->credits) {
            $res['credits'] = $this->credits;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingagentCreativeVideoResponse
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
        if(isset($map['outputs'])){
            if(!empty($map['outputs'])){
                $model->outputs = [];
                $n = 0;
                foreach($map['outputs'] as $item) {
                    $model->outputs[$n++] = null !== $item ? VideoOutput::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['script'])){
            $model->script = $map['script'];
        }
        if(isset($map['credits'])){
            $model->credits = $map['credits'];
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

    // 视频任务 ID
    /**
     * @var string
     */
    public $taskId;

    // PENDING、PROCESSING、COMPLETED、FAILED
    /**
     * @var string
     */
    public $status;

    // 视频产物列表
    /**
     * @var VideoOutput[]
     */
    public $outputs;

    // 扩写后的脚本，上游提供时返回
    /**
     * @var string
     */
    public $script;

    // 视频耗费credits
    /**
     * @var string
     */
    public $credits;

    // 任务失败原因
    /**
     * @var string
     */
    public $errorMessage;

}
