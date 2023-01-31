<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryGatewayAccountResponse extends Model
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

    // 账户信息列表
    /**
     * @var CarbonAccountInfo[]
     */
    public $accountInfoList;

    // 总量
    /**
     * @var int
     */
    public $total;

    // 当前页面
    /**
     * @var int
     */
    public $pageNumber;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'accountInfoList' => 'account_info_list',
        'total'           => 'total',
        'pageNumber'      => 'page_number',
        'pageSize'        => 'page_size',
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
        if (null !== $this->accountInfoList) {
            $res['account_info_list'] = [];
            if (null !== $this->accountInfoList && \is_array($this->accountInfoList)) {
                $n = 0;
                foreach ($this->accountInfoList as $item) {
                    $res['account_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGatewayAccountResponse
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
        if (isset($map['account_info_list'])) {
            if (!empty($map['account_info_list'])) {
                $model->accountInfoList = [];
                $n                      = 0;
                foreach ($map['account_info_list'] as $item) {
                    $model->accountInfoList[$n++] = null !== $item ? CarbonAccountInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
