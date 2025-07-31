<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AddKnowledgeCategoryRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 类型
    /**
     * @var string
     */
    public $type;

    // 问题
    /**
     * @var string
     */
    public $question;

    // 答案
    /**
     * @var string
     */
    public $answer;

    // 是否选择订单
    /**
     * @var bool
     */
    public $hasOrder;

    // 是否带小程序跳转链接
    /**
     * @var bool
     */
    public $hasAppLink;

    // 是否转人工
    /**
     * @var bool
     */
    public $hasManual;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'type'              => 'type',
        'question'          => 'question',
        'answer'            => 'answer',
        'hasOrder'          => 'has_order',
        'hasAppLink'        => 'has_app_link',
        'hasManual'         => 'has_manual',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('answer', $this->answer, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }
        if (null !== $this->hasOrder) {
            $res['has_order'] = $this->hasOrder;
        }
        if (null !== $this->hasAppLink) {
            $res['has_app_link'] = $this->hasAppLink;
        }
        if (null !== $this->hasManual) {
            $res['has_manual'] = $this->hasManual;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddKnowledgeCategoryRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['answer'])) {
            $model->answer = $map['answer'];
        }
        if (isset($map['has_order'])) {
            $model->hasOrder = $map['has_order'];
        }
        if (isset($map['has_app_link'])) {
            $model->hasAppLink = $map['has_app_link'];
        }
        if (isset($map['has_manual'])) {
            $model->hasManual = $map['has_manual'];
        }

        return $model;
    }
}
