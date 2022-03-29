<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryLogpathMetricsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 日志路径
    /**
     * @var string
     */
    public $fullpath;

    // 工作空间名
    /**
     * @var string
     */
    public $workspaceName;

    // 监控数据起始时间
    /**
     * @var int
     */
    public $start;

    // 监控数据结束时间
    /**
     * @var int
     */
    public $end;
    protected $_name = [
        'authToken'     => 'auth_token',
        'appName'       => 'app_name',
        'fullpath'      => 'fullpath',
        'workspaceName' => 'workspace_name',
        'start'         => 'start',
        'end'           => 'end',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('fullpath', $this->fullpath, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->fullpath) {
            $res['fullpath'] = $this->fullpath;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLogpathMetricsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['fullpath'])) {
            $model->fullpath = $map['fullpath'];
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

        return $model;
    }
}
