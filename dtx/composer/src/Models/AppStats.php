<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class AppStats extends Model
{
    // app name
    /**
     * @example app1
     *
     * @var string
     */
    public $appName;

    // 异常数
    /**
     * @example
     *
     * @var int
     */
    public $exceptionTotal;

    // 时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 发起方
    /**
     * @example ["110001"]
     *
     * @var string[]
     */
    public $initiator;

    // 参与者
    /**
     * @example ["action1", "action2"]
     *
     * @var string[]
     */
    public $participator;

    // 今日事务总数
    /**
     * @example
     *
     * @var int
     */
    public $todayTotal;

    // Saga模式返回3，其它模式不返回
    /**
     * @example 3
     *
     * @var int
     */
    public $actionMode;

    // 字段ID
    /**
     * @example 0
     *
     * @var int
     */
    public $id;
    protected $_name = [
        'appName'        => 'app_name',
        'exceptionTotal' => 'exception_total',
        'gmtCreate'      => 'gmt_create',
        'initiator'      => 'initiator',
        'participator'   => 'participator',
        'todayTotal'     => 'today_total',
        'actionMode'     => 'action_mode',
        'id'             => 'id',
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
        if (null !== $this->exceptionTotal) {
            $res['exception_total'] = $this->exceptionTotal;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->initiator) {
            $res['initiator'] = $this->initiator;
        }
        if (null !== $this->participator) {
            $res['participator'] = $this->participator;
        }
        if (null !== $this->todayTotal) {
            $res['today_total'] = $this->todayTotal;
        }
        if (null !== $this->actionMode) {
            $res['action_mode'] = $this->actionMode;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppStats
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['exception_total'])) {
            $model->exceptionTotal = $map['exception_total'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['initiator'])) {
            if (!empty($map['initiator'])) {
                $model->initiator = $map['initiator'];
            }
        }
        if (isset($map['participator'])) {
            if (!empty($map['participator'])) {
                $model->participator = $map['participator'];
            }
        }
        if (isset($map['today_total'])) {
            $model->todayTotal = $map['today_total'];
        }
        if (isset($map['action_mode'])) {
            $model->actionMode = $map['action_mode'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
