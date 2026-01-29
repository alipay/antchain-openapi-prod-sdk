<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerMerchantopenchannelResponse extends Model
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

    // 已经进件支付渠道信息
    /**
     * @var MerchantPayChannelInfo[]
     */
    public $merchantPayChannelInfoList;
    protected $_name = [
        'reqMsgId'                   => 'req_msg_id',
        'resultCode'                 => 'result_code',
        'resultMsg'                  => 'result_msg',
        'merchantPayChannelInfoList' => 'merchant_pay_channel_info_list',
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
        if (null !== $this->merchantPayChannelInfoList) {
            $res['merchant_pay_channel_info_list'] = [];
            if (null !== $this->merchantPayChannelInfoList && \is_array($this->merchantPayChannelInfoList)) {
                $n = 0;
                foreach ($this->merchantPayChannelInfoList as $item) {
                    $res['merchant_pay_channel_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerMerchantopenchannelResponse
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
        if (isset($map['merchant_pay_channel_info_list'])) {
            if (!empty($map['merchant_pay_channel_info_list'])) {
                $model->merchantPayChannelInfoList = [];
                $n                                 = 0;
                foreach ($map['merchant_pay_channel_info_list'] as $item) {
                    $model->merchantPayChannelInfoList[$n++] = null !== $item ? MerchantPayChannelInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
