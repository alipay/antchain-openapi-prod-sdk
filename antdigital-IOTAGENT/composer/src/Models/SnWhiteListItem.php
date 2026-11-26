<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class SnWhiteListItem extends Model {
    protected $_name = [
        'scene' => 'scene',
        'deviceId' => 'device_id',
    ];
    public function validate() {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SnWhiteListItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['device_id'])){
            $model->deviceId = $map['device_id'];
        }
        return $model;
    }
    // 场景码（APPID)
    /**
     * @example TEST-0001
     * @var string
     */
    public $scene;

    // 设备 SN
    /**
     * @example 9912191
     * @var string
     */
    public $deviceId;

}
