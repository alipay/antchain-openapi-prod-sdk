<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class SaveSgAuthrulegroupsRequest extends Model
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

    // {"type":"WHITELIST","enabled":0,"instanceId":"000001","dataId":"com.alipay.antcloud.drmdata.facade.PushFacade:1.0@DEFAULT","rules":[{"ruleItems":[{"type":"SYSTEM","operation":"EQUAL","field":"source.application.id","value":"app1"}],"enabled":0,"name":"rule1"}]}
    /**
     * @var string
     */
    public $authRuleGroup;

    // 服务鉴权接口id
    /**
     * @var string
     */
    public $dataId;

    // 租户instanceId
    /**
     * @var string
     */
    public $instanceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authRuleGroup'     => 'auth_rule_group',
        'dataId'            => 'data_id',
        'instanceId'        => 'instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('authRuleGroup', $this->authRuleGroup, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->authRuleGroup) {
            $res['auth_rule_group'] = $this->authRuleGroup;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveSgAuthrulegroupsRequest
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
        if (isset($map['auth_rule_group'])) {
            $model->authRuleGroup = $map['auth_rule_group'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }

        return $model;
    }
}
