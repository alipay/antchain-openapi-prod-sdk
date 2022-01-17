<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiflowMachineInstVO extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // machine_id
    /**
     * @example machine_id
     *
     * @var string
     */
    public $machineId;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // parent_id
    /**
     * @example parent_id
     *
     * @var string
     */
    public $parentId;

    // gmt_started
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtStarted;

    // business_key
    /**
     * @example business_key
     *
     * @var string
     */
    public $businessKey;

    // start_params
    /**
     * @example start_params
     *
     * @var string
     */
    public $startParams;

    // gmt_end
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtEnd;

    // excep
    /**
     * @example excep
     *
     * @var string
     */
    public $excep;

    // end_params
    /**
     * @example end_params
     *
     * @var string
     */
    public $endParams;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // compensation_status
    /**
     * @example compensation_status
     *
     * @var string
     */
    public $compensationStatus;

    // is_running
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isRunning;

    // gmt_updated
    /**
     * @example
     *
     * @var string
     */
    public $gmtUpdated;
    protected $_name = [
        'id'                 => 'id',
        'machineId'          => 'machine_id',
        'tenantId'           => 'tenant_id',
        'parentId'           => 'parent_id',
        'gmtStarted'         => 'gmt_started',
        'businessKey'        => 'business_key',
        'startParams'        => 'start_params',
        'gmtEnd'             => 'gmt_end',
        'excep'              => 'excep',
        'endParams'          => 'end_params',
        'status'             => 'status',
        'compensationStatus' => 'compensation_status',
        'isRunning'          => 'is_running',
        'gmtUpdated'         => 'gmt_updated',
    ];

    public function validate()
    {
        Model::validatePattern('gmtStarted', $this->gmtStarted, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtEnd', $this->gmtEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtUpdated', $this->gmtUpdated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->machineId) {
            $res['machine_id'] = $this->machineId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->gmtStarted) {
            $res['gmt_started'] = $this->gmtStarted;
        }
        if (null !== $this->businessKey) {
            $res['business_key'] = $this->businessKey;
        }
        if (null !== $this->startParams) {
            $res['start_params'] = $this->startParams;
        }
        if (null !== $this->gmtEnd) {
            $res['gmt_end'] = $this->gmtEnd;
        }
        if (null !== $this->excep) {
            $res['excep'] = $this->excep;
        }
        if (null !== $this->endParams) {
            $res['end_params'] = $this->endParams;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->compensationStatus) {
            $res['compensation_status'] = $this->compensationStatus;
        }
        if (null !== $this->isRunning) {
            $res['is_running'] = $this->isRunning;
        }
        if (null !== $this->gmtUpdated) {
            $res['gmt_updated'] = $this->gmtUpdated;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiflowMachineInstVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['machine_id'])) {
            $model->machineId = $map['machine_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['gmt_started'])) {
            $model->gmtStarted = $map['gmt_started'];
        }
        if (isset($map['business_key'])) {
            $model->businessKey = $map['business_key'];
        }
        if (isset($map['start_params'])) {
            $model->startParams = $map['start_params'];
        }
        if (isset($map['gmt_end'])) {
            $model->gmtEnd = $map['gmt_end'];
        }
        if (isset($map['excep'])) {
            $model->excep = $map['excep'];
        }
        if (isset($map['end_params'])) {
            $model->endParams = $map['end_params'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['compensation_status'])) {
            $model->compensationStatus = $map['compensation_status'];
        }
        if (isset($map['is_running'])) {
            $model->isRunning = $map['is_running'];
        }
        if (isset($map['gmt_updated'])) {
            $model->gmtUpdated = $map['gmt_updated'];
        }

        return $model;
    }
}
