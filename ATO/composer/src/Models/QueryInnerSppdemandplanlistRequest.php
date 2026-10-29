<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerSppdemandplanlistRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizDate' => 'biz_date',
        'productForm' => 'product_form',
        'auditStatus' => 'audit_status',
        'runStatus' => 'run_status',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'tenantId' => 'tenant_id',
        'traceId' => 'trace_id',
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
        if (null !== $this->bizDate) {
            $res['biz_date'] = $this->bizDate;
        }
        if (null !== $this->productForm) {
            $res['product_form'] = $this->productForm;
        }
        if (null !== $this->auditStatus) {
            $res['audit_status'] = $this->auditStatus;
        }
        if (null !== $this->runStatus) {
            $res['run_status'] = $this->runStatus;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerSppdemandplanlistRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['biz_date'])){
            $model->bizDate = $map['biz_date'];
        }
        if(isset($map['product_form'])){
            $model->productForm = $map['product_form'];
        }
        if(isset($map['audit_status'])){
            $model->auditStatus = $map['audit_status'];
        }
        if(isset($map['run_status'])){
            $model->runStatus = $map['run_status'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
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

    // 业务日期 yyyy-MM-dd；不传不过滤日期
    /**
     * @var string
     */
    public $bizDate;

    // 产品链路APP / WECHAT
    /**
     * @var string
     */
    public $productForm;

    // 审核状态DRAFT / PENDING / APPROVED / REJECTED
    /**
     * @var string
     */
    public $auditStatus;

    // 运营状态PENDING / RUNNING / PAUSED / FINISHED
    /**
     * @var string
     */
    public $runStatus;

    // 页码，默认1，正整数
    /**
     * @var int
     */
    public $pageNo;

    // 每页大小，默认20，1～100；超范围报参数错误
    /**
     * @var int
     */
    public $pageSize;

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

}
