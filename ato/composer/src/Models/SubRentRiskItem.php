<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SubRentRiskItem extends Model
{
    // 风险名称。枚举值：BASE_PERFORMANCE - 基础履约风险；OVERDUE - 逾期风险；MULTI_RENT - 共租风险。
    /**
     * @example BASE_PERFORMANCE
     *
     * @var string
     */
    public $riskName;

    // 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险。
    /**
     * @example RANK0
     *
     * @var string
     */
    public $riskRank;

    // 风险描述
    /**
     * @example 低风险
     *
     * @var string
     */
    public $riskDesc;
    protected $_name = [
        'riskName' => 'risk_name',
        'riskRank' => 'risk_rank',
        'riskDesc' => 'risk_desc',
    ];

    public function validate()
    {
        Model::validateRequired('riskName', $this->riskName, true);
        Model::validateRequired('riskRank', $this->riskRank, true);
        Model::validateRequired('riskDesc', $this->riskDesc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskName) {
            $res['risk_name'] = $this->riskName;
        }
        if (null !== $this->riskRank) {
            $res['risk_rank'] = $this->riskRank;
        }
        if (null !== $this->riskDesc) {
            $res['risk_desc'] = $this->riskDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubRentRiskItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_name'])) {
            $model->riskName = $map['risk_name'];
        }
        if (isset($map['risk_rank'])) {
            $model->riskRank = $map['risk_rank'];
        }
        if (isset($map['risk_desc'])) {
            $model->riskDesc = $map['risk_desc'];
        }

        return $model;
    }
}
