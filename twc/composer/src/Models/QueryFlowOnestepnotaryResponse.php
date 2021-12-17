<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryFlowOnestepnotaryResponse extends Model
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

    // 存证全流程状态，FINISH(完结)、PROCESSING(上链中)、DISABLE(失效)、FAILED(失败)
    /**
     * @var string
     */
    public $status;

    // 阶段存证查询结果列表
    /**
     * @var PhaseQueryResult[]
     */
    public $phaseQueryResultList;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'status'               => 'status',
        'phaseQueryResultList' => 'phase_query_result_list',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->phaseQueryResultList) {
            $res['phase_query_result_list'] = [];
            if (null !== $this->phaseQueryResultList && \is_array($this->phaseQueryResultList)) {
                $n = 0;
                foreach ($this->phaseQueryResultList as $item) {
                    $res['phase_query_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFlowOnestepnotaryResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['phase_query_result_list'])) {
            if (!empty($map['phase_query_result_list'])) {
                $model->phaseQueryResultList = [];
                $n                           = 0;
                foreach ($map['phase_query_result_list'] as $item) {
                    $model->phaseQueryResultList[$n++] = null !== $item ? PhaseQueryResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
