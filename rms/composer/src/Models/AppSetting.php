<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AppSetting extends Model
{
    // 租户ID
    /**
     * @example 123
     *
     * @var int
     */
    public $tenantId;

    // 工作空间ID
    /**
     * @example 123
     *
     * @var int
     */
    public $workspaceId;

    // 配置信息
    /**
     * @example {"xxx":"xxx"}
     *
     * @var string
     */
    public $setting;

    // 应用名称
    /**
     * @example monitorprod
     *
     * @var string
     */
    public $appName;

    // 应用监控是否开启采集
    /**
     * @example true, false
     *
     * @var bool
     */
    public $collectEnable;
    protected $_name = [
        'tenantId'      => 'tenant_id',
        'workspaceId'   => 'workspace_id',
        'setting'       => 'setting',
        'appName'       => 'app_name',
        'collectEnable' => 'collect_enable',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('collectEnable', $this->collectEnable, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->setting) {
            $res['setting'] = $this->setting;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->collectEnable) {
            $res['collect_enable'] = $this->collectEnable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppSetting
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['setting'])) {
            $model->setting = $map['setting'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['collect_enable'])) {
            $model->collectEnable = $map['collect_enable'];
        }

        return $model;
    }
}
