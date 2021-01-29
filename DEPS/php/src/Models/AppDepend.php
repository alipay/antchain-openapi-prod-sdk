<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppDepend extends Model {
    protected $_name = [
        'appName' => 'app_name',
        'dependAppNames' => 'depend_app_names',
        'appDisplayName' => 'app_display_name',
    ];
    public function validate() {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('dependAppNames', $this->dependAppNames, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dependAppNames) {
            $res['depend_app_names'] = $this->dependAppNames;
        }
        if (null !== $this->appDisplayName) {
            $res['app_display_name'] = $this->appDisplayName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppDepend
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['depend_app_names'])){
            $model->dependAppNames = $map['depend_app_names'];
        }
        if(isset($map['app_display_name'])){
            $model->appDisplayName = $map['app_display_name'];
        }
        return $model;
    }
    // 当前应用名称
    /**
     * @example aks
     * @var string
     */
    public $appName;

    // 该应用依赖的所有应用的 id 列表字符串
    /**
     * @example acmetaservice,provisioncore
     * @var string
     */
    public $dependAppNames;

    // 应用显示名称
    /**
     * @example 应用容器服务
     * @var string
     */
    public $appDisplayName;

}
