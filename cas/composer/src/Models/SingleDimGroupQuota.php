<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SingleDimGroupQuota extends Model
{
    // quota_id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $quotaId;

    // 后端用，前端无需关心
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $dimGroupId;

    // dim_identity
    /**
     * @example WORKSPACE
     *
     * @var string
     */
    public $dimIdentity;

    // resource_identity
    /**
     * @example CPU
     *
     * @var string
     */
    public $resourceIdentity;

    // 配额最大值，注意:1. hardLimit为 -1时 表时无限大2. hardLimit为 -2时 表时无限小
    /**
     * @example
     *
     * @var int
     */
    public $hardLimit;

    // 后端用，前端无需关心
    /**
     * @example 同步接口
     *
     * @var string
     */
    public $syncInterface;

    // 创建者
    /**
     * @example yushan
     *
     * @var string
     */
    public $creatorName;

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

    // 维度实例的值，比如某个workspace的ID
    /**
     * @example 00000001
     *
     * @var string
     */
    public $dimInsValue;

    // 由于额度只支持整数，用这个浮点数factor表示乘数因子，
    /**
     * @example 1
     *
     * @var string
     */
    public $quotaFactor;
    protected $_name = [
        'quotaId'          => 'quota_id',
        'dimGroupId'       => 'dim_group_id',
        'dimIdentity'      => 'dim_identity',
        'resourceIdentity' => 'resource_identity',
        'hardLimit'        => 'hard_limit',
        'syncInterface'    => 'sync_interface',
        'creatorName'      => 'creator_name',
        'utcCreate'        => 'utc_create',
        'utcModified'      => 'utc_modified',
        'dimInsValue'      => 'dim_ins_value',
        'quotaFactor'      => 'quota_factor',
    ];

    public function validate()
    {
        Model::validateRequired('quotaId', $this->quotaId, true);
        Model::validateRequired('dimIdentity', $this->dimIdentity, true);
        Model::validateRequired('resourceIdentity', $this->resourceIdentity, true);
        Model::validateRequired('hardLimit', $this->hardLimit, true);
        Model::validateRequired('dimInsValue', $this->dimInsValue, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->quotaId) {
            $res['quota_id'] = $this->quotaId;
        }
        if (null !== $this->dimGroupId) {
            $res['dim_group_id'] = $this->dimGroupId;
        }
        if (null !== $this->dimIdentity) {
            $res['dim_identity'] = $this->dimIdentity;
        }
        if (null !== $this->resourceIdentity) {
            $res['resource_identity'] = $this->resourceIdentity;
        }
        if (null !== $this->hardLimit) {
            $res['hard_limit'] = $this->hardLimit;
        }
        if (null !== $this->syncInterface) {
            $res['sync_interface'] = $this->syncInterface;
        }
        if (null !== $this->creatorName) {
            $res['creator_name'] = $this->creatorName;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->dimInsValue) {
            $res['dim_ins_value'] = $this->dimInsValue;
        }
        if (null !== $this->quotaFactor) {
            $res['quota_factor'] = $this->quotaFactor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SingleDimGroupQuota
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['quota_id'])) {
            $model->quotaId = $map['quota_id'];
        }
        if (isset($map['dim_group_id'])) {
            $model->dimGroupId = $map['dim_group_id'];
        }
        if (isset($map['dim_identity'])) {
            $model->dimIdentity = $map['dim_identity'];
        }
        if (isset($map['resource_identity'])) {
            $model->resourceIdentity = $map['resource_identity'];
        }
        if (isset($map['hard_limit'])) {
            $model->hardLimit = $map['hard_limit'];
        }
        if (isset($map['sync_interface'])) {
            $model->syncInterface = $map['sync_interface'];
        }
        if (isset($map['creator_name'])) {
            $model->creatorName = $map['creator_name'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['dim_ins_value'])) {
            $model->dimInsValue = $map['dim_ins_value'];
        }
        if (isset($map['quota_factor'])) {
            $model->quotaFactor = $map['quota_factor'];
        }

        return $model;
    }
}
