<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MSCENE\Models;

use AlibabaCloud\Tea\Model;

class MpaasUserGamecenterPaymentQuerystatusResponse extends Model {
    protected $_name = [
        'orderStatus' => 'order_status',
        'cpExtra' => 'cp_extra',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->cpExtra) {
            $res['cp_extra'] = $this->cpExtra;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MpaasUserGamecenterPaymentQuerystatusResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['order_status'])){
            $model->orderStatus = $map['order_status'];
        }
        if(isset($map['cp_extra'])){
            $model->cpExtra = $map['cp_extra'];
        }
        return $model;
    }
    // 订单状态。1-订单已创建。2-订单交易支付成功。3-订单交易支付失败
    /**
     * @example 2
     * @var string
     */
    public $orderStatus;

    // 扩展参数。biz_order_id-平台侧订单号，payment-金额（单位：分），open_uid-开放平台用户ID
    /**
     * @example {"payment":1200,"open_uid":"ez1Vz2gl/izliBRJxcPYTd2m8G3NE=","biz_order_id":"5124555xxx"}","orderStatus":"2"}
     * @var string
     */
    public $cpExtra;

}
