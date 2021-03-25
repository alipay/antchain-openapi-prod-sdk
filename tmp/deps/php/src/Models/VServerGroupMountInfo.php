<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\MountWeight;

class VServerGroupMountInfo extends Model {
    protected $_name = [
        'iaasId' => 'iaas_id',
        'name' => 'name',
        'paasId' => 'paas_id',
        'mountWeights' => 'mount_weights',
    ];
    public function validate() {
        Model::validateRequired('iaasId', $this->iaasId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('paasId', $this->paasId, true);
        Model::validateRequired('mountWeights', $this->mountWeights, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->paasId) {
            $res['paas_id'] = $this->paasId;
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
        return $res;
    }
    /**
     * @param array $map
     * @return VServerGroupMountInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['iaas_id'])){
            $model->iaasId = $map['iaas_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['paas_id'])){
            $model->paasId = $map['paas_id'];
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
        return $model;
    }
    // iaas id
    /**
     * @example 123
     * @var string
     */
    public $iaasId;

    // 名称
    /**
     * @example test
     * @var string
     */
    public $name;

    // paas id
    /**
     * @example 123
     * @var string
     */
    public $paasId;

    // 权重信息
    /**
     * @example 
     * @var MountWeight[]
     */
    public $mountWeights;

}
