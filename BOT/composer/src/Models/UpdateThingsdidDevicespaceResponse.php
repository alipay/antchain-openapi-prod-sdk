<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateThingsdidDevicespaceResponse extends Model
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

    // 代表本操作是否是异步调用 true: 执行完全，非异步操作
    /**
     * @var bool
     */
    public $executed;

    // 代表唯一交易ID，等于输入参数同名字段
    /**
     * @var string
     */
    public $nonce;

    // 注册成功返回的实体身份DID
    /**
     * @var string
     */
    public $thingDid;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'executed'   => 'executed',
        'nonce'      => 'nonce',
        'thingDid'   => 'thing_did',
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
        if (null !== $this->executed) {
            $res['executed'] = $this->executed;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->thingDid) {
            $res['thing_did'] = $this->thingDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateThingsdidDevicespaceResponse
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
        if (isset($map['executed'])) {
            $model->executed = $map['executed'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['thing_did'])) {
            $model->thingDid = $map['thing_did'];
        }

        return $model;
    }
}
