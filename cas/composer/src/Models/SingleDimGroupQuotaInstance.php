<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SingleDimGroupQuotaInstance extends Model
{
    // 配额实例所属的 配额id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $quotaId;

    // 配额实例id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $quotaInsId;

    // 维度实例组合id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $dimInsGroupId;

    // 维度标识
    /**
     * @example WORKSPACE
     *
     * @var string
     */
    public $dimIdentity;

    // 维度实例的值，比如某个具体的workspace_id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $dimInsValue;

    // resource
    /**
     * @example CPU
     *
     * @var string
     */
    public $resource;

    // 表示是无限大还是无限小
    /**
     * @example INFINITE
     *
     * @var string
     */
    public $status;

    // 限额值
    /**
     * @example 1
     *
     * @var int
     */
    public $hardLimit;

    // 已经使用的额度
    /**
     * @example 1
     *
     * @var int
     */
    public $inUse;

    // 预分配的额度
    /**
     * @example 1
     *
     * @var int
     */
    public $reserved;

    // 保留额度
    /**
     * @example
     *
     * @var int
     */
    public $remain;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utc_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // quota乘数因子，用以解决k8s资源可以用小数表示的问题。由于OP不支持浮点数，请用字符串表示
    /**
     * @example 0.1
     *
     * @var string
     */
    public $quotaFactor;
    protected $_name = [
        'quotaId'       => 'quota_id',
        'quotaInsId'    => 'quota_ins_id',
        'dimInsGroupId' => 'dim_ins_group_id',
        'dimIdentity'   => 'dim_identity',
        'dimInsValue'   => 'dim_ins_value',
        'resource'      => 'resource',
        'status'        => 'status',
        'hardLimit'     => 'hard_limit',
        'inUse'         => 'in_use',
        'reserved'      => 'reserved',
        'remain'        => 'remain',
        'utcCreate'     => 'utc_create',
        'utcModified'   => 'utc_modified',
        'quotaFactor'   => 'quota_factor',
    ];

    public function validate()
    {
        Model::validateRequired('quotaId', $this->quotaId, true);
        Model::validateRequired('quotaInsId', $this->quotaInsId, true);
        Model::validateRequired('resource', $this->resource, true);
        Model::validateRequired('hardLimit', $this->hardLimit, true);
        Model::validateRequired('inUse', $this->inUse, true);
        Model::validateRequired('quotaFactor', $this->quotaFactor, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->quotaId) {
            $res['quota_id'] = $this->quotaId;
        }
        if (null !== $this->quotaInsId) {
            $res['quota_ins_id'] = $this->quotaInsId;
        }
        if (null !== $this->dimInsGroupId) {
            $res['dim_ins_group_id'] = $this->dimInsGroupId;
        }
        if (null !== $this->dimIdentity) {
            $res['dim_identity'] = $this->dimIdentity;
        }
        if (null !== $this->dimInsValue) {
            $res['dim_ins_value'] = $this->dimInsValue;
        }
        if (null !== $this->resource) {
            $res['resource'] = $this->resource;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->hardLimit) {
            $res['hard_limit'] = $this->hardLimit;
        }
        if (null !== $this->inUse) {
            $res['in_use'] = $this->inUse;
        }
        if (null !== $this->reserved) {
            $res['reserved'] = $this->reserved;
        }
        if (null !== $this->remain) {
            $res['remain'] = $this->remain;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->quotaFactor) {
            $res['quota_factor'] = $this->quotaFactor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SingleDimGroupQuotaInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['quota_id'])) {
            $model->quotaId = $map['quota_id'];
        }
        if (isset($map['quota_ins_id'])) {
            $model->quotaInsId = $map['quota_ins_id'];
        }
        if (isset($map['dim_ins_group_id'])) {
            $model->dimInsGroupId = $map['dim_ins_group_id'];
        }
        if (isset($map['dim_identity'])) {
            $model->dimIdentity = $map['dim_identity'];
        }
        if (isset($map['dim_ins_value'])) {
            $model->dimInsValue = $map['dim_ins_value'];
        }
        if (isset($map['resource'])) {
            $model->resource = $map['resource'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['hard_limit'])) {
            $model->hardLimit = $map['hard_limit'];
        }
        if (isset($map['in_use'])) {
            $model->inUse = $map['in_use'];
        }
        if (isset($map['reserved'])) {
            $model->reserved = $map['reserved'];
        }
        if (isset($map['remain'])) {
            $model->remain = $map['remain'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['quota_factor'])) {
            $model->quotaFactor = $map['quota_factor'];
        }

        return $model;
    }
}
