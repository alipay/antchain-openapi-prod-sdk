<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DistributeDataPackage extends Model
{
    // 原始数据
    /**
     * @example
     *
     * @var RawData[]
     */
    public $dataList;

    // 发行设备Id
    /**
     * @example 244
     *
     * @var string
     */
    public $distributeDeviceId;

    // 打包时间
    /**
     * @example
     *
     * @var int
     */
    public $packageTime;
    protected $_name = [
        'dataList'           => 'data_list',
        'distributeDeviceId' => 'distribute_device_id',
        'packageTime'        => 'package_time',
    ];

    public function validate()
    {
        Model::validateRequired('dataList', $this->dataList, true);
        Model::validateRequired('distributeDeviceId', $this->distributeDeviceId, true);
        Model::validateRequired('packageTime', $this->packageTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataList) {
            $res['data_list'] = [];
            if (null !== $this->dataList && \is_array($this->dataList)) {
                $n = 0;
                foreach ($this->dataList as $item) {
                    $res['data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->distributeDeviceId) {
            $res['distribute_device_id'] = $this->distributeDeviceId;
        }
        if (null !== $this->packageTime) {
            $res['package_time'] = $this->packageTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DistributeDataPackage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_list'])) {
            if (!empty($map['data_list'])) {
                $model->dataList = [];
                $n               = 0;
                foreach ($map['data_list'] as $item) {
                    $model->dataList[$n++] = null !== $item ? RawData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['distribute_device_id'])) {
            $model->distributeDeviceId = $map['distribute_device_id'];
        }
        if (isset($map['package_time'])) {
            $model->packageTime = $map['package_time'];
        }

        return $model;
    }
}
