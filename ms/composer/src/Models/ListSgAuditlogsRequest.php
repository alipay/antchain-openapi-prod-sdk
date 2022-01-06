<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ListSgAuditlogsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 开始时间
    /**
     * @var string
     */
    public $beginTime;

    // 截止时间
    /**
     * @var string
     */
    public $endTime;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 操作类型
    /**
     * @var string
     */
    public $operateType;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 起始页
    /**
     * @var int
     */
    public $start;

    // 0 失败 1 成功
    /**
     * @var int
     */
    public $status;

    // 实体id
    /**
     * @var string
     */
    public $objectId;

    // 实体类型
    /**
     * @var string
     */
    public $objectType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'beginTime'         => 'begin_time',
        'endTime'           => 'end_time',
        'instanceId'        => 'instance_id',
        'operateType'       => 'operate_type',
        'operator'          => 'operator',
        'pageSize'          => 'page_size',
        'start'             => 'start',
        'status'            => 'status',
        'objectId'          => 'object_id',
        'objectType'        => 'object_type',
    ];

    public function validate()
    {
        Model::validatePattern('beginTime', $this->beginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('instanceId', $this->instanceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->beginTime) {
            $res['begin_time'] = $this->beginTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->objectId) {
            $res['object_id'] = $this->objectId;
        }
        if (null !== $this->objectType) {
            $res['object_type'] = $this->objectType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSgAuditlogsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['begin_time'])) {
            $model->beginTime = $map['begin_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['object_id'])) {
            $model->objectId = $map['object_id'];
        }
        if (isset($map['object_type'])) {
            $model->objectType = $map['object_type'];
        }

        return $model;
    }
}
