<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AuthorizePolicy extends Model
{
    // 授权策略ID
    /**
     * @example 11
     *
     * @var string
     */
    public $policyId;

    // 授权策略描述
    /**
     * @example 11
     *
     * @var string
     */
    public $description;

    // 授权策略配置
    /**
     * @example 授权策略配置
     *
     * @var string
     */
    public $authorizeConfig;
    protected $_name = [
        'policyId'        => 'policy_id',
        'description'     => 'description',
        'authorizeConfig' => 'authorize_config',
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
     * @return AuthorizePolicy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
