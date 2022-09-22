<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CheckContainerserviceConflictopsResponse extends Model
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

    // 结果
    /**
     * @var bool
     */
    public $result;

    // 冲突的发布单id
    /**
     * @var string
     */
    public $operationId;

    // sidercar工单id
    /**
     * @var string
     */
    public $sidercarPlanId;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'result'         => 'result',
        'operationId'    => 'operation_id',
        'sidercarPlanId' => 'sidercar_plan_id',
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
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->sidercarPlanId) {
            $res['sidercar_plan_id'] = $this->sidercarPlanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckContainerserviceConflictopsResponse
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
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['operation_id'])) {
            $model->operationId = $map['operation_id'];
        }
        if (isset($map['sidercar_plan_id'])) {
            $model->sidercarPlanId = $map['sidercar_plan_id'];
        }

        return $model;
    }
}
