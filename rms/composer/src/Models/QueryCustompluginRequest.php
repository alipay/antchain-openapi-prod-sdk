<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryCustompluginRequest extends Model
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

    // 父级文件夹 ID
    /**
     * @var int
     */
    public $parentFolderId;

    // 插件类型
    /**
     * @var string
     */
    public $pluginType;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceName'  => 'workspace_name',
        'parentFolderId' => 'parent_folder_id',
        'pluginType'     => 'plugin_type',
        'currentPage'    => 'current_page',
        'pageSize'       => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
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
        if (null !== $this->parentFolderId) {
            $res['parent_folder_id'] = $this->parentFolderId;
        }
        if (null !== $this->pluginType) {
            $res['plugin_type'] = $this->pluginType;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCustompluginRequest
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
        if (isset($map['parent_folder_id'])) {
            $model->parentFolderId = $map['parent_folder_id'];
        }
        if (isset($map['plugin_type'])) {
            $model->pluginType = $map['plugin_type'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
