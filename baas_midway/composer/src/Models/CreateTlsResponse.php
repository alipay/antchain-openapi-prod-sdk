<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAAS_MIDWAY\Models;

use AlibabaCloud\Tea\Model;

class CreateTlsResponse extends Model
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

    // 客户端TLS证书
    /**
     * @var string
     */
    public $clientCert;

    // 客户端TLS密钥
    /**
     * @var string
     */
    public $clientKey;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'clientCert' => 'client_cert',
        'clientKey'  => 'client_key',
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
        if (null !== $this->clientCert) {
            $res['client_cert'] = $this->clientCert;
        }
        if (null !== $this->clientKey) {
            $res['client_key'] = $this->clientKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTlsResponse
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
        if (isset($map['client_cert'])) {
            $model->clientCert = $map['client_cert'];
        }
        if (isset($map['client_key'])) {
            $model->clientKey = $map['client_key'];
        }

        return $model;
    }
}
