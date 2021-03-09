<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class LoadBalancer extends Model
{
    // app_id
    /**
     * @example app_id
     *
     * @var string
     */
    public $appId;

    // app_service_ids
    /**
     * @example
     *
     * @var string[]
     */
    public $appServiceIds;

    // assigned_app_ids
    /**
     * @example assigned_app_ids
     *
     * @var string[]
     */
    public $assignedAppIds;

    // assigned_app_service_ids
    /**
     * @example
     *
     * @var string[]
     */
    public $assignedAppServiceIds;

    // auto_renew
    /**
     * @example true, false
     *
     * @var bool
     */
    public $autoRenew;

    // auto_renew_period
    /**
     * @example auto_renew_period
     *
     * @var int
     */
    public $autoRenewPeriod;

    // bandwidth
    /**
     * @example 1
     *
     * @var int
     */
    public $bandwidth;

    // cluster_id
    /**
     * @example cluster_id
     *
     * @var string
     */
    public $clusterId;

    // cluster_mode
    /**
     * @example true, false
     *
     * @var bool
     */
    public $clusterMode;

    // domains
    /**
     * @example
     *
     * @var string[]
     */
    public $domains;

    // iaas_id
    /**
     * @example iaas_id
     *
     * @var string
     */
    public $iaasId;

    // iaas_type
    /**
     * @example iaas_type
     *
     * @var string
     */
    public $iaasType;

    // lb id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // internet_charge_type
    /**
     * @example internet_charge_type
     *
     * @var string
     */
    public $internetChargeType;

    // lb名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // network_type
    /**
     * @example network_type
     *
     * @var string
     */
    public $networkType;

    // provider_id
    /**
     * @example provider_id
     *
     * @var string
     */
    public $providerId;

    // regionId
    /**
     * @example regionId
     *
     * @var string
     */
    public $regionId;

    // scope
    /**
     * @example scope
     *
     * @var Scope
     */
    public $scope;

    // share_mode
    /**
     * @example true, false
     *
     * @var bool
     */
    public $shareMode;

    // lb状态
    /**
     * @example status
     *
     * @var string
     */
    public $status;

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

    // vip_addresses
    /**
     * @example
     *
     * @var string[]
     */
    public $vipAddresses;

    // vip_address_type
    /**
     * @example vip_address_type
     *
     * @var string
     */
    public $vipAddressType;

    // vip_type
    /**
     * @example vip_type
     *
     * @var string
     */
    public $vipType;

    // vpc_id
    /**
     * @example vpc_id
     *
     * @var string
     */
    public $vpcId;

    // v_switch_iaas_id
    /**
     * @example v_switch_iaas_id
     *
     * @var string
     */
    public $vSwitchIaasId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // zone_id
    /**
     * @example zone_id
     *
     * @var string
     */
    public $zoneId;

    // options，扩展字段
    /**
     * @example
     *
     * @var MapStringToStringEntity[]
     */
    public $options;

    // load_balancer_spec
    /**
     * @example load_balancer_spec
     *
     * @var string
     */
    public $loadBalancerSpec;
    protected $_name = [
        'appId'                 => 'app_id',
        'appServiceIds'         => 'app_service_ids',
        'assignedAppIds'        => 'assigned_app_ids',
        'assignedAppServiceIds' => 'assigned_app_service_ids',
        'autoRenew'             => 'auto_renew',
        'autoRenewPeriod'       => 'auto_renew_period',
        'bandwidth'             => 'bandwidth',
        'clusterId'             => 'cluster_id',
        'clusterMode'           => 'cluster_mode',
        'domains'               => 'domains',
        'iaasId'                => 'iaas_id',
        'iaasType'              => 'iaas_type',
        'id'                    => 'id',
        'internetChargeType'    => 'internet_charge_type',
        'name'                  => 'name',
        'networkType'           => 'network_type',
        'providerId'            => 'provider_id',
        'regionId'              => 'region_id',
        'scope'                 => 'scope',
        'shareMode'             => 'share_mode',
        'status'                => 'status',
        'utcCreate'             => 'utc_create',
        'utcModified'           => 'utc_modified',
        'vipAddresses'          => 'vip_addresses',
        'vipAddressType'        => 'vip_address_type',
        'vipType'               => 'vip_type',
        'vpcId'                 => 'vpc_id',
        'vSwitchIaasId'         => 'v_switch_iaas_id',
        'workspaceId'           => 'workspace_id',
        'zoneId'                => 'zone_id',
        'options'               => 'options',
        'loadBalancerSpec'      => 'load_balancer_spec',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->assignedAppIds) {
            $res['assigned_app_ids'] = $this->assignedAppIds;
        }
        if (null !== $this->assignedAppServiceIds) {
            $res['assigned_app_service_ids'] = $this->assignedAppServiceIds;
        }
        if (null !== $this->autoRenew) {
            $res['auto_renew'] = $this->autoRenew;
        }
        if (null !== $this->autoRenewPeriod) {
            $res['auto_renew_period'] = $this->autoRenewPeriod;
        }
        if (null !== $this->bandwidth) {
            $res['bandwidth'] = $this->bandwidth;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->clusterMode) {
            $res['cluster_mode'] = $this->clusterMode;
        }
        if (null !== $this->domains) {
            $res['domains'] = $this->domains;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->internetChargeType) {
            $res['internet_charge_type'] = $this->internetChargeType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->scope) {
            $res['scope'] = null !== $this->scope ? $this->scope->toMap() : null;
        }
        if (null !== $this->shareMode) {
            $res['share_mode'] = $this->shareMode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->vipAddresses) {
            $res['vip_addresses'] = $this->vipAddresses;
        }
        if (null !== $this->vipAddressType) {
            $res['vip_address_type'] = $this->vipAddressType;
        }
        if (null !== $this->vipType) {
            $res['vip_type'] = $this->vipType;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vSwitchIaasId) {
            $res['v_switch_iaas_id'] = $this->vSwitchIaasId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->options) {
            $res['options'] = [];
            if (null !== $this->options && \is_array($this->options)) {
                $n = 0;
                foreach ($this->options as $item) {
                    $res['options'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->loadBalancerSpec) {
            $res['load_balancer_spec'] = $this->loadBalancerSpec;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadBalancer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_service_ids'])) {
            if (!empty($map['app_service_ids'])) {
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        if (isset($map['assigned_app_ids'])) {
            if (!empty($map['assigned_app_ids'])) {
                $model->assignedAppIds = $map['assigned_app_ids'];
            }
        }
        if (isset($map['assigned_app_service_ids'])) {
            if (!empty($map['assigned_app_service_ids'])) {
                $model->assignedAppServiceIds = $map['assigned_app_service_ids'];
            }
        }
        if (isset($map['auto_renew'])) {
            $model->autoRenew = $map['auto_renew'];
        }
        if (isset($map['auto_renew_period'])) {
            $model->autoRenewPeriod = $map['auto_renew_period'];
        }
        if (isset($map['bandwidth'])) {
            $model->bandwidth = $map['bandwidth'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['cluster_mode'])) {
            $model->clusterMode = $map['cluster_mode'];
        }
        if (isset($map['domains'])) {
            if (!empty($map['domains'])) {
                $model->domains = $map['domains'];
            }
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['internet_charge_type'])) {
            $model->internetChargeType = $map['internet_charge_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['scope'])) {
            $model->scope = Scope::fromMap($map['scope']);
        }
        if (isset($map['share_mode'])) {
            $model->shareMode = $map['share_mode'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['vip_addresses'])) {
            if (!empty($map['vip_addresses'])) {
                $model->vipAddresses = $map['vip_addresses'];
            }
        }
        if (isset($map['vip_address_type'])) {
            $model->vipAddressType = $map['vip_address_type'];
        }
        if (isset($map['vip_type'])) {
            $model->vipType = $map['vip_type'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['v_switch_iaas_id'])) {
            $model->vSwitchIaasId = $map['v_switch_iaas_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['options'])) {
            if (!empty($map['options'])) {
                $model->options = [];
                $n              = 0;
                foreach ($map['options'] as $item) {
                    $model->options[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['load_balancer_spec'])) {
            $model->loadBalancerSpec = $map['load_balancer_spec'];
        }

        return $model;
    }
}
