<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryAiotdatalinkAskdataResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'jobId' => 'job_id',
        'requestId' => 'request_id',
        'status' => 'status',
        'data' => 'data',
        'rowNum' => 'row_num',
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
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->rowNum) {
            $res['row_num'] = $this->rowNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAiotdatalinkAskdataResponse
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
        if(isset($map['job_id'])){
            $model->jobId = $map['job_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        if(isset($map['row_num'])){
            $model->rowNum = $map['row_num'];
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

    // 任务ID
    /**
     * @var string
     */
    public $jobId;

    // 请求ID
    /**
     * @var string
     */
    public $requestId;

    // 任务状态， ACCEPTED 提交，RESOLVING_MODEL 解析寓意，INTERPRETING 生成SQL，SQL_VALIDATING sql 校验，EXECUTING 执行查询，ANALYZING 保存结果，COMPLETE 任务完成，FAILED 任务失败，CANCELLED  任务取消
    /**
     * @var string
     */
    public $status;

    // json 格式字符串
    /**
     * @var string
     */
    public $data;

    // 数据总条数
    /**
     * @var string
     */
    public $rowNum;

}
