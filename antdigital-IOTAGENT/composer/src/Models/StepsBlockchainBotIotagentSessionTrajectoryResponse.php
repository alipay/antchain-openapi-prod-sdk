<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class StepsBlockchainBotIotagentSessionTrajectoryResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'stepsJson' => 'steps_json',
        'nextCursor' => 'next_cursor',
        'totalSteps' => 'total_steps',
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
        if (null !== $this->stepsJson) {
            $res['steps_json'] = $this->stepsJson;
        }
        if (null !== $this->nextCursor) {
            $res['next_cursor'] = $this->nextCursor;
        }
        if (null !== $this->totalSteps) {
            $res['total_steps'] = $this->totalSteps;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StepsBlockchainBotIotagentSessionTrajectoryResponse
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
        if(isset($map['steps_json'])){
            $model->stepsJson = $map['steps_json'];
        }
        if(isset($map['next_cursor'])){
            $model->nextCursor = $map['next_cursor'];
        }
        if(isset($map['total_steps'])){
            $model->totalSteps = $map['total_steps'];
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

    // 执行步骤列表(JSON)
    /**
     * @var string
     */
    public $stepsJson;

    // 下一页游标
    /**
     * @var string
     */
    public $nextCursor;

    // 总步骤数
    /**
     * @var int
     */
    public $totalSteps;

}
