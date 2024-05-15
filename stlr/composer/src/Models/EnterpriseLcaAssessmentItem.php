<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseLcaAssessmentItem extends Model
{
    // 物料编码
    /**
     * @example 0601020000
     *
     * @var string
     */
    public $materialCode;

    // 数据明细名称
    /**
     * @example 煤炭
     *
     * @var string
     */
    public $assessmentItemName;

    // 物料直接碳排放评估量
    /**
     * @example 0
     *
     * @var string
     */
    public $emissionAmount;

    // 物料运输碳排放评估量
    /**
     * @example 123.1
     *
     * @var string
     */
    public $transportEmissionAmount;
    protected $_name = [
        'materialCode'            => 'material_code',
        'assessmentItemName'      => 'assessment_item_name',
        'emissionAmount'          => 'emission_amount',
        'transportEmissionAmount' => 'transport_emission_amount',
    ];

    public function validate()
    {
        Model::validateRequired('materialCode', $this->materialCode, true);
        Model::validateRequired('assessmentItemName', $this->assessmentItemName, true);
        Model::validateRequired('emissionAmount', $this->emissionAmount, true);
        Model::validateRequired('transportEmissionAmount', $this->transportEmissionAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->materialCode) {
            $res['material_code'] = $this->materialCode;
        }
        if (null !== $this->assessmentItemName) {
            $res['assessment_item_name'] = $this->assessmentItemName;
        }
        if (null !== $this->emissionAmount) {
            $res['emission_amount'] = $this->emissionAmount;
        }
        if (null !== $this->transportEmissionAmount) {
            $res['transport_emission_amount'] = $this->transportEmissionAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseLcaAssessmentItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['material_code'])) {
            $model->materialCode = $map['material_code'];
        }
        if (isset($map['assessment_item_name'])) {
            $model->assessmentItemName = $map['assessment_item_name'];
        }
        if (isset($map['emission_amount'])) {
            $model->emissionAmount = $map['emission_amount'];
        }
        if (isset($map['transport_emission_amount'])) {
            $model->transportEmissionAmount = $map['transport_emission_amount'];
        }

        return $model;
    }
}
