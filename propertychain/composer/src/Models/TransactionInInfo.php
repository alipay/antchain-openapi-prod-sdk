<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TransactionInInfo extends Model
{
    // 入库信息表ID
    /**
     * @example 21431231
     *
     * @var int
     */
    public $id;

    // 仓库Did
    /**
     * @example 1231231
     *
     * @var string
     */
    public $warehouseDid;

    // 仓库名称
    /**
     * @example warehouseName
     *
     * @var string
     */
    public $warehouseName;

    // 库位Did
    /**
     * @example locationDid
     *
     * @var string
     */
    public $locationDid;

    // 库位名称
    /**
     * @example locationName
     *
     * @var string
     */
    public $locationName;

    // 设备Did
    /**
     * @example deviceDid
     *
     * @var string
     */
    public $deviceDid;

    // 设备名称
    /**
     * @example deviceName
     *
     * @var string
     */
    public $deviceName;

    // 开始时间，单位：s
    /**
     * @example 213123123
     *
     * @var int
     */
    public $startTime;

    // 结束时间, 单位：s
    /**
     * @example 312312313
     *
     * @var int
     */
    public $endTime;

    // 入库视频信息url
    /**
     * @example videoUrl
     *
     * @var string
     */
    public $videoUrl;

    // 存证交易hash
    /**
     * @example txHash
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'id'            => 'id',
        'warehouseDid'  => 'warehouse_did',
        'warehouseName' => 'warehouse_name',
        'locationDid'   => 'location_did',
        'locationName'  => 'location_name',
        'deviceDid'     => 'device_did',
        'deviceName'    => 'device_name',
        'startTime'     => 'start_time',
        'endTime'       => 'end_time',
        'videoUrl'      => 'video_url',
        'txHash'        => 'tx_hash',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->warehouseDid) {
            $res['warehouse_did'] = $this->warehouseDid;
        }
        if (null !== $this->warehouseName) {
            $res['warehouse_name'] = $this->warehouseName;
        }
        if (null !== $this->locationDid) {
            $res['location_did'] = $this->locationDid;
        }
        if (null !== $this->locationName) {
            $res['location_name'] = $this->locationName;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionInInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['warehouse_did'])) {
            $model->warehouseDid = $map['warehouse_did'];
        }
        if (isset($map['warehouse_name'])) {
            $model->warehouseName = $map['warehouse_name'];
        }
        if (isset($map['location_did'])) {
            $model->locationDid = $map['location_did'];
        }
        if (isset($map['location_name'])) {
            $model->locationName = $map['location_name'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['video_url'])) {
            $model->videoUrl = $map['video_url'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
