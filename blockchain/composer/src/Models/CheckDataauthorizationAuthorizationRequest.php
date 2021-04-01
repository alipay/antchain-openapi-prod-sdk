<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CheckDataauthorizationAuthorizationRequest extends Model
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

    // 权限凭证
    /**
     * @var string
     */
    public $authorityCert;

    // 数据ID
    /**
     * @var string
     */
    public $dataId;

    // 参与方ID
    /**
     * @var string
     */
    public $participantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authorityCert'     => 'authority_cert',
        'dataId'            => 'data_id',
        'participantId'     => 'participant_id',
    ];

    public function validate()
    {
        Model::validateRequired('authorityCert', $this->authorityCert, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('participantId', $this->participantId, true);
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
        if (null !== $this->authorityCert) {
            $res['authority_cert'] = $this->authorityCert;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->participantId) {
            $res['participant_id'] = $this->participantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckDataauthorizationAuthorizationRequest
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
        if (isset($map['authority_cert'])) {
            $model->authorityCert = $map['authority_cert'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['participant_id'])) {
            $model->participantId = $map['participant_id'];
        }

        return $model;
    }
}
