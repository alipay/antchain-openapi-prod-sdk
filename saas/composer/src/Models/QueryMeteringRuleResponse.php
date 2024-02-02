<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryMeteringRuleResponse extends Model
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

    // 技术产品码
    /**
     * @var string
     */
    public $productCode;

    // 商业产品码
    /**
     * @var string
     */
    public $businessCode;

    // 计量规则
    /**
     * @var MethodMatchingRule[]
     */
    public $meteringRules;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'productCode'   => 'product_code',
        'businessCode'  => 'business_code',
        'meteringRules' => 'metering_rules',
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->meteringRules) {
            $res['metering_rules'] = [];
            if (null !== $this->meteringRules && \is_array($this->meteringRules)) {
                $n = 0;
                foreach ($this->meteringRules as $item) {
                    $res['metering_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeteringRuleResponse
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
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['metering_rules'])) {
            if (!empty($map['metering_rules'])) {
                $model->meteringRules = [];
                $n                    = 0;
                foreach ($map['metering_rules'] as $item) {
                    $model->meteringRules[$n++] = null !== $item ? MethodMatchingRule::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
