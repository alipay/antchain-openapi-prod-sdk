<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\DeviceLocator;
use AntChain\BOT\Models\ModuleVersionItem;

class QueryElectrocarOtaupgradecheckRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceLocator' => 'device_locator',
        'moduleVersions' => 'module_versions',
        'includeSuccess' => 'include_success',
    ];
    public function validate() {
        Model::validateRequired('deviceLocator', $this->deviceLocator, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceLocator) {
            $res['device_locator'] = null !== $this->deviceLocator ? $this->deviceLocator->toMap() : null;
        }
        if (null !== $this->moduleVersions) {
            $res['module_versions'] = [];
            if(null !== $this->moduleVersions && is_array($this->moduleVersions)){
                $n = 0;
                foreach($this->moduleVersions as $item){
                    $res['module_versions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->includeSuccess) {
            $res['include_success'] = $this->includeSuccess;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryElectrocarOtaupgradecheckRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['device_locator'])){
            $model->deviceLocator = DeviceLocator::fromMap($map['device_locator']);
        }
        if(isset($map['module_versions'])){
            if(!empty($map['module_versions'])){
                $model->moduleVersions = [];
                $n = 0;
                foreach($map['module_versions'] as $item) {
                    $model->moduleVersions[$n++] = null !== $item ? ModuleVersionItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['include_success'])){
            $model->includeSuccess = $map['include_success'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备定位信息
    /**
     * @var DeviceLocator
     */
    public $deviceLocator;

    // 模块版本上报列表
    /**
     * @var ModuleVersionItem[]
     */
    public $moduleVersions;

    // 是否返回已升级完成任务，默认 false
    /**
     * @var bool
     */
    public $includeSuccess;

}
