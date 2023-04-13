<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class RunFlowInstanceRequest extends Model
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

    // 参与方的partyId
    /**
     * @var string
     */
    public $partyId;

    // 动态工作流配置字符串
    /**
     * @var string
     */
    public $dynamicFlowConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'partyId'           => 'party_id',
        'dynamicFlowConfig' => 'dynamic_flow_config',
    ];

    public function validate()
    {
        Model::validateRequired('partyId', $this->partyId, true);
        Model::validateRequired('dynamicFlowConfig', $this->dynamicFlowConfig, true);
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
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }
        if (null !== $this->dynamicFlowConfig) {
            $res['dynamic_flow_config'] = $this->dynamicFlowConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RunFlowInstanceRequest
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
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }
        if (isset($map['dynamic_flow_config'])) {
            $model->dynamicFlowConfig = $map['dynamic_flow_config'];
        }

        return $model;
    }
}
