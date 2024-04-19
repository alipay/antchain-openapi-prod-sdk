<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class InverterGeneration extends Model
{
    // 逆变器SN
    /**
     * @example Inv-Other-16801-Q0kll-2024-04-11
     *
     * @var string
     */
    public $invSn;

    // 生产商名称
    /**
     * @example 生产商1
     *
     * @var string
     */
    public $manufacturer;

    // 当日发电量，最多3位小数
    /**
     * @example 1.232
     *
     * @var string
     */
    public $daily;

    // 累计发电量，最多3位小数
    /**
     * @example 1.232
     *
     * @var string
     */
    public $total;
    protected $_name = [
        'invSn'        => 'inv_sn',
        'manufacturer' => 'manufacturer',
        'daily'        => 'daily',
        'total'        => 'total',
    ];

    public function validate()
    {
        Model::validateRequired('invSn', $this->invSn, true);
        Model::validateRequired('manufacturer', $this->manufacturer, true);
        Model::validateRequired('daily', $this->daily, true);
        Model::validateRequired('total', $this->total, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->invSn) {
            $res['inv_sn'] = $this->invSn;
        }
        if (null !== $this->manufacturer) {
            $res['manufacturer'] = $this->manufacturer;
        }
        if (null !== $this->daily) {
            $res['daily'] = $this->daily;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InverterGeneration
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['inv_sn'])) {
            $model->invSn = $map['inv_sn'];
        }
        if (isset($map['manufacturer'])) {
            $model->manufacturer = $map['manufacturer'];
        }
        if (isset($map['daily'])) {
            $model->daily = $map['daily'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
