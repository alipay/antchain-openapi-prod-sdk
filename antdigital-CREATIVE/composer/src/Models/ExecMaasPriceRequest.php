<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\PriceUnits;

class ExecMaasPriceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'modelName' => 'model_name',
        'requestDimensions' => 'request_dimensions',
        'requestMetrics' => 'request_metrics',
        'units' => 'units',
    ];
    public function validate() {
        Model::validateRequired('modelName', $this->modelName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->requestDimensions) {
            $res['request_dimensions'] = $this->requestDimensions;
        }
        if (null !== $this->requestMetrics) {
            $res['request_metrics'] = $this->requestMetrics;
        }
        if (null !== $this->units) {
            $res['units'] = [];
            if(null !== $this->units && is_array($this->units)){
                $n = 0;
                foreach($this->units as $item){
                    $res['units'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecMaasPriceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['model_name'])){
            $model->modelName = $map['model_name'];
        }
        if(isset($map['request_dimensions'])){
            $model->requestDimensions = $map['request_dimensions'];
        }
        if(isset($map['request_metrics'])){
            $model->requestMetrics = $map['request_metrics'];
        }
        if(isset($map['units'])){
            if(!empty($map['units'])){
                $model->units = [];
                $n = 0;
                foreach($map['units'] as $item) {
                    $model->units[$n++] = null !== $item ? PriceUnits::fromMap($item) : $item;
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

    // 模型名称
    /**
     * @var string
     */
    public $modelName;

    // 请求级定价维度
    /**
     * @var string
     */
    public $requestDimensions;

    // 请求级计量指标
    /**
     * @var string
     */
    public $requestMetrics;

    // 输出单元列表
    /**
     * @var PriceUnits[]
     */
    public $units;

}
