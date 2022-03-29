<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmTarget extends Model
{
    // 告警对象标识:
    /**
     * @example 应用名称、主机IP、pod name
     *
     * @var string
     */
    public $targetIdentity;

    // 告警对象类型
    /**
     * @example app、host、pod
     *
     * @var string
     */
    public $targetType;
    protected $_name = [
        'targetIdentity' => 'target_identity',
        'targetType'     => 'target_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->targetIdentity) {
            $res['target_identity'] = $this->targetIdentity;
        }
        if (null !== $this->targetType) {
            $res['target_type'] = $this->targetType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmTarget
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['target_identity'])) {
            $model->targetIdentity = $map['target_identity'];
        }
        if (isset($map['target_type'])) {
            $model->targetType = $map['target_type'];
        }

        return $model;
    }
}
