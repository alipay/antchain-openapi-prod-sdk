<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ContainerInfo extends Model
{
    // 订舱单唯一标识
    /**
     * @example 暂无
     *
     * @var string
     */
    public $bookingNo;

    // 集装箱唯一标识
    /**
     * @example 暂无
     *
     * @var string
     */
    public $containerId;

    // 箱号
    /**
     * @example 暂无
     *
     * @var string
     */
    public $containerNo;

    // 箱型
    /**
     * @example 暂无
     *
     * @var string
     */
    public $containerType;
    protected $_name = [
        'bookingNo'     => 'booking_no',
        'containerId'   => 'container_id',
        'containerNo'   => 'container_no',
        'containerType' => 'container_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->containerNo) {
            $res['container_no'] = $this->containerNo;
        }
        if (null !== $this->containerType) {
            $res['container_type'] = $this->containerType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['booking_no'])) {
            $model->bookingNo = $map['booking_no'];
        }
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }
        if (isset($map['container_no'])) {
            $model->containerNo = $map['container_no'];
        }
        if (isset($map['container_type'])) {
            $model->containerType = $map['container_type'];
        }

        return $model;
    }
}
