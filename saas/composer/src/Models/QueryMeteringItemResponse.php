<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryMeteringItemResponse extends Model
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

    // 商业产品码
    /**
     * @var string
     */
    public $businessCode;

    // 计量域
    /**
     * @var string
     */
    public $meteringDomainCode;

    // 计量项
    /**
     * @var ItemRule[]
     */
    public $itemRules;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'businessCode'       => 'business_code',
        'meteringDomainCode' => 'metering_domain_code',
        'itemRules'          => 'item_rules',
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
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->meteringDomainCode) {
            $res['metering_domain_code'] = $this->meteringDomainCode;
        }
        if (null !== $this->itemRules) {
            $res['item_rules'] = [];
            if (null !== $this->itemRules && \is_array($this->itemRules)) {
                $n = 0;
                foreach ($this->itemRules as $item) {
                    $res['item_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeteringItemResponse
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
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['metering_domain_code'])) {
            $model->meteringDomainCode = $map['metering_domain_code'];
        }
        if (isset($map['item_rules'])) {
            if (!empty($map['item_rules'])) {
                $model->itemRules = [];
                $n                = 0;
                foreach ($map['item_rules'] as $item) {
                    $model->itemRules[$n++] = null !== $item ? ItemRule::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
