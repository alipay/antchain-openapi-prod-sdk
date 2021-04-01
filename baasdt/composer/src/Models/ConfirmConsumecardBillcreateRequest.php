<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ConfirmConsumecardBillcreateRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 账单ID
    /**
     * @var string
     */
    public $orderId;

    // 附言(不要超过500个字符)
    /**
     * @var string
     */
    public $remark;

    // 账单创建是否确认成功。true为成功，false为失败
    /**
     * @var bool
     */
    public $success;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'orderId'           => 'order_id',
        'remark'            => 'remark',
        'success'           => 'success',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('success', $this->success, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmConsumecardBillcreateRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
