<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Buildpack extends Model
{
    // 技术栈标识ID
    /**
     * @example 12345
     *
     * @var string
     */
    public $id;

    // 技术栈名称
    /**
     * @example sofa4
     *
     * @var string
     */
    public $name;

    // 技术栈描述
    /**
     * @example sofa4 描述
     *
     * @var string
     */
    public $des;

    // 技术栈版本
    /**
     * @example sofa4456
     *
     * @var string
     */
    public $version;

    // 技术栈类别
    /**
     * @example java
     *
     * @var string
     */
    public $stack;

    // 部署脚本id
    /**
     * @example sss
     *
     * @var string
     */
    public $deployScriptId;

    // 构建脚本ID
    /**
     * @example 1234
     *
     * @var string
     */
    public $buildScriptId;

    // 配置id
    /**
     * @example 12345
     *
     * @var string
     */
    public $configId;

    // 组件id
    /**
     * @example 12345
     *
     * @var string
     */
    public $componentId;

    // 命令id
    /**
     * @example 12345
     *
     * @var string
     */
    public $commandId;

    // 启用蓝绿
    /**
     * @example true, false
     *
     * @var bool
     */
    public $bgEnable;

    // 创建人
    /**
     * @example creator name
     *
     * @var string
     */
    public $creator;

    // 租户ID
    /**
     * @example 1234
     *
     * @var string
     */
    public $tenantId;

    // 客户id列表
    /**
     * @example ["1234", "12345"]
     *
     * @var string[]
     */
    public $customerIds;

    // 技术栈定义类型
    // 系统模板 TEMPLATE
    // 用户自定义 CUSTOM
    // 后台服务 BACKGROUND_SERVICE
    /**
     * @example TEMPLATE | CUSTOM | BACKGROUND_SERVICE
     *
     * @var string
     */
    public $type;

    // 技术栈状态
    // 草稿 DRAFT
    // 已提交 COMMITED
    // 已对外发布 PUBLISHED
    // 已退役 RETIRED
    /**
     * @example DRAFT | COMMITED | PUBLISHED | RETIRED
     *
     * @var string
     */
    public $status;

    // 创建日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 最近修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 技术栈信息汇总
    /**
     * @example message content
     *
     * @var string
     */
    public $resultMsg;

    // 可用 USABLE
    // 不可用 UNUSABLE
    /**
     * @example USABLE | UNUSABLE
     *
     * @var string
     */
    public $versionStatus;

    // 运行时属性
    /**
     * @example {}
     *
     * @var BuildpackInstances
     */
    public $instances;
    protected $_name = [
        'id'             => 'id',
        'name'           => 'name',
        'des'            => 'des',
        'version'        => 'version',
        'stack'          => 'stack',
        'deployScriptId' => 'deploy_script_id',
        'buildScriptId'  => 'build_script_id',
        'configId'       => 'config_id',
        'componentId'    => 'component_id',
        'commandId'      => 'command_id',
        'bgEnable'       => 'bg_enable',
        'creator'        => 'creator',
        'tenantId'       => 'tenant_id',
        'customerIds'    => 'customer_ids',
        'type'           => 'type',
        'status'         => 'status',
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
        'resultMsg'      => 'result_msg',
        'versionStatus'  => 'version_status',
        'instances'      => 'instances',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->des) {
            $res['des'] = $this->des;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->stack) {
            $res['stack'] = $this->stack;
        }
        if (null !== $this->deployScriptId) {
            $res['deploy_script_id'] = $this->deployScriptId;
        }
        if (null !== $this->buildScriptId) {
            $res['build_script_id'] = $this->buildScriptId;
        }
        if (null !== $this->configId) {
            $res['config_id'] = $this->configId;
        }
        if (null !== $this->componentId) {
            $res['component_id'] = $this->componentId;
        }
        if (null !== $this->commandId) {
            $res['command_id'] = $this->commandId;
        }
        if (null !== $this->bgEnable) {
            $res['bg_enable'] = $this->bgEnable;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->customerIds) {
            $res['customer_ids'] = $this->customerIds;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->versionStatus) {
            $res['version_status'] = $this->versionStatus;
        }
        if (null !== $this->instances) {
            $res['instances'] = null !== $this->instances ? $this->instances->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Buildpack
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['des'])) {
            $model->des = $map['des'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['stack'])) {
            $model->stack = $map['stack'];
        }
        if (isset($map['deploy_script_id'])) {
            $model->deployScriptId = $map['deploy_script_id'];
        }
        if (isset($map['build_script_id'])) {
            $model->buildScriptId = $map['build_script_id'];
        }
        if (isset($map['config_id'])) {
            $model->configId = $map['config_id'];
        }
        if (isset($map['component_id'])) {
            $model->componentId = $map['component_id'];
        }
        if (isset($map['command_id'])) {
            $model->commandId = $map['command_id'];
        }
        if (isset($map['bg_enable'])) {
            $model->bgEnable = $map['bg_enable'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['customer_ids'])) {
            if (!empty($map['customer_ids'])) {
                $model->customerIds = $map['customer_ids'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['version_status'])) {
            $model->versionStatus = $map['version_status'];
        }
        if (isset($map['instances'])) {
            $model->instances = BuildpackInstances::fromMap($map['instances']);
        }

        return $model;
    }
}
