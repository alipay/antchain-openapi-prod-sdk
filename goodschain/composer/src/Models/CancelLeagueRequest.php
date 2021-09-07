<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CancelLeagueRequest extends Model
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

    // 联盟id
    /**
     * @var string
     */
    public $leagueId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'leagueId'          => 'league_id',
    ];

    public function validate()
    {
        Model::validateRequired('leagueId', $this->leagueId, true);
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
        if (null !== $this->leagueId) {
            $res['league_id'] = $this->leagueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelLeagueRequest
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
        if (isset($map['league_id'])) {
            $model->leagueId = $map['league_id'];
        }

        return $model;
    }
}
