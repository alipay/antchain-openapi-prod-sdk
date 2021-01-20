<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryOperationlogTimelineRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'customerId' => 'customer_id',
        'gmtFrom' => 'gmt_from',
        'gmtTo' => 'gmt_to',
        'module' => 'module',
        'operationStatus' => 'operation_status',
        'operationTarget' => 'operation_target',
        'operationType' => 'operation_type',
        'operatorId' => 'operator_id',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'status' => 'status',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validatePattern('gmtFrom', $this->gmtFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtTo', $this->gmtTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->gmtFrom) {
            $res['gmt_from'] = $this->gmtFrom;
        }
        if (null !== $this->gmtTo) {
            $res['gmt_to'] = $this->gmtTo;
        }
        if (null !== $this->module) {
            $res['module'] = $this->module;
        }
        if (null !== $this->operationStatus) {
            $res['operation_status'] = $this->operationStatus;
        }
        if (null !== $this->operationTarget) {
            $res['operation_target'] = $this->operationTarget;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOperationlogTimelineRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['customer_id'])){
            $model->customerId = $map['customer_id'];
        }
        if(isset($map['gmt_from'])){
            $model->gmtFrom = $map['gmt_from'];
        }
        if(isset($map['gmt_to'])){
            $model->gmtTo = $map['gmt_to'];
        }
        if(isset($map['module'])){
            $model->module = $map['module'];
        }
        if(isset($map['operation_status'])){
            $model->operationStatus = $map['operation_status'];
        }
        if(isset($map['operation_target'])){
            $model->operationTarget = $map['operation_target'];
        }
        if(isset($map['operation_type'])){
            $model->operationType = $map['operation_type'];
        }
        if(isset($map['operator_id'])){
            $model->operatorId = $map['operator_id'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // customer_id
    /**
     * @var string
     */
    public $customerId;

    // gmt_from
    /**
     * @var string
     */
    public $gmtFrom;

    // gmt_to
    /**
     * @var string
     */
    public $gmtTo;

    // module
    /**
     * @var string
     */
    public $module;

    // operation_status
    /**
     * @var string
     */
    public $operationStatus;

    // operation_target
    /**
     * @var string
     */
    public $operationTarget;

    // operation_type
    /**
     * @var string
     */
    public $operationType;

    // operator_id
    /**
     * @var string
     */
    public $operatorId;

    // page_no
    /**
     * @var int
     */
    public $pageNo;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // status
    /**
     * @var string
     */
    public $status;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
