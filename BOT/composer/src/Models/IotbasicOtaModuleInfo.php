<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotbasicOtaModuleInfo extends Model
{
    // OTA模块名称
    /**
     * @example barcodeScanner
     *
     * @var string
     */
    public $moduleName;

    // 最新版本号
    /**
     * @example 1.1.1
     *
     * @var string
     */
    public $lastVersion;
    protected $_name = [
        'moduleName'  => 'module_name',
        'lastVersion' => 'last_version',
    ];

    public function validate()
    {
        Model::validateRequired('moduleName', $this->moduleName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->lastVersion) {
            $res['last_version'] = $this->lastVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotbasicOtaModuleInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['module_name'])) {
            $model->moduleName = $map['module_name'];
        }
        if (isset($map['last_version'])) {
            $model->lastVersion = $map['last_version'];
        }

        return $model;
    }
}
