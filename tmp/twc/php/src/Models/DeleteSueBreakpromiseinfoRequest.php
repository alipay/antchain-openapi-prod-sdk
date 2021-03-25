<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class DeleteSueBreakpromiseinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'preSueId' => 'pre_sue_id',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('preSueId', $this->preSueId, true);
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
        if (null !== $this->preSueId) {
            $res['pre_sue_id'] = $this->preSueId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteSueBreakpromiseinfoRequest
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
        if(isset($map['pre_sue_id'])){
            $model->preSueId = $map['pre_sue_id'];
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

    // 合同唯一标识，不可更新
    /**
     * @var string
     */
    public $orderId;

    // 诉前id，不可更新
    /**
     * @var string
     */
    public $preSueId;

}
