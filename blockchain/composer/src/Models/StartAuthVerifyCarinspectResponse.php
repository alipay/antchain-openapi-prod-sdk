<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVerifyCarinspectResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 年检有效期止。
    /**
     * @var string
     */
    public $inspectionDate;

    // 0：正常   1：逾期未检验  2：无法判断
    /**
     * @var int
     */
    public $status;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'inspectionDate' => 'inspection_date',
        'status'         => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->inspectionDate) {
            $res['inspection_date'] = $this->inspectionDate;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVerifyCarinspectResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['inspection_date'])) {
            $model->inspectionDate = $map['inspection_date'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
