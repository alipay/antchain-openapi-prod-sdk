<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppService;

class Computer extends Model {
    protected $_name = [
        'appServices' => 'app_services',
        'cellId' => 'cell_id',
        'computerType' => 'computer_type',
        'cpu' => 'cpu',
        'elasticIp' => 'elastic_ip',
        'iaasId' => 'iaas_id',
        'id' => 'id',
        'innerIp' => 'inner_ip',
        'memory' => 'memory',
        'name' => 'name',
        'publicIp' => 'public_ip',
        'region' => 'region',
        'status' => 'status',
        'zone' => 'zone',
        'deployMode' => 'deploy_mode',
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
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->computerType) {
            $res['computer_type'] = $this->computerType;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->elasticIp) {
            $res['elastic_ip'] = $this->elasticIp;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->innerIp) {
            $res['inner_ip'] = $this->innerIp;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->publicIp) {
            $res['public_ip'] = $this->publicIp;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->deployMode) {
            $res['deploy_mode'] = $this->deployMode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Computer
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
        if(isset($map['cell_id'])){
            $model->cellId = $map['cell_id'];
        }
        if(isset($map['computer_type'])){
            $model->computerType = $map['computer_type'];
        }
        if(isset($map['cpu'])){
            $model->cpu = $map['cpu'];
        }
        if(isset($map['elastic_ip'])){
            $model->elasticIp = $map['elastic_ip'];
        }
        if(isset($map['iaas_id'])){
            $model->iaasId = $map['iaas_id'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['inner_ip'])){
            $model->innerIp = $map['inner_ip'];
        }
        if(isset($map['memory'])){
            $model->memory = $map['memory'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['public_ip'])){
            $model->publicIp = $map['public_ip'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['zone'])){
            $model->zone = $map['zone'];
        }
        if(isset($map['deploy_mode'])){
            $model->deployMode = $map['deploy_mode'];
        }
        return $model;
    }
    // 服务实例列表
    /**
     * @example 
     * @var AppService[]
     */
    public $appServices;

    // 服务器所属的cell ID
    /**
     * @example 
     * @var string
     */
    public $cellId;

    // 类型:POD/DOCKER_VM
    /**
     * @example POD
     * @var string
     */
    public $computerType;

    // CPU核数
    /**
     * @example 
     * @var int
     */
    public $cpu;

    // 弹性ip地址
    /**
     * @example 
     * @var string
     */
    public $elasticIp;

    // iaas_id
    /**
     * @example i-bp13r5zxxxxxxl2tzuw2
     * @var string
     */
    public $iaasId;

    // 计算资源唯一标识
    /**
     * @example 
     * @var string
     */
    public $id;

    // 内网ip地址
    /**
     * @example 
     * @var string
     */
    public $innerIp;

    // 内存大小，单位：MB
    /**
     * @example 
     * @var int
     */
    public $memory;

    // 资源名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // 公网ip地址
    /**
     * @example 
     * @var string
     */
    public $publicIp;

    // 资源所属的地域id
    /**
     * @example 
     * @var string
     */
    public $region;

    // 资源状态，取值：
    // CREATING：创建中；
    // CREATE_FAILED：创建失败；
    // CREATED：已创建；
    // STARTING：开机中；
    // START_FAILED：开机失败；
    // UNALLOCATED：待分配；
    // INITIALIZING：初始化中；
    // INITIALIZE_FAILED：初始化失败；
    // OFFLINE：已下线；
    // READY：待部署；
    // DEPLOYING：部署中；
    // DEPLOY_FAILED：部署失败；
    // DEPLOYED：已部署；
    // RELEASING：释放中；
    // RELEASE_FAILED：释放失败；
    // STOPPING：关机中；
    // STOP_FAILED：关机失败；
    // STOPPED：已关机；
    // REBOOTING：重启中；
    // REBOOT_FAILED：重启失败；
    // DISK_INITIALIZING：初始化磁盘中；
    // SPEC_CHANGING：变配中；
    // LOCKED：被锁定；
    // EXPIRED：已过期；
    // TO_EXPIR：即将过期；
    // DELETING：删除中；
    // DELETE_FAILED：删除失败；
    // DELETED：删除成功
    // 
    /**
     * @example 
     * @var string
     */
    public $status;

    // 资源所属的可用区id
    /**
     * @example 
     * @var string
     */
    public $zone;

    // 机器是否镜像化
    /**
     * @example package or image
     * @var string
     */
    public $deployMode;

}
