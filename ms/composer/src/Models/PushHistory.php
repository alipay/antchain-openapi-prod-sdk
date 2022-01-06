<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class PushHistory extends Model
{
    // app name
    /**
     * @example drmdata
     *
     * @var string
     */
    public $appName;

    // 创建
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 推送历史id
    /**
     * @example 12
     *
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @example 0000001
     *
     * @var string
     */
    public $instanceId;

    // 编辑人
    /**
     * @example 罗勇
     *
     * @var string
     */
    public $operator;

    // 推送内容
    //
    //
    //
    //
    /**
     * @example json
     *
     * @var string
     */
    public $pushContent;

    // 逗号分隔的ruleId
    /**
     * @example 1,2
     *
     * @var string
     */
    public $ruleIds;

    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 推送目标
    /**
     * @example target
     *
     * @var string
     */
    public $target;
    protected $_name = [
        'appName'     => 'app_name',
        'gmtCreate'   => 'gmt_create',
        'id'          => 'id',
        'instanceId'  => 'instance_id',
        'operator'    => 'operator',
        'pushContent' => 'push_content',
        'ruleIds'     => 'rule_ids',
        'success'     => 'success',
        'target'      => 'target',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->pushContent) {
            $res['push_content'] = $this->pushContent;
        }
        if (null !== $this->ruleIds) {
            $res['rule_ids'] = $this->ruleIds;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushHistory
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['push_content'])) {
            $model->pushContent = $map['push_content'];
        }
        if (isset($map['rule_ids'])) {
            $model->ruleIds = $map['rule_ids'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }

        return $model;
    }
}
