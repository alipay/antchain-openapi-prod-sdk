<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DataModel extends Model
{
    // 业务系统唯一标示
    /**
     * @example 3fc223617da9a17a4d7792ef0c3f57bd176ec
     *
     * @var string
     */
    public $bizUid;

    // 空间ID
    /**
     * @example space1
     *
     * @var string
     */
    public $spaceId;

    // 创建时间
    /**
     * @example 1595574776000
     *
     * @var int
     */
    public $createTime;

    // 数据模型描述
    /**
     * @example 这是一个描述信息
     *
     * @var string
     */
    public $description;

    // 模型字段详细信息
    /**
     * @example {"organization":"test","company":"test"}
     *
     * @var string
     */
    public $fieldDetail;

    // 数据模型业务ID
    /**
     * @example model_company_data
     *
     * @var string
     */
    public $modelBizId;

    // 数据模型ID
    /**
     * @example DATA_MODEL_123
     *
     * @var string
     */
    public $modelId;

    // 数据模型名称
    /**
     * @example 税务信息模型
     *
     * @var string
     */
    public $name;

    // 提交人
    /**
     * @example
     *
     * @var Participant
     */
    public $submitter;

    // 更新时间
    /**
     * @example 1595574776000
     *
     * @var int
     */
    public $updateTime;

    // 状态
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'bizUid'      => 'biz_uid',
        'spaceId'     => 'space_id',
        'createTime'  => 'create_time',
        'description' => 'description',
        'fieldDetail' => 'field_detail',
        'modelBizId'  => 'model_biz_id',
        'modelId'     => 'model_id',
        'name'        => 'name',
        'submitter'   => 'submitter',
        'updateTime'  => 'update_time',
        'status'      => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('fieldDetail', $this->fieldDetail, true);
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('submitter', $this->submitter, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizUid) {
            $res['biz_uid'] = $this->bizUid;
        }
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
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
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->submitter) {
            $res['submitter'] = null !== $this->submitter ? $this->submitter->toMap() : null;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_uid'])) {
            $model->bizUid = $map['biz_uid'];
        }
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
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
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['submitter'])) {
            $model->submitter = Participant::fromMap($map['submitter']);
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
