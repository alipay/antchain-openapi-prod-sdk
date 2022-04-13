<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QuerySidecaropsAllservicesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 用于label到metaservice换取wsgName
    /**
     * @var string
     */
    public $workspaceGroupLabel;
    protected $_name = [
        'authToken'           => 'auth_token',
        'workspaceGroupLabel' => 'workspace_group_label',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroupLabel', $this->workspaceGroupLabel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroupLabel) {
            $res['workspace_group_label'] = $this->workspaceGroupLabel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySidecaropsAllservicesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group_label'])) {
            $model->workspaceGroupLabel = $map['workspace_group_label'];
        }

        return $model;
    }
}
