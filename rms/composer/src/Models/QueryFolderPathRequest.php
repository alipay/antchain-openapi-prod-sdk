<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryFolderPathRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 自定义监控 ID
    /**
     * @var int
     */
    public $customPluginId;

    // 文件夹 ID
    /**
     * @var int
     */
    public $folderId;

    // 是否包含插件名
    /**
     * @var bool
     */
    public $includePluginName;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'customPluginId'    => 'custom_plugin_id',
        'folderId'          => 'folder_id',
        'includePluginName' => 'include_plugin_name',
        'workspaceName'     => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('folderId', $this->folderId, true);
        Model::validateRequired('includePluginName', $this->includePluginName, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->customPluginId) {
            $res['custom_plugin_id'] = $this->customPluginId;
        }
        if (null !== $this->folderId) {
            $res['folder_id'] = $this->folderId;
        }
        if (null !== $this->includePluginName) {
            $res['include_plugin_name'] = $this->includePluginName;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFolderPathRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['custom_plugin_id'])) {
            $model->customPluginId = $map['custom_plugin_id'];
        }
        if (isset($map['folder_id'])) {
            $model->folderId = $map['folder_id'];
        }
        if (isset($map['include_plugin_name'])) {
            $model->includePluginName = $map['include_plugin_name'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
