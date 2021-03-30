<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class BookingNoInfo extends Model
{
    // 订舱单唯一标识
    /**
     * @example 暂无
     *
     * @var string
     */
    public $bookingNo;

    // 订舱号
    /**
     * @example 暂无
     *
     * @var string
     */
    public $bkgNo;
    protected $_name = [
        'bookingNo' => 'booking_no',
        'bkgNo'     => 'bkg_no',
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
        if (null !== $this->bkgNo) {
            $res['bkg_no'] = $this->bkgNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BookingNoInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['booking_no'])) {
            $model->bookingNo = $map['booking_no'];
        }
        if (isset($map['bkg_no'])) {
            $model->bkgNo = $map['bkg_no'];
        }

        return $model;
    }
}
