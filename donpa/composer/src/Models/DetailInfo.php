<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class DetailInfo extends Model
{
    // 修复人
    /**
     * @example
     *
     * @var PersonData
     */
    public $personData;

    // “0”: 修复中，”1":修复失败,”2":修复成功,”3":修复出错
    /**
     * @example “0”: 修复中，”1":修复失败,”2":修复成功,”3":修复出错
     *
     * @var string
     */
    public $repairStatus;

    // 修复结果过期时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $expireTime;

    // 修复结果数
    /**
     * @example 1，2
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'personData'   => 'person_data',
        'repairStatus' => 'repair_status',
        'expireTime'   => 'expire_time',
        'count'        => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('personData', $this->personData, true);
        Model::validateRequired('repairStatus', $this->repairStatus, true);
        Model::validateRequired('expireTime', $this->expireTime, true);
        Model::validateRequired('count', $this->count, true);
        Model::validatePattern('expireTime', $this->expireTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->personData) {
            $res['person_data'] = null !== $this->personData ? $this->personData->toMap() : null;
        }
        if (null !== $this->repairStatus) {
            $res['repair_status'] = $this->repairStatus;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['person_data'])) {
            $model->personData = PersonData::fromMap($map['person_data']);
        }
        if (isset($map['repair_status'])) {
            $model->repairStatus = $map['repair_status'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
