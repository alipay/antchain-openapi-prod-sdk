<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightAssetContractInfo extends Model
{
    // 资产类型：ERC721 / ERC1155
    /**
     * @example ERC721
     *
     * @var string
     */
    public $ercType;

    // 资产总量
    /**
     * @example 100
     *
     * @var int
     */
    public $assetCount;

    // 持有者总量
    /**
     * @example 10
     *
     * @var int
     */
    public $ownerCount;
    protected $_name = [
        'ercType'    => 'erc_type',
        'assetCount' => 'asset_count',
        'ownerCount' => 'owner_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ercType) {
            $res['erc_type'] = $this->ercType;
        }
        if (null !== $this->assetCount) {
            $res['asset_count'] = $this->assetCount;
        }
        if (null !== $this->ownerCount) {
            $res['owner_count'] = $this->ownerCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightAssetContractInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['erc_type'])) {
            $model->ercType = $map['erc_type'];
        }
        if (isset($map['asset_count'])) {
            $model->assetCount = $map['asset_count'];
        }
        if (isset($map['owner_count'])) {
            $model->ownerCount = $map['owner_count'];
        }

        return $model;
    }
}
