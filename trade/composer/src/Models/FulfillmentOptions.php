<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class FulfillmentOptions extends Model
{
    // 是否延迟履约，默认false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $deplay;

    // 实际履约开始时间，默认支付完成时间；只有deplay=true时，start_time才生效
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 跳过SPI回调，默认false，优先级高于商品上默认的接入属性
    /**
     * @example true,false
     *
     * @var bool
     */
    public $spiSkip;
    protected $_name = [
        'deplay'    => 'deplay',
        'startTime' => 'start_time',
        'spiSkip'   => 'spi_skip',
    ];

    public function validate()
    {
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deplay) {
            $res['deplay'] = $this->deplay;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->spiSkip) {
            $res['spi_skip'] = $this->spiSkip;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FulfillmentOptions
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['deplay'])) {
            $model->deplay = $map['deplay'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['spi_skip'])) {
            $model->spiSkip = $map['spi_skip'];
        }

        return $model;
    }
}
