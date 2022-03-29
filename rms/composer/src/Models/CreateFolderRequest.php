<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CreateFolderRequest extends Model
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

    // 文件夹名称
    /**
     * @var string
     */
    public $name;

    // 父级文件夹id
    /**
     * @var int
     */
    public $parentFolderId;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceName'  => 'workspace_name',
        'name'           => 'name',
        'parentFolderId' => 'parent_folder_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('parentFolderId', $this->parentFolderId, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->parentFolderId) {
            $res['parent_folder_id'] = $this->parentFolderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFolderRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['parent_folder_id'])) {
            $model->parentFolderId = $map['parent_folder_id'];
        }

        return $model;
    }
}
