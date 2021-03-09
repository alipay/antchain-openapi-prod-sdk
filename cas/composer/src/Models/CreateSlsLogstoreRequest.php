<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateSlsLogstoreRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 日志库名称，在Project下必须唯一
    /**
     * @var string
     */
    public $logstoreName;

    // 日志项目名称
    /**
     * @var string
     */
    public $projectName;

    // 区域id
    /**
     * @var string
     */
    public $slsRegionId;

    // Shard个数，单位为个，范围为1~100
    /**
     * @var int
     */
    public $shardCount;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 数据的保存时间，单位为天，范围1~3600。
    /**
     * @var int
     */
    public $ttl;

    // 是否添加索引
    /**
     * @var bool
     */
    public $addIndex;
    protected $_name = [
        'authToken'    => 'auth_token',
        'logstoreName' => 'logstore_name',
        'projectName'  => 'project_name',
        'slsRegionId'  => 'sls_region_id',
        'shardCount'   => 'shard_count',
        'tenantId'     => 'tenant_id',
        'ttl'          => 'ttl',
        'addIndex'     => 'add_index',
    ];

    public function validate()
    {
        Model::validateRequired('logstoreName', $this->logstoreName, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('shardCount', $this->shardCount, true);
        Model::validateRequired('ttl', $this->ttl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->logstoreName) {
            $res['logstore_name'] = $this->logstoreName;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->slsRegionId) {
            $res['sls_region_id'] = $this->slsRegionId;
        }
        if (null !== $this->shardCount) {
            $res['shard_count'] = $this->shardCount;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->ttl) {
            $res['ttl'] = $this->ttl;
        }
        if (null !== $this->addIndex) {
            $res['add_index'] = $this->addIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSlsLogstoreRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['logstore_name'])) {
            $model->logstoreName = $map['logstore_name'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['sls_region_id'])) {
            $model->slsRegionId = $map['sls_region_id'];
        }
        if (isset($map['shard_count'])) {
            $model->shardCount = $map['shard_count'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['ttl'])) {
            $model->ttl = $map['ttl'];
        }
        if (isset($map['add_index'])) {
            $model->addIndex = $map['add_index'];
        }

        return $model;
    }
}
