<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class UpdateDciUserRequest extends Model
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

    // dci用户ID
    /**
     * @var string
     */
    public $dciUserId;

    // 证件正面oss fileId
    /**
     * @var string
     */
    public $certFrontFileId;

    // 证件背面oss fileId
    /**
     * @var string
     */
    public $certBackFileId;

    // 手机号
    /**
     * @var string
     */
    public $phone;

    // 客户端令牌
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dciUserId'         => 'dci_user_id',
        'certFrontFileId'   => 'cert_front_file_id',
        'certBackFileId'    => 'cert_back_file_id',
        'phone'             => 'phone',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('dciUserId', $this->dciUserId, true);
        Model::validateRequired('certFrontFileId', $this->certFrontFileId, true);
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
        if (null !== $this->dciUserId) {
            $res['dci_user_id'] = $this->dciUserId;
        }
        if (null !== $this->certFrontFileId) {
            $res['cert_front_file_id'] = $this->certFrontFileId;
        }
        if (null !== $this->certBackFileId) {
            $res['cert_back_file_id'] = $this->certBackFileId;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDciUserRequest
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
        if (isset($map['dci_user_id'])) {
            $model->dciUserId = $map['dci_user_id'];
        }
        if (isset($map['cert_front_file_id'])) {
            $model->certFrontFileId = $map['cert_front_file_id'];
        }
        if (isset($map['cert_back_file_id'])) {
            $model->certBackFileId = $map['cert_back_file_id'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
