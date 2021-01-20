<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Workspace;

class WorkspaceGroupInfo extends Model {
    protected $_name = [
        'createdTime' => 'created_time',
        'displayName' => 'display_name',
        'domainSuffix' => 'domain_suffix',
        'id' => 'id',
        'masterWorkspaceId' => 'master_workspace_id',
        'masterWorkspaceIdentity' => 'master_workspace_identity',
        'modifiedTime' => 'modified_time',
        'name' => 'name',
        'releaseMode' => 'release_mode',
        'tenantName' => 'tenant_name',
        'workspaces' => 'workspaces',
        'identity' => 'identity',
    ];
    public function validate() {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->domainSuffix) {
            $res['domain_suffix'] = $this->domainSuffix;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->masterWorkspaceId) {
            $res['master_workspace_id'] = $this->masterWorkspaceId;
        }
        if (null !== $this->masterWorkspaceIdentity) {
            $res['master_workspace_identity'] = $this->masterWorkspaceIdentity;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->releaseMode) {
            $res['release_mode'] = $this->releaseMode;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = [];
            if(null !== $this->workspaces && is_array($this->workspaces)){
                $n = 0;
                foreach($this->workspaces as $item){
                    $res['workspaces'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WorkspaceGroupInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['created_time'])){
            $model->createdTime = $map['created_time'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['domain_suffix'])){
            $model->domainSuffix = $map['domain_suffix'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['master_workspace_id'])){
            $model->masterWorkspaceId = $map['master_workspace_id'];
        }
        if(isset($map['master_workspace_identity'])){
            $model->masterWorkspaceIdentity = $map['master_workspace_identity'];
        }
        if(isset($map['modified_time'])){
            $model->modifiedTime = $map['modified_time'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['release_mode'])){
            $model->releaseMode = $map['release_mode'];
        }
        if(isset($map['tenant_name'])){
            $model->tenantName = $map['tenant_name'];
        }
        if(isset($map['workspaces'])){
            if(!empty($map['workspaces'])){
                $model->workspaces = [];
                $n = 0;
                foreach($map['workspaces'] as $item) {
                    $model->workspaces[$n++] = null !== $item ? Workspace::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        return $model;
    }
    // 创建时间。
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $createdTime;

    // 工作空间组显示名称。
    /**
     * @example 生产环境
     * @var string
     */
    public $displayName;

    // 域名后缀。
    /**
     * @example alipay.net
     * @var string
     */
    public $domainSuffix;

    // 工作空间组id。
    /**
     * @example 00000001
     * @var string
     */
    public $id;

    // 主工作空间id。
    /**
     * @example 00000007
     * @var string
     */
    public $masterWorkspaceId;

    // 主工作空间名称。
    /**
     * @example dev
     * @var string
     */
    public $masterWorkspaceIdentity;

    // 修改时间。
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modifiedTime;

    // 工作空间组唯一标识。
    /**
     * @example prod
     * @var string
     */
    public $name;

    // 发布模式。
    /**
     * @example LDC
     * @var string
     */
    public $releaseMode;

    // the belonging tenant name.
    /**
     * @example ANTCLOUD
     * @var string
     */
    public $tenantName;

    // 包含工作空间列表。
    /**
     * @example [{}]
     * @var Workspace[]
     */
    public $workspaces;

    // workspace name
    /**
     * @example test
     * @var string
     */
    public $identity;

}
