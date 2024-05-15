<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class LcaCalcResult extends Model
{
    // 速算记录编号
    /**
     * @example 0340340000000704
     *
     * @var string
     */
    public $recordNo;

    // 碳足迹排放量
    /**
     * @example 123.12
     *
     * @var string
     */
    public $carbonAmount;

    // 各阶段评估数据明细
    /**
     * @example
     *
     * @var EnterpriseLcaStageAssessmentItem[]
     */
    public $lcaStageAssessmentDatum;

    // 速算发起时间
    /**
     * @example 2024-05-01
     *
     * @var string
     */
    public $recordDate;

    // 自定义业务标识
    /**
     * @example bizNo001
     *
     * @var string
     */
    public $customContext;
    protected $_name = [
        'recordNo'                => 'record_no',
        'carbonAmount'            => 'carbon_amount',
        'lcaStageAssessmentDatum' => 'lca_stage_assessment_datum',
        'recordDate'              => 'record_date',
        'customContext'           => 'custom_context',
    ];

    public function validate()
    {
        Model::validateRequired('recordNo', $this->recordNo, true);
        Model::validateRequired('carbonAmount', $this->carbonAmount, true);
        Model::validateRequired('lcaStageAssessmentDatum', $this->lcaStageAssessmentDatum, true);
        Model::validateRequired('recordDate', $this->recordDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->recordNo) {
            $res['record_no'] = $this->recordNo;
        }
        if (null !== $this->carbonAmount) {
            $res['carbon_amount'] = $this->carbonAmount;
        }
        if (null !== $this->lcaStageAssessmentDatum) {
            $res['lca_stage_assessment_datum'] = [];
            if (null !== $this->lcaStageAssessmentDatum && \is_array($this->lcaStageAssessmentDatum)) {
                $n = 0;
                foreach ($this->lcaStageAssessmentDatum as $item) {
                    $res['lca_stage_assessment_datum'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->recordDate) {
            $res['record_date'] = $this->recordDate;
        }
        if (null !== $this->customContext) {
            $res['custom_context'] = $this->customContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LcaCalcResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['record_no'])) {
            $model->recordNo = $map['record_no'];
        }
        if (isset($map['carbon_amount'])) {
            $model->carbonAmount = $map['carbon_amount'];
        }
        if (isset($map['lca_stage_assessment_datum'])) {
            if (!empty($map['lca_stage_assessment_datum'])) {
                $model->lcaStageAssessmentDatum = [];
                $n                              = 0;
                foreach ($map['lca_stage_assessment_datum'] as $item) {
                    $model->lcaStageAssessmentDatum[$n++] = null !== $item ? EnterpriseLcaStageAssessmentItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['record_date'])) {
            $model->recordDate = $map['record_date'];
        }
        if (isset($map['custom_context'])) {
            $model->customContext = $map['custom_context'];
        }

        return $model;
    }
}
