<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class ValidateBlockchainBotIotsuccessProductMcpResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'reachable' => 'reachable',
        'authenticated' => 'authenticated',
        'protocolReady' => 'protocol_ready',
        'latencyMs' => 'latency_ms',
    ];
    public function validate() {
        Model::validateRequired('reachable', $this->reachable, true);
        Model::validateRequired('authenticated', $this->authenticated, true);
        Model::validateRequired('protocolReady', $this->protocolReady, true);
        Model::validateRequired('latencyMs', $this->latencyMs, true);
    }
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
        if (null !== $this->reachable) {
            $res['reachable'] = $this->reachable;
        }
        if (null !== $this->authenticated) {
            $res['authenticated'] = $this->authenticated;
        }
        if (null !== $this->protocolReady) {
            $res['protocol_ready'] = $this->protocolReady;
        }
        if (null !== $this->latencyMs) {
            $res['latency_ms'] = $this->latencyMs;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ValidateBlockchainBotIotsuccessProductMcpResponse
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
        if(isset($map['reachable'])){
            $model->reachable = $map['reachable'];
        }
        if(isset($map['authenticated'])){
            $model->authenticated = $map['authenticated'];
        }
        if(isset($map['protocol_ready'])){
            $model->protocolReady = $map['protocol_ready'];
        }
        if(isset($map['latency_ms'])){
            $model->latencyMs = $map['latency_ms'];
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

    /**
     * @var bool
     */
    public $reachable;

    // 应用层鉴权结果；无可判定认证机制时为null，WebSocket握手不等于鉴权成功
    /**
     * @var bool
     */
    public $authenticated;

    // 完成initialize及initialized通知和tools/list；仅握手成功不得为true
    /**
     * @var bool
     */
    public $protocolReady;

    /**
     * @var int
     */
    public $latencyMs;

}
