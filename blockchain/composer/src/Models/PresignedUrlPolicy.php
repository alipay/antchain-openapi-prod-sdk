<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PresignedUrlPolicy extends Model
{
    // oss访问的临时access id
    /**
     * @example LTAIR4HVnajwxdUK
     *
     * @var string
     */
    public $accessId;

    // 一个需要回调通知服务端的方法名，非必填
    /**
     * @example callBackFunction
     *
     * @var string
     */
    public $callback;

    // oss上的文件存放路径
    /**
     * @example contract/abi/lP9v5bJsvY1566977941329
     *
     * @var string
     */
    public $dir;

    // url超期的时间戳说明
    /**
     * @example 1566977971
     *
     * @var string
     */
    public $expire;

    // oss的地址
    /**
     * @example https://baas-XXX.oss-cn-shanghai.aliyuncs.com
     *
     * @var string
     */
    public $host;

    // 被base64编码的policy内容
    /**
     * @example eyJleHBpcmF0aW9uIjoiMjAxOS0wOC0yOFQwNzozOTozMS4zMjlaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiY29udHJhY3QvYWJpL2xQOXY1YkpzdlkxNTY2OTc3OTQxMzI5Il1dfQ==
     *
     * @var string
     */
    public $policy;

    // 签名结果
    /**
     * @example sQEa/Q8F/e5jqDWPvTVYtZ5Ysbw=
     *
     * @var string
     */
    public $signature;
    protected $_name = [
        'accessId'  => 'access_id',
        'callback'  => 'callback',
        'dir'       => 'dir',
        'expire'    => 'expire',
        'host'      => 'host',
        'policy'    => 'policy',
        'signature' => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('accessId', $this->accessId, true);
        Model::validateRequired('dir', $this->dir, true);
        Model::validateRequired('expire', $this->expire, true);
        Model::validateRequired('host', $this->host, true);
        Model::validateRequired('policy', $this->policy, true);
        Model::validateRequired('signature', $this->signature, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessId) {
            $res['access_id'] = $this->accessId;
        }
        if (null !== $this->callback) {
            $res['callback'] = $this->callback;
        }
        if (null !== $this->dir) {
            $res['dir'] = $this->dir;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PresignedUrlPolicy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_id'])) {
            $model->accessId = $map['access_id'];
        }
        if (isset($map['callback'])) {
            $model->callback = $map['callback'];
        }
        if (isset($map['dir'])) {
            $model->dir = $map['dir'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
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

        return $model;
    }
}
