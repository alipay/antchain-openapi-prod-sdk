<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\ModuleLocator;

class OtaModuleVersionItemResponse extends Model {
    protected $_name = [
        'moduleLocator' => 'module_locator',
        'version' => 'version',
        'reportedAt' => 'reported_at',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->moduleLocator) {
            $res['module_locator'] = null !== $this->moduleLocator ? $this->moduleLocator->toMap() : null;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->reportedAt) {
            $res['reported_at'] = $this->reportedAt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OtaModuleVersionItemResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['module_locator'])){
            $model->moduleLocator = ModuleLocator::fromMap($map['module_locator']);
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['reported_at'])){
            $model->reportedAt = $map['reported_at'];
        }
        return $model;
    }
    // 对外模块定位信息
    /**
     * @example undefined
     * @var ModuleLocator
     */
    public $moduleLocator;

    // 设备最近一次被接受的上报版本号
    /**
     * @example 1.0.0
     * @var string
     */
    public $version;

    // 设备上报时间戳，单位毫秒。
    /**
     * @example 设备上报时间戳，单位毫秒。
     * @var string
     */
    public $reportedAt;

}
