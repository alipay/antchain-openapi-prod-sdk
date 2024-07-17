<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class OutboundTaskListResponseData extends Model
{
    // 任务数据库id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 任务名称
    /**
     * @example ss
     *
     * @var string
     */
    public $name;

    // 任务id
    /**
     * @example ss
     *
     * @var string
     */
    public $code;

    // 流程前端id/流程code
    /**
     * @example cjnsdfkj234r
     *
     * @var string
     */
    public $flowFeld;

    // 流程id
    /**
     * @example
     *
     * @var int
     */
    public $flowId;

    // 流程名称
    /**
     * @example ss
     *
     * @var string
     */
    public $flowName;

    // 流程环境区分
    // PRE——预发
    // PUB——线上
    /**
     * @example PRE
     *
     * @var string
     */
    public $flowEnv;

    // 规则id
    /**
     * @example
     *
     * @var int
     */
    public $ruleId;

    // 规则名称
    /**
     * @example ss
     *
     * @var string
     */
    public $ruleName;

    // 状态
    // USING-启用
    // UNUSED-不启用
    // DELETED-已删除
    /**
     * @example USING
     *
     * @var string
     */
    public $status;

    // 当前任务版本号
    /**
     * @example
     *
     * @var int
     */
    public $version;

    // 当前引用流程版本号
    /**
     * @example
     *
     * @var int
     */
    public $flowVersion;

    // 流程最新的版本号
    /**
     * @example
     *
     * @var int
     */
    public $flowLatestVersion;

    // 当前引用规则版本号
    /**
     * @example
     *
     * @var int
     */
    public $ruleVersion;

    // 规则最新的版本号
    /**
     * @example
     *
     * @var int
     */
    public $ruleLatestVersion;

    // 任务最新的版本号
    /**
     * @example
     *
     * @var int
     */
    public $latestVersion;

    // 任务线上版本号
    /**
     * @example
     *
     * @var int
     */
    public $pubVersion;

    // 任务是否在发布流程中
    /**
     * @example true, false
     *
     * @var bool
     */
    public $publishing;
    protected $_name = [
        'id'                => 'id',
        'name'              => 'name',
        'code'              => 'code',
        'flowFeld'          => 'flow_feld',
        'flowId'            => 'flow_id',
        'flowName'          => 'flow_name',
        'flowEnv'           => 'flow_env',
        'ruleId'            => 'rule_id',
        'ruleName'          => 'rule_name',
        'status'            => 'status',
        'version'           => 'version',
        'flowVersion'       => 'flow_version',
        'flowLatestVersion' => 'flow_latest_version',
        'ruleVersion'       => 'rule_version',
        'ruleLatestVersion' => 'rule_latest_version',
        'latestVersion'     => 'latest_version',
        'pubVersion'        => 'pub_version',
        'publishing'        => 'publishing',
    ];

    public function validate()
    {
        Model::validateRequired('publishing', $this->publishing, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->flowFeld) {
            $res['flow_feld'] = $this->flowFeld;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->flowName) {
            $res['flow_name'] = $this->flowName;
        }
        if (null !== $this->flowEnv) {
            $res['flow_env'] = $this->flowEnv;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->flowVersion) {
            $res['flow_version'] = $this->flowVersion;
        }
        if (null !== $this->flowLatestVersion) {
            $res['flow_latest_version'] = $this->flowLatestVersion;
        }
        if (null !== $this->ruleVersion) {
            $res['rule_version'] = $this->ruleVersion;
        }
        if (null !== $this->ruleLatestVersion) {
            $res['rule_latest_version'] = $this->ruleLatestVersion;
        }
        if (null !== $this->latestVersion) {
            $res['latest_version'] = $this->latestVersion;
        }
        if (null !== $this->pubVersion) {
            $res['pub_version'] = $this->pubVersion;
        }
        if (null !== $this->publishing) {
            $res['publishing'] = $this->publishing;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OutboundTaskListResponseData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['flow_feld'])) {
            $model->flowFeld = $map['flow_feld'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['flow_name'])) {
            $model->flowName = $map['flow_name'];
        }
        if (isset($map['flow_env'])) {
            $model->flowEnv = $map['flow_env'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['flow_version'])) {
            $model->flowVersion = $map['flow_version'];
        }
        if (isset($map['flow_latest_version'])) {
            $model->flowLatestVersion = $map['flow_latest_version'];
        }
        if (isset($map['rule_version'])) {
            $model->ruleVersion = $map['rule_version'];
        }
        if (isset($map['rule_latest_version'])) {
            $model->ruleLatestVersion = $map['rule_latest_version'];
        }
        if (isset($map['latest_version'])) {
            $model->latestVersion = $map['latest_version'];
        }
        if (isset($map['pub_version'])) {
            $model->pubVersion = $map['pub_version'];
        }
        if (isset($map['publishing'])) {
            $model->publishing = $map['publishing'];
        }

        return $model;
    }
}
