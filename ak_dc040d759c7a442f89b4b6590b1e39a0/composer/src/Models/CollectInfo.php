<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class CollectInfo extends Model
{
    // 资产ID
    /**
     * @example 56165431
     *
     * @var string
     */
    public $assetId;

    // 数据资产类型
    /**
     * @example LOCK
     *
     * @var string
     */
    public $dataScene;

    // 资产数据内容，业务要上链的数据JSON格式
    /**
     * @example {"a":xx,"b":xx}
     *
     * @var string
     */
    public $assetData;

    // 上链数据采集id
    /**
     * @example 289hj98u
     *
     * @var string
     */
    public $collectId;
    protected $_name = [
        'assetId'   => 'asset_id',
        'dataScene' => 'data_scene',
        'assetData' => 'asset_data',
        'collectId' => 'collect_id',
    ];

    public function validate()
    {
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('dataScene', $this->dataScene, true);
        Model::validateRequired('assetData', $this->assetData, true);
        Model::validateRequired('collectId', $this->collectId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->dataScene) {
            $res['data_scene'] = $this->dataScene;
        }
        if (null !== $this->assetData) {
            $res['asset_data'] = $this->assetData;
        }
        if (null !== $this->collectId) {
            $res['collect_id'] = $this->collectId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CollectInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['data_scene'])) {
            $model->dataScene = $map['data_scene'];
        }
        if (isset($map['asset_data'])) {
            $model->assetData = $map['asset_data'];
        }
        if (isset($map['collect_id'])) {
            $model->collectId = $map['collect_id'];
        }

        return $model;
    }
}
