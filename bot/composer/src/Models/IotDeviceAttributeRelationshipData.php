<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotDeviceAttributeRelationshipData extends Model
{
    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 设备品类名称
    /**
     * @example 智能防疫机一体机
     *
     * @var string
     */
    public $deviceCategory;

    // 关系类型
    /**
     * @example CORP
     *
     * @var string
     */
    public $relationType;

    // 厂商名称
    /**
     * @example 天波
     *
     * @var string
     */
    public $corpName;

    // 设备型号
    /**
     * @example TPS980
     *
     * @var string
     */
    public $deviceModel;

    // 设备规格
    /**
     * @example 安卓标准版
     *
     * @var string
     */
    public $deviceSpecs;

    // 硬件模块
    /**
     * @example 测温头
     *
     * @var string
     */
    public $hardwareModule;
    protected $_name = [
        'id'             => 'id',
        'deviceCategory' => 'device_category',
        'relationType'   => 'relation_type',
        'corpName'       => 'corp_name',
        'deviceModel'    => 'device_model',
        'deviceSpecs'    => 'device_specs',
        'hardwareModule' => 'hardware_module',
    ];

    public function validate()
    {
        Model::validateRequired('deviceCategory', $this->deviceCategory, true);
        Model::validateRequired('relationType', $this->relationType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->deviceCategory) {
            $res['device_category'] = $this->deviceCategory;
        }
        if (null !== $this->relationType) {
            $res['relation_type'] = $this->relationType;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->deviceSpecs) {
            $res['device_specs'] = $this->deviceSpecs;
        }
        if (null !== $this->hardwareModule) {
            $res['hardware_module'] = $this->hardwareModule;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotDeviceAttributeRelationshipData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['device_category'])) {
            $model->deviceCategory = $map['device_category'];
        }
        if (isset($map['relation_type'])) {
            $model->relationType = $map['relation_type'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['device_specs'])) {
            $model->deviceSpecs = $map['device_specs'];
        }
        if (isset($map['hardware_module'])) {
            $model->hardwareModule = $map['hardware_module'];
        }

        return $model;
    }
}
