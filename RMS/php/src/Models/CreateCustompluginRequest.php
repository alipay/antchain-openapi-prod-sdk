<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\AlarmPkgDO;

class CreateCustompluginRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'workspaceName' => 'workspace_name',
        'pluginType' => 'plugin_type',
        'name' => 'name',
        'parentFolderId' => 'parent_folder_id',
        'isOpen' => 'is_open',
        'alarmPkgs' => 'alarm_pkgs',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->pluginType) {
            $res['plugin_type'] = $this->pluginType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->parentFolderId) {
            $res['parent_folder_id'] = $this->parentFolderId;
        }
        if (null !== $this->isOpen) {
            $res['is_open'] = $this->isOpen;
        }
        if (null !== $this->alarmPkgs) {
            $res['alarm_pkgs'] = null !== $this->alarmPkgs ? $this->alarmPkgs->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateCustompluginRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['workspace_name'])){
            $model->workspaceName = $map['workspace_name'];
        }
        if(isset($map['plugin_type'])){
            $model->pluginType = $map['plugin_type'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['parent_folder_id'])){
            $model->parentFolderId = $map['parent_folder_id'];
        }
        if(isset($map['is_open'])){
            $model->isOpen = $map['is_open'];
        }
        if(isset($map['alarm_pkgs'])){
            $model->alarmPkgs = AlarmPkgDO::fromMap($map['alarm_pkgs']);
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 监控产品类型
    /**
     * @var string
     */
    public $pluginType;

    // 监控配置名
    /**
     * @var string
     */
    public $name;

    // 父级文件夹 ID
    /**
     * @var int
     */
    public $parentFolderId;

    // 是否生效
    /**
     * @var bool
     */
    public $isOpen;

    // 告警套餐
    /**
     * @var AlarmPkgDO
     */
    public $alarmPkgs;

}
