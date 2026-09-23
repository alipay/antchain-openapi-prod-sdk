<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerSppdashboarddistributionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId' => 'tenant_id',
        'traceId' => 'trace_id',
        'date' => 'date',
        'sinceTime' => 'since_time',
        'logLimit' => 'log_limit',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('traceId', $this->traceId, true);
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
        if (null !== $this->sinceTime) {
            $res['since_time'] = $this->sinceTime;
        }
        if (null !== $this->logLimit) {
            $res['log_limit'] = $this->logLimit;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerSppdashboarddistributionRequest
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
        if(isset($map['since_time'])){
            $model->sinceTime = $map['since_time'];
        }
        if(isset($map['log_limit'])){
            $model->logLimit = $map['log_limit'];
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

    // 进件日志增量游标（毫秒）；<=0 返回当日最新 logLimit 条
    /**
     * @var int
     */
    public $sinceTime;

    // 日志返回条数（最新 logLimit 条，按时间倒序），上限 50
    /**
     * @var int
     */
    public $logLimit;

}
