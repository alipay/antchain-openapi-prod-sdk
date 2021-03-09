<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryComputerCommonimageRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // providerIds
    /**
     * @var string[]
     */
    public $providerIds;

    // regionIds
    /**
     * @var string[]
     */
    public $regionIds;
    protected $_name = [
        'authToken'   => 'auth_token',
        'providerIds' => 'provider_ids',
        'regionIds'   => 'region_ids',
    ];

    public function validate()
    {
        Model::validateRequired('providerIds', $this->providerIds, true);
        Model::validateRequired('regionIds', $this->regionIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->providerIds) {
            $res['provider_ids'] = $this->providerIds;
        }
        if (null !== $this->regionIds) {
            $res['region_ids'] = $this->regionIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryComputerCommonimageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['provider_ids'])) {
            if (!empty($map['provider_ids'])) {
                $model->providerIds = $map['provider_ids'];
            }
        }
        if (isset($map['region_ids'])) {
            if (!empty($map['region_ids'])) {
                $model->regionIds = $map['region_ids'];
            }
        }

        return $model;
    }
}
