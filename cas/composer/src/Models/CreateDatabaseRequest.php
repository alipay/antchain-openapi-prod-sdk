<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateDatabaseRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 数据库账户
    /**
     * @var DatabaseAccount[]
     */
    public $databaseAccounts;

    // db schema
    /**
     * @var DatabaseSchema
     */
    public $databaseSchema;

    // db 引擎，默认为在 MYSQL
    /**
     * @var string
     */
    public $engine;

    // 引擎版本，默认为 MYSQL6
    /**
     * @var string
     */
    public $engineVersion;

    // 创建的实例数量。默认为 1 台
    /**
     * @var int
     */
    public $instanceCount;

    // database 名称
    /**
     * @var string
     */
    public $name;

    // db 规格。
    /**
     * @var string
     */
    public $specId;

    // db 存储空间大小
    /**
     * @var int
     */
    public $storageSize;

    // database 类型，默认为 DATABASE 类型
    /**
     * @var string
     */
    public $type;

    // VPC类型的实例，需要指定虚拟交换机ID。
    /**
     * @var string
     */
    public $vSwitchId;

    // database 所在工作空间
    /**
     * @var string
     */
    public $workspace;

    // app service ids
    /**
     * @var string[]
     */
    public $appServiceIds;

    // app ids
    /**
     * @var string[]
     */
    public $appIds;
    protected $_name = [
        'authToken'        => 'auth_token',
        'databaseAccounts' => 'database_accounts',
        'databaseSchema'   => 'database_schema',
        'engine'           => 'engine',
        'engineVersion'    => 'engine_version',
        'instanceCount'    => 'instance_count',
        'name'             => 'name',
        'specId'           => 'spec_id',
        'storageSize'      => 'storage_size',
        'type'             => 'type',
        'vSwitchId'        => 'v_switch_id',
        'workspace'        => 'workspace',
        'appServiceIds'    => 'app_service_ids',
        'appIds'           => 'app_ids',
    ];

    public function validate()
    {
        Model::validateRequired('specId', $this->specId, true);
        Model::validateRequired('storageSize', $this->storageSize, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->databaseAccounts) {
            $res['database_accounts'] = [];
            if (null !== $this->databaseAccounts && \is_array($this->databaseAccounts)) {
                $n = 0;
                foreach ($this->databaseAccounts as $item) {
                    $res['database_accounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->databaseSchema) {
            $res['database_schema'] = null !== $this->databaseSchema ? $this->databaseSchema->toMap() : null;
        }
        if (null !== $this->engine) {
            $res['engine'] = $this->engine;
        }
        if (null !== $this->engineVersion) {
            $res['engine_version'] = $this->engineVersion;
        }
        if (null !== $this->instanceCount) {
            $res['instance_count'] = $this->instanceCount;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->specId) {
            $res['spec_id'] = $this->specId;
        }
        if (null !== $this->storageSize) {
            $res['storage_size'] = $this->storageSize;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->vSwitchId) {
            $res['v_switch_id'] = $this->vSwitchId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDatabaseRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['database_accounts'])) {
            if (!empty($map['database_accounts'])) {
                $model->databaseAccounts = [];
                $n                       = 0;
                foreach ($map['database_accounts'] as $item) {
                    $model->databaseAccounts[$n++] = null !== $item ? DatabaseAccount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['database_schema'])) {
            $model->databaseSchema = DatabaseSchema::fromMap($map['database_schema']);
        }
        if (isset($map['engine'])) {
            $model->engine = $map['engine'];
        }
        if (isset($map['engine_version'])) {
            $model->engineVersion = $map['engine_version'];
        }
        if (isset($map['instance_count'])) {
            $model->instanceCount = $map['instance_count'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['spec_id'])) {
            $model->specId = $map['spec_id'];
        }
        if (isset($map['storage_size'])) {
            $model->storageSize = $map['storage_size'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['v_switch_id'])) {
            $model->vSwitchId = $map['v_switch_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['app_service_ids'])) {
            if (!empty($map['app_service_ids'])) {
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        if (isset($map['app_ids'])) {
            if (!empty($map['app_ids'])) {
                $model->appIds = $map['app_ids'];
            }
        }

        return $model;
    }
}
