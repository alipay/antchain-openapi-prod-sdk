<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDigitalassetExchangeEpwholesaleResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 失败账户列表
    /**
     * @var string[]
     */
    public $failList;

    // 失败原因 0:成功 1:执行失败 2:线下配额数量不足
    /**
     * @var int
     */
    public $reason;

    // 成功账户列表
    /**
     * @var string[]
     */
    public $successList;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'failList'    => 'fail_list',
        'reason'      => 'reason',
        'successList' => 'success_list',
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
        if (null !== $this->failList) {
            $res['fail_list'] = $this->failList;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->successList) {
            $res['success_list'] = $this->successList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDigitalassetExchangeEpwholesaleResponse
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
        if (isset($map['fail_list'])) {
            if (!empty($map['fail_list'])) {
                $model->failList = $map['fail_list'];
            }
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['success_list'])) {
            if (!empty($map['success_list'])) {
                $model->successList = $map['success_list'];
            }
        }

        return $model;
    }
}
