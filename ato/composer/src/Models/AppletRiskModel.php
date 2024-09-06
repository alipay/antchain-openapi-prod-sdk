<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AppletRiskModel extends Model
{
    // 风险咨询事件ID
    /**
     * @example 202403220000000000008833
     *
     * @var string
     */
    public $recordId;

    // 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险
    /**
     * @example RANK1
     *
     * @var string
     */
    public $riskRank;

    // 风险名称
    /**
     * @example 综合风险
     *
     * @var string
     */
    public $riskName;

    // 风险等级中文描述
    /**
     * @example 低风险
     *
     * @var string
     */
    public $riskDesc;

    // 子风险结果列表
    /**
     * @example
     *
     * @var SubRentRiskItem[]
     */
    public $subRiskResultList;
    protected $_name = [
        'recordId'          => 'record_id',
        'riskRank'          => 'risk_rank',
        'riskName'          => 'risk_name',
        'riskDesc'          => 'risk_desc',
        'subRiskResultList' => 'sub_risk_result_list',
    ];

    public function validate()
    {
        Model::validateRequired('recordId', $this->recordId, true);
        Model::validateRequired('riskRank', $this->riskRank, true);
        Model::validateRequired('riskName', $this->riskName, true);
        Model::validateRequired('riskDesc', $this->riskDesc, true);
        Model::validateRequired('subRiskResultList', $this->subRiskResultList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
        }
        if (null !== $this->riskRank) {
            $res['risk_rank'] = $this->riskRank;
        }
        if (null !== $this->riskName) {
            $res['risk_name'] = $this->riskName;
        }
        if (null !== $this->riskDesc) {
            $res['risk_desc'] = $this->riskDesc;
        }
        if (null !== $this->subRiskResultList) {
            $res['sub_risk_result_list'] = [];
            if (null !== $this->subRiskResultList && \is_array($this->subRiskResultList)) {
                $n = 0;
                foreach ($this->subRiskResultList as $item) {
                    $res['sub_risk_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppletRiskModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['record_id'])) {
            $model->recordId = $map['record_id'];
        }
        if (isset($map['risk_rank'])) {
            $model->riskRank = $map['risk_rank'];
        }
        if (isset($map['risk_name'])) {
            $model->riskName = $map['risk_name'];
        }
        if (isset($map['risk_desc'])) {
            $model->riskDesc = $map['risk_desc'];
        }
        if (isset($map['sub_risk_result_list'])) {
            if (!empty($map['sub_risk_result_list'])) {
                $model->subRiskResultList = [];
                $n                        = 0;
                foreach ($map['sub_risk_result_list'] as $item) {
                    $model->subRiskResultList[$n++] = null !== $item ? SubRentRiskItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
