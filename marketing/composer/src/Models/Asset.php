<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class Asset extends Model
{
    // 资产标识，作为幂等单号
    /**
     * @example 2024112900876318
     *
     * @var string
     */
    public $assetId;

    // VALID - 生效；INVALID - 作废
    /**
     * @example 资产状态
     *
     * @var string
     */
    public $status;

    // 资产详情，自定义展示
    /**
     * @example "{"company":"alpha","name":"beta","phone":"18812345678","email":"hello@example.com","position":"gamma","industry":"zeta","content":"delta"}"
     *
     * @var string
     */
    public $assetInfo;
    protected $_name = [
        'assetId'   => 'asset_id',
        'status'    => 'status',
        'assetInfo' => 'asset_info',
    ];

    public function validate()
    {
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('assetInfo', $this->assetInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->assetInfo) {
            $res['asset_info'] = $this->assetInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Asset
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['asset_info'])) {
            $model->assetInfo = $map['asset_info'];
        }

        return $model;
    }
}
