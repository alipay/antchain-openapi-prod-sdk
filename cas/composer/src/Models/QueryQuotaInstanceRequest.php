<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryQuotaInstanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // quota类的ID，请使用Quota API查询获取
    /**
     * @var string
     */
    public $quotaId;

    // 接入配额的时候,在配额中注册的资源标识
    /**
     * @var string
     */
    public $resourceIdentity;

    // 当状态为INFINITE,即无限大.当状态为INFINITESIMAL时,即为无限小
    /**
     * @var string
     */
    public $status;

    // 上限值
    /**
     * @var int
     */
    public $hardLimit;

    // in_use
    /**
     * @var int
     */
    public $inUse;

    // 维度实例组合ID
    /**
     * @var string
     */
    public $dimInstanceGroupId;

    // page_number
    /**
     * @var int
     */
    public $pageNumber;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // 维度标记
    /**
     * @var string
     */
    public $dimIdentity;

    // 维度的值
    /**
     * @var string
     */
    public $dimInsValue;
    protected $_name = [
        'authToken'          => 'auth_token',
        'quotaId'            => 'quota_id',
        'resourceIdentity'   => 'resource_identity',
        'status'             => 'status',
        'hardLimit'          => 'hard_limit',
        'inUse'              => 'in_use',
        'dimInstanceGroupId' => 'dim_instance_group_id',
        'pageNumber'         => 'page_number',
        'pageSize'           => 'page_size',
        'dimIdentity'        => 'dim_identity',
        'dimInsValue'        => 'dim_ins_value',
    ];

    public function validate()
    {
        Model::validateRequired('pageNumber', $this->pageNumber, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->quotaId) {
            $res['quota_id'] = $this->quotaId;
        }
        if (null !== $this->resourceIdentity) {
            $res['resource_identity'] = $this->resourceIdentity;
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
        if (null !== $this->dimInstanceGroupId) {
            $res['dim_instance_group_id'] = $this->dimInstanceGroupId;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->dimIdentity) {
            $res['dim_identity'] = $this->dimIdentity;
        }
        if (null !== $this->dimInsValue) {
            $res['dim_ins_value'] = $this->dimInsValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQuotaInstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['quota_id'])) {
            $model->quotaId = $map['quota_id'];
        }
        if (isset($map['resource_identity'])) {
            $model->resourceIdentity = $map['resource_identity'];
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
        if (isset($map['dim_instance_group_id'])) {
            $model->dimInstanceGroupId = $map['dim_instance_group_id'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['dim_identity'])) {
            $model->dimIdentity = $map['dim_identity'];
        }
        if (isset($map['dim_ins_value'])) {
            $model->dimInsValue = $map['dim_ins_value'];
        }

        return $model;
    }
}
