<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateThingsdidDidResponse extends Model
{
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

    // 更新的实体DID，等于输入
    /**
     * @var string
     */
    public $thingDid;

    // 异步执行标识，true代表已经完成执行，false代表异步返回，需要轮询nonce代表的交易
    /**
     * @var bool
     */
    public $executed;

    // 交易唯一ID
    /**
     * @var string
     */
    public $nonce;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'thingDid'   => 'thing_did',
        'executed'   => 'executed',
        'nonce'      => 'nonce',
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
        if (null !== $this->thingDid) {
            $res['thing_did'] = $this->thingDid;
        }
        if (null !== $this->executed) {
            $res['executed'] = $this->executed;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateThingsdidDidResponse
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
        if (isset($map['thing_did'])) {
            $model->thingDid = $map['thing_did'];
        }
        if (isset($map['executed'])) {
            $model->executed = $map['executed'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }

        return $model;
    }
}
