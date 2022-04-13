<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateUnifiedaccessinstanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 关联的Spanner逻辑集群名称，一个逻辑集群由很多个local集群组成
    /**
     * @var string
     */
    public $spannerCluster;

    // https协议配置
    /**
     * @var HttpsEntry
     */
    public $unifiedAccessInstanceHttpsEntry;

    // http协议配置
    /**
     * @var HttpEntry
     */
    public $unifiedAccessInstanceHttpEntry;

    // 统一接入实例名称
    /**
     * @var string
     */
    public $unifiedAccessInstanceName;

    // 统一接入网络类型，内网（intranet），公网（internet）
    /**
     * @var string
     */
    public $unifiedAccessInstanceType;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 用户自定义实例entry相关信息（vip/id），datacenter粒度
    /**
     * @var EntrySettings
     */
    public $entrySettings;
    protected $_name = [
        'authToken'                       => 'auth_token',
        'spannerCluster'                  => 'spanner_cluster',
        'unifiedAccessInstanceHttpsEntry' => 'unified_access_instance_https_entry',
        'unifiedAccessInstanceHttpEntry'  => 'unified_access_instance_http_entry',
        'unifiedAccessInstanceName'       => 'unified_access_instance_name',
        'unifiedAccessInstanceType'       => 'unified_access_instance_type',
        'workspaceGroup'                  => 'workspace_group',
        'entrySettings'                   => 'entry_settings',
    ];

    public function validate()
    {
        Model::validateRequired('spannerCluster', $this->spannerCluster, true);
        Model::validateRequired('unifiedAccessInstanceHttpEntry', $this->unifiedAccessInstanceHttpEntry, true);
        Model::validateRequired('unifiedAccessInstanceName', $this->unifiedAccessInstanceName, true);
        Model::validateRequired('unifiedAccessInstanceType', $this->unifiedAccessInstanceType, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->spannerCluster) {
            $res['spanner_cluster'] = $this->spannerCluster;
        }
        if (null !== $this->unifiedAccessInstanceHttpsEntry) {
            $res['unified_access_instance_https_entry'] = null !== $this->unifiedAccessInstanceHttpsEntry ? $this->unifiedAccessInstanceHttpsEntry->toMap() : null;
        }
        if (null !== $this->unifiedAccessInstanceHttpEntry) {
            $res['unified_access_instance_http_entry'] = null !== $this->unifiedAccessInstanceHttpEntry ? $this->unifiedAccessInstanceHttpEntry->toMap() : null;
        }
        if (null !== $this->unifiedAccessInstanceName) {
            $res['unified_access_instance_name'] = $this->unifiedAccessInstanceName;
        }
        if (null !== $this->unifiedAccessInstanceType) {
            $res['unified_access_instance_type'] = $this->unifiedAccessInstanceType;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->entrySettings) {
            $res['entry_settings'] = null !== $this->entrySettings ? $this->entrySettings->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUnifiedaccessinstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['spanner_cluster'])) {
            $model->spannerCluster = $map['spanner_cluster'];
        }
        if (isset($map['unified_access_instance_https_entry'])) {
            $model->unifiedAccessInstanceHttpsEntry = HttpsEntry::fromMap($map['unified_access_instance_https_entry']);
        }
        if (isset($map['unified_access_instance_http_entry'])) {
            $model->unifiedAccessInstanceHttpEntry = HttpEntry::fromMap($map['unified_access_instance_http_entry']);
        }
        if (isset($map['unified_access_instance_name'])) {
            $model->unifiedAccessInstanceName = $map['unified_access_instance_name'];
        }
        if (isset($map['unified_access_instance_type'])) {
            $model->unifiedAccessInstanceType = $map['unified_access_instance_type'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['entry_settings'])) {
            $model->entrySettings = EntrySettings::fromMap($map['entry_settings']);
        }

        return $model;
    }
}
