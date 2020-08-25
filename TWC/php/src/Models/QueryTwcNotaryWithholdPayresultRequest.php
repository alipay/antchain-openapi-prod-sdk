<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryTwcNotaryWithholdPayresultRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'entrustOrderId' => 'entrust_order_id',
        'outBizNo' => 'out_biz_no',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->entrustOrderId) {
            $res['entrust_order_id'] = $this->entrustOrderId;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTwcNotaryWithholdPayresultRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['entrust_order_id'])){
            $model->entrustOrderId = $map['entrust_order_id'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 请求扣款时，返回的委托单号,该笔转账在支付宝系统内部的单据ID
    /**
     * @var string
     */
    public $entrustOrderId;

    // 外部订单号,请求方保证唯一性
    /**
     * @var string
     */
    public $outBizNo;

}
