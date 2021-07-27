<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SendCollectorSummarydataRequest extends Model
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

    // 汇总所属的场景码
    /**
     * @var string
     */
    public $scene;

    // 汇总的业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
    /**
     * @var string
     */
    public $bizType;

    // 汇总所属的日期
    /**
     * @var string
     */
    public $summaryDate;

    // 汇总数据的数据模型ID
    /**
     * @var string
     */
    public $dataModelId;

    // 汇总数据的内容，格式遵循data_model_id制定的格式
    /**
     * @var string
     */
    public $content;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'bizType'           => 'biz_type',
        'summaryDate'       => 'summary_date',
        'dataModelId'       => 'data_model_id',
        'content'           => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('summaryDate', $this->summaryDate, true);
        Model::validateRequired('dataModelId', $this->dataModelId, true);
        Model::validateRequired('content', $this->content, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->summaryDate) {
            $res['summary_date'] = $this->summaryDate;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendCollectorSummarydataRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['summary_date'])) {
            $model->summaryDate = $map['summary_date'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
