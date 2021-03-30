<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DeviceInfoNoGroup extends Model
{
    // 物模型Id
    /**
     * @example aliyunModelId
     *
     * @var string
     */
    public $aliyunModelId;

    // 三元组
    /**
     * @example deviceMeta
     *
     * @var string
     */
    public $deviceMeta;

    // 设备拥有者Id
    /**
     * @example deviceOwnerId
     *
     * @var string
     */
    public $deviceOwnerId;

    // 设备安装信息
    /**
     * @example deviceSetupInfo
     *
     * @var string
     */
    public $deviceSetupInfo;

    // 设备类型【ALIDEV：阿里云设备，CHAINMACDEV：链机设备，M2MDEV：M2M设备，OTHERDEV：其他设备】
    //
    /**
     * @example ALIDEV
     *
     * @var string
     */
    public $deviceType;

    // 设备使用者Id
    /**
     * @example deviceUserId
     *
     * @var string[]
     */
    public $deviceUserIdList;

    // 设备虚拟id
    /**
     * @example deviceVirtualId
     *
     * @var string
     */
    public $deviceVirtualId;

    // 智能版本
    /**
     * @example smartVersion
     *
     * @var string
     */
    public $smartVersion;

    // 设备状态 【READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销， ALL：全部】
    /**
     * @example READY
     *
     * @var string
     */
    public $status;

    // 库位Id
    /**
     * @example stockPositionId
     *
     * @var string[]
     */
    public $stockPositionIdList;

    // 库位名称
    /**
     * @example stockPositionName
     *
     * @var string[]
     */
    public $stockPositionNameList;

    // 设备id
    /**
     * @example thingsDid
     *
     * @var string
     */
    public $thingsDid;

    // 设备名称
    /**
     * @example thingsName
     *
     * @var string
     */
    public $thingsName;

    // 视频流地址
    /**
     * @example videoUrl
     *
     * @var string
     */
    public $videoUrl;

    // 仓库Id
    /**
     * @example warehouseId
     *
     * @var string
     */
    public $warehouseId;

    // 仓库名称
    /**
     * @example warehouseName
     *
     * @var string
     */
    public $warehouseName;
    protected $_name = [
        'aliyunModelId'         => 'aliyun_model_id',
        'deviceMeta'            => 'device_meta',
        'deviceOwnerId'         => 'device_owner_id',
        'deviceSetupInfo'       => 'device_setup_info',
        'deviceType'            => 'device_type',
        'deviceUserIdList'      => 'device_user_id_list',
        'deviceVirtualId'       => 'device_virtual_id',
        'smartVersion'          => 'smart_version',
        'status'                => 'status',
        'stockPositionIdList'   => 'stock_position_id_list',
        'stockPositionNameList' => 'stock_position_name_list',
        'thingsDid'             => 'things_did',
        'thingsName'            => 'things_name',
        'videoUrl'              => 'video_url',
        'warehouseId'           => 'warehouse_id',
        'warehouseName'         => 'warehouse_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->aliyunModelId) {
            $res['aliyun_model_id'] = $this->aliyunModelId;
        }
        if (null !== $this->deviceMeta) {
            $res['device_meta'] = $this->deviceMeta;
        }
        if (null !== $this->deviceOwnerId) {
            $res['device_owner_id'] = $this->deviceOwnerId;
        }
        if (null !== $this->deviceSetupInfo) {
            $res['device_setup_info'] = $this->deviceSetupInfo;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->deviceUserIdList) {
            $res['device_user_id_list'] = $this->deviceUserIdList;
        }
        if (null !== $this->deviceVirtualId) {
            $res['device_virtual_id'] = $this->deviceVirtualId;
        }
        if (null !== $this->smartVersion) {
            $res['smart_version'] = $this->smartVersion;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->stockPositionIdList) {
            $res['stock_position_id_list'] = $this->stockPositionIdList;
        }
        if (null !== $this->stockPositionNameList) {
            $res['stock_position_name_list'] = $this->stockPositionNameList;
        }
        if (null !== $this->thingsDid) {
            $res['things_did'] = $this->thingsDid;
        }
        if (null !== $this->thingsName) {
            $res['things_name'] = $this->thingsName;
        }
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }
        if (null !== $this->warehouseId) {
            $res['warehouse_id'] = $this->warehouseId;
        }
        if (null !== $this->warehouseName) {
            $res['warehouse_name'] = $this->warehouseName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceInfoNoGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['aliyun_model_id'])) {
            $model->aliyunModelId = $map['aliyun_model_id'];
        }
        if (isset($map['device_meta'])) {
            $model->deviceMeta = $map['device_meta'];
        }
        if (isset($map['device_owner_id'])) {
            $model->deviceOwnerId = $map['device_owner_id'];
        }
        if (isset($map['device_setup_info'])) {
            $model->deviceSetupInfo = $map['device_setup_info'];
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['device_user_id_list'])) {
            if (!empty($map['device_user_id_list'])) {
                $model->deviceUserIdList = $map['device_user_id_list'];
            }
        }
        if (isset($map['device_virtual_id'])) {
            $model->deviceVirtualId = $map['device_virtual_id'];
        }
        if (isset($map['smart_version'])) {
            $model->smartVersion = $map['smart_version'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['stock_position_id_list'])) {
            if (!empty($map['stock_position_id_list'])) {
                $model->stockPositionIdList = $map['stock_position_id_list'];
            }
        }
        if (isset($map['stock_position_name_list'])) {
            if (!empty($map['stock_position_name_list'])) {
                $model->stockPositionNameList = $map['stock_position_name_list'];
            }
        }
        if (isset($map['things_did'])) {
            $model->thingsDid = $map['things_did'];
        }
        if (isset($map['things_name'])) {
            $model->thingsName = $map['things_name'];
        }
        if (isset($map['video_url'])) {
            $model->videoUrl = $map['video_url'];
        }
        if (isset($map['warehouse_id'])) {
            $model->warehouseId = $map['warehouse_id'];
        }
        if (isset($map['warehouse_name'])) {
            $model->warehouseName = $map['warehouse_name'];
        }

        return $model;
    }
}
