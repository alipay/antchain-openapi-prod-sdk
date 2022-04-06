<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceDnsProvider extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // provider_id
    /**
     * @example provider_id
     *
     * @var string
     */
    public $providerId;

    // region_id
    /**
     * @example region_id
     *
     * @var string
     */
    public $regionId;

    // zoneId
    /**
     * @example zoneId
     *
     * @var string
     */
    public $zoneId;

    // dns_provider_id
    /**
     * @example dns_provider_id
     *
     * @var string
     */
    public $dnsProviderId;

    // dns_network_type
    /**
     * @example dns_network_type
     *
     * @var string
     */
    public $dnsNetworkType;

    // sub_domain_name
    /**
     * @example sub_domain_name
     *
     * @var string
     */
    public $subDomainName;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utc_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;
    protected $_name = [
        'id'             => 'id',
        'workspaceId'    => 'workspace_id',
        'providerId'     => 'provider_id',
        'regionId'       => 'region_id',
        'zoneId'         => 'zone_id',
        'dnsProviderId'  => 'dns_provider_id',
        'dnsNetworkType' => 'dns_network_type',
        'subDomainName'  => 'sub_domain_name',
        'utcCreate'      => 'utc_create',
        'utcModified'    => 'utc_modified',
        'description'    => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
        Model::validateRequired('dnsProviderId', $this->dnsProviderId, true);
        Model::validateRequired('dnsNetworkType', $this->dnsNetworkType, true);
        Model::validateRequired('subDomainName', $this->subDomainName, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
        Model::validateRequired('description', $this->description, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->dnsProviderId) {
            $res['dns_provider_id'] = $this->dnsProviderId;
        }
        if (null !== $this->dnsNetworkType) {
            $res['dns_network_type'] = $this->dnsNetworkType;
        }
        if (null !== $this->subDomainName) {
            $res['sub_domain_name'] = $this->subDomainName;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceDnsProvider
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['dns_provider_id'])) {
            $model->dnsProviderId = $map['dns_provider_id'];
        }
        if (isset($map['dns_network_type'])) {
            $model->dnsNetworkType = $map['dns_network_type'];
        }
        if (isset($map['sub_domain_name'])) {
            $model->subDomainName = $map['sub_domain_name'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
