<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AddAuthAdminRequest extends Model
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

    // 授权策略ID
    /**
     * @var string
     */
    public $policyId;

    // 授权策略描述
    /**
     * @var string
     */
    public $description;

    // 授权策略配置
    /**
     * @var string
     */
    public $authorizeConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'policyId'          => 'policy_id',
        'description'       => 'description',
        'authorizeConfig'   => 'authorize_config',
    ];

    public function validate()
    {
        Model::validateRequired('policyId', $this->policyId, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('authorizeConfig', $this->authorizeConfig, true);
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
        if (null !== $this->policyId) {
            $res['policy_id'] = $this->policyId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->authorizeConfig) {
            $res['authorize_config'] = $this->authorizeConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddAuthAdminRequest
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
        if (isset($map['policy_id'])) {
            $model->policyId = $map['policy_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['authorize_config'])) {
            $model->authorizeConfig = $map['authorize_config'];
        }

        return $model;
    }
}
