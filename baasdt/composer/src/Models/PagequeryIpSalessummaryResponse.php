<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIpSalessummaryResponse extends Model
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

    // 订单ID
    /**
     * @var string
     */
    public $ipOrderId;

    // 账单ID
    /**
     * @var string
     */
    public $ipBillId;

    // 销售数据汇总信息列表
    /**
     * @var IPSalesSummary[]
     */
    public $ipSalesSummaryList;

    // 页码
    /**
     * @var int
     */
    public $pageNumber;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 销售数据总数
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'ipOrderId'          => 'ip_order_id',
        'ipBillId'           => 'ip_bill_id',
        'ipSalesSummaryList' => 'ip_sales_summary_list',
        'pageNumber'         => 'page_number',
        'pageSize'           => 'page_size',
        'totalCount'         => 'total_count',
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
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->ipBillId) {
            $res['ip_bill_id'] = $this->ipBillId;
        }
        if (null !== $this->ipSalesSummaryList) {
            $res['ip_sales_summary_list'] = [];
            if (null !== $this->ipSalesSummaryList && \is_array($this->ipSalesSummaryList)) {
                $n = 0;
                foreach ($this->ipSalesSummaryList as $item) {
                    $res['ip_sales_summary_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
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
     * @return PagequeryIpSalessummaryResponse
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
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['ip_bill_id'])) {
            $model->ipBillId = $map['ip_bill_id'];
        }
        if (isset($map['ip_sales_summary_list'])) {
            if (!empty($map['ip_sales_summary_list'])) {
                $model->ipSalesSummaryList = [];
                $n                         = 0;
                foreach ($map['ip_sales_summary_list'] as $item) {
                    $model->ipSalesSummaryList[$n++] = null !== $item ? IPSalesSummary::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
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
