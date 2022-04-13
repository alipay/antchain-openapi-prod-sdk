<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryFlowRecordRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app 名称
    /**
     * @var string
     */
    public $app;

    // 结束时间
    /**
     * @var string
     */
    public $endTime;

    // 查询页
    /**
     * @var int
     */
    public $pageNo;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 推送状态，可选（SUCCESS，FAILED，INVALID_REQUEST，NO_RECORD，SYSTEM_EXCEPTION，PARAM_QUERY_ERROR，PARAM_INVALID）
    /**
     * @var string
     */
    public $resultCode;

    // 开始时间
    /**
     * @var string
     */
    public $startTime;

    // 环境
    /**
     * @var string
     */
    public $workspaceGroup;

    // 规则类型
    /**
     * @var string
     */
    public $ruleType;
    protected $_name = [
        'authToken'      => 'auth_token',
        'app'            => 'app',
        'endTime'        => 'end_time',
        'pageNo'         => 'page_no',
        'pageSize'       => 'page_size',
        'resultCode'     => 'result_code',
        'startTime'      => 'start_time',
        'workspaceGroup' => 'workspace_group',
        'ruleType'       => 'rule_type',
    ];

    public function validate()
    {
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFlowRecordRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }

        return $model;
    }
}
