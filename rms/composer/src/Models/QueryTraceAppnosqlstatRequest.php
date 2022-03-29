<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceAppnosqlstatRequest extends Model
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

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 开始毫秒时间戳
    /**
     * @var int
     */
    public $startTime;

    // 结束毫秒时间戳
    /**
     * @var int
     */
    public $endTime;

    // 排序字段
    /**
     * @var string
     */
    public $sortBy;

    // 排序是否逆序
    /**
     * @var bool
     */
    public $sortReverse;

    // 分页页数
    /**
     * @var int
     */
    public $pageNumber;

    // 每页记录条数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'appName'       => 'app_name',
        'startTime'     => 'start_time',
        'endTime'       => 'end_time',
        'sortBy'        => 'sort_by',
        'sortReverse'   => 'sort_reverse',
        'pageNumber'    => 'page_number',
        'pageSize'      => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->sortBy) {
            $res['sort_by'] = $this->sortBy;
        }
        if (null !== $this->sortReverse) {
            $res['sort_reverse'] = $this->sortReverse;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceAppnosqlstatRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['sort_by'])) {
            $model->sortBy = $map['sort_by'];
        }
        if (isset($map['sort_reverse'])) {
            $model->sortReverse = $map['sort_reverse'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
