<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryChainDataTransactionResultData extends Model
{
    // 业务ID
    /**
     * @example 123
     *
     * @var string
     */
    public $bizId;

    // 所属业务
    /**
     * @example SMART_CAR_KEY
     *
     * @var string
     */
    public $bizScene;

    // 数据资产类型
    /**
     * @example 123
     *
     * @var string
     */
    public $dataScene;

    // 资产ID
    /**
     * @example 123
     *
     * @var string
     */
    public $assetId;

    // 租户id
    /**
     * @example ASDFGHJK
     *
     * @var string
     */
    public $tenantId;

    // 资产数据
    /**
     * @example 123
     *
     * @var string
     */
    public $assetData;

    // 时间
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'bizId'     => 'biz_id',
        'bizScene'  => 'biz_scene',
        'dataScene' => 'data_scene',
        'assetId'   => 'asset_id',
        'tenantId'  => 'tenant_id',
        'assetData' => 'asset_data',
        'timestamp' => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('dataScene', $this->dataScene, true);
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('assetData', $this->assetData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->dataScene) {
            $res['data_scene'] = $this->dataScene;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->assetData) {
            $res['asset_data'] = $this->assetData;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryChainDataTransactionResultData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['data_scene'])) {
            $model->dataScene = $map['data_scene'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['asset_data'])) {
            $model->assetData = $map['asset_data'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
