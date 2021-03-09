<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DescribeUnifiedresourceVpcRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 提供商类型
    /**
     * @var string
     */
    public $providerType;

    // region
    /**
     * @var string
     */
    public $region;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'    => 'auth_token',
        'providerType' => 'provider_type',
        'region'       => 'region',
        'workspace'    => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('providerType', $this->providerType, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->providerType) {
            $res['provider_type'] = $this->providerType;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DescribeUnifiedresourceVpcRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['provider_type'])) {
            $model->providerType = $map['provider_type'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
