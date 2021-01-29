<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SLBInfo extends Model {
    protected $_name = [
        'name' => 'name',
        'machineId' => 'machine_id',
        'port' => 'port',
        'paasId' => 'paas_id',
        'iaasId' => 'iaas_id',
        'vServerGroupId' => 'v_server_group_id',
        'vServerGroupName' => 'v_server_group_name',
        'computerId' => 'computer_id',
        'appId' => 'app_id',
        'appSvcId' => 'app_svc_id',
        'vipAddresses' => 'vip_addresses',
        'weight' => 'weight',
        'state' => 'state',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('machineId', $this->machineId, true);
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('paasId', $this->paasId, true);
        Model::validateRequired('iaasId', $this->iaasId, true);
        Model::validateRequired('vServerGroupId', $this->vServerGroupId, true);
        Model::validateRequired('vServerGroupName', $this->vServerGroupName, true);
        Model::validateRequired('computerId', $this->computerId, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('appSvcId', $this->appSvcId, true);
        Model::validateRequired('vipAddresses', $this->vipAddresses, true);
        Model::validateRequired('weight', $this->weight, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('id', $this->id, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->machineId) {
            $res['machine_id'] = $this->machineId;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->paasId) {
            $res['paas_id'] = $this->paasId;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->vServerGroupId) {
            $res['v_server_group_id'] = $this->vServerGroupId;
        }
        if (null !== $this->vServerGroupName) {
            $res['v_server_group_name'] = $this->vServerGroupName;
        }
        if (null !== $this->computerId) {
            $res['computer_id'] = $this->computerId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appSvcId) {
            $res['app_svc_id'] = $this->appSvcId;
        }
        if (null !== $this->vipAddresses) {
            $res['vip_addresses'] = $this->vipAddresses;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SLBInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['machine_id'])){
            $model->machineId = $map['machine_id'];
        }
        if(isset($map['port'])){
            $model->port = $map['port'];
        }
        if(isset($map['paas_id'])){
            $model->paasId = $map['paas_id'];
        }
        if(isset($map['iaas_id'])){
            $model->iaasId = $map['iaas_id'];
        }
        if(isset($map['v_server_group_id'])){
            $model->vServerGroupId = $map['v_server_group_id'];
        }
        if(isset($map['v_server_group_name'])){
            $model->vServerGroupName = $map['v_server_group_name'];
        }
        if(isset($map['computer_id'])){
            $model->computerId = $map['computer_id'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['app_svc_id'])){
            $model->appSvcId = $map['app_svc_id'];
        }
        if(isset($map['vip_addresses'])){
            if(!empty($map['vip_addresses'])){
                $model->vipAddresses = $map['vip_addresses'];
            }
        }
        if(isset($map['weight'])){
            $model->weight = $map['weight'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // 名称
    /**
     * @example test
     * @var string
     */
    public $name;

    // 机器ID
    /**
     * @example 123
     * @var string
     */
    public $machineId;

    // 端口
    /**
     * @example 
     * @var int
     */
    public $port;

    // paas id
    /**
     * @example 123
     * @var string
     */
    public $paasId;

    // iaas id
    /**
     * @example 123
     * @var string
     */
    public $iaasId;

    // 虚拟服务器组 id
    /**
     * @example 123
     * @var string
     */
    public $vServerGroupId;

    // 虚拟服务器组名
    /**
     * @example test
     * @var string
     */
    public $vServerGroupName;

    // 计算资源 ID
    /**
     * @example 123
     * @var string
     */
    public $computerId;

    // 应用 ID
    /**
     * @example 123
     * @var string
     */
    public $appId;

    // 应用服务 ID
    /**
     * @example 123
     * @var string
     */
    public $appSvcId;

    // vip 地址列表
    /**
     * @example 
     * @var string[]
     */
    public $vipAddresses;

    // 权重
    /**
     * @example 
     * @var int
     */
    public $weight;

    // 状态
    /**
     * @example FAILED
     * @var string
     */
    public $state;

    // ID
    /**
     * @example 123
     * @var string
     */
    public $id;

}
