<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IAM\Models\Condition;
use AntChain\IAM\Models\AliyunResource;

class AliyunRamAuthContext extends Model {
    protected $_name = [
        'action' => 'action',
        'conditions' => 'conditions',
        'id' => 'id',
        'regionId' => 'region_id',
        'resources' => 'resources',
        'serviceName' => 'service_name',
    ];
    public function validate() {
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('resources', $this->resources, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if(null !== $this->conditions && is_array($this->conditions)){
                $n = 0;
                foreach($this->conditions as $item){
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->resources) {
            $res['resources'] = [];
            if(null !== $this->resources && is_array($this->resources)){
                $n = 0;
                foreach($this->resources as $item){
                    $res['resources'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AliyunRamAuthContext
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['action'])){
            $model->action = $map['action'];
        }
        if(isset($map['conditions'])){
            if(!empty($map['conditions'])){
                $model->conditions = [];
                $n = 0;
                foreach($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? Condition::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['region_id'])){
            $model->regionId = $map['region_id'];
        }
        if(isset($map['resources'])){
            if(!empty($map['resources'])){
                $model->resources = [];
                $n = 0;
                foreach($map['resources'] as $item) {
                    $model->resources[$n++] = null !== $item ? AliyunResource::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['service_name'])){
            $model->serviceName = $map['service_name'];
        }
        return $model;
    }
    // 操作名称
    /**
     * @example CreateUser
     * @var string
     */
    public $action;

    // 条件
    /**
     * @example 
     * @var Condition[]
     */
    public $conditions;

    // 唯一ID
    /**
     * @example 123
     * @var string
     */
    public $id;

    // regionId
    /**
     * @example ch-hangzhou
     * @var string
     */
    public $regionId;

    // 资源
    /**
     * @example 
     * @var AliyunResource[]
     */
    public $resources;

    // 服务名称
    /**
     * @example sofa
     * @var string
     */
    public $serviceName;

}
