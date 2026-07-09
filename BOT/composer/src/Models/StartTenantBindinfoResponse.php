<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class StartTenantBindinfoResponse extends Model
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

    // 实体did
    /**
     * @var string
     */
    public $did;

    // 非openapi访问模式https鉴权key_id,  暂保留
    /**
     * @var string
     */
    public $keyId;

    // 非openapi访问模式https鉴权key_secret,  暂保留
    /**
     * @var string
     */
    public $keySecret;

    // 交易唯一ID
    /**
     * @var string
     */
    public $nonce;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'did'        => 'did',
        'keyId'      => 'key_id',
        'keySecret'  => 'key_secret',
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }
        if (null !== $this->keySecret) {
            $res['key_secret'] = $this->keySecret;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartTenantBindinfoResponse
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }
        if (isset($map['key_secret'])) {
            $model->keySecret = $map['key_secret'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }

        return $model;
    }
}
