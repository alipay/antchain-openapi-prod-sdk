<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ModelDetail extends Model {
    protected $_name = [
        'productCode' => 'product_code',
        'score' => 'score',
        'desc' => 'desc',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('score', $this->score, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ModelDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['score'])){
            $model->score = $map['score'];
        }
        if(isset($map['desc'])){
            $model->desc = $map['desc'];
        }
        return $model;
    }
    // 产品码
    /**
     * @example test
     * @var string
     */
    public $productCode;

    // 评分
    /**
     * @example 1.0
     * @var int
     */
    public $score;

    // 描述
    /**
     * @example test
     * @var string
     */
    public $desc;

}
