<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class MasterBlBookingParam extends Model
{
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @example 暂无
     *
     * @var string
     */
    public $action;

    // 订舱单号
    /**
     * @example 暂无
     *
     * @var string
     */
    public $bookingNo;
    protected $_name = [
        'action'    => 'action',
        'bookingNo' => 'booking_no',
    ];

    public function validate()
    {
        Model::validateRequired('bookingNo', $this->bookingNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MasterBlBookingParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['booking_no'])) {
            $model->bookingNo = $map['booking_no'];
        }

        return $model;
    }
}
