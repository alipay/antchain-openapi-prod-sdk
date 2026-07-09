<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ThingsDidUpdateReq extends Model
{
    // 业务类型，默认空
    /**
     * @example null
     *
     * @var string
     */
    public $bizType;

    // 待更新的实体did
    /**
     * @example "did:iot:xxxxx"
     *
     * @var string
     */
    public $thingDid;

    // 更新内容，参考更新请求不同实体类型结构体，对应不同实体类型不一样
    // 信物链实体附加信息 不同实体身份，有不同的json组织格式，
    // 参考 DeviceRegisterReqModel， SpaceRegisterReqModel， CorporateReqModel， WarehouseReqModel，
    /**
     * @example 参考结构体
     *
     * @var string
     */
    public $thingExtraParams;

    // 更新后的实体版本
    /**
     * @example "1.0.1"
     *
     * @var string
     */
    public $thingVersion;
    protected $_name = [
        'bizType'          => 'biz_type',
        'thingDid'         => 'thing_did',
        'thingExtraParams' => 'thing_extra_params',
        'thingVersion'     => 'thing_version',
    ];

    public function validate()
    {
        Model::validateRequired('thingDid', $this->thingDid, true);
        Model::validateRequired('thingVersion', $this->thingVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->thingDid) {
            $res['thing_did'] = $this->thingDid;
        }
        if (null !== $this->thingExtraParams) {
            $res['thing_extra_params'] = $this->thingExtraParams;
        }
        if (null !== $this->thingVersion) {
            $res['thing_version'] = $this->thingVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThingsDidUpdateReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['thing_did'])) {
            $model->thingDid = $map['thing_did'];
        }
        if (isset($map['thing_extra_params'])) {
            $model->thingExtraParams = $map['thing_extra_params'];
        }
        if (isset($map['thing_version'])) {
            $model->thingVersion = $map['thing_version'];
        }

        return $model;
    }
}
