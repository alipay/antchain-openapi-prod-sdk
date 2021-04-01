<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeScannedInfo extends Model
{
    // 扫码用户的ID
    /**
     * @example 2d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $userId;

    // 扫码用户的名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $userName;

    // 扫码用户的手机号
    /**
     * @example 13291887615
     *
     * @var string
     */
    public $phoneNumber;

    // 扫码用户的位置信息
    /**
     * @example 浙江省杭州市西湖区
     *
     * @var string
     */
    public $gps;

    // 扫码的时间(毫秒时间戳)
    /**
     * @example 713471745
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'userId'      => 'user_id',
        'userName'    => 'user_name',
        'phoneNumber' => 'phone_number',
        'gps'         => 'gps',
        'timestamp'   => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->gps) {
            $res['gps'] = $this->gps;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeScannedInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['gps'])) {
            $model->gps = $map['gps'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
