<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class MatchCarloanUsersRequest extends Model
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

    // 需要匹配的值
    /**
     * @var string
     */
    public $matchId;

    // 需要匹配的id类型：手机号md5、安卓设备号md5、ios设备号md5
    /**
     * @var string
     */
    public $idType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'matchId'           => 'match_id',
        'idType'            => 'id_type',
    ];

    public function validate()
    {
        Model::validateRequired('matchId', $this->matchId, true);
        Model::validateRequired('idType', $this->idType, true);
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
        if (null !== $this->matchId) {
            $res['match_id'] = $this->matchId;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MatchCarloanUsersRequest
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
        if (isset($map['match_id'])) {
            $model->matchId = $map['match_id'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }

        return $model;
    }
}
