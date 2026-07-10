<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ScreenCancelInfo extends Model
{
    // 允许放弃时长（分钟）
    /**
     * @example 10
     *
     * @var int
     */
    public $cancelInMin;

    // 可用放弃次数
    /**
     * @example 1
     *
     * @var int
     */
    public $cancelAttemptLeft;
    protected $_name = [
        'cancelInMin'       => 'cancel_in_min',
        'cancelAttemptLeft' => 'cancel_attempt_left',
    ];

    public function validate()
    {
        Model::validateRequired('cancelInMin', $this->cancelInMin, true);
        Model::validateRequired('cancelAttemptLeft', $this->cancelAttemptLeft, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cancelInMin) {
            $res['cancel_in_min'] = $this->cancelInMin;
        }
        if (null !== $this->cancelAttemptLeft) {
            $res['cancel_attempt_left'] = $this->cancelAttemptLeft;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScreenCancelInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cancel_in_min'])) {
            $model->cancelInMin = $map['cancel_in_min'];
        }
        if (isset($map['cancel_attempt_left'])) {
            $model->cancelAttemptLeft = $map['cancel_attempt_left'];
        }

        return $model;
    }
}
