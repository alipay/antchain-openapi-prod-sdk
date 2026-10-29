<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ExecAcctPayRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'platformId' => 'platform_id',
        'orderId' => 'order_id',
        'acctTradeOrderId' => 'acct_trade_order_id',
    ];
    public function validate() {
        Model::validateRequired('platformId', $this->platformId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('acctTradeOrderId', $this->acctTradeOrderId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->acctTradeOrderId) {
            $res['acct_trade_order_id'] = $this->acctTradeOrderId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAcctPayRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['platform_id'])){
            $model->platformId = $map['platform_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['acct_trade_order_id'])){
            $model->acctTradeOrderId = $map['acct_trade_order_id'];
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

    // 平台的统一社会信用代码，小于32
    /**
     * @var string
     */
    public $platformId;

    // 签约单号
    // ● 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 订单id，长度小于50
    /**
     * @var string
     */
    public $acctTradeOrderId;

}
