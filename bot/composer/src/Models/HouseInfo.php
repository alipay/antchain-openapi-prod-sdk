<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class HouseInfo extends Model
{
    // 房源唯一ID
    /**
     * @example a87
     *
     * @var string
     */
    public $houseId;

    // 租赁模式
    /**
     * @example 合租
     *
     * @var string
     */
    public $leaseMode;

    // 面积平方
    /**
     * @example 120㎡
     *
     * @var string
     */
    public $acreage;

    // 房源类型：0住宅、1别墅、
    // 2商铺、3写字楼
    /**
     * @example 0
     *
     * @var int
     */
    public $structure;

    // 房屋地址
    /**
     * @example hz
     *
     * @var string
     */
    public $addr;

    // 门锁设备DID
    /**
     * @example L91923
     *
     * @var string
     */
    public $lockId;

    // 电表设备DID
    /**
     * @example A87345
     *
     * @var string
     */
    public $ammeterId;
    protected $_name = [
        'houseId'   => 'house_id',
        'leaseMode' => 'lease_mode',
        'acreage'   => 'acreage',
        'structure' => 'structure',
        'addr'      => 'addr',
        'lockId'    => 'lock_id',
        'ammeterId' => 'ammeter_id',
    ];

    public function validate()
    {
        Model::validateRequired('houseId', $this->houseId, true);
        Model::validateRequired('structure', $this->structure, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->houseId) {
            $res['house_id'] = $this->houseId;
        }
        if (null !== $this->leaseMode) {
            $res['lease_mode'] = $this->leaseMode;
        }
        if (null !== $this->acreage) {
            $res['acreage'] = $this->acreage;
        }
        if (null !== $this->structure) {
            $res['structure'] = $this->structure;
        }
        if (null !== $this->addr) {
            $res['addr'] = $this->addr;
        }
        if (null !== $this->lockId) {
            $res['lock_id'] = $this->lockId;
        }
        if (null !== $this->ammeterId) {
            $res['ammeter_id'] = $this->ammeterId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HouseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['house_id'])) {
            $model->houseId = $map['house_id'];
        }
        if (isset($map['lease_mode'])) {
            $model->leaseMode = $map['lease_mode'];
        }
        if (isset($map['acreage'])) {
            $model->acreage = $map['acreage'];
        }
        if (isset($map['structure'])) {
            $model->structure = $map['structure'];
        }
        if (isset($map['addr'])) {
            $model->addr = $map['addr'];
        }
        if (isset($map['lock_id'])) {
            $model->lockId = $map['lock_id'];
        }
        if (isset($map['ammeter_id'])) {
            $model->ammeterId = $map['ammeter_id'];
        }

        return $model;
    }
}
