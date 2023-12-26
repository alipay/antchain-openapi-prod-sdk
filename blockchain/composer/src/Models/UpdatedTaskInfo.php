<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdatedTaskInfo extends Model
{
    // 任务标题(同一个租户不能重复)
    /**
     * @example xxx
     *
     * @var string
     */
    public $taskName;

    // appId
    /**
     * @example xxx
     *
     * @var string
     */
    public $appId;

    // 问卷ID
    /**
     * @example xxx
     *
     * @var string
     */
    public $surveyId;

    // 任务ID
    /**
     * @example qdQxqU5gz
     *
     * @var string
     */
    public $taskId;

    // 备注信息
    /**
     * @example xxx
     *
     * @var string
     */
    public $notes;

    // 租户ID
    /**
     * @example xxx
     *
     * @var string
     */
    public $tenantId;

    // 操作者ID
    /**
     * @example xxx
     *
     * @var string
     */
    public $operator;

    // banner标题
    /**
     * @example xxx
     *
     * @var string
     */
    public $bannerTitle;

    // banner图片地址（最多支持3张）
    /**
     * @example aaa
     *
     * @var string
     */
    public $bannerImageUrls;

    // banner 图片地址, 拼装后的url
    /**
     * @example [_aa_,_bb_]
     *
     * @var string[]
     */
    public $bannerImageFullUrls;

    // 题量
    /**
     * @example
     *
     * @var int
     */
    public $questionNum;

    // 任务连接地址
    /**
     * @example xxx
     *
     * @var string
     */
    public $taskLinkUrl;

    // 人群划分描述
    /**
     * @example xxx
     *
     * @var string
     */
    public $personDivideContent;

    // 城市列表
    /**
     * @example xxx
     *
     * @var string
     */
    public $cityDivideUrls;

    // 城市列表, 拼装后的url
    /**
     * @example [_a_]
     *
     * @var string[]
     */
    public $cityDivideFullUrls;

    // 样本数量
    /**
     * @example
     *
     * @var int
     */
    public $sampleNum;

    // 完成样本量
    /**
     * @example
     *
     * @var int
     */
    public $completedNum;

    // 产品下单code类型（1-资源包 2-后付费）
    /**
     * @example 1
     *
     * @var string
     */
    public $productCodeType;

    // 产品余量
    /**
     * @example
     *
     * @var int
     */
    public $productCapacity;

    // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
    /**
     * @example
     *
     * @var int
     */
    public $prizeChannel;

    // 支付宝账号
    /**
     * @example xxx
     *
     * @var string
     */
    public $alipayAccountId;

    // 奖励类型（0-定额红包）
    /**
     * @example 0
     *
     * @var int
     */
    public $prizeType;

    // 全额红包金额，奖励渠道为0和1时
    /**
     * @example 0.02
     *
     * @var string
     */
    public $fullRedPacketAmount;

    // 全额红包描述，奖励渠道为2时，此处必填
    /**
     * @example xxx
     *
     * @var string
     */
    public $fullRedPacketTextInfo;

    // 甄别红包金额
    /**
     * @example 0.01
     *
     * @var string
     */
    public $examineRedPacketAmount;

    // 关联的证书instanceId
    /**
     * @example xxx
     *
     * @var string
     */
    public $certInstanceId;

    // 证书实例详情
    /**
     * @example
     *
     * @var CertInstanceDetail
     */
    public $certInstanceDetail;

    // 审核意见
    /**
     * @example xxx
     *
     * @var string
     */
    public $verifyOmment;

    // 任务创建时间
    /**
     * @example 17010000
     *
     * @var string
     */
    public $gmtCreate;

    // 任务修改时间
    /**
     * @example 17098899
     *
     * @var string
     */
    public $gmtModified;

    // 审核理由
    /**
     * @example xxx
     *
     * @var string
     */
    public $reviewContent;

    // 状态
    /**
     * @example
     *
     * @var int
     */
    public $status;

    // 人群配置
    /**
     * @example {}
     *
     * @var string
     */
    public $crowdConfig;
    protected $_name = [
        'taskName'               => 'task_name',
        'appId'                  => 'app_id',
        'surveyId'               => 'survey_id',
        'taskId'                 => 'task_id',
        'notes'                  => 'notes',
        'tenantId'               => 'tenant_id',
        'operator'               => 'operator',
        'bannerTitle'            => 'banner_title',
        'bannerImageUrls'        => 'banner_image_urls',
        'bannerImageFullUrls'    => 'banner_image_full_urls',
        'questionNum'            => 'question_num',
        'taskLinkUrl'            => 'task_link_url',
        'personDivideContent'    => 'person_divide_content',
        'cityDivideUrls'         => 'city_divide_urls',
        'cityDivideFullUrls'     => 'city_divide_full_urls',
        'sampleNum'              => 'sample_num',
        'completedNum'           => 'completed_num',
        'productCodeType'        => 'product_code_type',
        'productCapacity'        => 'product_capacity',
        'prizeChannel'           => 'prize_channel',
        'alipayAccountId'        => 'alipay_account_id',
        'prizeType'              => 'prize_type',
        'fullRedPacketAmount'    => 'full_red_packet_amount',
        'fullRedPacketTextInfo'  => 'full_red_packet_text_info',
        'examineRedPacketAmount' => 'examine_red_packet_amount',
        'certInstanceId'         => 'cert_instance_id',
        'certInstanceDetail'     => 'cert_instance_detail',
        'verifyOmment'           => 'verify_omment',
        'gmtCreate'              => 'gmt_create',
        'gmtModified'            => 'gmt_modified',
        'reviewContent'          => 'review_content',
        'status'                 => 'status',
        'crowdConfig'            => 'crowd_config',
    ];

    public function validate()
    {
        Model::validateRequired('taskName', $this->taskName, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('surveyId', $this->surveyId, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('bannerTitle', $this->bannerTitle, true);
        Model::validateRequired('questionNum', $this->questionNum, true);
        Model::validateRequired('taskLinkUrl', $this->taskLinkUrl, true);
        Model::validateRequired('sampleNum', $this->sampleNum, true);
        Model::validateRequired('completedNum', $this->completedNum, true);
        Model::validateRequired('productCodeType', $this->productCodeType, true);
        Model::validateRequired('productCapacity', $this->productCapacity, true);
        Model::validateRequired('prizeChannel', $this->prizeChannel, true);
        Model::validateRequired('prizeType', $this->prizeType, true);
        Model::validateRequired('fullRedPacketAmount', $this->fullRedPacketAmount, true);
        Model::validateRequired('examineRedPacketAmount', $this->examineRedPacketAmount, true);
        Model::validateRequired('certInstanceDetail', $this->certInstanceDetail, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('crowdConfig', $this->crowdConfig, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskName) {
            $res['task_name'] = $this->taskName;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->surveyId) {
            $res['survey_id'] = $this->surveyId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->notes) {
            $res['notes'] = $this->notes;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->bannerTitle) {
            $res['banner_title'] = $this->bannerTitle;
        }
        if (null !== $this->bannerImageUrls) {
            $res['banner_image_urls'] = $this->bannerImageUrls;
        }
        if (null !== $this->bannerImageFullUrls) {
            $res['banner_image_full_urls'] = $this->bannerImageFullUrls;
        }
        if (null !== $this->questionNum) {
            $res['question_num'] = $this->questionNum;
        }
        if (null !== $this->taskLinkUrl) {
            $res['task_link_url'] = $this->taskLinkUrl;
        }
        if (null !== $this->personDivideContent) {
            $res['person_divide_content'] = $this->personDivideContent;
        }
        if (null !== $this->cityDivideUrls) {
            $res['city_divide_urls'] = $this->cityDivideUrls;
        }
        if (null !== $this->cityDivideFullUrls) {
            $res['city_divide_full_urls'] = $this->cityDivideFullUrls;
        }
        if (null !== $this->sampleNum) {
            $res['sample_num'] = $this->sampleNum;
        }
        if (null !== $this->completedNum) {
            $res['completed_num'] = $this->completedNum;
        }
        if (null !== $this->productCodeType) {
            $res['product_code_type'] = $this->productCodeType;
        }
        if (null !== $this->productCapacity) {
            $res['product_capacity'] = $this->productCapacity;
        }
        if (null !== $this->prizeChannel) {
            $res['prize_channel'] = $this->prizeChannel;
        }
        if (null !== $this->alipayAccountId) {
            $res['alipay_account_id'] = $this->alipayAccountId;
        }
        if (null !== $this->prizeType) {
            $res['prize_type'] = $this->prizeType;
        }
        if (null !== $this->fullRedPacketAmount) {
            $res['full_red_packet_amount'] = $this->fullRedPacketAmount;
        }
        if (null !== $this->fullRedPacketTextInfo) {
            $res['full_red_packet_text_info'] = $this->fullRedPacketTextInfo;
        }
        if (null !== $this->examineRedPacketAmount) {
            $res['examine_red_packet_amount'] = $this->examineRedPacketAmount;
        }
        if (null !== $this->certInstanceId) {
            $res['cert_instance_id'] = $this->certInstanceId;
        }
        if (null !== $this->certInstanceDetail) {
            $res['cert_instance_detail'] = null !== $this->certInstanceDetail ? $this->certInstanceDetail->toMap() : null;
        }
        if (null !== $this->verifyOmment) {
            $res['verify_omment'] = $this->verifyOmment;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->reviewContent) {
            $res['review_content'] = $this->reviewContent;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->crowdConfig) {
            $res['crowd_config'] = $this->crowdConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdatedTaskInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_name'])) {
            $model->taskName = $map['task_name'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['survey_id'])) {
            $model->surveyId = $map['survey_id'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['notes'])) {
            $model->notes = $map['notes'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['banner_title'])) {
            $model->bannerTitle = $map['banner_title'];
        }
        if (isset($map['banner_image_urls'])) {
            $model->bannerImageUrls = $map['banner_image_urls'];
        }
        if (isset($map['banner_image_full_urls'])) {
            if (!empty($map['banner_image_full_urls'])) {
                $model->bannerImageFullUrls = $map['banner_image_full_urls'];
            }
        }
        if (isset($map['question_num'])) {
            $model->questionNum = $map['question_num'];
        }
        if (isset($map['task_link_url'])) {
            $model->taskLinkUrl = $map['task_link_url'];
        }
        if (isset($map['person_divide_content'])) {
            $model->personDivideContent = $map['person_divide_content'];
        }
        if (isset($map['city_divide_urls'])) {
            $model->cityDivideUrls = $map['city_divide_urls'];
        }
        if (isset($map['city_divide_full_urls'])) {
            if (!empty($map['city_divide_full_urls'])) {
                $model->cityDivideFullUrls = $map['city_divide_full_urls'];
            }
        }
        if (isset($map['sample_num'])) {
            $model->sampleNum = $map['sample_num'];
        }
        if (isset($map['completed_num'])) {
            $model->completedNum = $map['completed_num'];
        }
        if (isset($map['product_code_type'])) {
            $model->productCodeType = $map['product_code_type'];
        }
        if (isset($map['product_capacity'])) {
            $model->productCapacity = $map['product_capacity'];
        }
        if (isset($map['prize_channel'])) {
            $model->prizeChannel = $map['prize_channel'];
        }
        if (isset($map['alipay_account_id'])) {
            $model->alipayAccountId = $map['alipay_account_id'];
        }
        if (isset($map['prize_type'])) {
            $model->prizeType = $map['prize_type'];
        }
        if (isset($map['full_red_packet_amount'])) {
            $model->fullRedPacketAmount = $map['full_red_packet_amount'];
        }
        if (isset($map['full_red_packet_text_info'])) {
            $model->fullRedPacketTextInfo = $map['full_red_packet_text_info'];
        }
        if (isset($map['examine_red_packet_amount'])) {
            $model->examineRedPacketAmount = $map['examine_red_packet_amount'];
        }
        if (isset($map['cert_instance_id'])) {
            $model->certInstanceId = $map['cert_instance_id'];
        }
        if (isset($map['cert_instance_detail'])) {
            $model->certInstanceDetail = CertInstanceDetail::fromMap($map['cert_instance_detail']);
        }
        if (isset($map['verify_omment'])) {
            $model->verifyOmment = $map['verify_omment'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['review_content'])) {
            $model->reviewContent = $map['review_content'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['crowd_config'])) {
            $model->crowdConfig = $map['crowd_config'];
        }

        return $model;
    }
}
