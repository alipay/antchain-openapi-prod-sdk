<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\ModuleLocator;

class ModuleVersionItem extends Model {
    protected $_name = [
        'moduleLocator' => 'module_locator',
        'version' => 'version',
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
        return $res;
    }
    /**
     * @param array $map
     * @return ModuleVersionItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['module_locator'])){
            $model->moduleLocator = ModuleLocator::fromMap($map['module_locator']);
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        return $model;
    }
    // 模块定位信息
    /**
     * @example undefined
     * @var ModuleLocator
     */
    public $moduleLocator;

    // 当前模块版本号
    /**
     * @example 1.0.0
     * @var string
     */
    public $version;

}
