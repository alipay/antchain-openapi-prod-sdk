<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class NotifyPartnerAsyncRequest extends Model
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

    // ZHONGYI
    /**
     * @var string
     */
    public $partnerId;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 通知内容
    //
    /**
     * @var string
     */
    public $notifyContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'partnerId'         => 'partner_id',
        'productCode'       => 'product_code',
        'notifyContent'     => 'notify_content',
    ];

    public function validate()
    {
        Model::validateRequired('partnerId', $this->partnerId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('notifyContent', $this->notifyContent, true);
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
        if (null !== $this->partnerId) {
            $res['partner_id'] = $this->partnerId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->notifyContent) {
            $res['notify_content'] = $this->notifyContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyPartnerAsyncRequest
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
        if (isset($map['partner_id'])) {
            $model->partnerId = $map['partner_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['notify_content'])) {
            $model->notifyContent = $map['notify_content'];
        }

        return $model;
    }
}
