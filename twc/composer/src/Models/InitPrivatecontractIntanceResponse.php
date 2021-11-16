<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class InitPrivatecontractIntanceResponse extends Model
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

    // 私有化服务实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 签名私钥的base64格式字符串
    /**
     * @var string
     */
    public $privateKey;

    // 验签公钥的base64格式字符串
    /**
     * @var string
     */
    public $publicKey;

    // 回调使用的签名私钥
    /**
     * @var string
     */
    public $privateKeyCallback;

    // 回调使用的验签公钥
    /**
     * @var string
     */
    public $publicKeyCallback;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'instanceId'         => 'instance_id',
        'privateKey'         => 'private_key',
        'publicKey'          => 'public_key',
        'privateKeyCallback' => 'private_key_callback',
        'publicKeyCallback'  => 'public_key_callback',
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->privateKey) {
            $res['private_key'] = $this->privateKey;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->privateKeyCallback) {
            $res['private_key_callback'] = $this->privateKeyCallback;
        }
        if (null !== $this->publicKeyCallback) {
            $res['public_key_callback'] = $this->publicKeyCallback;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitPrivatecontractIntanceResponse
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['private_key'])) {
            $model->privateKey = $map['private_key'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['private_key_callback'])) {
            $model->privateKeyCallback = $map['private_key_callback'];
        }
        if (isset($map['public_key_callback'])) {
            $model->publicKeyCallback = $map['public_key_callback'];
        }

        return $model;
    }
}
