<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class QueryAntsaasStaffingcContractCaResponse extends Model
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

    // 签署流程ID
    /**
     * @var string
     */
    public $signFlowId;

    // 签署流程状态
    /**
     * @var string
     */
    public $status;

    // 业务流水号
    /**
     * @var string
     */
    public $bizNo;

    // 签署任务结果列表
    /**
     * @var CaSignTaskResult[]
     */
    public $antSignTaskResultList;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'signFlowId'            => 'sign_flow_id',
        'status'                => 'status',
        'bizNo'                 => 'biz_no',
        'antSignTaskResultList' => 'ant_sign_task_result_list',
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
        if (null !== $this->signFlowId) {
            $res['sign_flow_id'] = $this->signFlowId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->antSignTaskResultList) {
            $res['ant_sign_task_result_list'] = [];
            if (null !== $this->antSignTaskResultList && \is_array($this->antSignTaskResultList)) {
                $n = 0;
                foreach ($this->antSignTaskResultList as $item) {
                    $res['ant_sign_task_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntsaasStaffingcContractCaResponse
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
        if (isset($map['sign_flow_id'])) {
            $model->signFlowId = $map['sign_flow_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['ant_sign_task_result_list'])) {
            if (!empty($map['ant_sign_task_result_list'])) {
                $model->antSignTaskResultList = [];
                $n                            = 0;
                foreach ($map['ant_sign_task_result_list'] as $item) {
                    $model->antSignTaskResultList[$n++] = null !== $item ? CaSignTaskResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
