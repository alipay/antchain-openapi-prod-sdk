<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListUnifiedresourceInstancefamiliesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // region id
    /**
     * @var string
     */
    public $regionId;

    // 提供商类型
    /**
     * @var string
     */
    public $providerType;
    protected $_name = [
        'authToken'    => 'auth_token',
        'regionId'     => 'region_id',
        'providerType' => 'provider_type',
    ];

    public function validate()
    {
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('providerType', $this->providerType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->providerType) {
            $res['provider_type'] = $this->providerType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListUnifiedresourceInstancefamiliesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['provider_type'])) {
            $model->providerType = $map['provider_type'];
        }

        return $model;
    }
}
