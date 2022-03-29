<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAlarmSubDTO extends Model
{
    // 订阅者id
    /**
     * @example 123
     *
     * @var string
     */
    public $subscriber;

    // 订阅者类型
    /**
     * @example ""
     *
     * @var string
     */
    public $subscriberType;

    // 订阅者来源
    /**
     * @example LOCAL, IAM
     *
     * @var string
     */
    public $subscriberSource;

    // 告警对象的名称
    /**
     * @example god
     *
     * @var string
     */
    public $subscriberName;
    protected $_name = [
        'subscriber'       => 'subscriber',
        'subscriberType'   => 'subscriber_type',
        'subscriberSource' => 'subscriber_source',
        'subscriberName'   => 'subscriber_name',
    ];

    public function validate()
    {
        Model::validateRequired('subscriber', $this->subscriber, true);
        Model::validateRequired('subscriberType', $this->subscriberType, true);
        Model::validateRequired('subscriberSource', $this->subscriberSource, true);
        Model::validateRequired('subscriberName', $this->subscriberName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subscriber) {
            $res['subscriber'] = $this->subscriber;
        }
        if (null !== $this->subscriberType) {
            $res['subscriber_type'] = $this->subscriberType;
        }
        if (null !== $this->subscriberSource) {
            $res['subscriber_source'] = $this->subscriberSource;
        }
        if (null !== $this->subscriberName) {
            $res['subscriber_name'] = $this->subscriberName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAlarmSubDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['subscriber'])) {
            $model->subscriber = $map['subscriber'];
        }
        if (isset($map['subscriber_type'])) {
            $model->subscriberType = $map['subscriber_type'];
        }
        if (isset($map['subscriber_source'])) {
            $model->subscriberSource = $map['subscriber_source'];
        }
        if (isset($map['subscriber_name'])) {
            $model->subscriberName = $map['subscriber_name'];
        }

        return $model;
    }
}
