<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryComputerSpecRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // prviderIds
    /**
     * @var string[]
     */
    public $providerIds;

    // zoneIds
    /**
     * @var string[]
     */
    public $zoneIds;

    // workspace name
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'   => 'auth_token',
        'providerIds' => 'provider_ids',
        'zoneIds'     => 'zone_ids',
        'workspace'   => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('providerIds', $this->providerIds, true);
        Model::validateRequired('zoneIds', $this->zoneIds, true);
        Model::validateRequired('workspace', $this->workspace, true);
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
        if (null !== $this->zoneIds) {
            $res['zone_ids'] = $this->zoneIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryComputerSpecRequest
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
        if (isset($map['zone_ids'])) {
            if (!empty($map['zone_ids'])) {
                $model->zoneIds = $map['zone_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
