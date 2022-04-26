<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class MetricInfo extends Model
{
    // 实际计收金额，单位：分。如传100，即为100分，1元
    /**
     * @example 100
     *
     * @var int
     */
    public $collectAmount;

    // 计收受理时间
    /**
     * @example 2022-04-15 17:05:37
     *
     * @var string
     */
    public $collectTime;

    // 计收的订单流水号
    /**
     * @example 12345678
     *
     * @var string
     */
    public $collectSerialNumber;
    protected $_name = [
        'collectAmount'       => 'collect_amount',
        'collectTime'         => 'collect_time',
        'collectSerialNumber' => 'collect_serial_number',
    ];

    public function validate()
    {
        Model::validateRequired('collectAmount', $this->collectAmount, true);
        Model::validateRequired('collectTime', $this->collectTime, true);
        Model::validateRequired('collectSerialNumber', $this->collectSerialNumber, true);
        Model::validatePattern('collectTime', $this->collectTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->collectAmount) {
            $res['collect_amount'] = $this->collectAmount;
        }
        if (null !== $this->collectTime) {
            $res['collect_time'] = $this->collectTime;
        }
        if (null !== $this->collectSerialNumber) {
            $res['collect_serial_number'] = $this->collectSerialNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MetricInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['collect_amount'])) {
            $model->collectAmount = $map['collect_amount'];
        }
        if (isset($map['collect_time'])) {
            $model->collectTime = $map['collect_time'];
        }
        if (isset($map['collect_serial_number'])) {
            $model->collectSerialNumber = $map['collect_serial_number'];
        }

        return $model;
    }
}
