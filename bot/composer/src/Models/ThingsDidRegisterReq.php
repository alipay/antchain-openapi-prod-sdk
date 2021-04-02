<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ThingsDidRegisterReq extends Model
{
    // 业务编码，暂时保留，不需传入
    /**
     * @example null
     *
     * @var string
     */
    public $bizType;

    // 信物链实体的所有者的分布式身份
    /**
     * @example "did:mychain:xxxxx"
     *
     * @var string
     */
    public $ownerTenantDid;

    // 信物链实体附加信息 不同实体身份，有不同的json组织格式...
    // 参考
    // DeviceRegisterReqModel，
    // SpaceRegisterReqModel，
    // CorporateReqModel，
    // WarehouseReqModel，
    //
    /**
     * @example "附加信息"
     *
     * @var string
     */
    public $thingExtraParams;

    // 原始id，租户内同一类型实体唯一
    /**
     * @example "租户下唯一ID"
     *
     * @var string
     */
    public $thingOriginId;

    // 实体原始名称
    /**
     * @example "摄像头a"
     *
     * @var string
     */
    public $thingOriginName;

    // 信物链实体身份
    // DID_TYPE_DEVICE_ALIYUN(0): 阿里云设备
    // DID_TYPE_DEVICE_PEGASUS(1): 链机设备
    // DID_TYPE_DEVICE_MCU(2): MCU设备
    // DID_TYPE_DEVICE_INTEL(3): intel设备
    // DID_TYPE_DEVICE_DEVICE(16384): 默认设备 ...
    // DID_TYPE_CORPORATE(65536): 组织实体
    // DID_TYPE_WAREHOUSE(131072)：仓库实体
    // DID_TYPE_SPACE(196608)： 空间实体
    /**
     * @example 0
     *
     * @var int
     */
    public $thingType;

    // 实体版本
    /**
     * @example "1.0.0"
     *
     * @var string
     */
    public $thingVersion;

    // 信物链实体的使用方的分布式身份列表
    /**
     * @example ["did:mychain:xxxx1","did:mychain:xxxx2"]
     *
     * @var string[]
     */
    public $userDid;
    protected $_name = [
        'bizType'          => 'biz_type',
        'ownerTenantDid'   => 'owner_tenant_did',
        'thingExtraParams' => 'thing_extra_params',
        'thingOriginId'    => 'thing_origin_id',
        'thingOriginName'  => 'thing_origin_name',
        'thingType'        => 'thing_type',
        'thingVersion'     => 'thing_version',
        'userDid'          => 'user_did',
    ];

    public function validate()
    {
        Model::validateRequired('thingOriginId', $this->thingOriginId, true);
        Model::validateRequired('thingOriginName', $this->thingOriginName, true);
        Model::validateRequired('thingType', $this->thingType, true);
        Model::validateRequired('thingVersion', $this->thingVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->ownerTenantDid) {
            $res['owner_tenant_did'] = $this->ownerTenantDid;
        }
        if (null !== $this->thingExtraParams) {
            $res['thing_extra_params'] = $this->thingExtraParams;
        }
        if (null !== $this->thingOriginId) {
            $res['thing_origin_id'] = $this->thingOriginId;
        }
        if (null !== $this->thingOriginName) {
            $res['thing_origin_name'] = $this->thingOriginName;
        }
        if (null !== $this->thingType) {
            $res['thing_type'] = $this->thingType;
        }
        if (null !== $this->thingVersion) {
            $res['thing_version'] = $this->thingVersion;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThingsDidRegisterReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['owner_tenant_did'])) {
            $model->ownerTenantDid = $map['owner_tenant_did'];
        }
        if (isset($map['thing_extra_params'])) {
            $model->thingExtraParams = $map['thing_extra_params'];
        }
        if (isset($map['thing_origin_id'])) {
            $model->thingOriginId = $map['thing_origin_id'];
        }
        if (isset($map['thing_origin_name'])) {
            $model->thingOriginName = $map['thing_origin_name'];
        }
        if (isset($map['thing_type'])) {
            $model->thingType = $map['thing_type'];
        }
        if (isset($map['thing_version'])) {
            $model->thingVersion = $map['thing_version'];
        }
        if (isset($map['user_did'])) {
            if (!empty($map['user_did'])) {
                $model->userDid = $map['user_did'];
            }
        }

        return $model;
    }
}
