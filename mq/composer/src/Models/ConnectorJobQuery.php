<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConnectorJobQuery extends Model
{
    // 任务名称
    /**
     * @example ODPS_TEST
     *
     * @var string
     */
    public $name;

    // 任务状态
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $status;

    // 排序的列
    /**
     * @example date
     *
     * @var string
     */
    public $sortColumn;

    // increment代表升序排序，decrement代表降序排序。
    //
    /**
     * @example increment、decrement
     *
     * @var string
     */
    public $sortType;

    // 应用名
    /**
     * @example antconnector
     *
     * @var string
     */
    public $app;

    // 审批状态
    /**
     * @example PENDING
     *
     * @var string
     */
    public $processStatus;
    protected $_name = [
        'name'          => 'name',
        'status'        => 'status',
        'sortColumn'    => 'sort_column',
        'sortType'      => 'sort_type',
        'app'           => 'app',
        'processStatus' => 'process_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->sortColumn) {
            $res['sort_column'] = $this->sortColumn;
        }
        if (null !== $this->sortType) {
            $res['sort_type'] = $this->sortType;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->processStatus) {
            $res['process_status'] = $this->processStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConnectorJobQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sort_column'])) {
            $model->sortColumn = $map['sort_column'];
        }
        if (isset($map['sort_type'])) {
            $model->sortType = $map['sort_type'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['process_status'])) {
            $model->processStatus = $map['process_status'];
        }

        return $model;
    }
}
