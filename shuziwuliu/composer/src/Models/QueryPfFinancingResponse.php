<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryPfFinancingResponse extends Model
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

    // 支用Id
    /**
     * @var string
     */
    public $financingId;

    // 状态，说明如下：
    // 融资申请失败 IN_VALID;
    // 融资申请失败 F_APPLY_FAIL;
    // 融资申请成功 F_APPLY_SUC;
    // 融资申请成功 COMMIT;
    // 融资核验中 VERIFYING;
    // 融资核验失败 VERIFY_FAILURE;
    // 融资订单生成成功 P_WITHDRAW;
    // 融资成功 A_WITHDRAW;
    // 融资失败 EXPIRED
    /**
     * @var string
     */
    public $status;

    // 描述
    /**
     * @var string
     */
    public $desc;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'financingId' => 'financing_id',
        'status'      => 'status',
        'desc'        => 'desc',
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
        if (null !== $this->financingId) {
            $res['financing_id'] = $this->financingId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPfFinancingResponse
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
        if (isset($map['financing_id'])) {
            $model->financingId = $map['financing_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
