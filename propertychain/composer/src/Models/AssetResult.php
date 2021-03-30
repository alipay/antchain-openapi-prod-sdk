<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AssetResult extends Model
{
    // 资产id
    /**
     * @example assetId
     *
     * @var string
     */
    public $assetId;

    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 信息
    /**
     * @example message
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'assetId' => 'asset_id',
        'success' => 'success',
        'message' => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('success', $this->success, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
