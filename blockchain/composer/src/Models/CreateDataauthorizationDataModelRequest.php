<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDataauthorizationDataModelRequest extends Model
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

    // 业务系统唯一标示
    /**
     * @var string
     */
    public $bizUid;

    // 数据模型描述
    /**
     * @var string
     */
    public $description;

    // 模型字段详细信息
    /**
     * @var string
     */
    public $fieldDetail;

    // 数据模型业务ID
    /**
     * @var string
     */
    public $modelBizId;

    // 数据模型名称
    /**
     * @var string
     */
    public $name;

    // 空间ID
    /**
     * @var string
     */
    public $spaceId;

    // 提交人ID
    /**
     * @var string
     */
    public $submitterId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizUid'            => 'biz_uid',
        'description'       => 'description',
        'fieldDetail'       => 'field_detail',
        'modelBizId'        => 'model_biz_id',
        'name'              => 'name',
        'spaceId'           => 'space_id',
        'submitterId'       => 'submitter_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizUid', $this->bizUid, true);
        Model::validateRequired('fieldDetail', $this->fieldDetail, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->bizUid) {
            $res['biz_uid'] = $this->bizUid;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->fieldDetail) {
            $res['field_detail'] = $this->fieldDetail;
        }
        if (null !== $this->modelBizId) {
            $res['model_biz_id'] = $this->modelBizId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->submitterId) {
            $res['submitter_id'] = $this->submitterId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDataauthorizationDataModelRequest
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
        if (isset($map['biz_uid'])) {
            $model->bizUid = $map['biz_uid'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['field_detail'])) {
            $model->fieldDetail = $map['field_detail'];
        }
        if (isset($map['model_biz_id'])) {
            $model->modelBizId = $map['model_biz_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['submitter_id'])) {
            $model->submitterId = $map['submitter_id'];
        }

        return $model;
    }
}
