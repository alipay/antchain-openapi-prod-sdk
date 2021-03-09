<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateLoadbalanceRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 负载均衡实例的网络类型。有 INTERNET 和 INTRANET
    /**
     * @var string
     */
    public $addressType;

    // app id
    /**
     * @var string
     */
    public $appId;

    // app service id
    /**
     * @var string
     */
    public $appServiceId;

    // cluster_mode
    /**
     * @var bool
     */
    public $clusterMode;

    //
    // 创建的实例数量。默认为 1 台
    /**
     * @var int
     */
    public $instanceCount;

    // 公网类型实例的付费方式。取值：
    // PAY_BY_BANDWIDTH：按带宽计费。
    // PAY_BY_TRAFFIC：按流量计费（默认值）。
    /**
     * @var string
     */
    public $internetChargeType;

    // listener JSON Array
    /**
     * @var string[]
     */
    public $listeners;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 共享模式
    /**
     * @var bool
     */
    public $shareMode;

    // ALB模式专用
    /**
     * @var string
     */
    public $vipType;

    // VPC类型的实例，需要指定虚拟交换机ID。
    /**
     * @var string
     */
    public $vSwitchId;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // 可用区
    /**
     * @var string
     */
    public $zoneId;

    // 负载均衡实例的规格。取值：
    //
    // slb.s1.small
    // slb.s2.small
    // slb.s2.medium
    // slb.s3.small
    // slb.s3.medium
    // slb.s3.large
    // 每个地域支持的规格不同。
    //
    // 目前支持性能保障型实例的地域有：华北 1（青岛）、华北 2（北京）、华东 1（杭州）、华东 2（上海）、华南 1（深圳）、华北 3（张家口）、华北 5 （呼和浩特）、亚太东南 1（新加坡）、英国（伦敦）、欧洲中部 1（法兰克福）、亚太东南 2（悉尼）、亚太东南 3（吉隆坡）、中东东部 1（迪拜）、亚太东南 5（雅加达）、美西 1（硅谷）、亚太南部 1（孟买）、亚太东北 1（东京）、中国香港和美东 1（弗吉尼亚）
    /**
     * @var string
     */
    public $loadBalancerSpec;
    protected $_name = [
        'authToken'          => 'auth_token',
        'addressType'        => 'address_type',
        'appId'              => 'app_id',
        'appServiceId'       => 'app_service_id',
        'clusterMode'        => 'cluster_mode',
        'instanceCount'      => 'instance_count',
        'internetChargeType' => 'internet_charge_type',
        'listeners'          => 'listeners',
        'name'               => 'name',
        'shareMode'          => 'share_mode',
        'vipType'            => 'vip_type',
        'vSwitchId'          => 'v_switch_id',
        'workspace'          => 'workspace',
        'workspaceId'        => 'workspace_id',
        'zoneId'             => 'zone_id',
        'loadBalancerSpec'   => 'load_balancer_spec',
    ];

    public function validate()
    {
        Model::validateRequired('shareMode', $this->shareMode, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->addressType) {
            $res['address_type'] = $this->addressType;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }
        if (null !== $this->clusterMode) {
            $res['cluster_mode'] = $this->clusterMode;
        }
        if (null !== $this->instanceCount) {
            $res['instance_count'] = $this->instanceCount;
        }
        if (null !== $this->internetChargeType) {
            $res['internet_charge_type'] = $this->internetChargeType;
        }
        if (null !== $this->listeners) {
            $res['listeners'] = $this->listeners;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->shareMode) {
            $res['share_mode'] = $this->shareMode;
        }
        if (null !== $this->vipType) {
            $res['vip_type'] = $this->vipType;
        }
        if (null !== $this->vSwitchId) {
            $res['v_switch_id'] = $this->vSwitchId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->loadBalancerSpec) {
            $res['load_balancer_spec'] = $this->loadBalancerSpec;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLoadbalanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['address_type'])) {
            $model->addressType = $map['address_type'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_service_id'])) {
            $model->appServiceId = $map['app_service_id'];
        }
        if (isset($map['cluster_mode'])) {
            $model->clusterMode = $map['cluster_mode'];
        }
        if (isset($map['instance_count'])) {
            $model->instanceCount = $map['instance_count'];
        }
        if (isset($map['internet_charge_type'])) {
            $model->internetChargeType = $map['internet_charge_type'];
        }
        if (isset($map['listeners'])) {
            if (!empty($map['listeners'])) {
                $model->listeners = $map['listeners'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['share_mode'])) {
            $model->shareMode = $map['share_mode'];
        }
        if (isset($map['vip_type'])) {
            $model->vipType = $map['vip_type'];
        }
        if (isset($map['v_switch_id'])) {
            $model->vSwitchId = $map['v_switch_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['load_balancer_spec'])) {
            $model->loadBalancerSpec = $map['load_balancer_spec'];
        }

        return $model;
    }
}
