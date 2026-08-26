<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ComboOrderPayOptions extends Model {
    protected $_name = [
        'autoCancelPayingOrder' => 'auto_cancel_paying_order',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->autoCancelPayingOrder) {
            $res['auto_cancel_paying_order'] = $this->autoCancelPayingOrder;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ComboOrderPayOptions
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auto_cancel_paying_order'])){
            $model->autoCancelPayingOrder = $map['auto_cancel_paying_order'];
        }
        return $model;
    }
    // 支付中的订单是否自动取消。false：不会自动取消；true：自动取消(兜底时间=支付链接超时时间+3m)
    /**
     * @example true
     * @var bool
     */
    public $autoCancelPayingOrder;

}
