<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalassetExchangeEptradeResponse extends Model
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

    // 页数 从1开始
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示数量
    /**
     * @var int
     */
    public $pageSize;

    // 数据总量
    /**
     * @var int
     */
    public $totalCount;

    // 交易信息列表
    /**
     * @var EPTradeInfo[]
     */
    public $txInfos;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'pageNum'    => 'page_num',
        'pageSize'   => 'page_size',
        'totalCount' => 'total_count',
        'txInfos'    => 'tx_infos',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->txInfos) {
            $res['tx_infos'] = [];
            if (null !== $this->txInfos && \is_array($this->txInfos)) {
                $n = 0;
                foreach ($this->txInfos as $item) {
                    $res['tx_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDigitalassetExchangeEptradeResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['tx_infos'])) {
            if (!empty($map['tx_infos'])) {
                $model->txInfos = [];
                $n              = 0;
                foreach ($map['tx_infos'] as $item) {
                    $model->txInfos[$n++] = null !== $item ? EPTradeInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
