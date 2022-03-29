<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateStackGeneratedconfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 待修改的技术栈配置
    /**
     * @var StackGeneratedConfig
     */
    public $generatedConfig;
    protected $_name = [
        'authToken'       => 'auth_token',
        'workspaceName'   => 'workspace_name',
        'generatedConfig' => 'generated_config',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('generatedConfig', $this->generatedConfig, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->generatedConfig) {
            $res['generated_config'] = null !== $this->generatedConfig ? $this->generatedConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateStackGeneratedconfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['generated_config'])) {
            $model->generatedConfig = StackGeneratedConfig::fromMap($map['generated_config']);
        }

        return $model;
    }
}
