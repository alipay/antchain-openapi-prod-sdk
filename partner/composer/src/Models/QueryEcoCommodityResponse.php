<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QueryEcoCommodityResponse extends Model
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

    // 商品及其归属政策信息
    /**
     * @var CommodityPolicyRelation[]
     */
    public $commodityPolicyInfo;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'commodityPolicyInfo' => 'commodity_policy_info',
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
        if (null !== $this->commodityPolicyInfo) {
            $res['commodity_policy_info'] = [];
            if (null !== $this->commodityPolicyInfo && \is_array($this->commodityPolicyInfo)) {
                $n = 0;
                foreach ($this->commodityPolicyInfo as $item) {
                    $res['commodity_policy_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEcoCommodityResponse
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
        if (isset($map['commodity_policy_info'])) {
            if (!empty($map['commodity_policy_info'])) {
                $model->commodityPolicyInfo = [];
                $n                          = 0;
                foreach ($map['commodity_policy_info'] as $item) {
                    $model->commodityPolicyInfo[$n++] = null !== $item ? CommodityPolicyRelation::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
