<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationVehiclelicensecertRequest extends Model
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

    // 数据集id，开发者提供
    /**
     * @var string
     */
    public $dataSetId;

    // 是否授权
    /**
     * @var bool
     */
    public $userAuthed;

    // 授权协议索引
    /**
     * @var string
     */
    public $fileIndex;

    // 车牌号
    /**
     * @var string
     */
    public $plateNumber;

    // 号牌种类，枚举
    /**
     * @var string
     */
    public $plateType;

    // 所有人姓名
    /**
     * @var string
     */
    public $owner;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataSetId'         => 'data_set_id',
        'userAuthed'        => 'user_authed',
        'fileIndex'         => 'file_index',
        'plateNumber'       => 'plate_number',
        'plateType'         => 'plate_type',
        'owner'             => 'owner',
    ];

    public function validate()
    {
        Model::validateRequired('dataSetId', $this->dataSetId, true);
        Model::validateRequired('userAuthed', $this->userAuthed, true);
        Model::validateRequired('fileIndex', $this->fileIndex, true);
        Model::validateRequired('plateNumber', $this->plateNumber, true);
        Model::validateRequired('plateType', $this->plateType, true);
        Model::validateRequired('owner', $this->owner, true);
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
        if (null !== $this->dataSetId) {
            $res['data_set_id'] = $this->dataSetId;
        }
        if (null !== $this->userAuthed) {
            $res['user_authed'] = $this->userAuthed;
        }
        if (null !== $this->fileIndex) {
            $res['file_index'] = $this->fileIndex;
        }
        if (null !== $this->plateNumber) {
            $res['plate_number'] = $this->plateNumber;
        }
        if (null !== $this->plateType) {
            $res['plate_type'] = $this->plateType;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApplicationVehiclelicensecertRequest
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
        if (isset($map['data_set_id'])) {
            $model->dataSetId = $map['data_set_id'];
        }
        if (isset($map['user_authed'])) {
            $model->userAuthed = $map['user_authed'];
        }
        if (isset($map['file_index'])) {
            $model->fileIndex = $map['file_index'];
        }
        if (isset($map['plate_number'])) {
            $model->plateNumber = $map['plate_number'];
        }
        if (isset($map['plate_type'])) {
            $model->plateType = $map['plate_type'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
