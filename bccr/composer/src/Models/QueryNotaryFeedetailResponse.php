<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryNotaryFeedetailResponse extends Model
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

    // 本次公证出证需支付的总费用
    /**
     * @var int
     */
    public $totalPriceRmbFen;

    // 本次申请中每一类证据的数量明细列表
    /**
     * @var NotaryFeeEvidTypeData[]
     */
    public $notaryFeeEvidTypeDataList;

    // 本次需支付费用的分项明细列表
    /**
     * @var NotaryFeeItem[]
     */
    public $notaryFeeItemList;

    // 收费规则描述
    /**
     * @var string[]
     */
    public $notaryFeeRuleList;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'totalPriceRmbFen'          => 'total_price_rmb_fen',
        'notaryFeeEvidTypeDataList' => 'notary_fee_evid_type_data_list',
        'notaryFeeItemList'         => 'notary_fee_item_list',
        'notaryFeeRuleList'         => 'notary_fee_rule_list',
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
        if (null !== $this->totalPriceRmbFen) {
            $res['total_price_rmb_fen'] = $this->totalPriceRmbFen;
        }
        if (null !== $this->notaryFeeEvidTypeDataList) {
            $res['notary_fee_evid_type_data_list'] = [];
            if (null !== $this->notaryFeeEvidTypeDataList && \is_array($this->notaryFeeEvidTypeDataList)) {
                $n = 0;
                foreach ($this->notaryFeeEvidTypeDataList as $item) {
                    $res['notary_fee_evid_type_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->notaryFeeItemList) {
            $res['notary_fee_item_list'] = [];
            if (null !== $this->notaryFeeItemList && \is_array($this->notaryFeeItemList)) {
                $n = 0;
                foreach ($this->notaryFeeItemList as $item) {
                    $res['notary_fee_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->notaryFeeRuleList) {
            $res['notary_fee_rule_list'] = $this->notaryFeeRuleList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNotaryFeedetailResponse
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
        if (isset($map['total_price_rmb_fen'])) {
            $model->totalPriceRmbFen = $map['total_price_rmb_fen'];
        }
        if (isset($map['notary_fee_evid_type_data_list'])) {
            if (!empty($map['notary_fee_evid_type_data_list'])) {
                $model->notaryFeeEvidTypeDataList = [];
                $n                                = 0;
                foreach ($map['notary_fee_evid_type_data_list'] as $item) {
                    $model->notaryFeeEvidTypeDataList[$n++] = null !== $item ? NotaryFeeEvidTypeData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['notary_fee_item_list'])) {
            if (!empty($map['notary_fee_item_list'])) {
                $model->notaryFeeItemList = [];
                $n                        = 0;
                foreach ($map['notary_fee_item_list'] as $item) {
                    $model->notaryFeeItemList[$n++] = null !== $item ? NotaryFeeItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['notary_fee_rule_list'])) {
            if (!empty($map['notary_fee_rule_list'])) {
                $model->notaryFeeRuleList = $map['notary_fee_rule_list'];
            }
        }

        return $model;
    }
}
