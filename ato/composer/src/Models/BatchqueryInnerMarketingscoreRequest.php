<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryInnerMarketingscoreRequest extends Model
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

    // 营销分查询对象
    /**
     * @var MarketingScoreQueryInfo[]
     */
    public $marketingScoreQueryInfos;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'marketingScoreQueryInfos' => 'marketing_score_query_infos',
    ];

    public function validate()
    {
        Model::validateRequired('marketingScoreQueryInfos', $this->marketingScoreQueryInfos, true);
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
        if (null !== $this->marketingScoreQueryInfos) {
            $res['marketing_score_query_infos'] = [];
            if (null !== $this->marketingScoreQueryInfos && \is_array($this->marketingScoreQueryInfos)) {
                $n = 0;
                foreach ($this->marketingScoreQueryInfos as $item) {
                    $res['marketing_score_query_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryInnerMarketingscoreRequest
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
        if (isset($map['marketing_score_query_infos'])) {
            if (!empty($map['marketing_score_query_infos'])) {
                $model->marketingScoreQueryInfos = [];
                $n                               = 0;
                foreach ($map['marketing_score_query_infos'] as $item) {
                    $model->marketingScoreQueryInfos[$n++] = null !== $item ? MarketingScoreQueryInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
