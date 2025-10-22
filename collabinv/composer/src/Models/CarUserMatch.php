<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class CarUserMatch extends Model
{
    // 设备号或者手机号md5
    /**
     * @example 12312asdasd123123123
     *
     * @var string
     */
    public $matchId;

    // 需要匹配的id类型：手机号md5、安卓设备号md5、ios设备号md5
    /**
     * @example phoneMd5/oaidMd5/idfaMd5
     *
     * @var string
     */
    public $idType;
    protected $_name = [
        'matchId' => 'match_id',
        'idType'  => 'id_type',
    ];

    public function validate()
    {
        Model::validateRequired('matchId', $this->matchId, true);
        Model::validateRequired('idType', $this->idType, true);
    }

    public function toMap()
    {
        $res = [];
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
     * @return CarUserMatch
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['match_id'])) {
            $model->matchId = $map['match_id'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }

        return $model;
    }
}
