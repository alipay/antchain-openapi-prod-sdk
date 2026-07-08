<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class LcaProjectTrace extends Model
{
    // 碳足迹编码
    /**
     * @example project_no
     *
     * @var string
     */
    public $projectNo;

    // 碳足迹生命周期边界
    /**
     * @example life_cycle_boundary
     *
     * @var string
     */
    public $lifeCycleBoundary;

    // 产品编码
    /**
     * @example product_no
     *
     * @var string
     */
    public $productNo;

    // 碳足迹项目排放量
    /**
     * @example lca_carbon_amount
     *
     * @var string
     */
    public $lcaCarbonAmount;

    // 产品名称
    /**
     * @example product_name
     *
     * @var string
     */
    public $productName;

    // 产品规格型号
    /**
     * @example specification
     *
     * @var string
     */
    public $specification;

    // 碳足迹开始时间
    /**
     * @example lca_start_date
     *
     * @var string
     */
    public $lcaStartDate;

    // 碳足迹结束时间
    /**
     * @example lca_end_date
     *
     * @var string
     */
    public $lcaEndDate;

    // 溯源状态
    /**
     * @example trace_status
     *
     * @var string
     */
    public $traceStatus;
    protected $_name = [
        'projectNo'         => 'project_no',
        'lifeCycleBoundary' => 'life_cycle_boundary',
        'productNo'         => 'product_no',
        'lcaCarbonAmount'   => 'lca_carbon_amount',
        'productName'       => 'product_name',
        'specification'     => 'specification',
        'lcaStartDate'      => 'lca_start_date',
        'lcaEndDate'        => 'lca_end_date',
        'traceStatus'       => 'trace_status',
    ];

    public function validate()
    {
        Model::validateRequired('projectNo', $this->projectNo, true);
        Model::validateRequired('lifeCycleBoundary', $this->lifeCycleBoundary, true);
        Model::validateRequired('productNo', $this->productNo, true);
        Model::validateRequired('lcaCarbonAmount', $this->lcaCarbonAmount, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('specification', $this->specification, true);
        Model::validateRequired('lcaStartDate', $this->lcaStartDate, true);
        Model::validateRequired('lcaEndDate', $this->lcaEndDate, true);
        Model::validateRequired('traceStatus', $this->traceStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectNo) {
            $res['project_no'] = $this->projectNo;
        }
        if (null !== $this->lifeCycleBoundary) {
            $res['life_cycle_boundary'] = $this->lifeCycleBoundary;
        }
        if (null !== $this->productNo) {
            $res['product_no'] = $this->productNo;
        }
        if (null !== $this->lcaCarbonAmount) {
            $res['lca_carbon_amount'] = $this->lcaCarbonAmount;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->specification) {
            $res['specification'] = $this->specification;
        }
        if (null !== $this->lcaStartDate) {
            $res['lca_start_date'] = $this->lcaStartDate;
        }
        if (null !== $this->lcaEndDate) {
            $res['lca_end_date'] = $this->lcaEndDate;
        }
        if (null !== $this->traceStatus) {
            $res['trace_status'] = $this->traceStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LcaProjectTrace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_no'])) {
            $model->projectNo = $map['project_no'];
        }
        if (isset($map['life_cycle_boundary'])) {
            $model->lifeCycleBoundary = $map['life_cycle_boundary'];
        }
        if (isset($map['product_no'])) {
            $model->productNo = $map['product_no'];
        }
        if (isset($map['lca_carbon_amount'])) {
            $model->lcaCarbonAmount = $map['lca_carbon_amount'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['specification'])) {
            $model->specification = $map['specification'];
        }
        if (isset($map['lca_start_date'])) {
            $model->lcaStartDate = $map['lca_start_date'];
        }
        if (isset($map['lca_end_date'])) {
            $model->lcaEndDate = $map['lca_end_date'];
        }
        if (isset($map['trace_status'])) {
            $model->traceStatus = $map['trace_status'];
        }

        return $model;
    }
}
