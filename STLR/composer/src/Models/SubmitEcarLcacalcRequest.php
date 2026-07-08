<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class SubmitEcarLcacalcRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 目标产品编码
    /**
     * @var string
     */
    public $materialCode;

    // 授权过程编码
    /**
     * @var string
     */
    public $processNo;

    // 生命周期边界
    /**
     * @var string
     */
    public $lifeCycleBoundary;

    // 产品功能单位
    /**
     * @var string
     */
    public $functionalUnit;

    // 功能单位数量
    /**
     * @var string
     */
    public $functionalAmount;

    // 各阶段活动数据
    /**
     * @var LcaStageActiveData[]
     */
    public $stageActiveDataList;

    // 自定义业务标识
    /**
     * @var string
     */
    public $customContext;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'materialCode'        => 'material_code',
        'processNo'           => 'process_no',
        'lifeCycleBoundary'   => 'life_cycle_boundary',
        'functionalUnit'      => 'functional_unit',
        'functionalAmount'    => 'functional_amount',
        'stageActiveDataList' => 'stage_active_data_list',
        'customContext'       => 'custom_context',
    ];

    public function validate()
    {
        Model::validateRequired('materialCode', $this->materialCode, true);
        Model::validateRequired('processNo', $this->processNo, true);
        Model::validateRequired('lifeCycleBoundary', $this->lifeCycleBoundary, true);
        Model::validateRequired('functionalUnit', $this->functionalUnit, true);
        Model::validateRequired('functionalAmount', $this->functionalAmount, true);
        Model::validateRequired('stageActiveDataList', $this->stageActiveDataList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->materialCode) {
            $res['material_code'] = $this->materialCode;
        }
        if (null !== $this->processNo) {
            $res['process_no'] = $this->processNo;
        }
        if (null !== $this->lifeCycleBoundary) {
            $res['life_cycle_boundary'] = $this->lifeCycleBoundary;
        }
        if (null !== $this->functionalUnit) {
            $res['functional_unit'] = $this->functionalUnit;
        }
        if (null !== $this->functionalAmount) {
            $res['functional_amount'] = $this->functionalAmount;
        }
        if (null !== $this->stageActiveDataList) {
            $res['stage_active_data_list'] = [];
            if (null !== $this->stageActiveDataList && \is_array($this->stageActiveDataList)) {
                $n = 0;
                foreach ($this->stageActiveDataList as $item) {
                    $res['stage_active_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->customContext) {
            $res['custom_context'] = $this->customContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitEcarLcacalcRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['material_code'])) {
            $model->materialCode = $map['material_code'];
        }
        if (isset($map['process_no'])) {
            $model->processNo = $map['process_no'];
        }
        if (isset($map['life_cycle_boundary'])) {
            $model->lifeCycleBoundary = $map['life_cycle_boundary'];
        }
        if (isset($map['functional_unit'])) {
            $model->functionalUnit = $map['functional_unit'];
        }
        if (isset($map['functional_amount'])) {
            $model->functionalAmount = $map['functional_amount'];
        }
        if (isset($map['stage_active_data_list'])) {
            if (!empty($map['stage_active_data_list'])) {
                $model->stageActiveDataList = [];
                $n                          = 0;
                foreach ($map['stage_active_data_list'] as $item) {
                    $model->stageActiveDataList[$n++] = null !== $item ? LcaStageActiveData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['custom_context'])) {
            $model->customContext = $map['custom_context'];
        }

        return $model;
    }
}
