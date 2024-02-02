<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateMeteringRuleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

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

    // 方法匹配规则
    /**
     * @var MethodMatchingRule[]
     */
    public $methodMatchingRules;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'productCode'         => 'product_code',
        'businessCode'        => 'business_code',
        'methodMatchingRules' => 'method_matching_rules',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('methodMatchingRules', $this->methodMatchingRules, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->methodMatchingRules) {
            $res['method_matching_rules'] = [];
            if (null !== $this->methodMatchingRules && \is_array($this->methodMatchingRules)) {
                $n = 0;
                foreach ($this->methodMatchingRules as $item) {
                    $res['method_matching_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMeteringRuleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['method_matching_rules'])) {
            if (!empty($map['method_matching_rules'])) {
                $model->methodMatchingRules = [];
                $n                          = 0;
                foreach ($map['method_matching_rules'] as $item) {
                    $model->methodMatchingRules[$n++] = null !== $item ? MethodMatchingRule::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
