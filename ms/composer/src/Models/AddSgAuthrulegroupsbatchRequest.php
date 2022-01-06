<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddSgAuthrulegroupsbatchRequest extends Model
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

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 鉴权规则json串
    /**
     * @var string
     */
    public $authRuleAddModel;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'authRuleAddModel'  => 'auth_rule_add_model',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('authRuleAddModel', $this->authRuleAddModel, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->authRuleAddModel) {
            $res['auth_rule_add_model'] = $this->authRuleAddModel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddSgAuthrulegroupsbatchRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['auth_rule_add_model'])) {
            $model->authRuleAddModel = $map['auth_rule_add_model'];
        }

        return $model;
    }
}
