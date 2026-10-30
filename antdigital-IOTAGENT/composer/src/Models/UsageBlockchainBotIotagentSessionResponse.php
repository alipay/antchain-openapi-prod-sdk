<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\SessionUsage;
use AntChain\IOTAGENT\Models\TurnModelCallsUsages;
use AntChain\IOTAGENT\Models\ContextOccupancy;

class UsageBlockchainBotIotagentSessionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'sessionUsage' => 'session_usage',
        'total' => 'total',
        'turns' => 'turns',
        'context' => 'context',
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
        if (null !== $this->sessionUsage) {
            $res['session_usage'] = null !== $this->sessionUsage ? $this->sessionUsage->toMap() : null;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->turns) {
            $res['turns'] = [];
            if(null !== $this->turns && is_array($this->turns)){
                $n = 0;
                foreach($this->turns as $item){
                    $res['turns'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->context) {
            $res['context'] = null !== $this->context ? $this->context->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UsageBlockchainBotIotagentSessionResponse
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
        if(isset($map['session_usage'])){
            $model->sessionUsage = SessionUsage::fromMap($map['session_usage']);
        }
        if(isset($map['total'])){
            $model->total = $map['total'];
        }
        if(isset($map['turns'])){
            if(!empty($map['turns'])){
                $model->turns = [];
                $n = 0;
                foreach($map['turns'] as $item) {
                    $model->turns[$n++] = null !== $item ? TurnModelCallsUsages::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['context'])){
            $model->context = ContextOccupancy::fromMap($map['context']);
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

    // 会话总量（全量聚合，不随分页变化）
    /**
     * @var SessionUsage
     */
    public $sessionUsage;

    // 总轮次数
    /**
     * @var int
     */
    public $total;

    // 本页轮次明细
    /**
     * @var TurnModelCallsUsages[]
     */
    public $turns;

    // 上下文占用分析（基于最后一次模型调用估算）
    /**
     * @var ContextOccupancy
     */
    public $context;

}
