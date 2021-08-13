<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIpSalesbydayResponse extends Model
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

    // 页码
    /**
     * @var int
     */
    public $pageNumber;

    // 页面数据量大小
    /**
     * @var int
     */
    public $pageSize;

    // 数据总数
    /**
     * @var int
     */
    public $totalCount;

    // T+1日的销售数据统计数据列表
    /**
     * @var SalesByDay[]
     */
    public $salesBDayList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'pageNumber'    => 'page_number',
        'pageSize'      => 'page_size',
        'totalCount'    => 'total_count',
        'salesBDayList' => 'sales_b_day_list',
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
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->salesBDayList) {
            $res['sales_b_day_list'] = [];
            if (null !== $this->salesBDayList && \is_array($this->salesBDayList)) {
                $n = 0;
                foreach ($this->salesBDayList as $item) {
                    $res['sales_b_day_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryIpSalesbydayResponse
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
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['sales_b_day_list'])) {
            if (!empty($map['sales_b_day_list'])) {
                $model->salesBDayList = [];
                $n                    = 0;
                foreach ($map['sales_b_day_list'] as $item) {
                    $model->salesBDayList[$n++] = null !== $item ? SalesByDay::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
