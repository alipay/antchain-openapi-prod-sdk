<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudPccCommodityPriceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'model' => 'model',
        'provider' => 'provider',
        'chargeItem' => 'charge_item',
        'status' => 'status',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'commodityCode' => 'commodity_code',
    ];
    public function validate() {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->chargeItem) {
            $res['charge_item'] = $this->chargeItem;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudPccCommodityPriceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['provider'])){
            $model->provider = $map['provider'];
        }
        if(isset($map['charge_item'])){
            $model->chargeItem = $map['charge_item'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['commodity_code'])){
            $model->commodityCode = $map['commodity_code'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 模型名称，精确匹配
    /**
     * @var string
     */
    public $model;

    // 供应商
    /**
     * @var string
     */
    public $provider;

    // 收费项（定价对象）
    /**
     * @var string
     */
    public $chargeItem;

    // 定价状态
    /**
     * @var string
     */
    public $status;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页数据量
    /**
     * @var int
     */
    public $pageSize;

    // 商品code
    /**
     * @var string
     */
    public $commodityCode;

}
