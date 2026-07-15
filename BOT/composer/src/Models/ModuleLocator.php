<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ModuleLocator extends Model {
    protected $_name = [
        'locatorType' => 'locator_type',
        'mid' => 'mid',
        'moduleName' => 'module_name',
        'externalId' => 'external_id',
    ];
    public function validate() {
        Model::validateRequired('locatorType', $this->locatorType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->locatorType) {
            $res['locator_type'] = $this->locatorType;
        }
        if (null !== $this->mid) {
            $res['mid'] = $this->mid;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ModuleLocator
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['locator_type'])){
            $model->locatorType = $map['locator_type'];
        }
        if(isset($map['mid'])){
            $model->mid = $map['mid'];
        }
        if(isset($map['module_name'])){
            $model->moduleName = $map['module_name'];
        }
        if(isset($map['external_id'])){
            $model->externalId = $map['external_id'];
        }
        return $model;
    }
    // 模块定位信息：EKYT_MID / MODULE_NAME / CHANNEL_EXTERNAL_ID
    /**
     * @example EKYT_MID
     * @var string
     */
    public $locatorType;

    // EKYT 模块 ID
    /**
     * @example fda6f23a7767486d9d5f29e7567a2004
     * @var string
     */
    public $mid;

    // 模块名称
    /**
     * @example BLE
     * @var string
     */
    public $moduleName;

    // channel 维度外部模块 ID
    /**
     * @example 123456
     * @var string
     */
    public $externalId;

}
