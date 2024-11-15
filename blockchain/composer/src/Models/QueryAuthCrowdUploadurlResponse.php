<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthCrowdUploadurlResponse extends Model
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

    // 上传地址
    /**
     * @var string
     */
    public $uploadUrl;

    // policy
    /**
     * @var string
     */
    public $policy;

    // 签名
    /**
     * @var string
     */
    public $signature;

    // 文件目录
    /**
     * @var string
     */
    public $dir;

    // oss地址
    /**
     * @var string
     */
    public $host;

    // 过期时间
    /**
     * @var string
     */
    public $expire;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'uploadUrl'  => 'upload_url',
        'policy'     => 'policy',
        'signature'  => 'signature',
        'dir'        => 'dir',
        'host'       => 'host',
        'expire'     => 'expire',
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
        if (null !== $this->uploadUrl) {
            $res['upload_url'] = $this->uploadUrl;
        }
        if (null !== $this->policy) {
            $res['policy'] = $this->policy;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->dir) {
            $res['dir'] = $this->dir;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthCrowdUploadurlResponse
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
        if (isset($map['upload_url'])) {
            $model->uploadUrl = $map['upload_url'];
        }
        if (isset($map['policy'])) {
            $model->policy = $map['policy'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['dir'])) {
            $model->dir = $map['dir'];
        }
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }

        return $model;
    }
}
