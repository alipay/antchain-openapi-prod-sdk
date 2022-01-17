<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiflowInstVO extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // machine_inst_id
    /**
     * @example machine_inst_id
     *
     * @var string
     */
    public $machineInstId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // service_name
    /**
     * @example service_name
     *
     * @var string
     */
    public $serviceName;

    // service_method
    /**
     * @example service_method
     *
     * @var string
     */
    public $serviceMethod;

    // service_type
    /**
     * @example service_type
     *
     * @var string
     */
    public $serviceType;

    // business_key
    /**
     * @example business_key
     *
     * @var string
     */
    public $businessKey;

    // state_id_compensated_for
    /**
     * @example state_id_compensated_for
     *
     * @var string
     */
    public $stateIdCompensatedFor;

    // state_id_retried_for
    /**
     * @example state_id_retried_for
     *
     * @var string
     */
    public $stateIdRetriedFor;

    // gmt_started
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtStarted;

    // is_for_update
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isForUpdate;

    // input_params
    /**
     * @example input_params
     *
     * @var string
     */
    public $inputParams;

    // output_params
    /**
     * @example output_params
     *
     * @var string
     */
    public $outputParams;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // excep
    /**
     * @example excep
     *
     * @var string
     */
    public $excep;

    // gmt_updated
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtUpdated;

    // gmt_end
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtEnd;
    protected $_name = [
        'id'                    => 'id',
        'machineInstId'         => 'machine_inst_id',
        'name'                  => 'name',
        'type'                  => 'type',
        'serviceName'           => 'service_name',
        'serviceMethod'         => 'service_method',
        'serviceType'           => 'service_type',
        'businessKey'           => 'business_key',
        'stateIdCompensatedFor' => 'state_id_compensated_for',
        'stateIdRetriedFor'     => 'state_id_retried_for',
        'gmtStarted'            => 'gmt_started',
        'isForUpdate'           => 'is_for_update',
        'inputParams'           => 'input_params',
        'outputParams'          => 'output_params',
        'status'                => 'status',
        'excep'                 => 'excep',
        'gmtUpdated'            => 'gmt_updated',
        'gmtEnd'                => 'gmt_end',
    ];

    public function validate()
    {
        Model::validatePattern('gmtStarted', $this->gmtStarted, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtUpdated', $this->gmtUpdated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtEnd', $this->gmtEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->machineInstId) {
            $res['machine_inst_id'] = $this->machineInstId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->serviceMethod) {
            $res['service_method'] = $this->serviceMethod;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->businessKey) {
            $res['business_key'] = $this->businessKey;
        }
        if (null !== $this->stateIdCompensatedFor) {
            $res['state_id_compensated_for'] = $this->stateIdCompensatedFor;
        }
        if (null !== $this->stateIdRetriedFor) {
            $res['state_id_retried_for'] = $this->stateIdRetriedFor;
        }
        if (null !== $this->gmtStarted) {
            $res['gmt_started'] = $this->gmtStarted;
        }
        if (null !== $this->isForUpdate) {
            $res['is_for_update'] = $this->isForUpdate;
        }
        if (null !== $this->inputParams) {
            $res['input_params'] = $this->inputParams;
        }
        if (null !== $this->outputParams) {
            $res['output_params'] = $this->outputParams;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->excep) {
            $res['excep'] = $this->excep;
        }
        if (null !== $this->gmtUpdated) {
            $res['gmt_updated'] = $this->gmtUpdated;
        }
        if (null !== $this->gmtEnd) {
            $res['gmt_end'] = $this->gmtEnd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiflowInstVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['machine_inst_id'])) {
            $model->machineInstId = $map['machine_inst_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['service_method'])) {
            $model->serviceMethod = $map['service_method'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['business_key'])) {
            $model->businessKey = $map['business_key'];
        }
        if (isset($map['state_id_compensated_for'])) {
            $model->stateIdCompensatedFor = $map['state_id_compensated_for'];
        }
        if (isset($map['state_id_retried_for'])) {
            $model->stateIdRetriedFor = $map['state_id_retried_for'];
        }
        if (isset($map['gmt_started'])) {
            $model->gmtStarted = $map['gmt_started'];
        }
        if (isset($map['is_for_update'])) {
            $model->isForUpdate = $map['is_for_update'];
        }
        if (isset($map['input_params'])) {
            $model->inputParams = $map['input_params'];
        }
        if (isset($map['output_params'])) {
            $model->outputParams = $map['output_params'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['excep'])) {
            $model->excep = $map['excep'];
        }
        if (isset($map['gmt_updated'])) {
            $model->gmtUpdated = $map['gmt_updated'];
        }
        if (isset($map['gmt_end'])) {
            $model->gmtEnd = $map['gmt_end'];
        }

        return $model;
    }
}
