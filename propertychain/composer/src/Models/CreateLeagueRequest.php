<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateLeagueRequest extends Model
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

    // 区块链标识
    /**
     * @var string
     */
    public $blockchainD;

    // 评论
    /**
     * @var string
     */
    public $comment;

    // 联盟名称
    /**
     * @var string
     */
    public $leagueName;

    // 用户标识
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'blockchainD'       => 'blockchain_d',
        'comment'           => 'comment',
        'leagueName'        => 'league_name',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('blockchainD', $this->blockchainD, true);
        Model::validateRequired('leagueName', $this->leagueName, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->blockchainD) {
            $res['blockchain_d'] = $this->blockchainD;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->leagueName) {
            $res['league_name'] = $this->leagueName;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeagueRequest
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
        if (isset($map['blockchain_d'])) {
            $model->blockchainD = $map['blockchain_d'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['league_name'])) {
            $model->leagueName = $map['league_name'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
