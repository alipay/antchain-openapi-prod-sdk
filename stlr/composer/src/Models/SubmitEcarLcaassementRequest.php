<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class SubmitEcarLcaassementRequest extends Model
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

    // 订单编号，碳矩阵关联的订单编号，业务主键
    /**
     * @var string
     */
    public $orderNo;

    // LCA产品评估状态，返回约定的状态编码
    /**
     * @var string
     */
    public $status;

    // 项目摘要信息，包括有关产品详情和报告时间等，JSON格式，按照约定的格式解析成碳矩阵对应的碳足迹项目和产品信息
    /**
     * @var string
     */
    public $projectSummary;

    // 产品工序数据，JSON格式，按照约定的格式解析成碳矩阵对应的工序信息
    /**
     * @var string
     */
    public $processDatum;

    // 碳足迹评估结果数据，JSON格式，按照约定的格式解析成碳矩阵对应的评估结果
    /**
     * @var string
     */
    public $assementResult;

    // 碳足迹评估报告，包括一些报告文件地址等，JSON格式，碳矩阵下载保存对应的报告文件
    /**
     * @var string
     */
    public $assementReport;

    // 扩展信息，JSON格式，预留需提交的数据
    /**
     * @var string
     */
    public $extraDatum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'status'            => 'status',
        'projectSummary'    => 'project_summary',
        'processDatum'      => 'process_datum',
        'assementResult'    => 'assement_result',
        'assementReport'    => 'assement_report',
        'extraDatum'        => 'extra_datum',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->projectSummary) {
            $res['project_summary'] = $this->projectSummary;
        }
        if (null !== $this->processDatum) {
            $res['process_datum'] = $this->processDatum;
        }
        if (null !== $this->assementResult) {
            $res['assement_result'] = $this->assementResult;
        }
        if (null !== $this->assementReport) {
            $res['assement_report'] = $this->assementReport;
        }
        if (null !== $this->extraDatum) {
            $res['extra_datum'] = $this->extraDatum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitEcarLcaassementRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['project_summary'])) {
            $model->projectSummary = $map['project_summary'];
        }
        if (isset($map['process_datum'])) {
            $model->processDatum = $map['process_datum'];
        }
        if (isset($map['assement_result'])) {
            $model->assementResult = $map['assement_result'];
        }
        if (isset($map['assement_report'])) {
            $model->assementReport = $map['assement_report'];
        }
        if (isset($map['extra_datum'])) {
            $model->extraDatum = $map['extra_datum'];
        }

        return $model;
    }
}
