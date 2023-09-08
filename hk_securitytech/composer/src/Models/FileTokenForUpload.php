<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class FileTokenForUpload extends Model
{
    // ·
    /**
     * @example ·
     *
     * @var string
     */
    public $accessId;

    // dir
    /**
     * @example dir
     *
     * @var string
     */
    public $dir;

    // expire
    /**
     * @example expire
     *
     * @var string
     */
    public $expire;

    // host
    /**
     * @example host
     *
     * @var string
     */
    public $host;

    // policy
    /**
     * @example policy
     *
     * @var string
     */
    public $policy;

    // signature
    /**
     * @example signature
     *
     * @var string
     */
    public $signature;
    protected $_name = [
        'accessId'  => 'access_id',
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
     * @return FileTokenForUpload
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_id'])) {
            $model->accessId = $map['access_id'];
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
