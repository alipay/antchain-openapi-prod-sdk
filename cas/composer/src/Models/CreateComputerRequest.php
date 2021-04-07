<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateComputerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

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

    // 是否自动续费
    /**
     * @var bool
     */
    public $autoRenew;

    // 每次自动续费的时长，当参数AutoRenew取值True时为必填取值范围：
    // 1
    // 2
    // 3
    // 6
    // 12
    //
    /**
     * @var int
     */
    public $autoRenewPeriod;

    // cell id
    /**
     * @var string
     */
    public $cellId;

    // 通用镜像文件ID，启动实例时选择的镜像资源。
    //
    /**
     * @var string
     */
    public $commonImageSequence;

    // AKE模式下可以指定此值
    /**
     * @var bool
     */
    public $cpuShared;

    // 数据盘信息
    /**
     * @var DataDisk[]
     */
    public $dataDisks;

    // sigma模式取值，公有云模式下无意义
    /**
     * @var string
     */
    public $deployMode;

    // 实例描述
    //
    /**
     * @var string
     */
    public $description;

    // 是否使用全局唯一名称
    /**
     * @var bool
     */
    public $distinctName;

    // 自定义镜像文件ID，启动实例时选择的镜像资源。
    //
    /**
     * @var string
     */
    public $imageSequence;

    // 计费方式，默认按量计费
    /**
     * @var string
     */
    public $instanceChargeType;

    // 创建的实例数量。默认为 1 台
    /**
     * @var int
     */
    public $instanceCount;

    // 实例名称前缀。可包含小写字母(a-z)，数字(0-9) 和中划线(-)，以字母开头，中划线不能结尾或连续使用，2 ~ 40 个字符。
    /**
     * @var string
     */
    public $name;

    // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。特殊符号可以是： ()`~!@#^&*-_+=|{}[]:;'<>,.?/ 其中，Windows实例不能以斜线号（/）为密码首字符。
    /**
     * @var string
     */
    public $password;

    // 购买资源的时长，单位为：月。当参数 InstanceChargeType 取值为 PrePaid 时才生效且为必选值。取值范围：1 - 9
    // 12
    // 24
    // 36
    // 48
    // 60
    //
    /**
     * @var int
     */
    public $period;

    // 购买资源的时长。可选值Week | Month。
    // PeriodUnit 为 Week 时：
    // Period 取值 {“1”, “2”, “3”, “4”}
    // AutoRenewPeriod 取值 {“1”, “2”, “3”}
    // Period 取值 { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}
    // AutoRenewPeriod 取值 {“1”, “2”, “3”, “6”, “12”}
    // 默认值：Month
    /**
     * @var string
     */
    public $periodUnit;

    // 新创建实例所属于的安全组/域序列号，同一个安全组内的实例之间可以互相访问。
    /**
     * @var string
     */
    public $securityGroupSequence;

    // 实例的资源规格。
    //
    /**
     * @var string
     */
    public $specId;

    // 单位 G。系统盘大小，需根据选择的 image 类型决定。
    /**
     * @var int
     */
    public $systemDiskSize;

    // 系统盘类型
    //
    /**
     * @var string
     */
    public $systemDiskType;

    // VPC类型的实例，需要指定虚拟交换机ID。
    /**
     * @var string
     */
    public $vSwitchId;

    // 实例所在工作空间
    /**
     * @var string
     */
    public $workspace;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // 实例所在可用区的 zone identity
    /**
     * @var string
     */
    public $zone;

    // zone_id如果为空，则zone必填，建议使用zone_id
    /**
     * @var string
     */
    public $zoneId;

    // 公有云上标签
    /**
     * @var MapStringToStringEntity[]
     */
    public $tags;

    // cmp模式下使用的vpc，一般场景勿用
    /**
     * @var string
     */
    public $vpcIaasId;

    // cmp模式下传的token，一般场景勿用
    /**
     * @var string
     */
    public $cloudManageToken;
    protected $_name = [
        'authToken'             => 'auth_token',
        'appId'                 => 'app_id',
        'appServiceId'          => 'app_service_id',
        'autoRenew'             => 'auto_renew',
        'autoRenewPeriod'       => 'auto_renew_period',
        'cellId'                => 'cell_id',
        'commonImageSequence'   => 'common_image_sequence',
        'cpuShared'             => 'cpu_shared',
        'dataDisks'             => 'data_disks',
        'deployMode'            => 'deploy_mode',
        'description'           => 'description',
        'distinctName'          => 'distinct_name',
        'imageSequence'         => 'image_sequence',
        'instanceChargeType'    => 'instance_charge_type',
        'instanceCount'         => 'instance_count',
        'name'                  => 'name',
        'password'              => 'password',
        'period'                => 'period',
        'periodUnit'            => 'period_unit',
        'securityGroupSequence' => 'security_group_sequence',
        'specId'                => 'spec_id',
        'systemDiskSize'        => 'system_disk_size',
        'systemDiskType'        => 'system_disk_type',
        'vSwitchId'             => 'v_switch_id',
        'workspace'             => 'workspace',
        'workspaceId'           => 'workspace_id',
        'zone'                  => 'zone',
        'zoneId'                => 'zone_id',
        'tags'                  => 'tags',
        'vpcIaasId'             => 'vpc_iaas_id',
        'cloudManageToken'      => 'cloud_manage_token',
    ];

    public function validate()
    {
        Model::validateMaxLength('name', $this->name, 40);
        Model::validateMaxLength('password', $this->password, 30);
        Model::validateMinLength('name', $this->name, 2);
        Model::validateMinLength('password', $this->password, 8);
        Model::validateRequired('securityGroupSequence', $this->securityGroupSequence, true);
        Model::validateRequired('specId', $this->specId, true);
        Model::validateRequired('systemDiskSize', $this->systemDiskSize, true);
        Model::validateRequired('systemDiskType', $this->systemDiskType, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('zone', $this->zone, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }
        if (null !== $this->autoRenew) {
            $res['auto_renew'] = $this->autoRenew;
        }
        if (null !== $this->autoRenewPeriod) {
            $res['auto_renew_period'] = $this->autoRenewPeriod;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->commonImageSequence) {
            $res['common_image_sequence'] = $this->commonImageSequence;
        }
        if (null !== $this->cpuShared) {
            $res['cpu_shared'] = $this->cpuShared;
        }
        if (null !== $this->dataDisks) {
            $res['data_disks'] = [];
            if (null !== $this->dataDisks && \is_array($this->dataDisks)) {
                $n = 0;
                foreach ($this->dataDisks as $item) {
                    $res['data_disks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deployMode) {
            $res['deploy_mode'] = $this->deployMode;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->distinctName) {
            $res['distinct_name'] = $this->distinctName;
        }
        if (null !== $this->imageSequence) {
            $res['image_sequence'] = $this->imageSequence;
        }
        if (null !== $this->instanceChargeType) {
            $res['instance_charge_type'] = $this->instanceChargeType;
        }
        if (null !== $this->instanceCount) {
            $res['instance_count'] = $this->instanceCount;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->periodUnit) {
            $res['period_unit'] = $this->periodUnit;
        }
        if (null !== $this->securityGroupSequence) {
            $res['security_group_sequence'] = $this->securityGroupSequence;
        }
        if (null !== $this->specId) {
            $res['spec_id'] = $this->specId;
        }
        if (null !== $this->systemDiskSize) {
            $res['system_disk_size'] = $this->systemDiskSize;
        }
        if (null !== $this->systemDiskType) {
            $res['system_disk_type'] = $this->systemDiskType;
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
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->tags) {
            $res['tags'] = [];
            if (null !== $this->tags && \is_array($this->tags)) {
                $n = 0;
                foreach ($this->tags as $item) {
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->vpcIaasId) {
            $res['vpc_iaas_id'] = $this->vpcIaasId;
        }
        if (null !== $this->cloudManageToken) {
            $res['cloud_manage_token'] = $this->cloudManageToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateComputerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_service_id'])) {
            $model->appServiceId = $map['app_service_id'];
        }
        if (isset($map['auto_renew'])) {
            $model->autoRenew = $map['auto_renew'];
        }
        if (isset($map['auto_renew_period'])) {
            $model->autoRenewPeriod = $map['auto_renew_period'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['common_image_sequence'])) {
            $model->commonImageSequence = $map['common_image_sequence'];
        }
        if (isset($map['cpu_shared'])) {
            $model->cpuShared = $map['cpu_shared'];
        }
        if (isset($map['data_disks'])) {
            if (!empty($map['data_disks'])) {
                $model->dataDisks = [];
                $n                = 0;
                foreach ($map['data_disks'] as $item) {
                    $model->dataDisks[$n++] = null !== $item ? DataDisk::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['deploy_mode'])) {
            $model->deployMode = $map['deploy_mode'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['distinct_name'])) {
            $model->distinctName = $map['distinct_name'];
        }
        if (isset($map['image_sequence'])) {
            $model->imageSequence = $map['image_sequence'];
        }
        if (isset($map['instance_charge_type'])) {
            $model->instanceChargeType = $map['instance_charge_type'];
        }
        if (isset($map['instance_count'])) {
            $model->instanceCount = $map['instance_count'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['period_unit'])) {
            $model->periodUnit = $map['period_unit'];
        }
        if (isset($map['security_group_sequence'])) {
            $model->securityGroupSequence = $map['security_group_sequence'];
        }
        if (isset($map['spec_id'])) {
            $model->specId = $map['spec_id'];
        }
        if (isset($map['system_disk_size'])) {
            $model->systemDiskSize = $map['system_disk_size'];
        }
        if (isset($map['system_disk_type'])) {
            $model->systemDiskType = $map['system_disk_type'];
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
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['vpc_iaas_id'])) {
            $model->vpcIaasId = $map['vpc_iaas_id'];
        }
        if (isset($map['cloud_manage_token'])) {
            $model->cloudManageToken = $map['cloud_manage_token'];
        }

        return $model;
    }
}
