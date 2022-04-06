<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryProviderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // LB，COMPUTE，VPC,OBJECT_STORAGE等
    /**
     * @var string
     */
    public $resourceType;

    // paas_region_id
    /**
     * @var string
     */
    public $paasRegionId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'resourceType' => 'resource_type',
        'paasRegionId' => 'paas_region_id',
    ];

    public function validate()
    {
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('paasRegionId', $this->paasRegionId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->paasRegionId) {
            $res['paas_region_id'] = $this->paasRegionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProviderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['paas_region_id'])) {
            $model->paasRegionId = $map['paas_region_id'];
        }

        return $model;
    }
}
