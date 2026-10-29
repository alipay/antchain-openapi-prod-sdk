<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncAcctTradeorderbreachRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'platformId' => 'platform_id',
        'acctTradeOrderId' => 'acct_trade_order_id',
        'breachedTime' => 'breached_time',
        'breachedAmount' => 'breached_amount',
        'breachedDesc' => 'breached_desc',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('platformId', $this->platformId, true);
        Model::validateRequired('acctTradeOrderId', $this->acctTradeOrderId, true);
        Model::validateRequired('breachedTime', $this->breachedTime, true);
        Model::validateRequired('breachedAmount', $this->breachedAmount, true);
        Model::validateRequired('breachedDesc', $this->breachedDesc, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }
        if (null !== $this->acctTradeOrderId) {
            $res['acct_trade_order_id'] = $this->acctTradeOrderId;
        }
        if (null !== $this->breachedTime) {
            $res['breached_time'] = $this->breachedTime;
        }
        if (null !== $this->breachedAmount) {
            $res['breached_amount'] = $this->breachedAmount;
        }
        if (null !== $this->breachedDesc) {
            $res['breached_desc'] = $this->breachedDesc;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncAcctTradeorderbreachRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['platform_id'])){
            $model->platformId = $map['platform_id'];
        }
        if(isset($map['acct_trade_order_id'])){
            $model->acctTradeOrderId = $map['acct_trade_order_id'];
        }
        if(isset($map['breached_time'])){
            $model->breachedTime = $map['breached_time'];
        }
        if(isset($map['breached_amount'])){
            $model->breachedAmount = $map['breached_amount'];
        }
        if(isset($map['breached_desc'])){
            $model->breachedDesc = $map['breached_desc'];
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

    // 签约单号，长度大于6小于50
    /**
     * @var string
     */
    public $orderId;

    // 平台商统一社会信用代码，长度大于0小于等于32
    /**
     * @var string
     */
    public $platformId;

    // 交易订单号，长度大于6小于50
    /**
     * @var string
     */
    public $acctTradeOrderId;

    // 违约时间，格式 yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $breachedTime;

    // 违约金额，单位分
    /**
     * @var int
     */
    public $breachedAmount;

    // 违约描述，长度大于0小于等于64
    /**
     * @var string
     */
    public $breachedDesc;

}
