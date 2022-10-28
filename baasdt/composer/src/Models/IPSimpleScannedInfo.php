<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPSimpleScannedInfo extends Model
{
    // 扫码人
    /**
     * @example 小王
     *
     * @var string
     */
    public $userName;

    // 扫码时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $scannedTime;

    // 扫码地址
    /**
     * @example 浙江省杭州市滨江区
     *
     * @var string
     */
    public $gps;

    // 外部自定义账号
    /**
     * @example user
     *
     * @var string
     */
    public $externalUserId;
    protected $_name = [
        'userName'       => 'user_name',
        'scannedTime'    => 'scanned_time',
        'gps'            => 'gps',
        'externalUserId' => 'external_user_id',
    ];

    public function validate()
    {
        Model::validatePattern('scannedTime', $this->scannedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->scannedTime) {
            $res['scanned_time'] = $this->scannedTime;
        }
        if (null !== $this->gps) {
            $res['gps'] = $this->gps;
        }
        if (null !== $this->externalUserId) {
            $res['external_user_id'] = $this->externalUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPSimpleScannedInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['scanned_time'])) {
            $model->scannedTime = $map['scanned_time'];
        }
        if (isset($map['gps'])) {
            $model->gps = $map['gps'];
        }
        if (isset($map['external_user_id'])) {
            $model->externalUserId = $map['external_user_id'];
        }

        return $model;
    }
}
