<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class ScanUserInfo extends Model
{
    // 用户昵称
    /**
     * @example 123
     *
     * @var string
     */
    public $nick;

    // 用户ID
    /**
     * @example 1654570807000
     *
     * @var string
     */
    public $userId;

    // 经度
    /**
     * @example 123
     *
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @example 123
     *
     * @var string
     */
    public $latitude;

    // 用户来源
    /**
     * @example alipay
     *
     * @var string
     */
    public $srcType;

    // 扫码时间
    /**
     * @example 1654570807000
     *
     * @var int
     */
    public $scanTime;
    protected $_name = [
        'nick'      => 'nick',
        'userId'    => 'user_id',
        'longitude' => 'longitude',
        'latitude'  => 'latitude',
        'srcType'   => 'src_type',
        'scanTime'  => 'scan_time',
    ];

    public function validate()
    {
        Model::validateRequired('nick', $this->nick, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('longitude', $this->longitude, true);
        Model::validateRequired('latitude', $this->latitude, true);
        Model::validateRequired('srcType', $this->srcType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nick) {
            $res['nick'] = $this->nick;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->srcType) {
            $res['src_type'] = $this->srcType;
        }
        if (null !== $this->scanTime) {
            $res['scan_time'] = $this->scanTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScanUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['nick'])) {
            $model->nick = $map['nick'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['src_type'])) {
            $model->srcType = $map['src_type'];
        }
        if (isset($map['scan_time'])) {
            $model->scanTime = $map['scan_time'];
        }

        return $model;
    }
}
