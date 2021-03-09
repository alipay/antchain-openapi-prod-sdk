<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class GetRegionAliasbyidRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // providerId
    /**
     * @var string
     */
    public $providerId;

    // iaasConnType
    /**
     * @var string
     */
    public $iaasConnType;
    protected $_name = [
        'authToken'    => 'auth_token',
        'regionId'     => 'region_id',
        'providerId'   => 'provider_id',
        'iaasConnType' => 'iaas_conn_type',
    ];

    public function validate()
    {
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('iaasConnType', $this->iaasConnType, true);
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
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->iaasConnType) {
            $res['iaas_conn_type'] = $this->iaasConnType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRegionAliasbyidRequest
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
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['iaas_conn_type'])) {
            $model->iaasConnType = $map['iaas_conn_type'];
        }

        return $model;
    }
}
