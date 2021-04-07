<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryLoadbalanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_ids
    /**
     * @var string[]
     */
    public $appIds;

    // app_service_ids
    /**
     * @var string[]
     */
    public $appServiceIds;

    // cluster_ids
    /**
     * @var string[]
     */
    public $clusterIds;

    // cluster_mode
    /**
     * @var bool
     */
    public $clusterMode;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // domains
    /**
     * @var string[]
     */
    public $domains;

    // health_levels
    /**
     * @var string[]
     */
    public $healthLevels;

    // iaas_ids
    /**
     * @var string[]
     */
    public $iaasIds;

    // name
    /**
     * @var string
     */
    public $name;

    // 网络类型
    /**
     * @var string
     */
    public $networkType;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // share_mode
    /**
     * @var bool
     */
    public $shareMode;

    // lb状态
    /**
     * @var string[]
     */
    public $statuses;

    // vip地址
    /**
     * @var string[]
     */
    public $vipAddresses;

    // vip地址类型
    /**
     * @var string
     */
    public $vipAddressType;

    // vip类型
    /**
     * @var string
     */
    public $vipType;

    // vpc_ids
    /**
     * @var string[]
     */
    public $vpcIds;

    // vswitch_iaas_ids
    /**
     * @var string[]
     */
    public $vswitchIaasIds;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'      => 'auth_token',
        'appIds'         => 'app_ids',
        'appServiceIds'  => 'app_service_ids',
        'clusterIds'     => 'cluster_ids',
        'clusterMode'    => 'cluster_mode',
        'currentPage'    => 'current_page',
        'domains'        => 'domains',
        'healthLevels'   => 'health_levels',
        'iaasIds'        => 'iaas_ids',
        'name'           => 'name',
        'networkType'    => 'network_type',
        'pageSize'       => 'page_size',
        'shareMode'      => 'share_mode',
        'statuses'       => 'statuses',
        'vipAddresses'   => 'vip_addresses',
        'vipAddressType' => 'vip_address_type',
        'vipType'        => 'vip_type',
        'vpcIds'         => 'vpc_ids',
        'vswitchIaasIds' => 'vswitch_iaas_ids',
        'workspace'      => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->clusterIds) {
            $res['cluster_ids'] = $this->clusterIds;
        }
        if (null !== $this->clusterMode) {
            $res['cluster_mode'] = $this->clusterMode;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->domains) {
            $res['domains'] = $this->domains;
        }
        if (null !== $this->healthLevels) {
            $res['health_levels'] = $this->healthLevels;
        }
        if (null !== $this->iaasIds) {
            $res['iaas_ids'] = $this->iaasIds;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->shareMode) {
            $res['share_mode'] = $this->shareMode;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
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
        if (null !== $this->vpcIds) {
            $res['vpc_ids'] = $this->vpcIds;
        }
        if (null !== $this->vswitchIaasIds) {
            $res['vswitch_iaas_ids'] = $this->vswitchIaasIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLoadbalanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_ids'])) {
            if (!empty($map['app_ids'])) {
                $model->appIds = $map['app_ids'];
            }
        }
        if (isset($map['app_service_ids'])) {
            if (!empty($map['app_service_ids'])) {
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        if (isset($map['cluster_ids'])) {
            if (!empty($map['cluster_ids'])) {
                $model->clusterIds = $map['cluster_ids'];
            }
        }
        if (isset($map['cluster_mode'])) {
            $model->clusterMode = $map['cluster_mode'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['domains'])) {
            if (!empty($map['domains'])) {
                $model->domains = $map['domains'];
            }
        }
        if (isset($map['health_levels'])) {
            if (!empty($map['health_levels'])) {
                $model->healthLevels = $map['health_levels'];
            }
        }
        if (isset($map['iaas_ids'])) {
            if (!empty($map['iaas_ids'])) {
                $model->iaasIds = $map['iaas_ids'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['share_mode'])) {
            $model->shareMode = $map['share_mode'];
        }
        if (isset($map['statuses'])) {
            if (!empty($map['statuses'])) {
                $model->statuses = $map['statuses'];
            }
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
        if (isset($map['vpc_ids'])) {
            if (!empty($map['vpc_ids'])) {
                $model->vpcIds = $map['vpc_ids'];
            }
        }
        if (isset($map['vswitch_iaas_ids'])) {
            if (!empty($map['vswitch_iaas_ids'])) {
                $model->vswitchIaasIds = $map['vswitch_iaas_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
