<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class LeagueInfo extends Model
{
    // 时间
    /**
     * @example 5676989
     *
     * @var int
     */
    public $createTime;

    // 联盟id
    /**
     * @example 5676989
     *
     * @var string
     */
    public $leagueId;

    // 联盟名称
    /**
     * @example 5676989
     *
     * @var string
     */
    public $leagueName;

    // 联盟描述
    /**
     * @example leagueDesc
     *
     * @var string
     */
    public $leagueDesc;

    // 联盟对应的物权平台产品
    /**
     * @example productVersion
     *
     * @var string
     */
    public $productVersion;
    protected $_name = [
        'createTime'     => 'create_time',
        'leagueId'       => 'league_id',
        'leagueName'     => 'league_name',
        'leagueDesc'     => 'league_desc',
        'productVersion' => 'product_version',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->leagueId) {
            $res['league_id'] = $this->leagueId;
        }
        if (null !== $this->leagueName) {
            $res['league_name'] = $this->leagueName;
        }
        if (null !== $this->leagueDesc) {
            $res['league_desc'] = $this->leagueDesc;
        }
        if (null !== $this->productVersion) {
            $res['product_version'] = $this->productVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeagueInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['league_id'])) {
            $model->leagueId = $map['league_id'];
        }
        if (isset($map['league_name'])) {
            $model->leagueName = $map['league_name'];
        }
        if (isset($map['league_desc'])) {
            $model->leagueDesc = $map['league_desc'];
        }
        if (isset($map['product_version'])) {
            $model->productVersion = $map['product_version'];
        }

        return $model;
    }
}
