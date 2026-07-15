<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarDevicepageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'current' => 'current',
        'pageSize' => 'page_size',
        'trustProductKey' => 'trust_product_key',
        'deviceQueryStr' => 'device_query_str',
        'deviceStatus' => 'device_status',
        'moduleName' => 'module_name',
        'version' => 'version',
    ];
    public function validate() {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('trustProductKey', $this->trustProductKey, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->deviceQueryStr) {
            $res['device_query_str'] = $this->deviceQueryStr;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryElectrocarDevicepageRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['current'])){
            $model->current = $map['current'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['device_query_str'])){
            $model->deviceQueryStr = $map['device_query_str'];
        }
        if(isset($map['device_status'])){
            $model->deviceStatus = $map['device_status'];
        }
        if(isset($map['module_name'])){
            $model->moduleName = $map['module_name'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
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

    // 当前页码
    /**
     * @var int
     */
    public $current;

    // 每页显示条数
    /**
     * @var int
     */
    public $pageSize;

    // 可信物联产品唯一标识
    /**
     * @var string
     */
    public $trustProductKey;

    // 设备名称/设备备注名称/可信物联唯一设备标识
    /**
     * @var string
     */
    public $deviceQueryStr;

    // 设备状态过滤: ONLINE/OFFLINE/UNACTIVE
    /**
     * @var string
     */
    public $deviceStatus;

    // OTA模块名称
    /**
     * @var string
     */
    public $moduleName;

    // OTA模块版本号（可选，配合moduleName使用）
    /**
     * @var string
     */
    public $version;

}
