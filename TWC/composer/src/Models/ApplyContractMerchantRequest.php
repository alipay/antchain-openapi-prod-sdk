<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyContractMerchantRequest extends Model
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

    // 入驻信息，必须是json字符串
    /**
     * @var string
     */
    public $bizContent;

    // 代理商户账户ID，此参数传null默认平台机构账户入驻，不允许传空字符串
    /**
     * @var string
     */
    public $agentAccountId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizContent'        => 'biz_content',
        'agentAccountId'    => 'agent_account_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizContent', $this->bizContent, true);
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
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->agentAccountId) {
            $res['agent_account_id'] = $this->agentAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyContractMerchantRequest
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
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['agent_account_id'])) {
            $model->agentAccountId = $map['agent_account_id'];
        }

        return $model;
    }
}
