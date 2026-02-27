<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATCS\Models;

use AlibabaCloud\Tea\Model;

class SubmitOnchainTaskRequest extends Model
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

    // 智能体标识
    /**
     * @var string
     */
    public $agentId;

    // 凭证标识,如delegate_id
    /**
     * @var string
     */
    public $credentialId;

    // 上链内容，json形式
    /**
     * @var string
     */
    public $text;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId'           => 'agent_id',
        'credentialId'      => 'credential_id',
        'text'              => 'text',
    ];

    public function validate()
    {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('credentialId', $this->credentialId, true);
        Model::validateRequired('text', $this->text, true);
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
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->credentialId) {
            $res['credential_id'] = $this->credentialId;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitOnchainTaskRequest
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
        if (isset($map['agent_id'])) {
            $model->agentId = $map['agent_id'];
        }
        if (isset($map['credential_id'])) {
            $model->credentialId = $map['credential_id'];
        }
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }

        return $model;
    }
}
