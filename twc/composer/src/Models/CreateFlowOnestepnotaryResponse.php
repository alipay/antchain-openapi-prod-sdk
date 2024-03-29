<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateFlowOnestepnotaryResponse extends Model
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

    // 返回流程ID，全局唯一
    /**
     * @var string
     */
    public $flowId;

    // 阶段存证结果列表
    /**
     * @var PhaseCreateResult[]
     */
    public $phaseCreateResultList;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'flowId'                => 'flow_id',
        'phaseCreateResultList' => 'phase_create_result_list',
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->phaseCreateResultList) {
            $res['phase_create_result_list'] = [];
            if (null !== $this->phaseCreateResultList && \is_array($this->phaseCreateResultList)) {
                $n = 0;
                foreach ($this->phaseCreateResultList as $item) {
                    $res['phase_create_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFlowOnestepnotaryResponse
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['phase_create_result_list'])) {
            if (!empty($map['phase_create_result_list'])) {
                $model->phaseCreateResultList = [];
                $n                            = 0;
                foreach ($map['phase_create_result_list'] as $item) {
                    $model->phaseCreateResultList[$n++] = null !== $item ? PhaseCreateResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
