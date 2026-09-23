<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerSppdashboardreasoningRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId' => 'tenant_id',
        'traceId' => 'trace_id',
        'date' => 'date',
        'module' => 'module',
        'sinceTime' => 'since_time',
    ];
    public function validate() {
        Model::validateRequired('module', $this->module, true);
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
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->module) {
            $res['module'] = $this->module;
        }
        if (null !== $this->sinceTime) {
            $res['since_time'] = $this->sinceTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerSppdashboardreasoningRequest
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
        if(isset($map['date'])){
            $model->date = $map['date'];
        }
        if(isset($map['module'])){
            $model->module = $map['module'];
        }
        if(isset($map['since_time'])){
            $model->sinceTime = $map['since_time'];
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

    // 数据日期 yyyyMMdd
    /**
     * @var string
     */
    public $date;

    // 目标领域：SCREENING 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
    /**
     * @var string
     */
    public $module;

    // 增量游标(毫秒)；<=0 返回最近 6 条
    /**
     * @var string
     */
    public $sinceTime;

}
