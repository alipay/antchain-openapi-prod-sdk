<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationChannelunifiedentranceRequest extends Model
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

    // 授权文件ID
    /**
     * @var string
     */
    public $fileIndex;

    // 整个需求的入参，map json
    /**
     * @var string
     */
    public $params;

    // 是否授权
    /**
     * @var bool
     */
    public $userAuthed;

    // 数据集服务id
    /**
     * @var string
     */
    public $serviceId;

    // token授权场景码
    /**
     * @var string
     */
    public $sceneCode;

    //
    // 授权token
    /**
     * @var string
     */
    public $token;

    // 客户ID
    /**
     * @var string
     */
    public $customerId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileIndex'         => 'file_index',
        'params'            => 'params',
        'userAuthed'        => 'user_authed',
        'serviceId'         => 'service_id',
        'sceneCode'         => 'scene_code',
        'token'             => 'token',
        'customerId'        => 'customer_id',
    ];

    public function validate()
    {
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('customerId', $this->customerId, true);
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
        if (null !== $this->fileIndex) {
            $res['file_index'] = $this->fileIndex;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->userAuthed) {
            $res['user_authed'] = $this->userAuthed;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApplicationChannelunifiedentranceRequest
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
        if (isset($map['file_index'])) {
            $model->fileIndex = $map['file_index'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['user_authed'])) {
            $model->userAuthed = $map['user_authed'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }

        return $model;
    }
}
