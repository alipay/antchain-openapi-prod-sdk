<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicDeviceHardWareModule extends Model
{
    // 所属规格
    /**
     * @example 12321321
     *
     * @var int
     */
    public $specsId;

    // 硬件模块ID
    /**
     * @example 12321321
     *
     * @var int
     */
    public $hardwareModuleId;

    // 模块名称
    /**
     * @example 反扫头
     *
     * @var string
     */
    public $hardwareModuleName;

    // 模块编码
    /**
     * @example REVERSE_SCANNING_HEAD
     *
     * @var string
     */
    public $hardwareModuleValue;

    // 模块参数
    /**
     * @example {"size":102}
     *
     * @var string
     */
    public $hardwareModuleParam;
    protected $_name = [
        'specsId'             => 'specs_id',
        'hardwareModuleId'    => 'hardware_module_id',
        'hardwareModuleName'  => 'hardware_module_name',
        'hardwareModuleValue' => 'hardware_module_value',
        'hardwareModuleParam' => 'hardware_module_param',
    ];

    public function validate()
    {
        Model::validateRequired('specsId', $this->specsId, true);
        Model::validateRequired('hardwareModuleId', $this->hardwareModuleId, true);
        Model::validateRequired('hardwareModuleName', $this->hardwareModuleName, true);
        Model::validateRequired('hardwareModuleValue', $this->hardwareModuleValue, true);
        Model::validateRequired('hardwareModuleParam', $this->hardwareModuleParam, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->specsId) {
            $res['specs_id'] = $this->specsId;
        }
        if (null !== $this->hardwareModuleId) {
            $res['hardware_module_id'] = $this->hardwareModuleId;
        }
        if (null !== $this->hardwareModuleName) {
            $res['hardware_module_name'] = $this->hardwareModuleName;
        }
        if (null !== $this->hardwareModuleValue) {
            $res['hardware_module_value'] = $this->hardwareModuleValue;
        }
        if (null !== $this->hardwareModuleParam) {
            $res['hardware_module_param'] = $this->hardwareModuleParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicDeviceHardWareModule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['specs_id'])) {
            $model->specsId = $map['specs_id'];
        }
        if (isset($map['hardware_module_id'])) {
            $model->hardwareModuleId = $map['hardware_module_id'];
        }
        if (isset($map['hardware_module_name'])) {
            $model->hardwareModuleName = $map['hardware_module_name'];
        }
        if (isset($map['hardware_module_value'])) {
            $model->hardwareModuleValue = $map['hardware_module_value'];
        }
        if (isset($map['hardware_module_param'])) {
            $model->hardwareModuleParam = $map['hardware_module_param'];
        }

        return $model;
    }
}
