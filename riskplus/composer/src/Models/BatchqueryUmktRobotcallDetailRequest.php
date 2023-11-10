<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryUmktRobotcallDetailRequest extends Model
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

    // 上传外呼任务返回的callId
    /**
     * @var string
     */
    public $bizId;

    // 手机号
    /**
     * @var string[]
     */
    public $phoneNumbers;

    // 手机号类型
    /**
     * @var string
     */
    public $templateType;

    // 场景策略id
    /**
     * @var int
     */
    public $sceneStrategyId;

    // 意向标签
    /**
     * @var string[]
     */
    public $intentTags;

    // 开始外呼时间
    /**
     * @var string
     */
    public $callDate;

    // 结束外呼时间
    /**
     * @var string
     */
    public $endCallDate;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 页数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'phoneNumbers'      => 'phone_numbers',
        'templateType'      => 'template_type',
        'sceneStrategyId'   => 'scene_strategy_id',
        'intentTags'        => 'intent_tags',
        'callDate'          => 'call_date',
        'endCallDate'       => 'end_call_date',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('phoneNumbers', $this->phoneNumbers, true);
        Model::validateRequired('templateType', $this->templateType, true);
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->phoneNumbers) {
            $res['phone_numbers'] = $this->phoneNumbers;
        }
        if (null !== $this->templateType) {
            $res['template_type'] = $this->templateType;
        }
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }
        if (null !== $this->intentTags) {
            $res['intent_tags'] = $this->intentTags;
        }
        if (null !== $this->callDate) {
            $res['call_date'] = $this->callDate;
        }
        if (null !== $this->endCallDate) {
            $res['end_call_date'] = $this->endCallDate;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryUmktRobotcallDetailRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['phone_numbers'])) {
            if (!empty($map['phone_numbers'])) {
                $model->phoneNumbers = $map['phone_numbers'];
            }
        }
        if (isset($map['template_type'])) {
            $model->templateType = $map['template_type'];
        }
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }
        if (isset($map['intent_tags'])) {
            if (!empty($map['intent_tags'])) {
                $model->intentTags = $map['intent_tags'];
            }
        }
        if (isset($map['call_date'])) {
            $model->callDate = $map['call_date'];
        }
        if (isset($map['end_call_date'])) {
            $model->endCallDate = $map['end_call_date'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
