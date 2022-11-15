<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseCaseInfo extends Model
{
    // 立案信息
    /**
     * @example 立案信息
     *
     * @var string
     */
    public $caseInfo;

    // 案件号
    /**
     * @example 案件号
     *
     * @var string
     */
    public $caseCode;

    // 立案时间
    /**
     * @example 2021-12-09
     *
     * @var string
     */
    public $caseCreateTime;

    // 案件状态
    /**
     * @example 案件状态
     *
     * @var string
     */
    public $caseStatus;

    // 公示状态
    /**
     * @example 公示状态
     *
     * @var string
     */
    public $publishStatus;

    // 被执行人姓名
    /**
     * @example 被执行人姓名
     *
     * @var string
     */
    public $execName;

    // 执行法院
    /**
     * @example 执行法院
     *
     * @var string
     */
    public $execCourtName;

    // 执行标的(元)
    /**
     * @example 执行标的(元)
     *
     * @var string
     */
    public $execMoney;

    // 关联裁判文书
    /**
     * @example 关联裁判文书
     *
     * @var string
     */
    public $gistId;

    // 案由
    /**
     * @example 案由
     *
     * @var string
     */
    public $caseType;

    // 创建时间
    /**
     * @example 2021-12-09
     *
     * @var string
     */
    public $createTime;
    protected $_name = [
        'caseInfo'       => 'case_info',
        'caseCode'       => 'case_code',
        'caseCreateTime' => 'case_create_time',
        'caseStatus'     => 'case_status',
        'publishStatus'  => 'publish_status',
        'execName'       => 'exec_name',
        'execCourtName'  => 'exec_court_name',
        'execMoney'      => 'exec_money',
        'gistId'         => 'gist_id',
        'caseType'       => 'case_type',
        'createTime'     => 'create_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->caseInfo) {
            $res['case_info'] = $this->caseInfo;
        }
        if (null !== $this->caseCode) {
            $res['case_code'] = $this->caseCode;
        }
        if (null !== $this->caseCreateTime) {
            $res['case_create_time'] = $this->caseCreateTime;
        }
        if (null !== $this->caseStatus) {
            $res['case_status'] = $this->caseStatus;
        }
        if (null !== $this->publishStatus) {
            $res['publish_status'] = $this->publishStatus;
        }
        if (null !== $this->execName) {
            $res['exec_name'] = $this->execName;
        }
        if (null !== $this->execCourtName) {
            $res['exec_court_name'] = $this->execCourtName;
        }
        if (null !== $this->execMoney) {
            $res['exec_money'] = $this->execMoney;
        }
        if (null !== $this->gistId) {
            $res['gist_id'] = $this->gistId;
        }
        if (null !== $this->caseType) {
            $res['case_type'] = $this->caseType;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseCaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['case_info'])) {
            $model->caseInfo = $map['case_info'];
        }
        if (isset($map['case_code'])) {
            $model->caseCode = $map['case_code'];
        }
        if (isset($map['case_create_time'])) {
            $model->caseCreateTime = $map['case_create_time'];
        }
        if (isset($map['case_status'])) {
            $model->caseStatus = $map['case_status'];
        }
        if (isset($map['publish_status'])) {
            $model->publishStatus = $map['publish_status'];
        }
        if (isset($map['exec_name'])) {
            $model->execName = $map['exec_name'];
        }
        if (isset($map['exec_court_name'])) {
            $model->execCourtName = $map['exec_court_name'];
        }
        if (isset($map['exec_money'])) {
            $model->execMoney = $map['exec_money'];
        }
        if (isset($map['gist_id'])) {
            $model->gistId = $map['gist_id'];
        }
        if (isset($map['case_type'])) {
            $model->caseType = $map['case_type'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
