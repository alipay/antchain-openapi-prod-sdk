<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppService;

class DepsDatabase extends Model {
    protected $_name = [
        'appServices' => 'app_services',
        'connectionAddress' => 'connection_address',
        'cpu' => 'cpu',
        'engine' => 'engine',
        'engineVersion' => 'engine_version',
        'iaasId' => 'iaas_id',
        'id' => 'id',
        'maxConnections' => 'max_connections',
        'maxIops' => 'max_iops',
        'memory' => 'memory',
        'name' => 'name',
        'networkType' => 'network_type',
        'netType' => 'net_type',
        'port' => 'port',
        'region' => 'region',
        'specIaasId' => 'spec_iaas_id',
        'status' => 'status',
        'storage' => 'storage',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->appServices) {
            $res['app_services'] = [];
            if(null !== $this->appServices && is_array($this->appServices)){
                $n = 0;
                foreach($this->appServices as $item){
                    $res['app_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->connectionAddress) {
            $res['connection_address'] = $this->connectionAddress;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->engine) {
            $res['engine'] = $this->engine;
        }
        if (null !== $this->engineVersion) {
            $res['engine_version'] = $this->engineVersion;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->maxConnections) {
            $res['max_connections'] = $this->maxConnections;
        }
        if (null !== $this->maxIops) {
            $res['max_iops'] = $this->maxIops;
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
        if (null !== $this->netType) {
            $res['net_type'] = $this->netType;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->specIaasId) {
            $res['spec_iaas_id'] = $this->specIaasId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->storage) {
            $res['storage'] = $this->storage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DepsDatabase
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_services'])){
            if(!empty($map['app_services'])){
                $model->appServices = [];
                $n = 0;
                foreach($map['app_services'] as $item) {
                    $model->appServices[$n++] = null !== $item ? AppService::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['connection_address'])){
            $model->connectionAddress = $map['connection_address'];
        }
        if(isset($map['cpu'])){
            $model->cpu = $map['cpu'];
        }
        if(isset($map['engine'])){
            $model->engine = $map['engine'];
        }
        if(isset($map['engine_version'])){
            $model->engineVersion = $map['engine_version'];
        }
        if(isset($map['iaas_id'])){
            $model->iaasId = $map['iaas_id'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['max_connections'])){
            $model->maxConnections = $map['max_connections'];
        }
        if(isset($map['max_iops'])){
            $model->maxIops = $map['max_iops'];
        }
        if(isset($map['memory'])){
            $model->memory = $map['memory'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['network_type'])){
            $model->networkType = $map['network_type'];
        }
        if(isset($map['net_type'])){
            $model->netType = $map['net_type'];
        }
        if(isset($map['port'])){
            $model->port = $map['port'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['spec_iaas_id'])){
            $model->specIaasId = $map['spec_iaas_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['storage'])){
            $model->storage = $map['storage'];
        }
        return $model;
    }
    // 服务实例列表
    /**
     * @example 
     * @var AppService[]
     */
    public $appServices;

    // 连接地址
    /**
     * @example 
     * @var string
     */
    public $connectionAddress;

    // CPU
    /**
     * @example 
     * @var int
     */
    public $cpu;

    // 数据库类型，取值 MYSQL, OCEANBASE
    /**
     * @example 
     * @var string
     */
    public $engine;

    // 数据库版本，取值 MYSQL5, MYSQL6, MYSQL7, OCEANBASE1_4, 分别对应Mysql5.5, 5.6, 5.7, Ocea
    /**
     * @example 
     * @var string
     */
    public $engineVersion;

    // iaaS在创建该资源时为其分配的唯一标示，创建中或创建失败时为空
    /**
     * @example 
     * @var string
     */
    public $iaasId;

    // 资源唯一标识
    /**
     * @example 
     * @var string
     */
    public $id;

    // 最大连接数
    /**
     * @example 
     * @var int
     */
    public $maxConnections;

    // 最大IOPS
    /**
     * @example 
     * @var int
     */
    public $maxIops;

    // 内存大小，单位：MB
    /**
     * @example 
     * @var int
     */
    public $memory;

    // 资源名称
    /**
     * @example test
     * @var string
     */
    public $name;

    // 网络类型，Classic或VPC
    /**
     * @example Classic
     * @var string
     */
    public $networkType;

    // 网络连接类型，取值 Internet：外网，Intranet：内网
    /**
     * @example 
     * @var string
     */
    public $netType;

    // 连接端口
    /**
     * @example 
     * @var int
     */
    public $port;

    // 资源所属的地域id
    /**
     * @example 
     * @var string
     */
    public $region;

    // 数据库实例规格
    /**
     * @example 
     * @var string
     */
    public $specIaasId;

    // 
    // 
    // 资源状态，取值 CREATING：正在创建，CREATEFAILED：创建失败，RUNNING: 运行中，REBOOTING: 重启，REBOOT_FAILED: 重启失败，
    // DELETING：正在删除，DELETED：删除成功，DELETE_FAILED：删除失败，RESOURCE_IMPORTING：资源导入中，RESOURCE_IMPORT_FAILED：资源导入失败，
    // RESOURCE_REMOVING：资源删除中，RESOURCE_REMOVE_FAILED：资源删除失败，DBINSTANCECLASSCHANGING：修改规格中，
    // MODIFY_SPEC_FAILED：修改规格失败
    // 
    /**
     * @example 
     * @var string
     */
    public $status;

    // 存储空间GB
    /**
     * @example 
     * @var int
     */
    public $storage;

}
