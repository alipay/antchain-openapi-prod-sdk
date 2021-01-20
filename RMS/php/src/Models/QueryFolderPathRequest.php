<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryFolderPathRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'customPluginId' => 'custom_plugin_id',
        'folderId' => 'folder_id',
        'includePluginName' => 'include_plugin_name',
    ];
    public function validate() {}
    public function toMap() {
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
        return $res;
    }
    /**
     * @param array $map
     * @return QueryFolderPathRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['custom_plugin_id'])){
            $model->customPluginId = $map['custom_plugin_id'];
        }
        if(isset($map['folder_id'])){
            $model->folderId = $map['folder_id'];
        }
        if(isset($map['include_plugin_name'])){
            $model->includePluginName = $map['include_plugin_name'];
        }
        return $model;
    }
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

}
