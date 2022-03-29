<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class FolderRequestCmd extends Model
{
    // custom_plugin_id
    /**
     * @example custom_plugin_id
     *
     * @var int
     */
    public $customPluginId;

    // folder_id
    /**
     * @example folder_id
     *
     * @var int
     */
    public $folderId;

    // include_me
    /**
     * @example true,false
     *
     * @var bool
     */
    public $includeMe;

    // include_plugin_name
    /**
     * @example true,false
     *
     * @var bool
     */
    public $includePluginName;
    protected $_name = [
        'customPluginId'    => 'custom_plugin_id',
        'folderId'          => 'folder_id',
        'includeMe'         => 'include_me',
        'includePluginName' => 'include_plugin_name',
    ];

    public function validate()
    {
        Model::validateRequired('customPluginId', $this->customPluginId, true);
        Model::validateRequired('folderId', $this->folderId, true);
        Model::validateRequired('includeMe', $this->includeMe, true);
        Model::validateRequired('includePluginName', $this->includePluginName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customPluginId) {
            $res['custom_plugin_id'] = $this->customPluginId;
        }
        if (null !== $this->folderId) {
            $res['folder_id'] = $this->folderId;
        }
        if (null !== $this->includeMe) {
            $res['include_me'] = $this->includeMe;
        }
        if (null !== $this->includePluginName) {
            $res['include_plugin_name'] = $this->includePluginName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FolderRequestCmd
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['custom_plugin_id'])) {
            $model->customPluginId = $map['custom_plugin_id'];
        }
        if (isset($map['folder_id'])) {
            $model->folderId = $map['folder_id'];
        }
        if (isset($map['include_me'])) {
            $model->includeMe = $map['include_me'];
        }
        if (isset($map['include_plugin_name'])) {
            $model->includePluginName = $map['include_plugin_name'];
        }

        return $model;
    }
}
