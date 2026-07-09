<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ThingsDidBaseRegisterRequest extends Model
{
    // 信物链实体的所有者的分布式身份
    /**
     * @example "did:mychain:6c9f6cde4f63103d25ab1d9893242547a8518d8f51bff1a9da44e4f8537a9816"
     *
     * @var string
     */
    public $ownerTenantDid;

    // 信物链实体的使用方的分布式身份列表
    /**
     * @example ["did:mychain:xxxx1","did:mychain:xxxx2"]
     *
     * @var string[]
     */
    public $userDid;

    // 信物链实体身份
    // DID_TYPE_DEVICE_ALIYUN: 阿里云设备
    // DID_TYPE_DEVICE_PEGASUS: 链机设备
    // DID_TYPE_DEVICE_MCU: MCU设备
    // DID_TYPE_DEVICE_INTEL: intel设备
    // DID_TYPE_DEVICE_DEVICE: 默认设备
    // ...
    // DID_TYPE_CORPORATE:  组织实体
    // DID_TYPE_WAREHOUSE：仓库实体
    // DID_TYPE_SPACE： 空间实体
    /**
     * @example "DID_TYPE_DEVICE_ALIYUN"
     *
     * @var string
     */
    public $thingType;

    // 原始id，租户内同一类型实体唯一
    /**
     * @example "aaaa123"
     *
     * @var string
     */
    public $thingOriginId;

    // 实体原始名称
    /**
     * @example "摄像头a11"
     *
     * @var string
     */
    public $thingOriginName;

    // 实体版本
    /**
     * @example "1.0.0"
     *
     * @var string
     */
    public $thingVersion;

    // 业务编码
    /**
     * @example null
     *
     * @var string
     */
    public $bizType;

    // 信物链实体附加信息
    // 不同实体身份，有不同的json组织格式，参考另外技术文档
    /**
     * @example "附加信息"
     *
     * @var string
     */
    public $thingExtraParams;
    protected $_name = [
        'ownerTenantDid'   => 'owner_tenant_did',
        'userDid'          => 'user_did',
        'thingType'        => 'thing_type',
        'thingOriginId'    => 'thing_origin_id',
        'thingOriginName'  => 'thing_origin_name',
        'thingVersion'     => 'thing_version',
        'bizType'          => 'biz_type',
        'thingExtraParams' => 'thing_extra_params',
    ];

    public function validate()
    {
        Model::validateRequired('thingType', $this->thingType, true);
        Model::validateRequired('thingOriginId', $this->thingOriginId, true);
        Model::validateRequired('thingOriginName', $this->thingOriginName, true);
        Model::validateRequired('thingVersion', $this->thingVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ownerTenantDid) {
            $res['owner_tenant_did'] = $this->ownerTenantDid;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->thingType) {
            $res['thing_type'] = $this->thingType;
        }
        if (null !== $this->thingOriginId) {
            $res['thing_origin_id'] = $this->thingOriginId;
        }
        if (null !== $this->thingOriginName) {
            $res['thing_origin_name'] = $this->thingOriginName;
        }
        if (null !== $this->thingVersion) {
            $res['thing_version'] = $this->thingVersion;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->thingExtraParams) {
            $res['thing_extra_params'] = $this->thingExtraParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThingsDidBaseRegisterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['owner_tenant_did'])) {
            $model->ownerTenantDid = $map['owner_tenant_did'];
        }
        if (isset($map['user_did'])) {
            if (!empty($map['user_did'])) {
                $model->userDid = $map['user_did'];
            }
        }
        if (isset($map['thing_type'])) {
            $model->thingType = $map['thing_type'];
        }
        if (isset($map['thing_origin_id'])) {
            $model->thingOriginId = $map['thing_origin_id'];
        }
        if (isset($map['thing_origin_name'])) {
            $model->thingOriginName = $map['thing_origin_name'];
        }
        if (isset($map['thing_version'])) {
            $model->thingVersion = $map['thing_version'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['thing_extra_params'])) {
            $model->thingExtraParams = $map['thing_extra_params'];
        }

        return $model;
    }
}
