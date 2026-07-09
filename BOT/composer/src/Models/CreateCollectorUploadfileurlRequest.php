<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateCollectorUploadfileurlRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 待上传文件的业务类型，
    // 设备心跳数据：COLLECT_MUL
    // 设备业务数据： COLLECT_DEVICE_BIZ_DATA
    /**
     * @var string
     */
    public $dataType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'dataType'          => 'data_type',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('dataType', $this->dataType, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCollectorUploadfileurlRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }

        return $model;
    }
}
