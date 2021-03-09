<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QuerySlsLogRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 查询开始时间点（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
    /**
     * @var int
     */
    public $from;

    // 请求返回的最大日志条数。取值范围为 0~100，默认值为 100。
    /**
     * @var int
     */
    public $line;

    // 需要查询日志的 Logstore 名称。
    /**
     * @var string
     */
    public $logstoreName;

    // 请求返回日志的起始点。取值范围为 0 或正整数，默认值为 0。
    /**
     * @var int
     */
    public $offset;

    // 日志项目名称
    /**
     * @var string
     */
    public $projectName;

    // 查询表达式。关于查询表达式的详细语法，请参见 。
    /**
     * @var string
     */
    public $query;

    // 区域id
    /**
     * @var string
     */
    public $slsRegionId;

    // 是否按日志时间戳逆序返回日志，精确到分钟级别。true 表示逆序，false 表示顺序，默认值为 false。
    /**
     * @var bool
     */
    public $reverse;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 查询结束时间点（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
    /**
     * @var int
     */
    public $to;

    // 查询日志主题。
    /**
     * @var string
     */
    public $topic;

    // 查询 Logstore 数据的类型。在 GetLogs 接口中该参数必须为 log。
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'    => 'auth_token',
        'from'         => 'from',
        'line'         => 'line',
        'logstoreName' => 'logstore_name',
        'offset'       => 'offset',
        'projectName'  => 'project_name',
        'query'        => 'query',
        'slsRegionId'  => 'sls_region_id',
        'reverse'      => 'reverse',
        'tenantId'     => 'tenant_id',
        'to'           => 'to',
        'topic'        => 'topic',
        'type'         => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('logstoreName', $this->logstoreName, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('to', $this->to, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->line) {
            $res['line'] = $this->line;
        }
        if (null !== $this->logstoreName) {
            $res['logstore_name'] = $this->logstoreName;
        }
        if (null !== $this->offset) {
            $res['offset'] = $this->offset;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->slsRegionId) {
            $res['sls_region_id'] = $this->slsRegionId;
        }
        if (null !== $this->reverse) {
            $res['reverse'] = $this->reverse;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySlsLogRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['line'])) {
            $model->line = $map['line'];
        }
        if (isset($map['logstore_name'])) {
            $model->logstoreName = $map['logstore_name'];
        }
        if (isset($map['offset'])) {
            $model->offset = $map['offset'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }
        if (isset($map['sls_region_id'])) {
            $model->slsRegionId = $map['sls_region_id'];
        }
        if (isset($map['reverse'])) {
            $model->reverse = $map['reverse'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
