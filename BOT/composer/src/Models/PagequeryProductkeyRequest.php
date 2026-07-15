<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryProductkeyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageIndex' => 'page_index',
        'pageSize' => 'page_size',
        'productKey' => 'product_key',
        'scene' => 'scene',
        'tenantName' => 'tenant_name',
        'mock' => 'mock',
    ];
    public function validate() {
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->mock) {
            $res['mock'] = $this->mock;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PagequeryProductkeyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['tenant_name'])){
            $model->tenantName = $map['tenant_name'];
        }
        if(isset($map['mock'])){
            $model->mock = $map['mock'];
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

    // 页数，默认1
    /**
     * @var int
     */
    public $pageIndex;

    // 页码大小，默认10，最大100
    /**
     * @var int
     */
    public $pageSize;

    // 设备端productKey
    /**
     * @var string
     */
    public $productKey;

    // 场景码
    // 
    /**
     * @var string
     */
    public $scene;

    // 租户ID
    // 
    /**
     * @var string
     */
    public $tenantName;

    // 是否为测试数据
    /**
     * @var bool
     */
    public $mock;

}
