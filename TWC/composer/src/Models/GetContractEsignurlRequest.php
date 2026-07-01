<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetContractEsignurlRequest extends Model
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

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 账户id
    /**
     * @var string
     */
    public $accountId;

    // 默认为空，返回的任务链接仅包含签署人本人需要签署的任务；  传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务；  传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务, 注意：当签署是企业签署的情况，该字段必传。建议organizeId直接传0。
    /**
     * @var string
     */
    public $organizeId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'accountId'         => 'account_id',
        'organizeId'        => 'organize_id',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('accountId', $this->accountId, true);
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->organizeId) {
            $res['organize_id'] = $this->organizeId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetContractEsignurlRequest
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['organize_id'])) {
            $model->organizeId = $map['organize_id'];
        }

        return $model;
    }
}
