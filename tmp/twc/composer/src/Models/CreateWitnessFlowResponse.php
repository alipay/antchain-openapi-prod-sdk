<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateWitnessFlowResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 错误码
    /**
     * @var int
     */
    public $code;

    // 流程配置
    /**
     * @var WitnessFlowConfig
     */
    public $flowConfig;

    // 流程创建响应数据
    /**
     * @var string
     */
    public $message;

    // 见证流程
    /**
     * @var string
     */
    public $witnessFlowId;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'code'          => 'code',
        'flowConfig'    => 'flow_config',
        'message'       => 'message',
        'witnessFlowId' => 'witness_flow_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->flowConfig) {
            $res['flow_config'] = null !== $this->flowConfig ? $this->flowConfig->toMap() : null;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->witnessFlowId) {
            $res['witness_flow_id'] = $this->witnessFlowId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateWitnessFlowResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['flow_config'])) {
            $model->flowConfig = WitnessFlowConfig::fromMap($map['flow_config']);
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['witness_flow_id'])) {
            $model->witnessFlowId = $map['witness_flow_id'];
        }

        return $model;
    }
}
