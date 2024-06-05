<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class ChainModelResult extends Model
{
    // 所属业务
    /**
     * @example XR_LEASE
     *
     * @var string
     */
    public $bizScene;

    // 资产类型
    /**
     * @example LOCK_RECORD
     *
     * @var string
     */
    public $dataScene;

    // 资产id
    /**
     * @example 资产id
     *
     * @var string
     */
    public $assetId;

    // 资产数据内容json
    /**
     * @example {}
     *
     * @var string
     */
    public $assetData;

    // 租户id
    /**
     * @example SDFJAG
     *
     * @var string
     */
    public $tenantId;

    // 上链时间
    /**
     * @example 2022-10-02 09:10:09
     *
     * @var string
     */
    public $txTime;

    // 业务ID
    /**
     * @example 业务ID
     *
     * @var string
     */
    public $businessId;

    // 上链id
    /**
     * @example 123
     *
     * @var string
     */
    public $antchainId;
    protected $_name = [
        'bizScene'   => 'biz_scene',
        'dataScene'  => 'data_scene',
        'assetId'    => 'asset_id',
        'assetData'  => 'asset_data',
        'tenantId'   => 'tenant_id',
        'txTime'     => 'tx_time',
        'businessId' => 'business_id',
        'antchainId' => 'antchain_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('dataScene', $this->dataScene, true);
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('assetData', $this->assetData, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('txTime', $this->txTime, true);
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('antchainId', $this->antchainId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->dataScene) {
            $res['data_scene'] = $this->dataScene;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->assetData) {
            $res['asset_data'] = $this->assetData;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->antchainId) {
            $res['antchain_id'] = $this->antchainId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainModelResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['data_scene'])) {
            $model->dataScene = $map['data_scene'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['asset_data'])) {
            $model->assetData = $map['asset_data'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['antchain_id'])) {
            $model->antchainId = $map['antchain_id'];
        }

        return $model;
    }
}
