<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateLogserviceDesensconfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 需配置的脱敏类型
    /**
     * @var string[]
     */
    public $desensTypes;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'desensTypes'   => 'desens_types',
        'workspaceName' => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('desensTypes', $this->desensTypes, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->desensTypes) {
            $res['desens_types'] = $this->desensTypes;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateLogserviceDesensconfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['desens_types'])) {
            if (!empty($map['desens_types'])) {
                $model->desensTypes = $map['desens_types'];
            }
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
