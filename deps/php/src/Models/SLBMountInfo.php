<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\MountWeight;
use AntChain\Deps\Models\VServerGroupMountInfo;

class SLBMountInfo extends Model {
    protected $_name = [
        'iaasId' => 'iaas_id',
        'id' => 'id',
        'name' => 'name',
        'vipAddresses' => 'vip_addresses',
        'mountWeights' => 'mount_weights',
        'vServerGroupMountInfoList' => 'v_server_group_mount_info_list',
    ];
    public function validate() {
        Model::validateRequired('iaasId', $this->iaasId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('vipAddresses', $this->vipAddresses, true);
        Model::validateRequired('mountWeights', $this->mountWeights, true);
        Model::validateRequired('vServerGroupMountInfoList', $this->vServerGroupMountInfoList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->vipAddresses) {
            $res['vip_addresses'] = $this->vipAddresses;
        }
        if (null !== $this->mountWeights) {
            $res['mount_weights'] = [];
            if(null !== $this->mountWeights && is_array($this->mountWeights)){
                $n = 0;
                foreach($this->mountWeights as $item){
                    $res['mount_weights'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->vServerGroupMountInfoList) {
            $res['v_server_group_mount_info_list'] = [];
            if(null !== $this->vServerGroupMountInfoList && is_array($this->vServerGroupMountInfoList)){
                $n = 0;
                foreach($this->vServerGroupMountInfoList as $item){
                    $res['v_server_group_mount_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SLBMountInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['iaas_id'])){
            $model->iaasId = $map['iaas_id'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['vip_addresses'])){
            if(!empty($map['vip_addresses'])){
                $model->vipAddresses = $map['vip_addresses'];
            }
        }
        if(isset($map['mount_weights'])){
            if(!empty($map['mount_weights'])){
                $model->mountWeights = [];
                $n = 0;
                foreach($map['mount_weights'] as $item) {
                    $model->mountWeights[$n++] = null !== $item ? MountWeight::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['v_server_group_mount_info_list'])){
            if(!empty($map['v_server_group_mount_info_list'])){
                $model->vServerGroupMountInfoList = [];
                $n = 0;
                foreach($map['v_server_group_mount_info_list'] as $item) {
                    $model->vServerGroupMountInfoList[$n++] = null !== $item ? VServerGroupMountInfo::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // iaas id
    /**
     * @example 123
     * @var string
     */
    public $iaasId;

    // slb id
    /**
     * @example 123
     * @var string
     */
    public $id;

    // SLB 名
    /**
     * @example test
     * @var string
     */
    public $name;

    // vip 地址
    /**
     * @example 
     * @var string[]
     */
    public $vipAddresses;

    // 挂载权重
    /**
     * @example 
     * @var MountWeight[]
     */
    public $mountWeights;

    // 虚拟服务器组挂载信息
    /**
     * @example 
     * @var VServerGroupMountInfo[]
     */
    public $vServerGroupMountInfoList;

}
