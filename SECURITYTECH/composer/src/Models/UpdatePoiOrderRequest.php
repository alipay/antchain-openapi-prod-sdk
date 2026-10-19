<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class UpdatePoiOrderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId' => 'open_id',
        'merchantId' => 'merchant_id',
        'orderId' => 'order_id',
        'fulfillStatus' => 'fulfill_status',
        'statusGmt' => 'status_gmt',
        'logisticsCode' => 'logistics_code',
        'trackingNo' => 'tracking_no',
    ];
    public function validate() {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('fulfillStatus', $this->fulfillStatus, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->fulfillStatus) {
            $res['fulfill_status'] = $this->fulfillStatus;
        }
        if (null !== $this->statusGmt) {
            $res['status_gmt'] = $this->statusGmt;
        }
        if (null !== $this->logisticsCode) {
            $res['logistics_code'] = $this->logisticsCode;
        }
        if (null !== $this->trackingNo) {
            $res['tracking_no'] = $this->trackingNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdatePoiOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['fulfill_status'])){
            $model->fulfillStatus = $map['fulfill_status'];
        }
        if(isset($map['status_gmt'])){
            $model->statusGmt = $map['status_gmt'];
        }
        if(isset($map['logistics_code'])){
            $model->logisticsCode = $map['logistics_code'];
        }
        if(isset($map['tracking_no'])){
            $model->trackingNo = $map['tracking_no'];
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

    // 支付宝小程序用户唯一ID
    /**
     * @var string
     */
    public $openId;

    // 商户入驻主体ID
    /**
     * @var string
     */
    public $merchantId;

    // 商城订单号
    /**
     * @var string
     */
    public $orderId;

    // 履约状态：SHIPPED-已发货 / RECEIVED-已确认收货
    /**
     * @var string
     */
    public $fulfillStatus;

    // 状态发生业务时间，格式yyyy-MM-dd HH:mm:ss，建议传入便于对账
    /**
     * @var string
     */
    public $statusGmt;

    // 物流快递公司ID，枚举值，详见接口文档
    // 若上送，需要和tracking_no同时上送
    /**
     * @var string
     */
    public $logisticsCode;

    // 订单物流单号
    // 若上送，需要和logistics_code同时上送
    /**
     * @var string
     */
    public $trackingNo;

}
