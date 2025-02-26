<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class CreateBlockchainBccrDciRegistrationcertRequest extends Model
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

    // 任务ID
    /**
     * @var string
     */
    public $taskId;

    // 版权用户ID
    /**
     * @var string
     */
    public $userId;

    // DCI码
    /**
     * @var string
     */
    public $dciCode;

    // 登记号
    /**
     * @var string
     */
    public $regNumber;

    // 二维码
    /**
     * @var string
     */
    public $qrCodeUrl;

    // 客户端token
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskId'            => 'task_id',
        'userId'            => 'user_id',
        'dciCode'           => 'dci_code',
        'regNumber'         => 'reg_number',
        'qrCodeUrl'         => 'qr_code_url',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('dciCode', $this->dciCode, true);
        Model::validateRequired('regNumber', $this->regNumber, true);
        Model::validateRequired('qrCodeUrl', $this->qrCodeUrl, true);
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
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->dciCode) {
            $res['dci_code'] = $this->dciCode;
        }
        if (null !== $this->regNumber) {
            $res['reg_number'] = $this->regNumber;
        }
        if (null !== $this->qrCodeUrl) {
            $res['qr_code_url'] = $this->qrCodeUrl;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBlockchainBccrDciRegistrationcertRequest
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
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['dci_code'])) {
            $model->dciCode = $map['dci_code'];
        }
        if (isset($map['reg_number'])) {
            $model->regNumber = $map['reg_number'];
        }
        if (isset($map['qr_code_url'])) {
            $model->qrCodeUrl = $map['qr_code_url'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
