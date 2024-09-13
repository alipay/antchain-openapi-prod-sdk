<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class SmsSendStatus extends Model
{
    // 手机号
    /**
     * @example 132XXXXXXXX
     *
     * @var string
     */
    public $phoneNo;

    // 发送状态
    /**
     * @example WAITING SENDING SUCCESS FAILED
     *
     * @var string
     */
    public $status;

    // 发送状态描述
    /**
     * @example 暂无
     *
     * @var string
     */
    public $detailMsg;
    protected $_name = [
        'phoneNo'   => 'phone_no',
        'status'    => 'status',
        'detailMsg' => 'detail_msg',
    ];

    public function validate()
    {
        Model::validateRequired('phoneNo', $this->phoneNo, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('detailMsg', $this->detailMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phoneNo) {
            $res['phone_no'] = $this->phoneNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->detailMsg) {
            $res['detail_msg'] = $this->detailMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SmsSendStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phone_no'])) {
            $model->phoneNo = $map['phone_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['detail_msg'])) {
            $model->detailMsg = $map['detail_msg'];
        }

        return $model;
    }
}
