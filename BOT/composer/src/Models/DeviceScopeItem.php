<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceScopeItem extends Model {
    protected $_name = [
        'scene' => 'scene',
        'deviceList' => 'device_list',
    ];
    public function validate() {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('deviceList', $this->deviceList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->deviceList) {
            $res['device_list'] = $this->deviceList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeviceScopeItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['device_list'])){
            if(!empty($map['device_list'])){
                $model->deviceList = $map['device_list'];
            }
        }
        return $model;
    }
    // 场景码
    /**
     * @example SCENE_001
     * @var string
     */
    public $scene;

    // 客户侧 deviceId 列表
    /**
     * @example DEV001
     * @var string[]
     */
    public $deviceList;

}
