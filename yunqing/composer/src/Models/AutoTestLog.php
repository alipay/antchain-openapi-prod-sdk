<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AutoTestLog extends Model
{
    // 日志id
    /**
     * @example 73040000925130
     *
     * @var string
     */
    public $id;

    // 日志内容
    /**
     * @example Sun Apr 28 14:47:03 CST 2019[] 开始执行自动化测试
     * Sun Apr 28 14:47:52 CST 2019[] start container: 4ba64f01c71b332a2867b424b371244
     * @var string
     */
    public $message;

    // 节点执行的动作
    /**
     * @example T_AUTOTEST_DEPLOY
     *
     * @var string
     */
    public $nodeAction;

    // 节点id
    /**
     * @example 73040000925015
     *
     * @var string
     */
    public $nodeId;

    // 节点所处的阶段
    /**
     * @example execute
     *
     * @var string
     */
    public $stage;

    // 创建时间
    /**
     * @example 2019-04-28T14:47:52+0800
     *
     * @var string
     */
    public $utcCreate;

    // 修改时间
    /**
     * @example 2019-04-28T14:47:52+0800
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'id'          => 'id',
        'message'     => 'message',
        'nodeAction'  => 'node_action',
        'nodeId'      => 'node_id',
        'stage'       => 'stage',
        'utcCreate'   => 'utc_create',
        'utcModified' => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('nodeAction', $this->nodeAction, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('stage', $this->stage, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->nodeAction) {
            $res['node_action'] = $this->nodeAction;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->stage) {
            $res['stage'] = $this->stage;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AutoTestLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['node_action'])) {
            $model->nodeAction = $map['node_action'];
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['stage'])) {
            $model->stage = $map['stage'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
