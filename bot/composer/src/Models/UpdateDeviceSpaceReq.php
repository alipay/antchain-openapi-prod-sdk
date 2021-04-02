<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateDeviceSpaceReq extends Model
{
    // API要更新的设备DID
    /**
     * @example "did:iot:xxxxx"
     *
     * @var string
     */
    public $deviceDid;

    // 0-全部更新 (暂不支持)
    // 1-添加
    // 2-删除
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $updateMode;

    // API要更新的设备部署库位
    /**
     * @example ["did:iot:xxxx","did:iot:xxxxx"]
     *
     * @var string[]
     */
    public $deviceSpace;
    protected $_name = [
        'deviceDid'   => 'device_did',
        'updateMode'  => 'update_mode',
        'deviceSpace' => 'device_space',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('updateMode', $this->updateMode, true);
        Model::validateRequired('deviceSpace', $this->deviceSpace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->updateMode) {
            $res['update_mode'] = $this->updateMode;
        }
        if (null !== $this->deviceSpace) {
            $res['device_space'] = $this->deviceSpace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDeviceSpaceReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['update_mode'])) {
            $model->updateMode = $map['update_mode'];
        }
        if (isset($map['device_space'])) {
            if (!empty($map['device_space'])) {
                $model->deviceSpace = $map['device_space'];
            }
        }

        return $model;
    }
}
