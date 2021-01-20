<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppService;

class DepsLoadBalancer extends Model {
    protected $_name = [
        'appServices' => 'app_services',
        'bandwidth' => 'bandwidth',
        'iaasId' => 'iaas_id',
        'id' => 'id',
        'internetChargeType' => 'internet_charge_type',
        'name' => 'name',
        'networkType' => 'network_type',
        'region' => 'region',
        'status' => 'status',
        'vipAddress' => 'vip_address',
        'vipAddressType' => 'vip_address_type',
        'vipType' => 'vip_type',
        'vpcId' => 'vpc_id',
        'zone' => 'zone',
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
        if (null !== $this->bandwidth) {
            $res['bandwidth'] = $this->bandwidth;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
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
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->vipAddress) {
            $res['vip_address'] = $this->vipAddress;
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
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DepsLoadBalancer
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
        if(isset($map['bandwidth'])){
            $model->bandwidth = $map['bandwidth'];
        }
        if(isset($map['iaas_id'])){
            $model->iaasId = $map['iaas_id'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['internet_charge_type'])){
            $model->internetChargeType = $map['internet_charge_type'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['network_type'])){
            $model->networkType = $map['network_type'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['vip_address'])){
            $model->vipAddress = $map['vip_address'];
        }
        if(isset($map['vip_address_type'])){
            $model->vipAddressType = $map['vip_address_type'];
        }
        if(isset($map['vip_type'])){
            $model->vipType = $map['vip_type'];
        }
        if(isset($map['vpc_id'])){
            $model->vpcId = $map['vpc_id'];
        }
        if(isset($map['zone'])){
            $model->zone = $map['zone'];
        }
        return $model;
    }
    // 服务实例列表
    /**
     * @example 
     * @var AppService[]
     */
    public $appServices;

    // 网络带宽
    /**
     * @example 1
     * @var int
     */
    public $bandwidth;

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

    // 公网计费方式
    /**
     * @example PAY_BY_BANDWIDTH
     * @var string
     */
    public $internetChargeType;

    // 资源名称
    /**
     * @example test
     * @var string
     */
    public $name;

    // VIP类型
    /**
     * @example Classic
     * @var string
     */
    public $networkType;

    // 资源所属的地域id
    /**
     * @example 
     * @var string
     */
    public $region;

    // 
    // 
    // 资源所处的状态，资源状态，取值 CREATING：正在创建，CREATE_FAILED：创建失败，DELETING：正在删除，DELETED：删除成功，
    // DELETE_FAILED：删除失败，RESOURCE_IMPORTING：资源导入中，RESOURCE_IMPORT_FAILED：资源导入失败，RESOURCE_REMOVING：资源删除中，
    // RESOURCE_REMOVE_FAILED：资源删除失败，INACTIVE：未激活，STOPPING：正在停止，STARTING：正在启动，ACTIVE：已激活，LOCKED：已锁定，
    // RELEASING：正在释放，UPDATING：正在更新，MOUNTING：正在挂载，UMOUNTING：正在卸载
    // 
    /**
     * @example 
     * @var string
     */
    public $status;

    // vip地址
    /**
     * @example 192.168.1.1
     * @var string
     */
    public $vipAddress;

    // address 类型：INTERNET, INTRANET
    /**
     * @example INTERNET
     * @var string
     */
    public $vipAddressType;

    // VIP类型
    /**
     * @example NORMAL_INTERNET
     * @var string
     */
    public $vipType;

    // vpc的id
    /**
     * @example 
     * @var string
     */
    public $vpcId;

    // 资源所属的可用区id
    /**
     * @example 
     * @var string
     */
    public $zone;

}
