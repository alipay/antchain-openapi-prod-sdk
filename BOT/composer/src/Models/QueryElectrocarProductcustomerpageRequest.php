<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarProductcustomerpageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'current' => 'current',
        'pageSize' => 'page_size',
        'productName' => 'product_name',
        'productKey' => 'product_key',
        'industryId' => 'industry_id',
        'categoryId' => 'category_id',
        'netType' => 'net_type',
        'customerId' => 'customer_id',
    ];
    public function validate() {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('customerId', $this->customerId, true);
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
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->industryId) {
            $res['industry_id'] = $this->industryId;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->netType) {
            $res['net_type'] = $this->netType;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryElectrocarProductcustomerpageRequest
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
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['industry_id'])){
            $model->industryId = $map['industry_id'];
        }
        if(isset($map['category_id'])){
            $model->categoryId = $map['category_id'];
        }
        if(isset($map['net_type'])){
            $model->netType = $map['net_type'];
        }
        if(isset($map['customer_id'])){
            $model->customerId = $map['customer_id'];
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

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 产品key
    /**
     * @var string
     */
    public $productKey;

    // 行业id
    /**
     * @var string
     */
    public $industryId;

    // 品类id
    /**
     * @var string
     */
    public $categoryId;

    // 联网方式：0-WIFI、1-蜂窝、2-以太网、3-蓝牙、4-蓝牙+蜂窝网络
    /**
     * @var int
     */
    public $netType;

    // 客户id
    /**
     * @var string
     */
    public $customerId;

}
