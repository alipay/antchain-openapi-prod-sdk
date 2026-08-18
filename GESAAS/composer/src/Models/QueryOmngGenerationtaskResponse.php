<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\GESAAS\Models\TaskResultInfoDto;

class QueryOmngGenerationtaskResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'result' => 'result',
        'failMsg' => 'fail_msg',
        'taskResultInfoDto' => 'task_result_info_dto',
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
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->failMsg) {
            $res['fail_msg'] = $this->failMsg;
        }
        if (null !== $this->taskResultInfoDto) {
            $res['task_result_info_dto'] = null !== $this->taskResultInfoDto ? $this->taskResultInfoDto->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOmngGenerationtaskResponse
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
        if(isset($map['result'])){
            $model->result = $map['result'];
        }
        if(isset($map['fail_msg'])){
            $model->failMsg = $map['fail_msg'];
        }
        if(isset($map['task_result_info_dto'])){
            $model->taskResultInfoDto = TaskResultInfoDto::fromMap($map['task_result_info_dto']);
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

    // 查询结果
    // 成功：success
    // 失败：fail
    /**
     * @var string
     */
    public $result;

    // 查询失败原因
    /**
     * @var string
     */
    public $failMsg;

    // 视频场景任务结果信息
    /**
     * @var TaskResultInfoDto
     */
    public $taskResultInfoDto;

}
