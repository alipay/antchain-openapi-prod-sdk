<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\PriceDetailDTO;

class ModelPriceItemDTO extends Model {
    protected $_name = [
        'model' => 'model',
        'prices' => 'prices',
    ];
    public function validate() {
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('prices', $this->prices, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->prices) {
            $res['prices'] = [];
            if(null !== $this->prices && is_array($this->prices)){
                $n = 0;
                foreach($this->prices as $item){
                    $res['prices'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ModelPriceItemDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['prices'])){
            if(!empty($map['prices'])){
                $model->prices = [];
                $n = 0;
                foreach($map['prices'] as $item) {
                    $model->prices[$n++] = null !== $item ? PriceDetailDTO::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 模型名称
    /**
     * @example qwen3.5-plus
     * @var string
     */
    public $model;

    // 定价详情
    /**
     * @example undefined
     * @var PriceDetailDTO[]
     */
    public $prices;

}
