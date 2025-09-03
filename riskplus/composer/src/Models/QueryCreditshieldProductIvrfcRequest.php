<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditshieldProductIvrfcRequest extends Model
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

    // 1.信息查询 2.债务人判断
    /**
     * @var string
     */
    public $queryCode;

    // 查询信息Map集合
    /**
     * @var QueryInfo[]
     */
    public $queryInfos;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'queryCode'         => 'query_code',
        'queryInfos'        => 'query_infos',
    ];

    public function validate()
    {
        Model::validateRequired('queryCode', $this->queryCode, true);
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
        if (null !== $this->queryCode) {
            $res['query_code'] = $this->queryCode;
        }
        if (null !== $this->queryInfos) {
            $res['query_infos'] = [];
            if (null !== $this->queryInfos && \is_array($this->queryInfos)) {
                $n = 0;
                foreach ($this->queryInfos as $item) {
                    $res['query_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCreditshieldProductIvrfcRequest
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
        if (isset($map['query_code'])) {
            $model->queryCode = $map['query_code'];
        }
        if (isset($map['query_infos'])) {
            if (!empty($map['query_infos'])) {
                $model->queryInfos = [];
                $n                 = 0;
                foreach ($map['query_infos'] as $item) {
                    $model->queryInfos[$n++] = null !== $item ? QueryInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
