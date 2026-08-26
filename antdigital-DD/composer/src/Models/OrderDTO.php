<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class OrderDTO extends Model {
    protected $_name = [
        'orderNo' => 'order_no',
        'status' => 'status',
    ];
    public function validate() {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('status', $this->status, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrderDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    // 订单编号
    /**
     * @example ORD001
     * @var string
     */
    public $orderNo;

    // 状态
    /**
     * @example SUCCESS
     * @var string
     */
    public $status;

}
