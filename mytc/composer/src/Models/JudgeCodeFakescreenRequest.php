<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class JudgeCodeFakescreenRequest extends Model
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

    // 设备型号
    /**
     * @var string
     */
    public $deviceType;

    // 未闪光图片的fileId
    /**
     * @var string
     */
    public $unflashedFileId;

    // 闪光后图片fileId
    /**
     * @var string
     */
    public $flashedFileId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceType'        => 'device_type',
        'unflashedFileId'   => 'unflashed_file_id',
        'flashedFileId'     => 'flashed_file_id',
    ];

    public function validate()
    {
        Model::validateRequired('unflashedFileId', $this->unflashedFileId, true);
        Model::validateRequired('flashedFileId', $this->flashedFileId, true);
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
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->unflashedFileId) {
            $res['unflashed_file_id'] = $this->unflashedFileId;
        }
        if (null !== $this->flashedFileId) {
            $res['flashed_file_id'] = $this->flashedFileId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudgeCodeFakescreenRequest
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
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['unflashed_file_id'])) {
            $model->unflashedFileId = $map['unflashed_file_id'];
        }
        if (isset($map['flashed_file_id'])) {
            $model->flashedFileId = $map['flashed_file_id'];
        }

        return $model;
    }
}
