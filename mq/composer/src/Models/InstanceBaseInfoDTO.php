<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class InstanceBaseInfoDTO extends Model
{
    // 各个协议的接入点
    /**
     * @example
     *
     * @var EndpointsDTO
     */
    public $endpoints;

    // 实例是否有命名空间。取值说明如下：
    //
    // true：拥有独立命名空间，资源命名确保实例内唯一，跨实例之间可重名
    // false：无独立命名空间，实例内或者跨实例之间，资源命名必须全局唯一
    /**
     * @example true, false
     *
     * @var bool
     */
    public $independentNaming;

    // 实例 ID
    /**
     * @example MQ_INST_111111111111_DOxxxxxx
     *
     * @var string
     */
    public $instanceId;

    // 实例名称
    /**
     * @example test
     *
     * @var string
     */
    public $instanceName;

    // 实例状态。取值说明如下：
    //
    // 0：铂金版实例部署中
    // 2：后付费实例已欠费
    // 5：后付费实例或铂金版实例服务中
    // 7：铂金版实例升级中且服务可用
    /**
     * @example 5
     *
     * @var int
     */
    public $instanceStatus;

    // 实例类型。取值说明如下：
    //
    // 1：后付费实例
    // 2：铂金版实例
    /**
     * @example 1
     *
     * @var int
     */
    public $instanceType;

    // 铂金版实例过期时间
    //
    //
    /**
     * @example 1575392461
     *
     * @var int
     */
    public $releaseTime;

    // 备注
    /**
     * @example test
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'endpoints'         => 'endpoints',
        'independentNaming' => 'independent_naming',
        'instanceId'        => 'instance_id',
        'instanceName'      => 'instance_name',
        'instanceStatus'    => 'instance_status',
        'instanceType'      => 'instance_type',
        'releaseTime'       => 'release_time',
        'remark'            => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('endpoints', $this->endpoints, true);
        Model::validateRequired('independentNaming', $this->independentNaming, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('instanceName', $this->instanceName, true);
        Model::validateRequired('instanceStatus', $this->instanceStatus, true);
        Model::validateRequired('remark', $this->remark, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->endpoints) {
            $res['endpoints'] = null !== $this->endpoints ? $this->endpoints->toMap() : null;
        }
        if (null !== $this->independentNaming) {
            $res['independent_naming'] = $this->independentNaming;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->instanceStatus) {
            $res['instance_status'] = $this->instanceStatus;
        }
        if (null !== $this->instanceType) {
            $res['instance_type'] = $this->instanceType;
        }
        if (null !== $this->releaseTime) {
            $res['release_time'] = $this->releaseTime;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstanceBaseInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['endpoints'])) {
            $model->endpoints = EndpointsDTO::fromMap($map['endpoints']);
        }
        if (isset($map['independent_naming'])) {
            $model->independentNaming = $map['independent_naming'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['instance_name'])) {
            $model->instanceName = $map['instance_name'];
        }
        if (isset($map['instance_status'])) {
            $model->instanceStatus = $map['instance_status'];
        }
        if (isset($map['instance_type'])) {
            $model->instanceType = $map['instance_type'];
        }
        if (isset($map['release_time'])) {
            $model->releaseTime = $map['release_time'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
