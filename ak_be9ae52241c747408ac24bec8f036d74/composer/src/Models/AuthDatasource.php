<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class AuthDatasource extends Model
{
    // 授权数据源ID
    /**
     * @example "AUTH_DSRC_test00"
     *
     * @var string
     */
    public $authDatasourceId;

    // 创建数据源授权时间(毫秒)
    /**
     * @example 1698659953000
     *
     * @var int
     */
    public $gmtCreate;

    // 更新数据源授权时间(毫秒)
    /**
     * @example 1698659953000
     *
     * @var int
     */
    public $gmtModified;

    // 数据源名称
    /**
     * @example "测试数据源"
     *
     * @var string
     */
    public $name;

    // 对应本地数据源的配置参数
    /**
     * @example "{"datasourceId":"DSRC_20231020170127_kznqCB8x"}"
     *
     * @var string
     */
    public $config;

    // 数据源来源
    /**
     * @example "SAAS"
     *
     * @var string
     */
    public $source;

    // 项目ID
    /**
     * @example "PROJ_test001"
     *
     * @var string
     */
    public $projectId;

    // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
    /**
     * @example "ALL_TENANT"
     *
     * @var string
     */
    public $visibleType;
    protected $_name = [
        'authDatasourceId' => 'auth_datasource_id',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'name'             => 'name',
        'config'           => 'config',
        'source'           => 'source',
        'projectId'        => 'project_id',
        'visibleType'      => 'visible_type',
    ];

    public function validate()
    {
        Model::validateRequired('authDatasourceId', $this->authDatasourceId, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('config', $this->config, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('visibleType', $this->visibleType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authDatasourceId) {
            $res['auth_datasource_id'] = $this->authDatasourceId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->visibleType) {
            $res['visible_type'] = $this->visibleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthDatasource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_datasource_id'])) {
            $model->authDatasourceId = $map['auth_datasource_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['visible_type'])) {
            $model->visibleType = $map['visible_type'];
        }

        return $model;
    }
}
