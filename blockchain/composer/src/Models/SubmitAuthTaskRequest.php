<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SubmitAuthTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 任务标题(同一个租户不能重复)
    /**
     * @var string
     */
    public $taskName;

    // appId
    /**
     * @var string
     */
    public $appId;

    // 问卷id(同一个租户不能重复，只能包含字母、数组或者下划线)
    /**
     * @var string
     */
    public $surveyId;

    // notes
    /**
     * @var string
     */
    public $notes;

    // 任务创建者用户ID
    /**
     * @var string
     */
    public $operator;

    // banner标题
    /**
     * @var string
     */
    public $bannerTitle;

    // banner图片地址（最多支持3张）
    /**
     * @var string[]
     */
    public $bannerImageUrls;

    // 题量
    /**
     * @var int
     */
    public $questionNum;

    // 任务连接地址
    /**
     * @var string
     */
    public $taskLinkUrl;

    // 人群划分描述
    /**
     * @var string
     */
    public $personDivideContent;

    // 城市列表
    /**
     * @var string[]
     */
    public $cityDivideUrls;

    // 样本数量
    /**
     * @var int
     */
    public $sampleNum;

    // 产品下单code类型（1-资源包 2-后付费）
    /**
     * @var string
     */
    public $productCodeType;

    // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
    /**
     * @var int
     */
    public $prizeChannel;

    // 支付宝账号
    /**
     * @var string
     */
    public $alipayAccountId;

    // 奖励类型（0-定额红包）
    /**
     * @var int
     */
    public $prizeType;

    // 全额红包金额（价格在0.01~100），奖励渠道为0和1时
    /**
     * @var string
     */
    public $fullRedPacketAmount;

    // 甄别红包金额
    /**
     * @var string
     */
    public $examineRedPacketAmount;

    // 全额红包描述，奖励渠道为2时，此处必填
    /**
     * @var string
     */
    public $fullRedPacketTextInfo;

    // 证书内容
    /**
     * @var string
     */
    public $certContent;

    // 人群配置
    /**
     * @var string
     */
    public $crowdConfig;

    // 是否草稿，1表示草稿
    /**
     * @var string
     */
    public $draft;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'taskName'               => 'task_name',
        'appId'                  => 'app_id',
        'surveyId'               => 'survey_id',
        'notes'                  => 'notes',
        'operator'               => 'operator',
        'bannerTitle'            => 'banner_title',
        'bannerImageUrls'        => 'banner_image_urls',
        'questionNum'            => 'question_num',
        'taskLinkUrl'            => 'task_link_url',
        'personDivideContent'    => 'person_divide_content',
        'cityDivideUrls'         => 'city_divide_urls',
        'sampleNum'              => 'sample_num',
        'productCodeType'        => 'product_code_type',
        'prizeChannel'           => 'prize_channel',
        'alipayAccountId'        => 'alipay_account_id',
        'prizeType'              => 'prize_type',
        'fullRedPacketAmount'    => 'full_red_packet_amount',
        'examineRedPacketAmount' => 'examine_red_packet_amount',
        'fullRedPacketTextInfo'  => 'full_red_packet_text_info',
        'certContent'            => 'cert_content',
        'crowdConfig'            => 'crowd_config',
        'draft'                  => 'draft',
    ];

    public function validate()
    {
        Model::validateRequired('taskName', $this->taskName, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('surveyId', $this->surveyId, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('bannerTitle', $this->bannerTitle, true);
        Model::validateRequired('questionNum', $this->questionNum, true);
        Model::validateRequired('taskLinkUrl', $this->taskLinkUrl, true);
        Model::validateRequired('sampleNum', $this->sampleNum, true);
        Model::validateRequired('productCodeType', $this->productCodeType, true);
        Model::validateRequired('prizeChannel', $this->prizeChannel, true);
        Model::validateRequired('prizeType', $this->prizeType, true);
        Model::validateRequired('fullRedPacketAmount', $this->fullRedPacketAmount, true);
        Model::validateRequired('examineRedPacketAmount', $this->examineRedPacketAmount, true);
        Model::validateRequired('crowdConfig', $this->crowdConfig, true);
        Model::validateRequired('draft', $this->draft, true);
        Model::validateMaxLength('taskName', $this->taskName, 20);
        Model::validateMaxLength('appId', $this->appId, 32);
        Model::validateMaxLength('surveyId', $this->surveyId, 32);
        Model::validateMaxLength('notes', $this->notes, 32);
        Model::validateMaxLength('operator', $this->operator, 100);
        Model::validateMaxLength('bannerTitle', $this->bannerTitle, 30);
        Model::validateMaxLength('taskLinkUrl', $this->taskLinkUrl, 1000);
        Model::validateMaxLength('personDivideContent', $this->personDivideContent, 1000);
        Model::validateMaxLength('productCodeType', $this->productCodeType, 4);
        Model::validateMaxLength('alipayAccountId', $this->alipayAccountId, 100);
        Model::validateMaximum('questionNum', $this->questionNum, 1000);
        Model::validateMaximum('sampleNum', $this->sampleNum, 100000);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->taskName) {
            $res['task_name'] = $this->taskName;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->surveyId) {
            $res['survey_id'] = $this->surveyId;
        }
        if (null !== $this->notes) {
            $res['notes'] = $this->notes;
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
        if (null !== $this->sampleNum) {
            $res['sample_num'] = $this->sampleNum;
        }
        if (null !== $this->productCodeType) {
            $res['product_code_type'] = $this->productCodeType;
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
        if (null !== $this->examineRedPacketAmount) {
            $res['examine_red_packet_amount'] = $this->examineRedPacketAmount;
        }
        if (null !== $this->fullRedPacketTextInfo) {
            $res['full_red_packet_text_info'] = $this->fullRedPacketTextInfo;
        }
        if (null !== $this->certContent) {
            $res['cert_content'] = $this->certContent;
        }
        if (null !== $this->crowdConfig) {
            $res['crowd_config'] = $this->crowdConfig;
        }
        if (null !== $this->draft) {
            $res['draft'] = $this->draft;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAuthTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['task_name'])) {
            $model->taskName = $map['task_name'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['survey_id'])) {
            $model->surveyId = $map['survey_id'];
        }
        if (isset($map['notes'])) {
            $model->notes = $map['notes'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['banner_title'])) {
            $model->bannerTitle = $map['banner_title'];
        }
        if (isset($map['banner_image_urls'])) {
            if (!empty($map['banner_image_urls'])) {
                $model->bannerImageUrls = $map['banner_image_urls'];
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
            if (!empty($map['city_divide_urls'])) {
                $model->cityDivideUrls = $map['city_divide_urls'];
            }
        }
        if (isset($map['sample_num'])) {
            $model->sampleNum = $map['sample_num'];
        }
        if (isset($map['product_code_type'])) {
            $model->productCodeType = $map['product_code_type'];
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
        if (isset($map['examine_red_packet_amount'])) {
            $model->examineRedPacketAmount = $map['examine_red_packet_amount'];
        }
        if (isset($map['full_red_packet_text_info'])) {
            $model->fullRedPacketTextInfo = $map['full_red_packet_text_info'];
        }
        if (isset($map['cert_content'])) {
            $model->certContent = $map['cert_content'];
        }
        if (isset($map['crowd_config'])) {
            $model->crowdConfig = $map['crowd_config'];
        }
        if (isset($map['draft'])) {
            $model->draft = $map['draft'];
        }

        return $model;
    }
}
