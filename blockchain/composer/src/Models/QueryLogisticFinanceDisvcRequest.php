<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryLogisticFinanceDisvcRequest extends Model
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

    // 代理申请的分布式数字身份，缺省时为自己的分布式数字身份
    /**
     * @var string
     */
    public $agentDid;

    // 可验证声明id
    /**
     * @var string
     */
    public $vcId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentDid'          => 'agent_did',
        'vcId'              => 'vc_id',
    ];

    public function validate()
    {
        Model::validateRequired('vcId', $this->vcId, true);
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
        if (null !== $this->agentDid) {
            $res['agent_did'] = $this->agentDid;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLogisticFinanceDisvcRequest
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
        if (isset($map['agent_did'])) {
            $model->agentDid = $map['agent_did'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }

        return $model;
    }
}
