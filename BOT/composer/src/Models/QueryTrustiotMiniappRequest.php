<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\DeviceScopeItem;

class QueryTrustiotMiniappRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'traceNo' => 'trace_no',
        'deviceScope' => 'device_scope',
    ];
    public function validate() {
        Model::validateRequired('traceNo', $this->traceNo, true);
        Model::validateRequired('deviceScope', $this->deviceScope, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->traceNo) {
            $res['trace_no'] = $this->traceNo;
        }
        if (null !== $this->deviceScope) {
            $res['device_scope'] = [];
            if(null !== $this->deviceScope && is_array($this->deviceScope)){
                $n = 0;
                foreach($this->deviceScope as $item){
                    $res['device_scope'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTrustiotMiniappRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['trace_no'])){
            $model->traceNo = $map['trace_no'];
        }
        if(isset($map['device_scope'])){
            if(!empty($map['device_scope'])){
                $model->deviceScope = [];
                $n = 0;
                foreach($map['device_scope'] as $item) {
                    $model->deviceScope[$n++] = null !== $item ? DeviceScopeItem::fromMap($item) : $item;
                }
            }
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

    // 友宝跳转流水号
    /**
     * @var string
     */
    public $traceNo;

    // 本次授权设备清单，可包含多个 scene
    /**
     * @var DeviceScopeItem[]
     */
    public $deviceScope;

}
