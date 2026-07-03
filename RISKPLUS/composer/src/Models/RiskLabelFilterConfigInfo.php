<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RiskLabelFilterConfigInfo extends Model
{
    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 是否为基本筛选标签
    /**
     * @example 1
     *
     * @var int
     */
    public $isBase;

    // 标记删除
    /**
     * @example 0
     *
     * @var int
     */
    public $isDelete;

    // 操作人员ID
    /**
     * @example 1
     *
     * @var string
     */
    public $operatorId;

    // 地区名
    /**
     * @example place_name
     *
     * @var string
     */
    public $placeName;

    // 地区类型
    /**
     * @example place_type
     *
     * @var string
     */
    public $placeType;

    // 标签ID
    /**
     * @example 1
     *
     * @var string
     */
    public $tagId;
    protected $_name = [
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'id'          => 'id',
        'isBase'      => 'is_base',
        'isDelete'    => 'is_delete',
        'operatorId'  => 'operator_id',
        'placeName'   => 'place_name',
        'placeType'   => 'place_type',
        'tagId'       => 'tag_id',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('isBase', $this->isBase, true);
        Model::validateRequired('isDelete', $this->isDelete, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('placeName', $this->placeName, true);
        Model::validateRequired('placeType', $this->placeType, true);
        Model::validateRequired('tagId', $this->tagId, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->isBase) {
            $res['is_base'] = $this->isBase;
        }
        if (null !== $this->isDelete) {
            $res['is_delete'] = $this->isDelete;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->placeName) {
            $res['place_name'] = $this->placeName;
        }
        if (null !== $this->placeType) {
            $res['place_type'] = $this->placeType;
        }
        if (null !== $this->tagId) {
            $res['tag_id'] = $this->tagId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskLabelFilterConfigInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['is_base'])) {
            $model->isBase = $map['is_base'];
        }
        if (isset($map['is_delete'])) {
            $model->isDelete = $map['is_delete'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['place_name'])) {
            $model->placeName = $map['place_name'];
        }
        if (isset($map['place_type'])) {
            $model->placeType = $map['place_type'];
        }
        if (isset($map['tag_id'])) {
            $model->tagId = $map['tag_id'];
        }

        return $model;
    }
}
