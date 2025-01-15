<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RiskGoModel extends Model
{
    // 风险类型。
    // 枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
    /**
     * @example MARKETING_PURCHASE_COMMON
     *
     * @var string
     */
    public $riskType;

    // 风险等级。
    // 枚举：rank0 无法判断；rank1 极低风险；rank2 较低风险；rank3 中风险；rank4 高风险；rank5 极高风险
    /**
     * @example rank1
     *
     * @var string
     */
    public $riskValue;

    // 风险描述
    /**
     * @example 风险等级1
     *
     * @var string
     */
    public $riskDesc;

    // 风险标签
    /**
     * @example 1001
     *
     * @var string
     */
    public $infoCode;
    protected $_name = [
        'riskType'  => 'risk_type',
        'riskValue' => 'risk_value',
        'riskDesc'  => 'risk_desc',
        'infoCode'  => 'info_code',
    ];

    public function validate()
    {
        Model::validateRequired('riskType', $this->riskType, true);
        Model::validateRequired('riskValue', $this->riskValue, true);
        Model::validateRequired('riskDesc', $this->riskDesc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }
        if (null !== $this->riskValue) {
            $res['risk_value'] = $this->riskValue;
        }
        if (null !== $this->riskDesc) {
            $res['risk_desc'] = $this->riskDesc;
        }
        if (null !== $this->infoCode) {
            $res['info_code'] = $this->infoCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskGoModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_type'])) {
            $model->riskType = $map['risk_type'];
        }
        if (isset($map['risk_value'])) {
            $model->riskValue = $map['risk_value'];
        }
        if (isset($map['risk_desc'])) {
            $model->riskDesc = $map['risk_desc'];
        }
        if (isset($map['info_code'])) {
            $model->infoCode = $map['info_code'];
        }

        return $model;
    }
}
