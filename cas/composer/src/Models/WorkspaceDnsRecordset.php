<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceDnsRecordset extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // iaasId
    /**
     * @example iaasId
     *
     * @var string
     */
    public $iaasId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

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

    // device_network_address_type
    /**
     * @example VIP
     *
     * @var string
     */
    public $deviceNetworkAddressType;

    // 绑定的资源的类型COMPUTER或LOAD_BALANCER
    /**
     * @example resource_type
     *
     * @var string
     */
    public $resourceType;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // type
    /**
     * @example A
     *
     * @var string
     */
    public $type;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // value
    /**
     * @example 1.1.1.1
     *
     * @var string
     */
    public $value;

    // ttl
    /**
     * @example ttl
     *
     * @var int
     */
    public $ttl;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // resource_id
    /**
     * @example resource_id
     *
     * @var string
     */
    public $resourceId;

    // resource_iaas_id
    /**
     * @example resource_iaas_id
     *
     * @var string
     */
    public $resourceIaasId;

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
    protected $_name = [
        'id'                       => 'id',
        'iaasId'                   => 'iaas_id',
        'name'                     => 'name',
        'dnsProviderId'            => 'dns_provider_id',
        'dnsNetworkType'           => 'dns_network_type',
        'deviceNetworkAddressType' => 'device_network_address_type',
        'resourceType'             => 'resource_type',
        'description'              => 'description',
        'type'                     => 'type',
        'status'                   => 'status',
        'value'                    => 'value',
        'ttl'                      => 'ttl',
        'workspaceId'              => 'workspace_id',
        'resourceId'               => 'resource_id',
        'resourceIaasId'           => 'resource_iaas_id',
        'utcCreate'                => 'utc_create',
        'utcModified'              => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('iaasId', $this->iaasId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('dnsProviderId', $this->dnsProviderId, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('ttl', $this->ttl, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->dnsProviderId) {
            $res['dns_provider_id'] = $this->dnsProviderId;
        }
        if (null !== $this->dnsNetworkType) {
            $res['dns_network_type'] = $this->dnsNetworkType;
        }
        if (null !== $this->deviceNetworkAddressType) {
            $res['device_network_address_type'] = $this->deviceNetworkAddressType;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->ttl) {
            $res['ttl'] = $this->ttl;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceIaasId) {
            $res['resource_iaas_id'] = $this->resourceIaasId;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceDnsRecordset
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['dns_provider_id'])) {
            $model->dnsProviderId = $map['dns_provider_id'];
        }
        if (isset($map['dns_network_type'])) {
            $model->dnsNetworkType = $map['dns_network_type'];
        }
        if (isset($map['device_network_address_type'])) {
            $model->deviceNetworkAddressType = $map['device_network_address_type'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['ttl'])) {
            $model->ttl = $map['ttl'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_iaas_id'])) {
            $model->resourceIaasId = $map['resource_iaas_id'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
