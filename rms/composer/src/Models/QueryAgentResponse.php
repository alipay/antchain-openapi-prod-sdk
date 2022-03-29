<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAgentResponse extends Model
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

    // agent 实例列表
    /**
     * @var AgentInstance[]
     */
    public $agentInstances;

    // agent 实例总数
    /**
     * @var int
     */
    public $totalCount;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'agentInstances' => 'agent_instances',
        'totalCount'     => 'total_count',
        'pageSize'       => 'page_size',
        'currentPage'    => 'current_page',
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
        if (null !== $this->agentInstances) {
            $res['agent_instances'] = [];
            if (null !== $this->agentInstances && \is_array($this->agentInstances)) {
                $n = 0;
                foreach ($this->agentInstances as $item) {
                    $res['agent_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAgentResponse
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
        if (isset($map['agent_instances'])) {
            if (!empty($map['agent_instances'])) {
                $model->agentInstances = [];
                $n                     = 0;
                foreach ($map['agent_instances'] as $item) {
                    $model->agentInstances[$n++] = null !== $item ? AgentInstance::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }

        return $model;
    }
}
