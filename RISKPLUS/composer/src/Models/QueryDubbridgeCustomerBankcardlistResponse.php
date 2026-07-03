<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeCustomerBankcardlistResponse extends Model
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

    // 用户绑定银行卡信息列表
    /**
     * @var CustomerBankCardInfo[]
     */
    public $customerBankCardInfoList;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'customerBankCardInfoList' => 'customer_bank_card_info_list',
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
        if (null !== $this->customerBankCardInfoList) {
            $res['customer_bank_card_info_list'] = [];
            if (null !== $this->customerBankCardInfoList && \is_array($this->customerBankCardInfoList)) {
                $n = 0;
                foreach ($this->customerBankCardInfoList as $item) {
                    $res['customer_bank_card_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeCustomerBankcardlistResponse
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
        if (isset($map['customer_bank_card_info_list'])) {
            if (!empty($map['customer_bank_card_info_list'])) {
                $model->customerBankCardInfoList = [];
                $n                               = 0;
                foreach ($map['customer_bank_card_info_list'] as $item) {
                    $model->customerBankCardInfoList[$n++] = null !== $item ? CustomerBankCardInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
