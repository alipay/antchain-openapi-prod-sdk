<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryQmpTaskDetailRequest extends Model
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

    // 手机号列表
    /**
     * @var string[]
     */
    public $customerKeys;

    // 手机号类型
    /**
     * @var string
     */
    public $keyTemplate;

    // 场景策略id
    /**
     * @var int
     */
    public $sceneStrategyId;

    // 开始外呼时间，只可查询最近30天的日期
    /**
     * @var string
     */
    public $callDate;

    // 结束外呼时间
    /**
     * @var string
     */
    public $endCallDate;

    // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
    /**
     * @var string
     */
    public $industryTag;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'customerKeys'      => 'customer_keys',
        'keyTemplate'       => 'key_template',
        'sceneStrategyId'   => 'scene_strategy_id',
        'callDate'          => 'call_date',
        'endCallDate'       => 'end_call_date',
        'industryTag'       => 'industry_tag',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('customerKeys', $this->customerKeys, true);
        Model::validateRequired('keyTemplate', $this->keyTemplate, true);
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
        if (null !== $this->customerKeys) {
            $res['customer_keys'] = $this->customerKeys;
        }
        if (null !== $this->keyTemplate) {
            $res['key_template'] = $this->keyTemplate;
        }
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }
        if (null !== $this->callDate) {
            $res['call_date'] = $this->callDate;
        }
        if (null !== $this->endCallDate) {
            $res['end_call_date'] = $this->endCallDate;
        }
        if (null !== $this->industryTag) {
            $res['industry_tag'] = $this->industryTag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryQmpTaskDetailRequest
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
        if (isset($map['customer_keys'])) {
            if (!empty($map['customer_keys'])) {
                $model->customerKeys = $map['customer_keys'];
            }
        }
        if (isset($map['key_template'])) {
            $model->keyTemplate = $map['key_template'];
        }
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }
        if (isset($map['call_date'])) {
            $model->callDate = $map['call_date'];
        }
        if (isset($map['end_call_date'])) {
            $model->endCallDate = $map['end_call_date'];
        }
        if (isset($map['industry_tag'])) {
            $model->industryTag = $map['industry_tag'];
        }

        return $model;
    }
}
