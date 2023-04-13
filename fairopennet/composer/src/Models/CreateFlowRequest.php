<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class CreateFlowRequest extends Model
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

    // 静态工作流配置字符串
    /**
     * @var string
     */
    public $staticFlowConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'partyId'           => 'party_id',
        'staticFlowConfig'  => 'static_flow_config',
    ];

    public function validate()
    {
        Model::validateRequired('partyId', $this->partyId, true);
        Model::validateRequired('staticFlowConfig', $this->staticFlowConfig, true);
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
        if (null !== $this->staticFlowConfig) {
            $res['static_flow_config'] = $this->staticFlowConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFlowRequest
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
        if (isset($map['static_flow_config'])) {
            $model->staticFlowConfig = $map['static_flow_config'];
        }

        return $model;
    }
}
