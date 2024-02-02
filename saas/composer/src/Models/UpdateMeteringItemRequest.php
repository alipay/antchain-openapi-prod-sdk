<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateMeteringItemRequest extends Model
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

    // 计量项列表
    /**
     * @var ItemRule[]
     */
    public $itemRules;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'businessCode'       => 'business_code',
        'meteringDomainCode' => 'metering_domain_code',
        'itemRules'          => 'item_rules',
    ];

    public function validate()
    {
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('meteringDomainCode', $this->meteringDomainCode, true);
        Model::validateRequired('itemRules', $this->itemRules, true);
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
     * @return UpdateMeteringItemRequest
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
