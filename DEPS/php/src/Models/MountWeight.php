<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class MountWeight extends Model {
    protected $_name = [
        'mountTargetId' => 'mount_target_id',
        'port' => 'port',
        'weight' => 'weight',
    ];
    public function validate() {
        Model::validateMaximum('weight', $this->weight, '100');
        Model::validateMinimum('weight', $this->weight, '0');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->mountTargetId) {
            $res['mount_target_id'] = $this->mountTargetId;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MountWeight
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['mount_target_id'])){
            $model->mountTargetId = $map['mount_target_id'];
        }
        if(isset($map['port'])){
            $model->port = $map['port'];
        }
        if(isset($map['weight'])){
            $model->weight = $map['weight'];
        }
        return $model;
    }
    // 挂载目标 ID
    /**
     * @example 123
     * @var string
     */
    public $mountTargetId;

    // 端口
    /**
     * @example 
     * @var int
     */
    public $port;

    // 权重
    /**
     * @example 
     * @var int
     */
    public $weight;

}
