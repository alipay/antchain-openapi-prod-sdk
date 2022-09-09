<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RegisterWaasBusinessRequest extends Model
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

    // 业务场景名称
    /**
     * @var string
     */
    public $bizName;

    // 业务场景公钥
    /**
     * @var string
     */
    public $publicKey;

    // 业务场景运行dcep合约的链id
    /**
     * @var string
     */
    public $chainId;

    // 数据资产展示首页
    /**
     * @var string
     */
    public $indexUrl;

    // 与waas交互地址，waas服务会推送相关消息至该链接
    /**
     * @var string
     */
    public $interactionUrl;

    // 业务场景描述
    /**
     * @var string
     */
    public $businessDesc;

    // 扩展字段
    /**
     * @var string
     */
    public $extension;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizName'           => 'biz_name',
        'publicKey'         => 'public_key',
        'chainId'           => 'chain_id',
        'indexUrl'          => 'index_url',
        'interactionUrl'    => 'interaction_url',
        'businessDesc'      => 'business_desc',
        'extension'         => 'extension',
    ];

    public function validate()
    {
        Model::validateRequired('bizName', $this->bizName, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('indexUrl', $this->indexUrl, true);
        Model::validateRequired('interactionUrl', $this->interactionUrl, true);
        Model::validateRequired('businessDesc', $this->businessDesc, true);
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
        if (null !== $this->bizName) {
            $res['biz_name'] = $this->bizName;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->indexUrl) {
            $res['index_url'] = $this->indexUrl;
        }
        if (null !== $this->interactionUrl) {
            $res['interaction_url'] = $this->interactionUrl;
        }
        if (null !== $this->businessDesc) {
            $res['business_desc'] = $this->businessDesc;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterWaasBusinessRequest
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
        if (isset($map['biz_name'])) {
            $model->bizName = $map['biz_name'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['index_url'])) {
            $model->indexUrl = $map['index_url'];
        }
        if (isset($map['interaction_url'])) {
            $model->interactionUrl = $map['interaction_url'];
        }
        if (isset($map['business_desc'])) {
            $model->businessDesc = $map['business_desc'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }

        return $model;
    }
}
