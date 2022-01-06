<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class GuardianApp extends Model
{
    // 是否生效
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enable;

    // 监控id
    /**
     * @example 2134
     *
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 描述字段
    /**
     * @example EC_KBRECONCENTER_CUSTOMIZEBILL
     *
     * @var string
     */
    public $name;

    // 运行模式
    /**
     * @example CONTROL
     *
     * @var string
     */
    public $runMode;
    protected $_name = [
        'enable'     => 'enable',
        'id'         => 'id',
        'instanceId' => 'instance_id',
        'name'       => 'name',
        'runMode'    => 'run_mode',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->runMode) {
            $res['run_mode'] = $this->runMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GuardianApp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['run_mode'])) {
            $model->runMode = $map['run_mode'];
        }

        return $model;
    }
}
