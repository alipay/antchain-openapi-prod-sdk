<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class SubmitDciFeedbackRequest extends Model
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

    // 业务ID
    /**
     * @var string
     */
    public $serviceId;

    // 作品名称
    /**
     * @var string
     */
    public $workName;

    // 联系人
    /**
     * @var string
     */
    public $contactName;

    // 联系电话
    /**
     * @var string
     */
    public $contactPhoneNumber;

    // 申诉原因
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'serviceId'          => 'service_id',
        'workName'           => 'work_name',
        'contactName'        => 'contact_name',
        'contactPhoneNumber' => 'contact_phone_number',
        'message'            => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('workName', $this->workName, true);
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactPhoneNumber', $this->contactPhoneNumber, true);
        Model::validateRequired('message', $this->message, true);
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
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->workName) {
            $res['work_name'] = $this->workName;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactPhoneNumber) {
            $res['contact_phone_number'] = $this->contactPhoneNumber;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitDciFeedbackRequest
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
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['work_name'])) {
            $model->workName = $map['work_name'];
        }
        if (isset($map['contact_name'])) {
            $model->contactName = $map['contact_name'];
        }
        if (isset($map['contact_phone_number'])) {
            $model->contactPhoneNumber = $map['contact_phone_number'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
