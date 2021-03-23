<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class StatusDrive extends Model
{
    // 起始状态
    /**
     * @example  START
     *
     * @var string
     */
    public $fromStatus;

    // 下一状态
    /**
     * @example  NEXT
     *
     * @var string
     */
    public $toStatus;

    // 驱动上链记录哈希
    /**
     * @example  cbf34bb98ad466a4640f725ce6c53233b83477feb9ef46537a80287b3c244cfd
     *
     * @var string
     */
    public $driveHash;

    // 链上时间戳
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'fromStatus' => 'from_status',
        'toStatus'   => 'to_status',
        'driveHash'  => 'drive_hash',
        'timestamp'  => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('fromStatus', $this->fromStatus, true);
        Model::validateRequired('toStatus', $this->toStatus, true);
        Model::validateRequired('driveHash', $this->driveHash, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fromStatus) {
            $res['from_status'] = $this->fromStatus;
        }
        if (null !== $this->toStatus) {
            $res['to_status'] = $this->toStatus;
        }
        if (null !== $this->driveHash) {
            $res['drive_hash'] = $this->driveHash;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StatusDrive
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['from_status'])) {
            $model->fromStatus = $map['from_status'];
        }
        if (isset($map['to_status'])) {
            $model->toStatus = $map['to_status'];
        }
        if (isset($map['drive_hash'])) {
            $model->driveHash = $map['drive_hash'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
