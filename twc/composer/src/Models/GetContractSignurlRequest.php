<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetContractSignurlRequest extends Model
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

    // 签署人账号id
    /**
     * @var string
     */
    public $accountId;

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 默认为空，返回的任务链接仅包含签署人本人需要签署的任务； 传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务； 传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务
    /**
     * @var string
     */
    public $organizeId;

    // 是否需要同时返回短链接，默认为false
    /**
     * @var bool
     */
    public $shortUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountId'         => 'account_id',
        'flowId'            => 'flow_id',
        'organizeId'        => 'organize_id',
        'shortUrl'          => 'short_url',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('flowId', $this->flowId, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->organizeId) {
            $res['organize_id'] = $this->organizeId;
        }
        if (null !== $this->shortUrl) {
            $res['short_url'] = $this->shortUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetContractSignurlRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['organize_id'])) {
            $model->organizeId = $map['organize_id'];
        }
        if (isset($map['short_url'])) {
            $model->shortUrl = $map['short_url'];
        }

        return $model;
    }
}
