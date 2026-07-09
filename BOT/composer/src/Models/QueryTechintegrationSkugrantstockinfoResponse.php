<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryTechintegrationSkugrantstockinfoResponse extends Model
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

    // 证书授权信息列表
    /**
     * @var SkuGrantStockInfoResp[]
     */
    public $grantStockInfoList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'grantStockInfoList' => 'grant_stock_info_list',
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
        if (null !== $this->grantStockInfoList) {
            $res['grant_stock_info_list'] = [];
            if (null !== $this->grantStockInfoList && \is_array($this->grantStockInfoList)) {
                $n = 0;
                foreach ($this->grantStockInfoList as $item) {
                    $res['grant_stock_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTechintegrationSkugrantstockinfoResponse
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
        if (isset($map['grant_stock_info_list'])) {
            if (!empty($map['grant_stock_info_list'])) {
                $model->grantStockInfoList = [];
                $n                         = 0;
                foreach ($map['grant_stock_info_list'] as $item) {
                    $model->grantStockInfoList[$n++] = null !== $item ? SkuGrantStockInfoResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
