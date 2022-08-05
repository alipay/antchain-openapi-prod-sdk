<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class CreateResourcePolicyResponse extends Model
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

    // 最终上传至服务端的实际文件名称
    /**
     * @var string
     */
    public $name;

    // 用户请求的AccessKey ID
    /**
     * @var string
     */
    public $accessid;

    // 用户发送上传请求的域名。
    /**
     * @var string
     */
    public $host;

    // 用户表单上传的策略（Policy），Policy为经过Ba...
    /**
     * @var string
     */
    public $policy;

    // 对Policy签名后的字符串
    /**
     * @var string
     */
    public $signature;

    // 由服务器端指定的Policy过期时间，格式为Unix时间戳
    /**
     * @var string
     */
    public $expire;

    // 文件类型
    /**
     * @var string
     */
    public $mimeType;

    //
    // 限制上传的文件名称
    /**
     * @var string
     */
    public $dir;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'name'       => 'name',
        'accessid'   => 'accessid',
        'host'       => 'host',
        'policy'     => 'policy',
        'signature'  => 'signature',
        'expire'     => 'expire',
        'mimeType'   => 'mime_type',
        'dir'        => 'dir',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->accessid) {
            $res['accessid'] = $this->accessid;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
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
        if (null !== $this->mimeType) {
            $res['mime_type'] = $this->mimeType;
        }
        if (null !== $this->dir) {
            $res['dir'] = $this->dir;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateResourcePolicyResponse
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['accessid'])) {
            $model->accessid = $map['accessid'];
        }
        if (isset($map['host'])) {
            $model->host = $map['host'];
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
        if (isset($map['mime_type'])) {
            $model->mimeType = $map['mime_type'];
        }
        if (isset($map['dir'])) {
            $model->dir = $map['dir'];
        }

        return $model;
    }
}
