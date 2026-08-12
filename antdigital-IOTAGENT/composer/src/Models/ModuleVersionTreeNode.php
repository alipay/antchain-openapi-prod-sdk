<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class ModuleVersionTreeNode extends Model {
    protected $_name = [
        'moduleName' => 'module_name',
        'versions' => 'versions',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->versions) {
            $res['versions'] = $this->versions;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ModuleVersionTreeNode
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['module_name'])){
            $model->moduleName = $map['module_name'];
        }
        if(isset($map['versions'])){
            if(!empty($map['versions'])){
                $model->versions = $map['versions'];
            }
        }
        return $model;
    }
    // 模块名称
    /**
     * @example BLE
     * @var string
     */
    public $moduleName;

    // 版本号列表
    /**
     * @example undefined
     * @var string[]
     */
    public $versions;

}
