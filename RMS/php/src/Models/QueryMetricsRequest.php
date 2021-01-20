<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryMetricsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'start' => 'start',
        'end' => 'end',
        'plugin' => 'plugin',
        'dsId' => 'ds_id',
        'contentType' => 'content_type',
        'workspaceName' => 'workspace_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->plugin) {
            $res['plugin'] = $this->plugin;
        }
        if (null !== $this->dsId) {
            $res['ds_id'] = $this->dsId;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMetricsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['start'])){
            $model->start = $map['start'];
        }
        if(isset($map['end'])){
            $model->end = $map['end'];
        }
        if(isset($map['plugin'])){
            $model->plugin = $map['plugin'];
        }
        if(isset($map['ds_id'])){
            $model->dsId = $map['ds_id'];
        }
        if(isset($map['content_type'])){
            $model->contentType = $map['content_type'];
        }
        if(isset($map['workspace_name'])){
            $model->workspaceName = $map['workspace_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

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

    // 插件类型
    /**
     * @var string
     */
    public $plugin;

    // 监控指标 ID
    /**
     * @var int
     */
    public $dsId;

    // contentType
    /**
     * @var string
     */
    public $contentType;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

}
