<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGTMNG\Models;

use AlibabaCloud\Tea\Model;

class QueryAntdigitalDtaiagtMarketRichdetailRequest extends Model
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

    // 市场条目 ID，必填
    /**
     * @var int
     */
    public $id;

    // 当前空间 ID（用于判断订阅状态），非必填
    /**
     * @var int
     */
    public $botId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'botId'             => 'bot_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->botId) {
            $res['bot_id'] = $this->botId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntdigitalDtaiagtMarketRichdetailRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['bot_id'])) {
            $model->botId = $map['bot_id'];
        }

        return $model;
    }
}
