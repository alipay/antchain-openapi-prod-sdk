<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCutpaymentsubTransactionResponse extends Model
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

    // 当前页
    /**
     * @var string
     */
    public $pageNum;

    // 每页数量
    /**
     * @var string
     */
    public $pageSize;

    // 总页数
    /**
     * @var string
     */
    public $pageCount;

    // 银行卡代扣二级租户收支明细
    /**
     * @var TransactionDetail[]
     */
    public $transactionDetailList;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'pageNum'               => 'page_num',
        'pageSize'              => 'page_size',
        'pageCount'             => 'page_count',
        'transactionDetailList' => 'transaction_detail_list',
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
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageCount) {
            $res['page_count'] = $this->pageCount;
        }
        if (null !== $this->transactionDetailList) {
            $res['transaction_detail_list'] = [];
            if (null !== $this->transactionDetailList && \is_array($this->transactionDetailList)) {
                $n = 0;
                foreach ($this->transactionDetailList as $item) {
                    $res['transaction_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCutpaymentsubTransactionResponse
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
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_count'])) {
            $model->pageCount = $map['page_count'];
        }
        if (isset($map['transaction_detail_list'])) {
            if (!empty($map['transaction_detail_list'])) {
                $model->transactionDetailList = [];
                $n                            = 0;
                foreach ($map['transaction_detail_list'] as $item) {
                    $model->transactionDetailList[$n++] = null !== $item ? TransactionDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
