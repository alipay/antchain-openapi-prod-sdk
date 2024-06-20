<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class SetGeneralDivideRequest extends Model
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

    // 合约实例id
    /**
     * @var string
     */
    public $serviceId;

    // 自定义分账规则唯一ID
    /**
     * @var string
     */
    public $ruleId;

    // 分账方，分账方不能重复配置
    /**
     * @var RuleItem[]
     */
    public $ruleItemList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceId'         => 'service_id',
        'ruleId'            => 'rule_id',
        'ruleItemList'      => 'rule_item_list',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('ruleId', $this->ruleId, true);
        Model::validateRequired('ruleItemList', $this->ruleItemList, true);
        Model::validateMaxLength('ruleId', $this->ruleId, 64);
        Model::validateMinLength('ruleId', $this->ruleId, 0);
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
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }
        if (null !== $this->ruleItemList) {
            $res['rule_item_list'] = [];
            if (null !== $this->ruleItemList && \is_array($this->ruleItemList)) {
                $n = 0;
                foreach ($this->ruleItemList as $item) {
                    $res['rule_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetGeneralDivideRequest
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
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }
        if (isset($map['rule_item_list'])) {
            if (!empty($map['rule_item_list'])) {
                $model->ruleItemList = [];
                $n                   = 0;
                foreach ($map['rule_item_list'] as $item) {
                    $model->ruleItemList[$n++] = null !== $item ? RuleItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
