<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class MeteringData extends Model
{
    // endTime
    /**
     * @example endTime
     *
     * @var string
     */
    public $endTime;

    // metering_data_detail_list
    /**
     * @example metering_data_detail_list
     *
     * @var MeteringDataDetail[]
     */
    public $meteringDataDetailList;

    // startTime
    /**
     * @example startTime
     *
     * @var string
     */
    public $startTime;
    protected $_name = [
        'endTime'                => 'end_time',
        'meteringDataDetailList' => 'metering_data_detail_list',
        'startTime'              => 'start_time',
    ];

    public function validate()
    {
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->meteringDataDetailList) {
            $res['metering_data_detail_list'] = [];
            if (null !== $this->meteringDataDetailList && \is_array($this->meteringDataDetailList)) {
                $n = 0;
                foreach ($this->meteringDataDetailList as $item) {
                    $res['metering_data_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MeteringData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['metering_data_detail_list'])) {
            if (!empty($map['metering_data_detail_list'])) {
                $model->meteringDataDetailList = [];
                $n                             = 0;
                foreach ($map['metering_data_detail_list'] as $item) {
                    $model->meteringDataDetailList[$n++] = null !== $item ? MeteringDataDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }

        return $model;
    }
}
