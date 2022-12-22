<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class ScanHeadInfo extends Model
{
    // 扫描时间
    /**
     * @example 1654570807000
     *
     * @var int
     */
    public $scanTime;

    // 扫码次数
    /**
     * @example 123
     *
     * @var int
     */
    public $scanCount;

    // 扫码地址
    /**
     * @example 1654570807000
     *
     * @var string
     */
    public $scanAddr;
    protected $_name = [
        'scanTime'  => 'scan_time',
        'scanCount' => 'scan_count',
        'scanAddr'  => 'scan_addr',
    ];

    public function validate()
    {
        Model::validateRequired('scanTime', $this->scanTime, true);
        Model::validateRequired('scanCount', $this->scanCount, true);
        Model::validateRequired('scanAddr', $this->scanAddr, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->scanTime) {
            $res['scan_time'] = $this->scanTime;
        }
        if (null !== $this->scanCount) {
            $res['scan_count'] = $this->scanCount;
        }
        if (null !== $this->scanAddr) {
            $res['scan_addr'] = $this->scanAddr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScanHeadInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scan_time'])) {
            $model->scanTime = $map['scan_time'];
        }
        if (isset($map['scan_count'])) {
            $model->scanCount = $map['scan_count'];
        }
        if (isset($map['scan_addr'])) {
            $model->scanAddr = $map['scan_addr'];
        }

        return $model;
    }
}
