<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ApplyDciPromotionRequest extends Model
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

    // 联系人姓名
    /**
     * @var string
     */
    public $contactName;

    // 联系人电话
    /**
     * @var string
     */
    public $contactPhone;

    // dci ID
    /**
     * @var string
     */
    public $dciContentId;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 推广渠道
    /**
     * @var string
     */
    public $promotionWay;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contactName'       => 'contact_name',
        'contactPhone'      => 'contact_phone',
        'dciContentId'      => 'dci_content_id',
        'clientToken'       => 'client_token',
        'promotionWay'      => 'promotion_way',
    ];

    public function validate()
    {
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactPhone', $this->contactPhone, true);
        Model::validateRequired('dciContentId', $this->dciContentId, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateRequired('promotionWay', $this->promotionWay, true);
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
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactPhone) {
            $res['contact_phone'] = $this->contactPhone;
        }
        if (null !== $this->dciContentId) {
            $res['dci_content_id'] = $this->dciContentId;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->promotionWay) {
            $res['promotion_way'] = $this->promotionWay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDciPromotionRequest
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
        if (isset($map['contact_name'])) {
            $model->contactName = $map['contact_name'];
        }
        if (isset($map['contact_phone'])) {
            $model->contactPhone = $map['contact_phone'];
        }
        if (isset($map['dci_content_id'])) {
            $model->dciContentId = $map['dci_content_id'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['promotion_way'])) {
            $model->promotionWay = $map['promotion_way'];
        }

        return $model;
    }
}
