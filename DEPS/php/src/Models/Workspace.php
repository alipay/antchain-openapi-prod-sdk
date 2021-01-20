<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Workspace extends Model {
    protected $_name = [
        'createTime' => 'create_time',
        'displayName' => 'display_name',
        'id' => 'id',
        'identity' => 'identity',
        'name' => 'name',
        'networkType' => 'network_type',
        'region' => 'region',
        'regionId' => 'region_id',
        'tenant' => 'tenant',
        'updateTime' => 'update_time',
        'zones' => 'zones',
        'type' => 'type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
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
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Workspace
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['create_time'])){
            $model->createTime = $map['create_time'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
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
        if(isset($map['region_id'])){
            $model->regionId = $map['region_id'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['update_time'])){
            $model->updateTime = $map['update_time'];
        }
        if(isset($map['zones'])){
            if(!empty($map['zones'])){
                $model->zones = $map['zones'];
            }
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    // 创建时间
    /**
     * @example 
     * @var string
     */
    public $createTime;

    // workspace 显示名称
    /**
     * @example 生产环境
     * @var string
     */
    public $displayName;

    // workspace 名称
    /**
     * @example 
     * @var string
     */
    public $id;

    // 工作空间唯一标识
    /**
     * @example prod
     * @var string
     */
    public $identity;

    // workspace 名称（等同于唯一标识）
    /**
     * @example dev
     * @var string
     */
    public $name;

    // 网络类型
    /**
     * @example 
     * @var string
     */
    public $networkType;

    // workspace所在regionId
    /**
     * @example 
     * @var string
     */
    public $region;

    // region id
    /**
     * @example 0000000001
     * @var string
     */
    public $regionId;

    // 所属租户名称
    /**
     * @example 
     * @var string
     */
    public $tenant;

    // 最近更新时间
    /**
     * @example 
     * @var string
     */
    public $updateTime;

    // workspace所在zoneIdentity列表
    /**
     * @example 
     * @var string[]
     */
    public $zones;

    // 工作空间类型
    /**
     * @example UNIT
     * @var string
     */
    public $type;

}
