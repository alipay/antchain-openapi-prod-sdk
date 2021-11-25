<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetAuthCertInstancedataurlResponse extends Model
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

    // oss服务地址
    /**
     * @var string
     */
    public $host;

    // 申请的证书领取人csv的名称，使用该key作为批量颁发证书的path参数
    /**
     * @var string
     */
    public $dir;

    // ak
    /**
     * @var string
     */
    public $accessId;

    // Policy规定了请求表单域的合法性
    /**
     * @var string
     */
    public $policy;

    // 签名
    /**
     * @var string
     */
    public $signature;

    // 过期时间戳
    /**
     * @var string
     */
    public $expire;

    // 加密回调信息
    /**
     * @var string
     */
    public $callback;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'host'       => 'host',
        'dir'        => 'dir',
        'accessId'   => 'access_id',
        'policy'     => 'policy',
        'signature'  => 'signature',
        'expire'     => 'expire',
        'callback'   => 'callback',
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
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->dir) {
            $res['dir'] = $this->dir;
        }
        if (null !== $this->accessId) {
            $res['access_id'] = $this->accessId;
        }
        if (null !== $this->policy) {
            $res['policy'] = $this->policy;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->callback) {
            $res['callback'] = $this->callback;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAuthCertInstancedataurlResponse
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
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }
        if (isset($map['dir'])) {
            $model->dir = $map['dir'];
        }
        if (isset($map['access_id'])) {
            $model->accessId = $map['access_id'];
        }
        if (isset($map['policy'])) {
            $model->policy = $map['policy'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['callback'])) {
            $model->callback = $map['callback'];
        }

        return $model;
    }
}
