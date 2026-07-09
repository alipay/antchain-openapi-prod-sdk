<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SyncDeviceScreenstatusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 所属业务
    /**
     * @var string
     */
    public $bizScene;

    // 设备did
    /**
     * @var string
     */
    public $deviceDid;

    // 设备屏幕状态
    /**
     * @var string
     */
    public $deviceScreenStatus;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 状态改变时间
    /**
     * @var string
     */
    public $statusChangeTime;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'bizScene'           => 'biz_scene',
        'deviceDid'          => 'device_did',
        'deviceScreenStatus' => 'device_screen_status',
        'tenantId'           => 'tenant_id',
        'statusChangeTime'   => 'status_change_time',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('deviceScreenStatus', $this->deviceScreenStatus, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('statusChangeTime', $this->statusChangeTime, true);
        Model::validatePattern('statusChangeTime', $this->statusChangeTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->deviceScreenStatus) {
            $res['device_screen_status'] = $this->deviceScreenStatus;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->statusChangeTime) {
            $res['status_change_time'] = $this->statusChangeTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncDeviceScreenstatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['device_screen_status'])) {
            $model->deviceScreenStatus = $map['device_screen_status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['status_change_time'])) {
            $model->statusChangeTime = $map['status_change_time'];
        }

        return $model;
    }
}
