<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class OpsCheckResult extends Model
{
    // 应用名
    /**
     * @example checkservice
     *
     * @var string
     */
    public $app;

    // 实际实例数
    /**
     * @example 1
     *
     * @var int
     */
    public $actualInstanceNum;

    // 预期实例数
    /**
     * @example 2
     *
     * @var int
     */
    public $expectInstanceNum;

    // 应用监控指标健康数
    /**
     * @example 1
     *
     * @var int
     */
    public $appHealthyNum;

    //
    // 应用监控指标异常数
    /**
     * @example 1
     *
     * @var int
     */
    public $appUnhealthyNum;

    // 自定义监控指标健康数
    /**
     * @example 1
     *
     * @var int
     */
    public $customHealthyNum;

    // 自定义监控指标异常数
    /**
     * @example 1
     *
     * @var int
     */
    public $customUnhealthyNum;

    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 规则状态 0：已关闭 1：已开启
    /**
     * @example 0
     *
     * @var int
     */
    public $ruleStatus;

    // rule_id
    /**
     * @example 1
     *
     * @var string
     */
    public $ruleId;
    protected $_name = [
        'app'                => 'app',
        'actualInstanceNum'  => 'actual_instance_num',
        'expectInstanceNum'  => 'expect_instance_num',
        'appHealthyNum'      => 'app_healthy_num',
        'appUnhealthyNum'    => 'app_unhealthy_num',
        'customHealthyNum'   => 'custom_healthy_num',
        'customUnhealthyNum' => 'custom_unhealthy_num',
        'id'                 => 'id',
        'ruleStatus'         => 'rule_status',
        'ruleId'             => 'rule_id',
    ];

    public function validate()
    {
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('actualInstanceNum', $this->actualInstanceNum, true);
        Model::validateRequired('expectInstanceNum', $this->expectInstanceNum, true);
        Model::validateRequired('appHealthyNum', $this->appHealthyNum, true);
        Model::validateRequired('appUnhealthyNum', $this->appUnhealthyNum, true);
        Model::validateRequired('customHealthyNum', $this->customHealthyNum, true);
        Model::validateRequired('customUnhealthyNum', $this->customUnhealthyNum, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('ruleStatus', $this->ruleStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->actualInstanceNum) {
            $res['actual_instance_num'] = $this->actualInstanceNum;
        }
        if (null !== $this->expectInstanceNum) {
            $res['expect_instance_num'] = $this->expectInstanceNum;
        }
        if (null !== $this->appHealthyNum) {
            $res['app_healthy_num'] = $this->appHealthyNum;
        }
        if (null !== $this->appUnhealthyNum) {
            $res['app_unhealthy_num'] = $this->appUnhealthyNum;
        }
        if (null !== $this->customHealthyNum) {
            $res['custom_healthy_num'] = $this->customHealthyNum;
        }
        if (null !== $this->customUnhealthyNum) {
            $res['custom_unhealthy_num'] = $this->customUnhealthyNum;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->ruleStatus) {
            $res['rule_status'] = $this->ruleStatus;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsCheckResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['actual_instance_num'])) {
            $model->actualInstanceNum = $map['actual_instance_num'];
        }
        if (isset($map['expect_instance_num'])) {
            $model->expectInstanceNum = $map['expect_instance_num'];
        }
        if (isset($map['app_healthy_num'])) {
            $model->appHealthyNum = $map['app_healthy_num'];
        }
        if (isset($map['app_unhealthy_num'])) {
            $model->appUnhealthyNum = $map['app_unhealthy_num'];
        }
        if (isset($map['custom_healthy_num'])) {
            $model->customHealthyNum = $map['custom_healthy_num'];
        }
        if (isset($map['custom_unhealthy_num'])) {
            $model->customUnhealthyNum = $map['custom_unhealthy_num'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['rule_status'])) {
            $model->ruleStatus = $map['rule_status'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }

        return $model;
    }
}
