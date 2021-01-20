<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\TaskResult;

class GetTaskResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'creationTime' => 'creation_time',
        'executionResults' => 'execution_results',
        'id' => 'id',
        'reqBizId' => 'req_biz_id',
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
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->executionResults) {
            $res['execution_results'] = [];
            if(null !== $this->executionResults && is_array($this->executionResults)){
                $n = 0;
                foreach($this->executionResults as $item){
                    $res['execution_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->reqBizId) {
            $res['req_biz_id'] = $this->reqBizId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetTaskResponse
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
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['execution_results'])){
            if(!empty($map['execution_results'])){
                $model->executionResults = [];
                $n = 0;
                foreach($map['execution_results'] as $item) {
                    $model->executionResults[$n++] = null !== $item ? TaskResult::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['req_biz_id'])){
            $model->reqBizId = $map['req_biz_id'];
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

    // 
    // 异步请求创建的时间和日期。采用UTC时间，按照[ISO8601](https://zh.wikipedia.org/wiki/ISO_8601)标准表示，格式为：`YYYY-MM-DDThh:mm:ssZ`
    // 
    /**
     * @var string
     */
    public $creationTime;

    // 异步请求中任务的执行结果，key为任务操作对象id比如某个资源的id，value为操作结果
    /**
     * @var TaskResult[]
     */
    public $executionResults;

    // 异步请求唯一标识
    /**
     * @var string
     */
    public $id;

    // 异步请求业务号
    /**
     * @var string
     */
    public $reqBizId;

    // 异步请求状态，取值：
    // INIT：初始化中；
    // READY：待执行；
    // PROCESSING：执行中；
    // COMPLETED：执行完成
    // 
    /**
     * @var string
     */
    public $status;

}
