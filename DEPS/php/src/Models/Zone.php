<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Zone extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'paasId' => 'paas_id',
        'regionId' => 'region_id',
        'state' => 'state',
        'iaasId' => 'iaas_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->paasId) {
            $res['paas_id'] = $this->paasId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Zone
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['paas_id'])){
            $model->paasId = $map['paas_id'];
        }
        if(isset($map['region_id'])){
            $model->regionId = $map['region_id'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['iaas_id'])){
            $model->iaasId = $map['iaas_id'];
        }
        return $model;
    }
    // zone名称
    /**
     * @example 
     * @var string
     */
    public $id;

    // zone显示名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // zone paas id
    /**
     * @example 0000000001
     * @var string
     */
    public $paasId;

    // region identity
    /**
     * @example CN-SHANGHAI-FINANCE
     * @var string
     */
    public $regionId;

    // zone state
    /**
     * @example A
     * @var string
     */
    public $state;

    // 机房iaas identity
    /**
     * @example cn-hangzhou
     * @var string
     */
    public $iaasId;

}
