<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class RpReleaseEvent extends Model
{
    // 集群名
    /**
     * @example mayibank-sit
     *
     * @var string
     */
    public $cluster;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 事件关联的对象类型
    //
    /**
     * @example Pod
     *
     * @var string
     */
    public $invObjKind;

    // 事件关联对象名字
    //
    /**
     * @example Pod123
     *
     * @var string
     */
    public $invObjName;

    // 事件关联对象的namespace
    //
    /**
     * @example default
     *
     * @var string
     */
    public $invObjNamespace;

    // 事件关联对象版本
    //
    /**
     * @example v1
     *
     * @var string
     */
    public $invObjVersion;

    // 事件详情
    //
    /**
     * @example pulling image "nginx:1.9.1"
     *
     * @var string
     */
    public $message;

    // 事件原因
    //
    /**
     * @example Pulling
     *
     * @var string
     */
    public $reason;

    // 事件来源组件
    //
    /**
     * @example kubelet
     *
     * @var string
     */
    public $sourceComp;

    // start_time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;
    protected $_name = [
        'cluster'         => 'cluster',
        'endTime'         => 'end_time',
        'invObjKind'      => 'inv_obj_kind',
        'invObjName'      => 'inv_obj_name',
        'invObjNamespace' => 'inv_obj_namespace',
        'invObjVersion'   => 'inv_obj_version',
        'message'         => 'message',
        'reason'          => 'reason',
        'sourceComp'      => 'source_comp',
        'startTime'       => 'start_time',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('invObjKind', $this->invObjKind, true);
        Model::validateRequired('invObjName', $this->invObjName, true);
        Model::validateRequired('invObjNamespace', $this->invObjNamespace, true);
        Model::validateRequired('invObjVersion', $this->invObjVersion, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('reason', $this->reason, true);
        Model::validateRequired('sourceComp', $this->sourceComp, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->invObjKind) {
            $res['inv_obj_kind'] = $this->invObjKind;
        }
        if (null !== $this->invObjName) {
            $res['inv_obj_name'] = $this->invObjName;
        }
        if (null !== $this->invObjNamespace) {
            $res['inv_obj_namespace'] = $this->invObjNamespace;
        }
        if (null !== $this->invObjVersion) {
            $res['inv_obj_version'] = $this->invObjVersion;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->sourceComp) {
            $res['source_comp'] = $this->sourceComp;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RpReleaseEvent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['inv_obj_kind'])) {
            $model->invObjKind = $map['inv_obj_kind'];
        }
        if (isset($map['inv_obj_name'])) {
            $model->invObjName = $map['inv_obj_name'];
        }
        if (isset($map['inv_obj_namespace'])) {
            $model->invObjNamespace = $map['inv_obj_namespace'];
        }
        if (isset($map['inv_obj_version'])) {
            $model->invObjVersion = $map['inv_obj_version'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['source_comp'])) {
            $model->sourceComp = $map['source_comp'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }

        return $model;
    }
}
