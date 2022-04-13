<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeploymentCondition extends Model
{
    // Last time the condition transitioned from one status to another.
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastTransitionTime;

    // The last time this condition was updated.
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastUpdateTime;

    // A human readable message indicating details about the transition.
    //
    /**
     * @example message
     *
     * @var string
     */
    public $message;

    // The reason for the condition_s last transition.
    //
    /**
     * @example reason
     *
     * @var string
     */
    public $reason;

    // Status of the condition, one of True, False, Unknown.
    //
    /**
     * @example True, False, Unknown.
     *
     * @var string
     */
    public $status;

    // Type of deployment condition.
    //
    /**
     * @example type
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'lastTransitionTime' => 'last_transition_time',
        'lastUpdateTime'     => 'last_update_time',
        'message'            => 'message',
        'reason'             => 'reason',
        'status'             => 'status',
        'type'               => 'type',
    ];

    public function validate()
    {
        Model::validatePattern('lastTransitionTime', $this->lastTransitionTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('lastUpdateTime', $this->lastUpdateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->lastTransitionTime) {
            $res['last_transition_time'] = $this->lastTransitionTime;
        }
        if (null !== $this->lastUpdateTime) {
            $res['last_update_time'] = $this->lastUpdateTime;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeploymentCondition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['last_transition_time'])) {
            $model->lastTransitionTime = $map['last_transition_time'];
        }
        if (isset($map['last_update_time'])) {
            $model->lastUpdateTime = $map['last_update_time'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
