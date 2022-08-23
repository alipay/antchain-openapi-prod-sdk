<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class LbInstance extends Model
{
    // lb资源池
    /**
     * @example zz-lb
     *
     * @var string
     */
    public $resourcePoolName;

    // lb资源id
    /**
     * @example zz-lb-lb-xxx-xxxxx
     *
     * @var string
     */
    public $resourceId;

    // lb资源实例名称
    /**
     * @example zz-lb-xxx-xxx
     *
     * @var string
     */
    public $resourceName;

    // lb路由信息：prodCode_appName
    /**
     * @example YUNYOUDEV-yunyoudev
     *
     * @var string
     */
    public $lbRouterName;

    // lb的vip
    /**
     * @example 12.12.12.12
     *
     * @var string
     */
    public $vip;

    // lb绑定的域名
    /**
     * @example xxx.alipay.net
     *
     * @var string
     */
    public $domainName;

    // lb地址类型：INTENET公网，INTRANET内网
    /**
     * @example INTERNET
     *
     * @var string
     */
    public $addressType;

    // lb带宽
    /**
     * @example -1
     *
     * @var string
     */
    public $bandwidth;

    // 是否是anytunnel lb
    /**
     * @example true, false
     *
     * @var bool
     */
    public $anyTunnel;

    // 是否是办公网
    /**
     * @example true, false
     *
     * @var bool
     */
    public $officialOnly;

    // lb类型：SLB、ALB
    /**
     * @example SLB
     *
     * @var string
     */
    public $provider;

    // lb状态，ACTIVE，FAILED
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;

    // 部署单元实例id
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitInstanceIdentity;

    // 部署单元标识id
    /**
     * @example default
     *
     * @var string
     */
    public $deploymentUnitIdentity;
    protected $_name = [
        'resourcePoolName'               => 'resource_pool_name',
        'resourceId'                     => 'resource_id',
        'resourceName'                   => 'resource_name',
        'lbRouterName'                   => 'lb_router_name',
        'vip'                            => 'vip',
        'domainName'                     => 'domain_name',
        'addressType'                    => 'address_type',
        'bandwidth'                      => 'bandwidth',
        'anyTunnel'                      => 'any_tunnel',
        'officialOnly'                   => 'official_only',
        'provider'                       => 'provider',
        'status'                         => 'status',
        'deploymentUnitInstanceIdentity' => 'deployment_unit_instance_identity',
        'deploymentUnitIdentity'         => 'deployment_unit_identity',
    ];

    public function validate()
    {
        Model::validateRequired('resourcePoolName', $this->resourcePoolName, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('resourceName', $this->resourceName, true);
        Model::validateRequired('lbRouterName', $this->lbRouterName, true);
        Model::validateRequired('vip', $this->vip, true);
        Model::validateRequired('domainName', $this->domainName, true);
        Model::validateRequired('addressType', $this->addressType, true);
        Model::validateRequired('bandwidth', $this->bandwidth, true);
        Model::validateRequired('anyTunnel', $this->anyTunnel, true);
        Model::validateRequired('officialOnly', $this->officialOnly, true);
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('deploymentUnitInstanceIdentity', $this->deploymentUnitInstanceIdentity, true);
        Model::validateRequired('deploymentUnitIdentity', $this->deploymentUnitIdentity, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resourcePoolName) {
            $res['resource_pool_name'] = $this->resourcePoolName;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->lbRouterName) {
            $res['lb_router_name'] = $this->lbRouterName;
        }
        if (null !== $this->vip) {
            $res['vip'] = $this->vip;
        }
        if (null !== $this->domainName) {
            $res['domain_name'] = $this->domainName;
        }
        if (null !== $this->addressType) {
            $res['address_type'] = $this->addressType;
        }
        if (null !== $this->bandwidth) {
            $res['bandwidth'] = $this->bandwidth;
        }
        if (null !== $this->anyTunnel) {
            $res['any_tunnel'] = $this->anyTunnel;
        }
        if (null !== $this->officialOnly) {
            $res['official_only'] = $this->officialOnly;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->deploymentUnitInstanceIdentity) {
            $res['deployment_unit_instance_identity'] = $this->deploymentUnitInstanceIdentity;
        }
        if (null !== $this->deploymentUnitIdentity) {
            $res['deployment_unit_identity'] = $this->deploymentUnitIdentity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LbInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['resource_pool_name'])) {
            $model->resourcePoolName = $map['resource_pool_name'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['lb_router_name'])) {
            $model->lbRouterName = $map['lb_router_name'];
        }
        if (isset($map['vip'])) {
            $model->vip = $map['vip'];
        }
        if (isset($map['domain_name'])) {
            $model->domainName = $map['domain_name'];
        }
        if (isset($map['address_type'])) {
            $model->addressType = $map['address_type'];
        }
        if (isset($map['bandwidth'])) {
            $model->bandwidth = $map['bandwidth'];
        }
        if (isset($map['any_tunnel'])) {
            $model->anyTunnel = $map['any_tunnel'];
        }
        if (isset($map['official_only'])) {
            $model->officialOnly = $map['official_only'];
        }
        if (isset($map['provider'])) {
            $model->provider = $map['provider'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['deployment_unit_instance_identity'])) {
            $model->deploymentUnitInstanceIdentity = $map['deployment_unit_instance_identity'];
        }
        if (isset($map['deployment_unit_identity'])) {
            $model->deploymentUnitIdentity = $map['deployment_unit_identity'];
        }

        return $model;
    }
}
