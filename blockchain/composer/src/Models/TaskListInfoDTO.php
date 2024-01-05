<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TaskListInfoDTO extends Model
{
    // 任务名称
    /**
     * @example 普通任务
     *
     * @var string
     */
    public $taskName;

    // 任务ID
    /**
     * @example qdQxqU5gz
     *
     * @var string
     */
    public $taskId;

    // appId
    /**
     * @example 2021004121633301
     *
     * @var string
     */
    public $appId;

    // 自有ID
    /**
     * @example ybl1112
     *
     * @var string
     */
    public $surveyId;

    // 租户ID
    /**
     * @example RIVUFSJG
     *
     * @var string
     */
    public $tenantId;

    // 租户名称
    /**
     * @example 李强
     *
     * @var string
     */
    public $tenantName;

    // 操作员
    /**
     * @example eipzps@alitest.comtest
     *
     * @var string
     */
    public $operator;

    // 样本数量
    /**
     * @example
     *
     * @var int
     */
    public $sampleNum;

    // 完成数量
    /**
     * @example
     *
     * @var int
     */
    public $completedNum;

    // 甄别数量
    /**
     * @example
     *
     * @var int
     */
    public $screenNum;

    // 样本总金额
    /**
     * @example 10.00
     *
     * @var string
     */
    public $sampleTotalAmount;

    // 全额红包总金额
    /**
     * @example 20.00
     *
     * @var string
     */
    public $redPacketTotalAmount;

    // 该任务总金额
    /**
     * @example 30.00
     *
     * @var string
     */
    public $taskTotalAmount;

    // 全额红包金额
    /**
     * @example 1.00
     *
     * @var string
     */
    public $fullRedPacketAmount;

    // 甄别红包金额
    /**
     * @example 0.05
     *
     * @var string
     */
    public $examineRedPacketAmount;

    // 发证量
    /**
     * @example
     *
     * @var int
     */
    public $issuedNum;

    // 产品下单code类型（1-资源包 2-后付费）
    /**
     * @example 1
     *
     * @var string
     */
    public $productCodeType;

    // 审核理由
    /**
     * @example 拒绝,图片不合适
     *
     * @var string
     */
    public $reviewContent;

    // 任务状态：0-已删、1-已完成、2-审核未通过、3-暂停、4-投放中、5-暂停中未重启、6、投放中未暂停、7-投放中未调整、8-投放中未完成、9-待投放、10-草稿任务
    /**
     * @example 9
     *
     * @var string
     */
    public $status;

    // ap状态，1:启用，0：审批中
    /**
     * @example 1
     *
     * @var string
     */
    public $apStatus;

    // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
    /**
     * @example 1
     *
     * @var int
     */
    public $prizeChannel;

    // 奖励渠道为问卷自带时，全额红包信息
    /**
     * @example 1-5元红包
     *
     * @var string
     */
    public $fullRedPacketTextInfo;

    // 修改时间
    /**
     * @example 2023-12-22 10:34:11
     *
     * @var string
     */
    public $gmtModified;

    // 创建时间
    /**
     * @example 2023-12-22 10:11:33
     *
     * @var string
     */
    public $gmtCreate;

    // 投放时间
    /**
     * @example 2023-12-23 10:11:22
     *
     * @var string
     */
    public $gmtOnline;

    // 最近暂停/完成时间
    /**
     * @example 2022-12-22 09:11:11
     *
     * @var string
     */
    public $gmtPauseOrComplete;

    // 最近一轮用时（h）
    /**
     * @example 1
     *
     * @var int
     */
    public $lastRoundTime;
    protected $_name = [
        'taskName'               => 'task_name',
        'taskId'                 => 'task_id',
        'appId'                  => 'app_id',
        'surveyId'               => 'survey_id',
        'tenantId'               => 'tenant_id',
        'tenantName'             => 'tenant_name',
        'operator'               => 'operator',
        'sampleNum'              => 'sample_num',
        'completedNum'           => 'completed_num',
        'screenNum'              => 'screen_num',
        'sampleTotalAmount'      => 'sample_total_amount',
        'redPacketTotalAmount'   => 'red_packet_total_amount',
        'taskTotalAmount'        => 'task_total_amount',
        'fullRedPacketAmount'    => 'full_red_packet_amount',
        'examineRedPacketAmount' => 'examine_red_packet_amount',
        'issuedNum'              => 'issued_num',
        'productCodeType'        => 'product_code_type',
        'reviewContent'          => 'review_content',
        'status'                 => 'status',
        'apStatus'               => 'ap_status',
        'prizeChannel'           => 'prize_channel',
        'fullRedPacketTextInfo'  => 'full_red_packet_text_info',
        'gmtModified'            => 'gmt_modified',
        'gmtCreate'              => 'gmt_create',
        'gmtOnline'              => 'gmt_online',
        'gmtPauseOrComplete'     => 'gmt_pause_or_complete',
        'lastRoundTime'          => 'last_round_time',
    ];

    public function validate()
    {
        Model::validateRequired('taskName', $this->taskName, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('surveyId', $this->surveyId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('sampleNum', $this->sampleNum, true);
        Model::validateRequired('completedNum', $this->completedNum, true);
        Model::validateRequired('screenNum', $this->screenNum, true);
        Model::validateRequired('sampleTotalAmount', $this->sampleTotalAmount, true);
        Model::validateRequired('redPacketTotalAmount', $this->redPacketTotalAmount, true);
        Model::validateRequired('taskTotalAmount', $this->taskTotalAmount, true);
        Model::validateRequired('fullRedPacketAmount', $this->fullRedPacketAmount, true);
        Model::validateRequired('examineRedPacketAmount', $this->examineRedPacketAmount, true);
        Model::validateRequired('productCodeType', $this->productCodeType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('apStatus', $this->apStatus, true);
        Model::validateRequired('prizeChannel', $this->prizeChannel, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskName) {
            $res['task_name'] = $this->taskName;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->surveyId) {
            $res['survey_id'] = $this->surveyId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->sampleNum) {
            $res['sample_num'] = $this->sampleNum;
        }
        if (null !== $this->completedNum) {
            $res['completed_num'] = $this->completedNum;
        }
        if (null !== $this->screenNum) {
            $res['screen_num'] = $this->screenNum;
        }
        if (null !== $this->sampleTotalAmount) {
            $res['sample_total_amount'] = $this->sampleTotalAmount;
        }
        if (null !== $this->redPacketTotalAmount) {
            $res['red_packet_total_amount'] = $this->redPacketTotalAmount;
        }
        if (null !== $this->taskTotalAmount) {
            $res['task_total_amount'] = $this->taskTotalAmount;
        }
        if (null !== $this->fullRedPacketAmount) {
            $res['full_red_packet_amount'] = $this->fullRedPacketAmount;
        }
        if (null !== $this->examineRedPacketAmount) {
            $res['examine_red_packet_amount'] = $this->examineRedPacketAmount;
        }
        if (null !== $this->issuedNum) {
            $res['issued_num'] = $this->issuedNum;
        }
        if (null !== $this->productCodeType) {
            $res['product_code_type'] = $this->productCodeType;
        }
        if (null !== $this->reviewContent) {
            $res['review_content'] = $this->reviewContent;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->apStatus) {
            $res['ap_status'] = $this->apStatus;
        }
        if (null !== $this->prizeChannel) {
            $res['prize_channel'] = $this->prizeChannel;
        }
        if (null !== $this->fullRedPacketTextInfo) {
            $res['full_red_packet_text_info'] = $this->fullRedPacketTextInfo;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtOnline) {
            $res['gmt_online'] = $this->gmtOnline;
        }
        if (null !== $this->gmtPauseOrComplete) {
            $res['gmt_pause_or_complete'] = $this->gmtPauseOrComplete;
        }
        if (null !== $this->lastRoundTime) {
            $res['last_round_time'] = $this->lastRoundTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskListInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_name'])) {
            $model->taskName = $map['task_name'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['survey_id'])) {
            $model->surveyId = $map['survey_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['sample_num'])) {
            $model->sampleNum = $map['sample_num'];
        }
        if (isset($map['completed_num'])) {
            $model->completedNum = $map['completed_num'];
        }
        if (isset($map['screen_num'])) {
            $model->screenNum = $map['screen_num'];
        }
        if (isset($map['sample_total_amount'])) {
            $model->sampleTotalAmount = $map['sample_total_amount'];
        }
        if (isset($map['red_packet_total_amount'])) {
            $model->redPacketTotalAmount = $map['red_packet_total_amount'];
        }
        if (isset($map['task_total_amount'])) {
            $model->taskTotalAmount = $map['task_total_amount'];
        }
        if (isset($map['full_red_packet_amount'])) {
            $model->fullRedPacketAmount = $map['full_red_packet_amount'];
        }
        if (isset($map['examine_red_packet_amount'])) {
            $model->examineRedPacketAmount = $map['examine_red_packet_amount'];
        }
        if (isset($map['issued_num'])) {
            $model->issuedNum = $map['issued_num'];
        }
        if (isset($map['product_code_type'])) {
            $model->productCodeType = $map['product_code_type'];
        }
        if (isset($map['review_content'])) {
            $model->reviewContent = $map['review_content'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['ap_status'])) {
            $model->apStatus = $map['ap_status'];
        }
        if (isset($map['prize_channel'])) {
            $model->prizeChannel = $map['prize_channel'];
        }
        if (isset($map['full_red_packet_text_info'])) {
            $model->fullRedPacketTextInfo = $map['full_red_packet_text_info'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_online'])) {
            $model->gmtOnline = $map['gmt_online'];
        }
        if (isset($map['gmt_pause_or_complete'])) {
            $model->gmtPauseOrComplete = $map['gmt_pause_or_complete'];
        }
        if (isset($map['last_round_time'])) {
            $model->lastRoundTime = $map['last_round_time'];
        }

        return $model;
    }
}
