<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceOverViewResponse extends Model
{
    // 设备品类名称
    /**
     * @example test_category
     *
     * @var string
     */
    public $deviceCategoryName;

    // 设备总数
    /**
     * @example 2000
     *
     * @var int
     */
    public $deviceTotal;
    protected $_name = [
        'deviceCategoryName' => 'device_category_name',
        'deviceTotal'        => 'device_total',
    ];

    public function validate()
    {
        Model::validateRequired('deviceCategoryName', $this->deviceCategoryName, true);
        Model::validateRequired('deviceTotal', $this->deviceTotal, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceCategoryName) {
            $res['device_category_name'] = $this->deviceCategoryName;
        }
        if (null !== $this->deviceTotal) {
            $res['device_total'] = $this->deviceTotal;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceOverViewResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_category_name'])) {
            $model->deviceCategoryName = $map['device_category_name'];
        }
        if (isset($map['device_total'])) {
            $model->deviceTotal = $map['device_total'];
        }

        return $model;
    }
}
