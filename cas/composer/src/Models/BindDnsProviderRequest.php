<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class BindDnsProviderRequest extends Model
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

    // 部分环境绑定到机房机房
    /**
     * @var string
     */
    public $zoneId;

    // dns_provider_id
    /**
     * @var string
     */
    public $dnsProviderId;

    // default_sub_domain_name
    /**
     * @var string
     */
    public $defaultSubDomainName;
    protected $_name = [
        'authToken'            => 'auth_token',
        'workspaceId'          => 'workspace_id',
        'zoneId'               => 'zone_id',
        'dnsProviderId'        => 'dns_provider_id',
        'defaultSubDomainName' => 'default_sub_domain_name',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('dnsProviderId', $this->dnsProviderId, true);
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
        if (null !== $this->dnsProviderId) {
            $res['dns_provider_id'] = $this->dnsProviderId;
        }
        if (null !== $this->defaultSubDomainName) {
            $res['default_sub_domain_name'] = $this->defaultSubDomainName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindDnsProviderRequest
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
        if (isset($map['dns_provider_id'])) {
            $model->dnsProviderId = $map['dns_provider_id'];
        }
        if (isset($map['default_sub_domain_name'])) {
            $model->defaultSubDomainName = $map['default_sub_domain_name'];
        }

        return $model;
    }
}
