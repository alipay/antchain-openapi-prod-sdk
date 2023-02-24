<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationDrivingpermitinfoRequest extends Model
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
    public $platNumber;

    // 号牌种类，枚举
    /**
     * @var string
     */
    public $platetype;

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
        'platNumber'        => 'plat_number',
        'platetype'         => 'platetype',
        'owner'             => 'owner',
    ];

    public function validate()
    {
        Model::validateRequired('dataSetId', $this->dataSetId, true);
        Model::validateRequired('userAuthed', $this->userAuthed, true);
        Model::validateRequired('fileIndex', $this->fileIndex, true);
        Model::validateRequired('platNumber', $this->platNumber, true);
        Model::validateRequired('platetype', $this->platetype, true);
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
        if (null !== $this->platNumber) {
            $res['plat_number'] = $this->platNumber;
        }
        if (null !== $this->platetype) {
            $res['platetype'] = $this->platetype;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApplicationDrivingpermitinfoRequest
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
        if (isset($map['plat_number'])) {
            $model->platNumber = $map['plat_number'];
        }
        if (isset($map['platetype'])) {
            $model->platetype = $map['platetype'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
