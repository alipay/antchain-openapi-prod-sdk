<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class QueryTradeOrderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'source' => 'source',
        'merchantOrderNo' => 'merchant_order_no',
    ];
    public function validate() {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('merchantOrderNo', $this->merchantOrderNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->merchantOrderNo) {
            $res['merchant_order_no'] = $this->merchantOrderNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTradeOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['merchant_order_no'])){
            $model->merchantOrderNo = $map['merchant_order_no'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 中台颁发的场景码，IP_COPYRIGHT
    /**
     * @var string
     */
    public $source;

    // 外部商户订单号，不超32位
    /**
     * @var string
     */
    public $merchantOrderNo;

}
