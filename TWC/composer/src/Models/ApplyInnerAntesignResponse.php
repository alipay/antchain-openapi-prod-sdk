<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyInnerAntesignResponse extends Model
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

    // 用印流程受理流水号
    /**
     * @var string
     */
    public $signFlowId;

    // 业务流水号
    /**
     * @var string
     */
    public $bizNo;

    // 子任务信息
    /**
     * @var SubAntSignResult[]
     */
    public $subAntSignResultList;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'signFlowId'           => 'sign_flow_id',
        'bizNo'                => 'biz_no',
        'subAntSignResultList' => 'sub_ant_sign_result_list',
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
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->subAntSignResultList) {
            $res['sub_ant_sign_result_list'] = [];
            if (null !== $this->subAntSignResultList && \is_array($this->subAntSignResultList)) {
                $n = 0;
                foreach ($this->subAntSignResultList as $item) {
                    $res['sub_ant_sign_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInnerAntesignResponse
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
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['sub_ant_sign_result_list'])) {
            if (!empty($map['sub_ant_sign_result_list'])) {
                $model->subAntSignResultList = [];
                $n                           = 0;
                foreach ($map['sub_ant_sign_result_list'] as $item) {
                    $model->subAntSignResultList[$n++] = null !== $item ? SubAntSignResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
