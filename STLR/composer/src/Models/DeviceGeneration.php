<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DeviceGeneration extends Model
{
    // 设备内部编号，注册设备后获取
    /**
     * @example 0340340000000707
     *
     * @var string
     */
    public $deviceNo;

    // 逆变器发电量列表
    /**
     * @example
     *
     * @var InverterGeneration[]
     */
    public $inverterGenerations;
    protected $_name = [
        'deviceNo'            => 'device_no',
        'inverterGenerations' => 'inverter_generations',
    ];

    public function validate()
    {
        Model::validateRequired('deviceNo', $this->deviceNo, true);
        Model::validateRequired('inverterGenerations', $this->inverterGenerations, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceNo) {
            $res['device_no'] = $this->deviceNo;
        }
        if (null !== $this->inverterGenerations) {
            $res['inverter_generations'] = [];
            if (null !== $this->inverterGenerations && \is_array($this->inverterGenerations)) {
                $n = 0;
                foreach ($this->inverterGenerations as $item) {
                    $res['inverter_generations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceGeneration
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_no'])) {
            $model->deviceNo = $map['device_no'];
        }
        if (isset($map['inverter_generations'])) {
            if (!empty($map['inverter_generations'])) {
                $model->inverterGenerations = [];
                $n                          = 0;
                foreach ($map['inverter_generations'] as $item) {
                    $model->inverterGenerations[$n++] = null !== $item ? InverterGeneration::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
