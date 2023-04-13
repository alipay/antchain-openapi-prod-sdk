<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class FlowInstanceStatus extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $spaceId;

    /**
     * @example
     *
     * @var string
     */
    public $flowId;

    /**
     * @example
     *
     * @var string
     */
    public $instanceId;

    /**
     * @example true, false
     *
     * @var bool
     */
    public $consentOn;

    /**
     * @example
     *
     * @var bool
     */
    public $autoStart;

    /**
     * @example
     *
     * @var string
     */
    public $staticParameters;

    /**
     * @example
     *
     * @var string
     */
    public $dynamicParameters;

    /**
     * @example
     *
     * @var int
     */
    public $totalComponents;

    /**
     * @example
     *
     * @var int
     */
    public $completedComponents;

    // fair错误码
    /**
     * @example "FC0000011000"
     *
     * @var string
     */
    public $errorCode;

    // Fair错误信息
    /**
     * @example ""
     *
     * @var string
     */
    public $errorMessage;

    // 工作流实力执行的状态码
    /**
     * @example "INSTANCE_COMPLETED"
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'spaceId'             => 'space_id',
        'flowId'              => 'flow_id',
        'instanceId'          => 'instance_id',
        'consentOn'           => 'consent_on',
        'autoStart'           => 'auto_start',
        'staticParameters'    => 'static_parameters',
        'dynamicParameters'   => 'dynamic_parameters',
        'totalComponents'     => 'total_components',
        'completedComponents' => 'completed_components',
        'errorCode'           => 'error_code',
        'errorMessage'        => 'error_message',
        'status'              => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('consentOn', $this->consentOn, true);
        Model::validateRequired('autoStart', $this->autoStart, true);
        Model::validateRequired('staticParameters', $this->staticParameters, true);
        Model::validateRequired('dynamicParameters', $this->dynamicParameters, true);
        Model::validateRequired('totalComponents', $this->totalComponents, true);
        Model::validateRequired('completedComponents', $this->completedComponents, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->consentOn) {
            $res['consent_on'] = $this->consentOn;
        }
        if (null !== $this->autoStart) {
            $res['auto_start'] = $this->autoStart;
        }
        if (null !== $this->staticParameters) {
            $res['static_parameters'] = $this->staticParameters;
        }
        if (null !== $this->dynamicParameters) {
            $res['dynamic_parameters'] = $this->dynamicParameters;
        }
        if (null !== $this->totalComponents) {
            $res['total_components'] = $this->totalComponents;
        }
        if (null !== $this->completedComponents) {
            $res['completed_components'] = $this->completedComponents;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FlowInstanceStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['consent_on'])) {
            $model->consentOn = $map['consent_on'];
        }
        if (isset($map['auto_start'])) {
            $model->autoStart = $map['auto_start'];
        }
        if (isset($map['static_parameters'])) {
            $model->staticParameters = $map['static_parameters'];
        }
        if (isset($map['dynamic_parameters'])) {
            $model->dynamicParameters = $map['dynamic_parameters'];
        }
        if (isset($map['total_components'])) {
            $model->totalComponents = $map['total_components'];
        }
        if (isset($map['completed_components'])) {
            $model->completedComponents = $map['completed_components'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
