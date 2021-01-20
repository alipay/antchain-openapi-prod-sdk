<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ZoneView;

class RegionView extends Model {
    protected $_name = [
        'availableNetworkTypes' => 'available_network_types',
        'displayName' => 'display_name',
        'id' => 'id',
        'identity' => 'identity',
        'zones' => 'zones',
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
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->zones) {
            $res['zones'] = [];
            if(null !== $this->zones && is_array($this->zones)){
                $n = 0;
                foreach($this->zones as $item){
                    $res['zones'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RegionView
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
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['zones'])){
            if(!empty($map['zones'])){
                $model->zones = [];
                $n = 0;
                foreach($map['zones'] as $item) {
                    $model->zones[$n++] = null !== $item ? ZoneView::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 支持的网络类型列表
    /**
     * @example 
     * @var string[]
     */
    public $availableNetworkTypes;

    // 显示名称
    /**
     * @example 杭州
     * @var string
     */
    public $displayName;

    // table id
    /**
     * @example 0783f915-6b7a-42d8-9
     * @var string
     */
    public $id;

    // 标识
    /**
     * @example cn-zhangzhou
     * @var string
     */
    public $identity;

    // region包含的所有zone 列表
    /**
     * @example 
     * @var ZoneView[]
     */
    public $zones;

}
