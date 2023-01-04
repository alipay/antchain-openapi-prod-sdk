<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SendContractComplainfeedbackRequest extends Model
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

    // 支付宝侧投诉单号
    /**
     * @var string
     */
    public $complainEventId;

    // 反馈类目ID
    // 00:使用体验保障金退款；
    // 02:通过其他方式退款;
    // 03:已发货;
    // 04:其他;
    // 05:已完成售后服务;
    // 06:非我方责任范围；
    /**
     * @var string
     */
    public $feedbackCode;

    // 反馈内容，字数不超过200个字
    /**
     * @var string
     */
    public $feedbackContent;

    // 商家处理投诉时反馈凭证的图片id，多个逗号隔开（图片id可以通过"商户上传处理图片"接口获取）
    /**
     * @var string
     */
    public $feedbackImages;

    // 处理投诉人，字数不超过6个字
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'complainEventId'   => 'complain_event_id',
        'feedbackCode'      => 'feedback_code',
        'feedbackContent'   => 'feedback_content',
        'feedbackImages'    => 'feedback_images',
        'operator'          => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('complainEventId', $this->complainEventId, true);
        Model::validateRequired('feedbackCode', $this->feedbackCode, true);
        Model::validateRequired('feedbackContent', $this->feedbackContent, true);
        Model::validateMaxLength('complainEventId', $this->complainEventId, 64);
        Model::validateMaxLength('feedbackCode', $this->feedbackCode, 32);
        Model::validateMaxLength('feedbackContent', $this->feedbackContent, 200);
        Model::validateMaxLength('operator', $this->operator, 32);
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
        if (null !== $this->complainEventId) {
            $res['complain_event_id'] = $this->complainEventId;
        }
        if (null !== $this->feedbackCode) {
            $res['feedback_code'] = $this->feedbackCode;
        }
        if (null !== $this->feedbackContent) {
            $res['feedback_content'] = $this->feedbackContent;
        }
        if (null !== $this->feedbackImages) {
            $res['feedback_images'] = $this->feedbackImages;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendContractComplainfeedbackRequest
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
        if (isset($map['complain_event_id'])) {
            $model->complainEventId = $map['complain_event_id'];
        }
        if (isset($map['feedback_code'])) {
            $model->feedbackCode = $map['feedback_code'];
        }
        if (isset($map['feedback_content'])) {
            $model->feedbackContent = $map['feedback_content'];
        }
        if (isset($map['feedback_images'])) {
            $model->feedbackImages = $map['feedback_images'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
