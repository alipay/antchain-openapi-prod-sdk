<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class AccountSmsSendStatus extends Model
{
    // ⼿机号
    /**
     * @example 132XXXXXXXX
     *
     * @var string
     */
    public $phoneNo;

    // 批次号
    /**
     * @example 202409050005000000019020
     *
     * @var string
     */
    public $batchTaskId;

    // 发送状态
    // SUCCESS：发送成
    // 功；
    // FAILED：发送失败；
    /**
     * @example SUCCESS
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
        'phoneNo'     => 'phone_no',
        'batchTaskId' => 'batch_task_id',
        'status'      => 'status',
        'detailMsg'   => 'detail_msg',
    ];

    public function validate()
    {
        Model::validateRequired('phoneNo', $this->phoneNo, true);
        Model::validateRequired('batchTaskId', $this->batchTaskId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('detailMsg', $this->detailMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phoneNo) {
            $res['phone_no'] = $this->phoneNo;
        }
        if (null !== $this->batchTaskId) {
            $res['batch_task_id'] = $this->batchTaskId;
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
     * @return AccountSmsSendStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phone_no'])) {
            $model->phoneNo = $map['phone_no'];
        }
        if (isset($map['batch_task_id'])) {
            $model->batchTaskId = $map['batch_task_id'];
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
