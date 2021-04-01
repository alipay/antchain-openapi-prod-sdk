<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDistributionFundPromoterResponse extends Model
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

    // 推广人账户列表
    /**
     * @var FundInfo[]
     */
    public $fundList;

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

    // 推广人id
    /**
     * @var string
     */
    public $promoterId;

    // 总量
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'fundList'   => 'fund_list',
        'pageNum'    => 'page_num',
        'pageSize'   => 'page_size',
        'promoterId' => 'promoter_id',
        'totalCount' => 'total_count',
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
        if (null !== $this->fundList) {
            $res['fund_list'] = [];
            if (null !== $this->fundList && \is_array($this->fundList)) {
                $n = 0;
                foreach ($this->fundList as $item) {
                    $res['fund_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->promoterId) {
            $res['promoter_id'] = $this->promoterId;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDistributionFundPromoterResponse
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
        if (isset($map['fund_list'])) {
            if (!empty($map['fund_list'])) {
                $model->fundList = [];
                $n               = 0;
                foreach ($map['fund_list'] as $item) {
                    $model->fundList[$n++] = null !== $item ? FundInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['promoter_id'])) {
            $model->promoterId = $map['promoter_id'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
