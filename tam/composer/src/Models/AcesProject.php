<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class AcesProject extends Model
{
    // 项目id
    /**
     * @example 1000231
     *
     * @var string
     */
    public $projectId;

    // 项目名称
    /**
     * @example 测试
     *
     * @var string
     */
    public $projectName;

    // 客户id
    /**
     * @example 200003020121
     *
     * @var string
     */
    public $customerId;

    // 客户名称
    /**
     * @example 测试
     *
     * @var string
     */
    public $customerName;

    // 产品线
    /**
     * @example 测试
     *
     * @var string
     */
    public $projectLine;

    // 业务线
    /**
     * @example 测试
     *
     * @var string
     */
    public $workLine;

    // 业务分类
    /**
     * @example Baas
     *
     * @var string
     */
    public $bizType;

    // 项目大阶段
    /**
     * @example 售后
     *
     * @var string
     */
    public $projectBigStage;

    // 转维状态
    /**
     * @example A1
     *
     * @var string
     */
    public $opStatus;

    // 交付阶段
    /**
     * @example 交付完成
     *
     * @var string
     */
    public $deliver;

    // 是否售后
    /**
     * @example true, false
     *
     * @var bool
     */
    public $afterSale;

    /**
     * @example
     *
     * @var string
     */
    public $aliyunBpid;

    // 解决方案架构师
    /**
     * @example 康乐
     *
     * @var string
     */
    public $sa;

    // 项目经理
    /**
     * @example 康乐
     *
     * @var string
     */
    public $pm;

    // 商务经理
    /**
     * @example 康乐
     *
     * @var string
     */
    public $bd;

    // 交付经理
    /**
     * @example 康乐
     *
     * @var string
     */
    public $tm;

    // 项目状态
    /**
     * @example 1b 未签-POC-已完成
     *
     * @var string
     */
    public $projectStage;

    // 项目交付状态（未启动、已启动等）
    /**
     * @example NOT_START
     *
     * @var string
     */
    public $projectStatus;

    // 是否需要交付 1需要 0不需要
    /**
     * @example 1
     *
     * @var string
     */
    public $needDeliver;

    // 是否需要提前进场 1需要 0不需要
    /**
     * @example 1
     *
     * @var string
     */
    public $needAdEntry;

    // 是否需要竞标 1需要 0不需要
    /**
     * @example 1
     *
     * @var string
     */
    public $needTender;
    protected $_name = [
        'projectId'       => 'project_id',
        'projectName'     => 'project_name',
        'customerId'      => 'customer_id',
        'customerName'    => 'customer_name',
        'projectLine'     => 'project_line',
        'workLine'        => 'work_line',
        'bizType'         => 'biz_type',
        'projectBigStage' => 'project_big_stage',
        'opStatus'        => 'op_status',
        'deliver'         => 'deliver',
        'afterSale'       => 'after_sale',
        'aliyunBpid'      => 'aliyun_bpid',
        'sa'              => 'sa',
        'pm'              => 'pm',
        'bd'              => 'bd',
        'tm'              => 'tm',
        'projectStage'    => 'project_stage',
        'projectStatus'   => 'project_status',
        'needDeliver'     => 'need_deliver',
        'needAdEntry'     => 'need_ad_entry',
        'needTender'      => 'need_tender',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('sa', $this->sa, true);
        Model::validateRequired('pm', $this->pm, true);
        Model::validateRequired('bd', $this->bd, true);
        Model::validateRequired('tm', $this->tm, true);
        Model::validateRequired('needDeliver', $this->needDeliver, true);
        Model::validateRequired('needAdEntry', $this->needAdEntry, true);
        Model::validateRequired('needTender', $this->needTender, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->projectLine) {
            $res['project_line'] = $this->projectLine;
        }
        if (null !== $this->workLine) {
            $res['work_line'] = $this->workLine;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->projectBigStage) {
            $res['project_big_stage'] = $this->projectBigStage;
        }
        if (null !== $this->opStatus) {
            $res['op_status'] = $this->opStatus;
        }
        if (null !== $this->deliver) {
            $res['deliver'] = $this->deliver;
        }
        if (null !== $this->afterSale) {
            $res['after_sale'] = $this->afterSale;
        }
        if (null !== $this->aliyunBpid) {
            $res['aliyun_bpid'] = $this->aliyunBpid;
        }
        if (null !== $this->sa) {
            $res['sa'] = $this->sa;
        }
        if (null !== $this->pm) {
            $res['pm'] = $this->pm;
        }
        if (null !== $this->bd) {
            $res['bd'] = $this->bd;
        }
        if (null !== $this->tm) {
            $res['tm'] = $this->tm;
        }
        if (null !== $this->projectStage) {
            $res['project_stage'] = $this->projectStage;
        }
        if (null !== $this->projectStatus) {
            $res['project_status'] = $this->projectStatus;
        }
        if (null !== $this->needDeliver) {
            $res['need_deliver'] = $this->needDeliver;
        }
        if (null !== $this->needAdEntry) {
            $res['need_ad_entry'] = $this->needAdEntry;
        }
        if (null !== $this->needTender) {
            $res['need_tender'] = $this->needTender;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AcesProject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['project_line'])) {
            $model->projectLine = $map['project_line'];
        }
        if (isset($map['work_line'])) {
            $model->workLine = $map['work_line'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['project_big_stage'])) {
            $model->projectBigStage = $map['project_big_stage'];
        }
        if (isset($map['op_status'])) {
            $model->opStatus = $map['op_status'];
        }
        if (isset($map['deliver'])) {
            $model->deliver = $map['deliver'];
        }
        if (isset($map['after_sale'])) {
            $model->afterSale = $map['after_sale'];
        }
        if (isset($map['aliyun_bpid'])) {
            $model->aliyunBpid = $map['aliyun_bpid'];
        }
        if (isset($map['sa'])) {
            $model->sa = $map['sa'];
        }
        if (isset($map['pm'])) {
            $model->pm = $map['pm'];
        }
        if (isset($map['bd'])) {
            $model->bd = $map['bd'];
        }
        if (isset($map['tm'])) {
            $model->tm = $map['tm'];
        }
        if (isset($map['project_stage'])) {
            $model->projectStage = $map['project_stage'];
        }
        if (isset($map['project_status'])) {
            $model->projectStatus = $map['project_status'];
        }
        if (isset($map['need_deliver'])) {
            $model->needDeliver = $map['need_deliver'];
        }
        if (isset($map['need_ad_entry'])) {
            $model->needAdEntry = $map['need_ad_entry'];
        }
        if (isset($map['need_tender'])) {
            $model->needTender = $map['need_tender'];
        }

        return $model;
    }
}
