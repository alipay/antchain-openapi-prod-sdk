<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryOrderSettlementResponse extends Model
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

    // 2026-06-30 12:00:00
    /**
     * @var string
     */
    public $operationDt;

    // 分账明细
    /**
     * @var SettleOrderRoyaltyDetail[]
     */
    public $royaltyDetailList;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'operationDt'       => 'operation_dt',
        'royaltyDetailList' => 'royalty_detail_list',
    ];

    public function validate()
    {
        Model::validatePattern('operationDt', $this->operationDt, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->operationDt) {
            $res['operation_dt'] = $this->operationDt;
        }
        if (null !== $this->royaltyDetailList) {
            $res['royalty_detail_list'] = [];
            if (null !== $this->royaltyDetailList && \is_array($this->royaltyDetailList)) {
                $n = 0;
                foreach ($this->royaltyDetailList as $item) {
                    $res['royalty_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOrderSettlementResponse
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
        if (isset($map['operation_dt'])) {
            $model->operationDt = $map['operation_dt'];
        }
        if (isset($map['royalty_detail_list'])) {
            if (!empty($map['royalty_detail_list'])) {
                $model->royaltyDetailList = [];
                $n                        = 0;
                foreach ($map['royalty_detail_list'] as $item) {
                    $model->royaltyDetailList[$n++] = null !== $item ? SettleOrderRoyaltyDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
