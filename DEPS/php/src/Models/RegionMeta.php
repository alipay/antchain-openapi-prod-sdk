<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class RegionMeta extends Model {
    protected $_name = [
        'availableNetworkTypes' => 'available_network_types',
        'displayName' => 'display_name',
        'id' => 'id',
        'paasId' => 'paas_id',
        'regionIaasId' => 'region_iaas_id',
        'zoneIds' => 'zone_ids',
        'state' => 'state',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->availableNetworkTypes) {
            $res['available_network_types'] = $this->availableNetworkTypes;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->paasId) {
            $res['paas_id'] = $this->paasId;
        }
        if (null !== $this->regionIaasId) {
            $res['region_iaas_id'] = $this->regionIaasId;
        }
        if (null !== $this->zoneIds) {
            $res['zone_ids'] = $this->zoneIds;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RegionMeta
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['available_network_types'])){
            if(!empty($map['available_network_types'])){
                $model->availableNetworkTypes = $map['available_network_types'];
            }
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['paas_id'])){
            $model->paasId = $map['paas_id'];
        }
        if(isset($map['region_iaas_id'])){
            $model->regionIaasId = $map['region_iaas_id'];
        }
        if(isset($map['zone_ids'])){
            if(!empty($map['zone_ids'])){
                $model->zoneIds = $map['zone_ids'];
            }
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        return $model;
    }
    // region支持的网络类型
    /**
     * @example 
     * @var string[]
     */
    public $availableNetworkTypes;

    // region display name
    /**
     * @example 华东1 金融云（杭州）
     * @var string
     */
    public $displayName;

    // region identity
    /**
     * @example CH-HANGZHOU-FINANCE
     * @var string
     */
    public $id;

    // region paas id
    /**
     * @example 0000000001
     * @var string
     */
    public $paasId;

    // region iaas id
    /**
     * @example cn-hangzhou
     * @var string
     */
    public $regionIaasId;

    // region包含的所有zone id列表
    /**
     * @example 
     * @var string[]
     */
    public $zoneIds;

    // region state.
    /**
     * @example AVAILABLE
     * @var string
     */
    public $state;

}
