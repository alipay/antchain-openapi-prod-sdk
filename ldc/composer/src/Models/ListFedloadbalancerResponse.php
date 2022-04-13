<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListFedloadbalancerResponse extends Model
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

    // 联邦负载均衡实例列表
    /**
     * @var FedLoadBalancer[]
     */
    public $fedLoadbalancerList;

    // 查询到的联邦负载均衡实例总数
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'fedLoadbalancerList' => 'fed_loadbalancer_list',
        'totalCount'          => 'total_count',
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
        if (null !== $this->fedLoadbalancerList) {
            $res['fed_loadbalancer_list'] = [];
            if (null !== $this->fedLoadbalancerList && \is_array($this->fedLoadbalancerList)) {
                $n = 0;
                foreach ($this->fedLoadbalancerList as $item) {
                    $res['fed_loadbalancer_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListFedloadbalancerResponse
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
        if (isset($map['fed_loadbalancer_list'])) {
            if (!empty($map['fed_loadbalancer_list'])) {
                $model->fedLoadbalancerList = [];
                $n                          = 0;
                foreach ($map['fed_loadbalancer_list'] as $item) {
                    $model->fedLoadbalancerList[$n++] = null !== $item ? FedLoadBalancer::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
