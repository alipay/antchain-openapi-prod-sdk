<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class DebugRecord extends Model
{
    // 应用名
    /**
     * @example paycore
     *
     * @var string
     */
    public $appName;

    // 1：发起方联调，2：参与者联调
    /**
     * @example 1
     *
     * @var int
     */
    public $debugType;

    // 创建时间
    /**
     * @example 2017-01-05 22:59:27
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2017-01-05 22:59:27
     *
     * @var string
     */
    public $gmtModified;

    // 记录id
    /**
     * @example 111
     *
     * @var int
     */
    public $id;

    // 发起方信息
    /**
     * @example
     *
     * @var DebugInitiator
     */
    public $initiator;

    // 环境唯一标识
    /**
     * @example dev;alipay
     *
     * @var string
     */
    public $instanceId;

    // 执行人
    /**
     * @example 张三
     *
     * @var string
     */
    public $operator;

    // 参与者信息
    /**
     * @example
     *
     * @var DebugParticipator
     */
    public $participator;

    // 状态
    /**
     * @example 0
     *
     * @var string
     */
    public $state;

    // 联调结果信息
    /**
     * @example 发起方联调成功
     *
     * @var string
     */
    public $msg;
    protected $_name = [
        'appName'      => 'app_name',
        'debugType'    => 'debug_type',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
        'id'           => 'id',
        'initiator'    => 'initiator',
        'instanceId'   => 'instance_id',
        'operator'     => 'operator',
        'participator' => 'participator',
        'state'        => 'state',
        'msg'          => 'msg',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('debugType', $this->debugType, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('initiator', $this->initiator, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('participator', $this->participator, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->debugType) {
            $res['debug_type'] = $this->debugType;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->initiator) {
            $res['initiator'] = null !== $this->initiator ? $this->initiator->toMap() : null;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->participator) {
            $res['participator'] = null !== $this->participator ? $this->participator->toMap() : null;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DebugRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['debug_type'])) {
            $model->debugType = $map['debug_type'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['initiator'])) {
            $model->initiator = DebugInitiator::fromMap($map['initiator']);
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['participator'])) {
            $model->participator = DebugParticipator::fromMap($map['participator']);
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }

        return $model;
    }
}
