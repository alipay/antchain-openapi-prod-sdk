<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SingleExecResult;

class GetBashcmdResultResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'errMsg' => 'err_msg',
        'finishTime' => 'finish_time',
        'results' => 'results',
        'startTime' => 'start_time',
        'status' => 'status',
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
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }
        if (null !== $this->finishTime) {
            $res['finish_time'] = $this->finishTime;
        }
        if (null !== $this->results) {
            $res['results'] = [];
            if(null !== $this->results && is_array($this->results)){
                $n = 0;
                foreach($this->results as $item){
                    $res['results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetBashcmdResultResponse
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
        if(isset($map['err_msg'])){
            $model->errMsg = $map['err_msg'];
        }
        if(isset($map['finish_time'])){
            $model->finishTime = $map['finish_time'];
        }
        if(isset($map['results'])){
            if(!empty($map['results'])){
                $model->results = [];
                $n = 0;
                foreach($map['results'] as $item) {
                    $model->results[$n++] = null !== $item ? SingleExecResult::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 错误信息。内容为指令无法下发到机器上的详细原因
    /**
     * @var string
     */
    public $errMsg;

    // 执行结束时间
    /**
     * @var string
     */
    public $finishTime;

    // 执行的结果
    /**
     * @var SingleExecResult[]
     */
    public $results;

    // 执行开始时间
    /**
     * @var string
     */
    public $startTime;

    // 执行结果状态。取值列表：EXECUTING：执行中；SUCCESS：执行成功；FAILED：执行失败；IGNORED：已忽略；TIME_OUT：已超时
    /**
     * @var string
     */
    public $status;

}
