<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDistributionFundPromoterflowResponse extends Model
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

    // 流水信息列表
    /**
     * @var CapitalInfo[]
     */
    public $capitalFlows;

    // 分页号
    /**
     * @var int
     */
    public $pageNum;

    // 分页显示条数
    /**
     * @var int
     */
    public $pageSize;

    // 总数量
    /**
     * @var string
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'capitalFlows' => 'capital_flows',
        'pageNum'      => 'page_num',
        'pageSize'     => 'page_size',
        'totalCount'   => 'total_count',
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
        if (null !== $this->capitalFlows) {
            $res['capital_flows'] = [];
            if (null !== $this->capitalFlows && \is_array($this->capitalFlows)) {
                $n = 0;
                foreach ($this->capitalFlows as $item) {
                    $res['capital_flows'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDistributionFundPromoterflowResponse
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
        if (isset($map['capital_flows'])) {
            if (!empty($map['capital_flows'])) {
                $model->capitalFlows = [];
                $n                   = 0;
                foreach ($map['capital_flows'] as $item) {
                    $model->capitalFlows[$n++] = null !== $item ? CapitalInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
