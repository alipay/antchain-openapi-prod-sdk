<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class TrackCheckResult extends Model
{
    // 轨迹核验状态code
    /**
     * @example AD
     *
     * @var string
     */
    public $trackCheckStatus;

    // 轨迹核验结果描述
    /**
     * @example 运单验证正常
     *
     * @var string
     */
    public $trackCheckStatusMsg;
    protected $_name = [
        'trackCheckStatus'    => 'track_check_status',
        'trackCheckStatusMsg' => 'track_check_status_msg',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->trackCheckStatus) {
            $res['track_check_status'] = $this->trackCheckStatus;
        }
        if (null !== $this->trackCheckStatusMsg) {
            $res['track_check_status_msg'] = $this->trackCheckStatusMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TrackCheckResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['track_check_status'])) {
            $model->trackCheckStatus = $map['track_check_status'];
        }
        if (isset($map['track_check_status_msg'])) {
            $model->trackCheckStatusMsg = $map['track_check_status_msg'];
        }

        return $model;
    }
}
