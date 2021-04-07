<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Computer extends Model
{
    // app_id
    /**
     * @example app_id
     *
     * @var string
     */
    public $appId;

    // appServiceIds
    /**
     * @example
     *
     * @var string[]
     */
    public $appServiceIds;

    // assignedAppServiceIds
    /**
     * @example
     *
     * @var string[]
     */
    public $assignedAppServiceIds;

    // 是否自动续费
    /**
     * @example
     *
     * @var bool
     */
    public $autoRenew;

    // 每次自动续费的时长，当参数AutoRenew取值True时为必填。
    /**
     * @example
     *
     * @var int
     */
    public $autoRenewPeriod;

    // bandwidth
    /**
     * @example bandwidth
     *
     * @var int
     */
    public $bandwidth;

    // common_image
    /**
     * @example true, false
     *
     * @var bool
     */
    public $commonImage;

    // vCPU数。
    /**
     * @example 8
     *
     * @var int
     */
    public $cpu;

    // cpu_shared
    /**
     * @example true, false
     *
     * @var bool
     */
    public $cpuShared;

    // 实例创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $creationTime;

    // data_disk
    /**
     * @example
     *
     * @var Disk[]
     */
    public $dataDisks;

    // 这是SIGMA模式下的专用字段，阿里云模式下无意义
    /**
     * @example package or image
     *
     * @var string
     */
    public $deployMode;

    // 服务器描述
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // elastic_ip
    /**
     * @example elastic_ip
     *
     * @var string
     */
    public $elasticIp;

    // 过期时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $expiredTime;

    // ecs iaas id
    /**
     * @example i-salf23rjnjk23***
     *
     * @var string
     */
    public $iaasId;

    // iaasStatus
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $iaasStatus;

    // iaasType
    /**
     * @example COMPUTER
     *
     * @var string
     */
    public $iaasType;

    // 主机id
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $id;

    // image_iaas_id
    /**
     * @example image_iaas_id
     *
     * @var string
     */
    public $imageIaasId;

    // image_id
    /**
     * @example image_id
     *
     * @var string
     */
    public $imageId;

    // image_name
    /**
     * @example image_name
     *
     * @var string
     */
    public $imageName;

    // initialized
    /**
     * @example true, false
     *
     * @var bool
     */
    public $initialized;

    // instanceChargeType
    /**
     * @example PostPaid
     *
     * @var string
     */
    public $instanceChargeType;

    // io_optimized
    /**
     * @example io_optimized
     *
     * @var bool
     */
    public $ioOptimized;

    // last_ops_order_id
    /**
     * @example last_ops_order_id
     *
     * @var string
     */
    public $lastOpsOrderId;

    // last_ops_type
    /**
     * @example last_ops_type
     *
     * @var string
     */
    public $lastOpsType;

    // memory
    /**
     * @example memory
     *
     * @var int
     */
    public $memory;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // networkType
    /**
     * @example VPC
     *
     * @var string
     */
    public $networkType;

    // Options字段
    /**
     * @example
     *
     * @var MapStringToStringEntity[]
     */
    public $options;

    // os
    /**
     * @example os
     *
     * @var string
     */
    public $os;

    // os_bit
    /**
     * @example os_bit
     *
     * @var int
     */
    public $osBit;

    // os_version
    /**
     * @example os_version
     *
     * @var string
     */
    public $osVersion;

    // paas_status
    /**
     * @example paas_status
     *
     * @var string
     */
    public $paasStatus;

    // password
    /**
     * @example password
     *
     * @var string
     */
    public $password;

    // private_ip
    /**
     * @example private_ip
     *
     * @var string
     */
    public $privateIp;

    // providerId
    /**
     * @example 000000001
     *
     * @var string
     */
    public $providerId;

    // public_ip
    /**
     * @example public_ip
     *
     * @var string
     */
    public $publicIp;

    // regionId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $regionId;

    // serial_number
    /**
     * @example serial_number
     *
     * @var string
     */
    public $serialNumber;

    // spec_iaas_id
    /**
     * @example spec_iaas_id
     *
     * @var string
     */
    public $specIaasId;

    // 实例状态。
    /**
     * @example Running
     *
     * @var string
     */
    public $status;

    // system_disk
    /**
     * @example
     *
     * @var Disk
     */
    public $systemDisk;

    // Tags
    /**
     * @example
     *
     * @var MapStringToStringEntity[]
     */
    public $tags;

    // tenantId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $tenantId;

    // tenantId2
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $tenantId2;

    // CPU线程数。
    /**
     * @example 2
     *
     * @var int
     */
    public $threadsPerCore;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utcModified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // vpcId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $vpcId;

    // vSwitchIaasId
    /**
     * @example vsw-s8fusoufso899s***
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

    // zoneId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $zoneId;
    protected $_name = [
        'appId'                 => 'app_id',
        'appServiceIds'         => 'app_service_ids',
        'assignedAppServiceIds' => 'assigned_app_service_ids',
        'autoRenew'             => 'auto_renew',
        'autoRenewPeriod'       => 'auto_renew_period',
        'bandwidth'             => 'bandwidth',
        'commonImage'           => 'common_image',
        'cpu'                   => 'cpu',
        'cpuShared'             => 'cpu_shared',
        'creationTime'          => 'creation_time',
        'dataDisks'             => 'data_disks',
        'deployMode'            => 'deploy_mode',
        'description'           => 'description',
        'elasticIp'             => 'elastic_ip',
        'expiredTime'           => 'expired_time',
        'iaasId'                => 'iaas_id',
        'iaasStatus'            => 'iaas_status',
        'iaasType'              => 'iaas_type',
        'id'                    => 'id',
        'imageIaasId'           => 'image_iaas_id',
        'imageId'               => 'image_id',
        'imageName'             => 'image_name',
        'initialized'           => 'initialized',
        'instanceChargeType'    => 'instance_charge_type',
        'ioOptimized'           => 'io_optimized',
        'lastOpsOrderId'        => 'last_ops_order_id',
        'lastOpsType'           => 'last_ops_type',
        'memory'                => 'memory',
        'name'                  => 'name',
        'networkType'           => 'network_type',
        'options'               => 'options',
        'os'                    => 'os',
        'osBit'                 => 'os_bit',
        'osVersion'             => 'os_version',
        'paasStatus'            => 'paas_status',
        'password'              => 'password',
        'privateIp'             => 'private_ip',
        'providerId'            => 'provider_id',
        'publicIp'              => 'public_ip',
        'regionId'              => 'region_id',
        'serialNumber'          => 'serial_number',
        'specIaasId'            => 'spec_iaas_id',
        'status'                => 'status',
        'systemDisk'            => 'system_disk',
        'tags'                  => 'tags',
        'tenantId'              => 'tenant_id',
        'tenantId2'             => 'tenant_id2',
        'threadsPerCore'        => 'threads_per_core',
        'utcCreate'             => 'utc_create',
        'utcModified'           => 'utc_modified',
        'vpcId'                 => 'vpc_id',
        'vSwitchIaasId'         => 'v_switch_iaas_id',
        'workspaceId'           => 'workspace_id',
        'zoneId'                => 'zone_id',
    ];

    public function validate()
    {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('expiredTime', $this->expiredTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('id', $this->id, true);
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
        if (null !== $this->commonImage) {
            $res['common_image'] = $this->commonImage;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->cpuShared) {
            $res['cpu_shared'] = $this->cpuShared;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
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
        if (null !== $this->elasticIp) {
            $res['elastic_ip'] = $this->elasticIp;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->iaasStatus) {
            $res['iaas_status'] = $this->iaasStatus;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->imageIaasId) {
            $res['image_iaas_id'] = $this->imageIaasId;
        }
        if (null !== $this->imageId) {
            $res['image_id'] = $this->imageId;
        }
        if (null !== $this->imageName) {
            $res['image_name'] = $this->imageName;
        }
        if (null !== $this->initialized) {
            $res['initialized'] = $this->initialized;
        }
        if (null !== $this->instanceChargeType) {
            $res['instance_charge_type'] = $this->instanceChargeType;
        }
        if (null !== $this->ioOptimized) {
            $res['io_optimized'] = $this->ioOptimized;
        }
        if (null !== $this->lastOpsOrderId) {
            $res['last_ops_order_id'] = $this->lastOpsOrderId;
        }
        if (null !== $this->lastOpsType) {
            $res['last_ops_type'] = $this->lastOpsType;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
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
        if (null !== $this->os) {
            $res['os'] = $this->os;
        }
        if (null !== $this->osBit) {
            $res['os_bit'] = $this->osBit;
        }
        if (null !== $this->osVersion) {
            $res['os_version'] = $this->osVersion;
        }
        if (null !== $this->paasStatus) {
            $res['paas_status'] = $this->paasStatus;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->privateIp) {
            $res['private_ip'] = $this->privateIp;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->publicIp) {
            $res['public_ip'] = $this->publicIp;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->serialNumber) {
            $res['serial_number'] = $this->serialNumber;
        }
        if (null !== $this->specIaasId) {
            $res['spec_iaas_id'] = $this->specIaasId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->systemDisk) {
            $res['system_disk'] = null !== $this->systemDisk ? $this->systemDisk->toMap() : null;
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantId2) {
            $res['tenant_id2'] = $this->tenantId2;
        }
        if (null !== $this->threadsPerCore) {
            $res['threads_per_core'] = $this->threadsPerCore;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Computer
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
        if (isset($map['common_image'])) {
            $model->commonImage = $map['common_image'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['cpu_shared'])) {
            $model->cpuShared = $map['cpu_shared'];
        }
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['data_disks'])) {
            if (!empty($map['data_disks'])) {
                $model->dataDisks = [];
                $n                = 0;
                foreach ($map['data_disks'] as $item) {
                    $model->dataDisks[$n++] = null !== $item ? Disk::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['deploy_mode'])) {
            $model->deployMode = $map['deploy_mode'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['elastic_ip'])) {
            $model->elasticIp = $map['elastic_ip'];
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['iaas_status'])) {
            $model->iaasStatus = $map['iaas_status'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['image_iaas_id'])) {
            $model->imageIaasId = $map['image_iaas_id'];
        }
        if (isset($map['image_id'])) {
            $model->imageId = $map['image_id'];
        }
        if (isset($map['image_name'])) {
            $model->imageName = $map['image_name'];
        }
        if (isset($map['initialized'])) {
            $model->initialized = $map['initialized'];
        }
        if (isset($map['instance_charge_type'])) {
            $model->instanceChargeType = $map['instance_charge_type'];
        }
        if (isset($map['io_optimized'])) {
            $model->ioOptimized = $map['io_optimized'];
        }
        if (isset($map['last_ops_order_id'])) {
            $model->lastOpsOrderId = $map['last_ops_order_id'];
        }
        if (isset($map['last_ops_type'])) {
            $model->lastOpsType = $map['last_ops_type'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
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
        if (isset($map['os'])) {
            $model->os = $map['os'];
        }
        if (isset($map['os_bit'])) {
            $model->osBit = $map['os_bit'];
        }
        if (isset($map['os_version'])) {
            $model->osVersion = $map['os_version'];
        }
        if (isset($map['paas_status'])) {
            $model->paasStatus = $map['paas_status'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['private_ip'])) {
            $model->privateIp = $map['private_ip'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['public_ip'])) {
            $model->publicIp = $map['public_ip'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['serial_number'])) {
            $model->serialNumber = $map['serial_number'];
        }
        if (isset($map['spec_iaas_id'])) {
            $model->specIaasId = $map['spec_iaas_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['system_disk'])) {
            $model->systemDisk = Disk::fromMap($map['system_disk']);
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_id2'])) {
            $model->tenantId2 = $map['tenant_id2'];
        }
        if (isset($map['threads_per_core'])) {
            $model->threadsPerCore = $map['threads_per_core'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
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

        return $model;
    }
}
