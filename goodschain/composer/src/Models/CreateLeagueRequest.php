<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

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

    // 酒证:WINE_ASSET,茶证:TEA_ASSET,艺术物证:ARTISTIC_ASSET
    /**
     * @var string
     */
    public $sceneType;

    // 联盟名称
    /**
     * @var string
     */
    public $leagueName;

    // 黄酒集市
    /**
     * @var string
     */
    public $sceneDesc;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneType'         => 'scene_type',
        'leagueName'        => 'league_name',
        'sceneDesc'         => 'scene_desc',
    ];

    public function validate()
    {
        Model::validateRequired('sceneType', $this->sceneType, true);
        Model::validateRequired('leagueName', $this->leagueName, true);
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
        if (null !== $this->sceneType) {
            $res['scene_type'] = $this->sceneType;
        }
        if (null !== $this->leagueName) {
            $res['league_name'] = $this->leagueName;
        }
        if (null !== $this->sceneDesc) {
            $res['scene_desc'] = $this->sceneDesc;
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
        if (isset($map['scene_type'])) {
            $model->sceneType = $map['scene_type'];
        }
        if (isset($map['league_name'])) {
            $model->leagueName = $map['league_name'];
        }
        if (isset($map['scene_desc'])) {
            $model->sceneDesc = $map['scene_desc'];
        }

        return $model;
    }
}
