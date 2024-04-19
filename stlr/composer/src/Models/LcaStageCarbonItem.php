<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class LcaStageCarbonItem extends Model
{
    // 生命周期阶段：
    // [MaterialPurchase]-原材料，[ProductManufacture]-生产制造，[ProductSale]-分销，[ProductUsage]-产品使用，[ProductWithdraw]-处置/再生利用
    /**
     * @example MaterialPurchase
     *
     * @var string
     */
    public $lcaStageCode;

    // 阶段碳排放量
    /**
     * @example 223.23
     *
     * @var string
     */
    public $lcaStageCarbonAmount;
    protected $_name = [
        'lcaStageCode'         => 'lca_stage_code',
        'lcaStageCarbonAmount' => 'lca_stage_carbon_amount',
    ];

    public function validate()
    {
        Model::validateRequired('lcaStageCode', $this->lcaStageCode, true);
        Model::validateRequired('lcaStageCarbonAmount', $this->lcaStageCarbonAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->lcaStageCode) {
            $res['lca_stage_code'] = $this->lcaStageCode;
        }
        if (null !== $this->lcaStageCarbonAmount) {
            $res['lca_stage_carbon_amount'] = $this->lcaStageCarbonAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LcaStageCarbonItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lca_stage_code'])) {
            $model->lcaStageCode = $map['lca_stage_code'];
        }
        if (isset($map['lca_stage_carbon_amount'])) {
            $model->lcaStageCarbonAmount = $map['lca_stage_carbon_amount'];
        }

        return $model;
    }
}
