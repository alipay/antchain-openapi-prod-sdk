<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class GetDnsWorkspaceproviderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // zoneId
    /**
     * @var string
     */
    public $zoneId;

    // dns_network_type
    /**
     * @var string
     */
    public $dnsNetworkType;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceId'    => 'workspace_id',
        'zoneId'         => 'zone_id',
        'dnsNetworkType' => 'dns_network_type',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('dnsNetworkType', $this->dnsNetworkType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->dnsNetworkType) {
            $res['dns_network_type'] = $this->dnsNetworkType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDnsWorkspaceproviderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['dns_network_type'])) {
            $model->dnsNetworkType = $map['dns_network_type'];
        }

        return $model;
    }
}
