<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CloudStackConfig extends Model
{
    // 阿里云accessKey获取
    /**
     * @example xxx
     *
     * @var string
     */
    public $accessKey;

    // 云游加密后的accessKeySecret
    /**
     * @example xxx
     *
     * @var string
     */
    public $encryptedAccessKeySecret;

    // 底座所在的region
    /**
     * @example default
     *
     * @var string
     */
    public $region;

    // 底座可用区
    /**
     * @example default
     *
     * @var string
     */
    public $zone;

    // 底座类型
    /**
     * @example ANT_STACK
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'accessKey'                => 'access_key',
        'encryptedAccessKeySecret' => 'encrypted_access_key_secret',
        'region'                   => 'region',
        'zone'                     => 'zone',
        'type'                     => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('accessKey', $this->accessKey, true);
        Model::validateRequired('encryptedAccessKeySecret', $this->encryptedAccessKeySecret, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('zone', $this->zone, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->encryptedAccessKeySecret) {
            $res['encrypted_access_key_secret'] = $this->encryptedAccessKeySecret;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloudStackConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['encrypted_access_key_secret'])) {
            $model->encryptedAccessKeySecret = $map['encrypted_access_key_secret'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
