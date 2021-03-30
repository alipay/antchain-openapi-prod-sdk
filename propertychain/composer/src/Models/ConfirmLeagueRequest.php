<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ConfirmLeagueRequest extends Model
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

    // 用户标识
    /**
     * @var string
     */
    public $userId;

    // 加入用户的标识
    /**
     * @var string
     */
    public $joinUserId;

    // 审核结果
    /**
     * @var bool
     */
    public $pass;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'leagueId'          => 'league_id',
        'userId'            => 'user_id',
        'joinUserId'        => 'join_user_id',
        'pass'              => 'pass',
    ];

    public function validate()
    {
        Model::validateRequired('leagueId', $this->leagueId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('joinUserId', $this->joinUserId, true);
        Model::validateRequired('pass', $this->pass, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->joinUserId) {
            $res['join_user_id'] = $this->joinUserId;
        }
        if (null !== $this->pass) {
            $res['pass'] = $this->pass;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmLeagueRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['join_user_id'])) {
            $model->joinUserId = $map['join_user_id'];
        }
        if (isset($map['pass'])) {
            $model->pass = $map['pass'];
        }

        return $model;
    }
}
