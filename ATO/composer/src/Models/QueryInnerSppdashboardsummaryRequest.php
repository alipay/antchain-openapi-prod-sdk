<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerSppdashboardsummaryRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId' => 'tenant_id',
        'traceId' => 'trace_id',
        'module' => 'module',
        'input' => 'input',
        'rawData' => 'raw_data',
        'date' => 'date',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('module', $this->module, true);
        Model::validateRequired('input', $this->input, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->module) {
            $res['module'] = $this->module;
        }
        if (null !== $this->input) {
            $res['input'] = $this->input;
        }
        if (null !== $this->rawData) {
            $res['raw_data'] = $this->rawData;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerSppdashboardsummaryRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        if(isset($map['module'])){
            $model->module = $map['module'];
        }
        if(isset($map['input'])){
            $model->input = $map['input'];
        }
        if(isset($map['raw_data'])){
            $model->rawData = $map['raw_data'];
        }
        if(isset($map['date'])){
            $model->date = $map['date'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // traceid
    /**
     * @var string
     */
    public $traceId;

    // 目标领域：SCREENING 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
    /**
     * @var string
     */
    public $module;

    // 待总结的输入内容（该领域的指标/观察文本）
    /**
     * @var string
     */
    public $input;

    // 原始数据（补充上下文，可选）
    /**
     * @var string
     */
    public $rawData;

    // 数据日期 yyyyMMdd，仅作上下文/记录
    /**
     * @var string
     */
    public $date;

}
