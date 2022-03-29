<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAlarmHistoryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 开始时间
    /**
     * @var int
     */
    public $start;

    // 结束时间
    /**
     * @var int
     */
    public $end;

    // 是否查询所有告警类型
    /**
     * @var bool
     */
    public $allTypes;

    // 告警类型数组
    /**
     * @var string[]
     */
    public $alarmTypes;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // dsid
    /**
     * @var int
     */
    public $dsid;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'start'         => 'start',
        'end'           => 'end',
        'allTypes'      => 'all_types',
        'alarmTypes'    => 'alarm_types',
        'currentPage'   => 'current_page',
        'pageSize'      => 'page_size',
        'dsid'          => 'dsid',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
        Model::validateRequired('allTypes', $this->allTypes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->allTypes) {
            $res['all_types'] = $this->allTypes;
        }
        if (null !== $this->alarmTypes) {
            $res['alarm_types'] = $this->alarmTypes;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->dsid) {
            $res['dsid'] = $this->dsid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAlarmHistoryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['all_types'])) {
            $model->allTypes = $map['all_types'];
        }
        if (isset($map['alarm_types'])) {
            if (!empty($map['alarm_types'])) {
                $model->alarmTypes = $map['alarm_types'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['dsid'])) {
            $model->dsid = $map['dsid'];
        }

        return $model;
    }
}
