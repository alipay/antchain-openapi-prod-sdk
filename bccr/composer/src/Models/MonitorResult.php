<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class MonitorResult extends Model
{
    // 监测任务ID
    //
    /**
     * @example 111111111111111111
     *
     * @var string
     */
    public $monitorTaskId;

    // 监测结果ID
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $monitorResultId;

    // 侵权网址
    //
    //
    /**
     * @example http://a.b.c
     *
     * @var string
     */
    public $infrUrl;

    // 侵权主体
    //
    //
    /**
     * @example hhh
     *
     * @var string
     */
    public $infrHost;

    // 侵权标题
    //
    //
    /**
     * @example biaoti
     *
     * @var string
     */
    public $infrTitle;

    // 侵权内容上传时间
    //
    //
    /**
     * @example 1592807928
     *
     * @var int
     */
    public $infrTime;

    // 侵权详情
    //
    /**
     * @example details
     *
     * @var string
     */
    public $detail;
    protected $_name = [
        'monitorTaskId'   => 'monitor_task_id',
        'monitorResultId' => 'monitor_result_id',
        'infrUrl'         => 'infr_url',
        'infrHost'        => 'infr_host',
        'infrTitle'       => 'infr_title',
        'infrTime'        => 'infr_time',
        'detail'          => 'detail',
    ];

    public function validate()
    {
        Model::validateRequired('monitorTaskId', $this->monitorTaskId, true);
        Model::validateRequired('monitorResultId', $this->monitorResultId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->monitorTaskId) {
            $res['monitor_task_id'] = $this->monitorTaskId;
        }
        if (null !== $this->monitorResultId) {
            $res['monitor_result_id'] = $this->monitorResultId;
        }
        if (null !== $this->infrUrl) {
            $res['infr_url'] = $this->infrUrl;
        }
        if (null !== $this->infrHost) {
            $res['infr_host'] = $this->infrHost;
        }
        if (null !== $this->infrTitle) {
            $res['infr_title'] = $this->infrTitle;
        }
        if (null !== $this->infrTime) {
            $res['infr_time'] = $this->infrTime;
        }
        if (null !== $this->detail) {
            $res['detail'] = $this->detail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitorResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['monitor_task_id'])) {
            $model->monitorTaskId = $map['monitor_task_id'];
        }
        if (isset($map['monitor_result_id'])) {
            $model->monitorResultId = $map['monitor_result_id'];
        }
        if (isset($map['infr_url'])) {
            $model->infrUrl = $map['infr_url'];
        }
        if (isset($map['infr_host'])) {
            $model->infrHost = $map['infr_host'];
        }
        if (isset($map['infr_title'])) {
            $model->infrTitle = $map['infr_title'];
        }
        if (isset($map['infr_time'])) {
            $model->infrTime = $map['infr_time'];
        }
        if (isset($map['detail'])) {
            $model->detail = $map['detail'];
        }

        return $model;
    }
}
