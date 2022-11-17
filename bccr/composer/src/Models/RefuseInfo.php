<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class RefuseInfo extends Model
{
    // 拒绝理由/终止备注
    /**
     * @example 拒绝理由/终止备注
     *
     * @var string
     */
    public $reason;

    // 不予办理决定书路径/终止决定书路径
    /**
     * @example 不予办理决定书路径/终止决定书路径
     *
     * @var string
     */
    public $notificationPath;
    protected $_name = [
        'reason'           => 'reason',
        'notificationPath' => 'notification_path',
    ];

    public function validate()
    {
        Model::validateRequired('reason', $this->reason, true);
        Model::validateRequired('notificationPath', $this->notificationPath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->notificationPath) {
            $res['notification_path'] = $this->notificationPath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefuseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['notification_path'])) {
            $model->notificationPath = $map['notification_path'];
        }

        return $model;
    }
}
