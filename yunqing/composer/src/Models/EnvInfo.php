<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class EnvInfo extends Model
{
    // 站点名称
    /**
     * @example xx环境
     *
     * @var string
     */
    public $name;

    // 站点展示名称
    /**
     * @example xx的站点
     *
     * @var string
     */
    public $displayName;

    // IAM租户id
    /**
     * @example 00000001
     *
     * @var string
     */
    public $tenantId;

    // 站点类型：DEV、PROD、SIT
    /**
     * @example DEV
     *
     * @var string
     */
    public $type;

    // 站点环境id
    /**
     * @example 7304000000000001
     *
     * @var string
     */
    public $envId;

    // 云环境站点类型
    /**
     * @example ANT_STACK
     *
     * @var string
     */
    public $cloudStack;

    // 客户名
    /**
     * @example xx银行
     *
     * @var string
     */
    public $customerName;

    // 站点客户id
    /**
     * @example 00001
     *
     * @var string
     */
    public $customerId;

    // 站点资源前缀，云环境名称
    /**
     * @example zjnx
     *
     * @var string
     */
    public $cloudName;

    // global云环境id
    /**
     * @example 000001
     *
     * @var string
     */
    public $cloudId;

    // global云环境中文名称
    /**
     * @example 云游自动
     *
     * @var string
     */
    public $realCloudName;

    // rdb资源池名称
    /**
     * @example zz-db
     *
     * @var string
     */
    public $rdbPoolName;

    // 容器资源池ID
    /**
     * @example zz-xxxengine
     *
     * @var string
     */
    public $containerPoolName;

    // lb资源池名称
    /**
     * @example zz-lb
     *
     * @var string
     */
    public $lbPoolName;

    // 对象资源池名称
    /**
     * @example zz-xxx
     *
     * @var string
     */
    public $storagePoolName;

    // ecs资源池名称
    /**
     * @example zz-ecs
     *
     * @var string
     */
    public $ecsPoolName;

    // vpc资源池名称
    /**
     * @example zz-vpc
     *
     * @var string
     */
    public $vpcPoolName;

    // dns资源池名称
    /**
     * @example zz-dns
     *
     * @var string
     */
    public $dnsPoolName;

    // keystone资源池名称
    /**
     * @example zz-keystone
     *
     * @var string
     */
    public $keystonePoolName;

    // 底座配置
    /**
     * @example
     *
     * @var CloudStackConfig
     */
    public $cloudStackConfig;
    protected $_name = [
        'name'              => 'name',
        'displayName'       => 'display_name',
        'tenantId'          => 'tenant_id',
        'type'              => 'type',
        'envId'             => 'env_id',
        'cloudStack'        => 'cloud_stack',
        'customerName'      => 'customer_name',
        'customerId'        => 'customer_id',
        'cloudName'         => 'cloud_name',
        'cloudId'           => 'cloud_id',
        'realCloudName'     => 'real_cloud_name',
        'rdbPoolName'       => 'rdb_pool_name',
        'containerPoolName' => 'container_pool_name',
        'lbPoolName'        => 'lb_pool_name',
        'storagePoolName'   => 'storage_pool_name',
        'ecsPoolName'       => 'ecs_pool_name',
        'vpcPoolName'       => 'vpc_pool_name',
        'dnsPoolName'       => 'dns_pool_name',
        'keystonePoolName'  => 'keystone_pool_name',
        'cloudStackConfig'  => 'cloud_stack_config',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('cloudStack', $this->cloudStack, true);
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validateRequired('cloudName', $this->cloudName, true);
        Model::validateRequired('cloudId', $this->cloudId, true);
        Model::validateRequired('realCloudName', $this->realCloudName, true);
        Model::validateRequired('rdbPoolName', $this->rdbPoolName, true);
        Model::validateRequired('containerPoolName', $this->containerPoolName, true);
        Model::validateRequired('lbPoolName', $this->lbPoolName, true);
        Model::validateRequired('ecsPoolName', $this->ecsPoolName, true);
        Model::validateRequired('vpcPoolName', $this->vpcPoolName, true);
        Model::validateRequired('dnsPoolName', $this->dnsPoolName, true);
        Model::validateRequired('keystonePoolName', $this->keystonePoolName, true);
        Model::validateRequired('cloudStackConfig', $this->cloudStackConfig, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->cloudStack) {
            $res['cloud_stack'] = $this->cloudStack;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->cloudName) {
            $res['cloud_name'] = $this->cloudName;
        }
        if (null !== $this->cloudId) {
            $res['cloud_id'] = $this->cloudId;
        }
        if (null !== $this->realCloudName) {
            $res['real_cloud_name'] = $this->realCloudName;
        }
        if (null !== $this->rdbPoolName) {
            $res['rdb_pool_name'] = $this->rdbPoolName;
        }
        if (null !== $this->containerPoolName) {
            $res['container_pool_name'] = $this->containerPoolName;
        }
        if (null !== $this->lbPoolName) {
            $res['lb_pool_name'] = $this->lbPoolName;
        }
        if (null !== $this->storagePoolName) {
            $res['storage_pool_name'] = $this->storagePoolName;
        }
        if (null !== $this->ecsPoolName) {
            $res['ecs_pool_name'] = $this->ecsPoolName;
        }
        if (null !== $this->vpcPoolName) {
            $res['vpc_pool_name'] = $this->vpcPoolName;
        }
        if (null !== $this->dnsPoolName) {
            $res['dns_pool_name'] = $this->dnsPoolName;
        }
        if (null !== $this->keystonePoolName) {
            $res['keystone_pool_name'] = $this->keystonePoolName;
        }
        if (null !== $this->cloudStackConfig) {
            $res['cloud_stack_config'] = null !== $this->cloudStackConfig ? $this->cloudStackConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnvInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['cloud_stack'])) {
            $model->cloudStack = $map['cloud_stack'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['cloud_name'])) {
            $model->cloudName = $map['cloud_name'];
        }
        if (isset($map['cloud_id'])) {
            $model->cloudId = $map['cloud_id'];
        }
        if (isset($map['real_cloud_name'])) {
            $model->realCloudName = $map['real_cloud_name'];
        }
        if (isset($map['rdb_pool_name'])) {
            $model->rdbPoolName = $map['rdb_pool_name'];
        }
        if (isset($map['container_pool_name'])) {
            $model->containerPoolName = $map['container_pool_name'];
        }
        if (isset($map['lb_pool_name'])) {
            $model->lbPoolName = $map['lb_pool_name'];
        }
        if (isset($map['storage_pool_name'])) {
            $model->storagePoolName = $map['storage_pool_name'];
        }
        if (isset($map['ecs_pool_name'])) {
            $model->ecsPoolName = $map['ecs_pool_name'];
        }
        if (isset($map['vpc_pool_name'])) {
            $model->vpcPoolName = $map['vpc_pool_name'];
        }
        if (isset($map['dns_pool_name'])) {
            $model->dnsPoolName = $map['dns_pool_name'];
        }
        if (isset($map['keystone_pool_name'])) {
            $model->keystonePoolName = $map['keystone_pool_name'];
        }
        if (isset($map['cloud_stack_config'])) {
            $model->cloudStackConfig = CloudStackConfig::fromMap($map['cloud_stack_config']);
        }

        return $model;
    }
}
