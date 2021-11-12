<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

/**
 * @internal
 * @coversNothing
 */
class AutoTestCase extends Model
{
    // 测试应用本身的名字
    /**
     * @example zookeepertest
     *
     * @var string
     */
    public $appName;

    // 测试应用本身的版本
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $appVersion;

    // case的级别
    /**
     * @example P1
     *
     * @var string
     */
    public $caseLevel;

    // case的名字
    /**
     * @example 校验共享zookeeper的mode是否正确,且leader仅1个
     *
     * @var string
     */
    public $caseName;

    // case的状态
    /**
     * @example PASSED
     *
     * @var string
     */
    public $caseStatus;

    // case的类型
    /**
     * @example SDK
     *
     * @var string
     */
    public $caseType;

    // case的类
    /**
     * @example com.alipay.zookeeperTest.testSuite.zookeeperTestCases.ZookeeperNormalTest
     *
     * @var string
     */
    public $className;

    // 详情
    /**
     * @example {}
     *
     * @var string
     */
    public $detail;

    // case运行的时间，单位毫秒
    /**
     * @example 140
     *
     * @var int
     */
    public $duration;

    // case的id
    /**
     * @example 73040000927761
     *
     * @var string
     */
    public $id;

    // 测试方法名
    /**
     * @example testLeaderAndFollowers
     *
     * @var string
     */
    public $methodName;
    protected $_name = [
        'appName'    => 'app_name',
        'appVersion' => 'app_version',
        'caseLevel'  => 'case_level',
        'caseName'   => 'case_name',
        'caseStatus' => 'case_status',
        'caseType'   => 'case_type',
        'className'  => 'class_name',
        'detail'     => 'detail',
        'duration'   => 'duration',
        'id'         => 'id',
        'methodName' => 'method_name',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('appVersion', $this->appVersion, true);
        Model::validateRequired('caseLevel', $this->caseLevel, true);
        Model::validateRequired('caseName', $this->caseName, true);
        Model::validateRequired('caseStatus', $this->caseStatus, true);
        Model::validateRequired('caseType', $this->caseType, true);
        Model::validateRequired('className', $this->className, true);
        Model::validateRequired('duration', $this->duration, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('methodName', $this->methodName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->caseLevel) {
            $res['case_level'] = $this->caseLevel;
        }
        if (null !== $this->caseName) {
            $res['case_name'] = $this->caseName;
        }
        if (null !== $this->caseStatus) {
            $res['case_status'] = $this->caseStatus;
        }
        if (null !== $this->caseType) {
            $res['case_type'] = $this->caseType;
        }
        if (null !== $this->className) {
            $res['class_name'] = $this->className;
        }
        if (null !== $this->detail) {
            $res['detail'] = $this->detail;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->methodName) {
            $res['method_name'] = $this->methodName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AutoTestCase
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['case_level'])) {
            $model->caseLevel = $map['case_level'];
        }
        if (isset($map['case_name'])) {
            $model->caseName = $map['case_name'];
        }
        if (isset($map['case_status'])) {
            $model->caseStatus = $map['case_status'];
        }
        if (isset($map['case_type'])) {
            $model->caseType = $map['case_type'];
        }
        if (isset($map['class_name'])) {
            $model->className = $map['class_name'];
        }
        if (isset($map['detail'])) {
            $model->detail = $map['detail'];
        }
        if (isset($map['duration'])) {
            $model->duration = $map['duration'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['method_name'])) {
            $model->methodName = $map['method_name'];
        }

        return $model;
    }
}
