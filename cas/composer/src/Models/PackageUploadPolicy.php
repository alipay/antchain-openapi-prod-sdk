<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class PackageUploadPolicy extends Model
{
    // accessKey
    /**
     * @example accessKey
     *
     * @var string
     */
    public $accessKey;

    // 策略
    /**
     * @example policy
     *
     * @var string
     */
    public $policy;

    // 签名
    /**
     * @example signature
     *
     * @var string
     */
    public $signature;

    // 路径前缀
    /**
     * @example pathPrefix
     *
     * @var string
     */
    public $pathPrefix;

    // endpoint
    /**
     * @example endpoint
     *
     * @var string
     */
    public $endpoint;

    // expire
    /**
     * @example expire
     *
     * @var string
     */
    public $expire;

    // bucket
    /**
     * @example bucket
     *
     * @var string
     */
    public $bucket;
    protected $_name = [
        'accessKey'  => 'access_key',
        'policy'     => 'policy',
        'signature'  => 'signature',
        'pathPrefix' => 'path_prefix',
        'endpoint'   => 'endpoint',
        'expire'     => 'expire',
        'bucket'     => 'bucket',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->policy) {
            $res['policy'] = $this->policy;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->pathPrefix) {
            $res['path_prefix'] = $this->pathPrefix;
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->bucket) {
            $res['bucket'] = $this->bucket;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PackageUploadPolicy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['policy'])) {
            $model->policy = $map['policy'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['path_prefix'])) {
            $model->pathPrefix = $map['path_prefix'];
        }
        if (isset($map['endpoint'])) {
            $model->endpoint = $map['endpoint'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['bucket'])) {
            $model->bucket = $map['bucket'];
        }

        return $model;
    }
}
