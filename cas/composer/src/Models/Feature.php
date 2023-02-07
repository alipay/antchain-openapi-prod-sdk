<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Feature extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // cloud_name
    /**
     * @example cloud_name
     *
     * @var string
     */
    public $cloudName;

    // region_id
    /**
     * @example region_id
     *
     * @var string
     */
    public $regionId;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // feature_name
    /**
     * @example feature_name
     *
     * @var string
     */
    public $featureName;

    // content
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // conditional_content
    /**
     * @example conditional_content
     *
     * @var string
     */
    public $conditionalContent;

    // utc_create
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utc_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'id'                 => 'id',
        'cloudName'          => 'cloud_name',
        'regionId'           => 'region_id',
        'description'        => 'description',
        'featureName'        => 'feature_name',
        'content'            => 'content',
        'conditionalContent' => 'conditional_content',
        'utcCreate'          => 'utc_create',
        'utcModified'        => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('cloudName', $this->cloudName, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('featureName', $this->featureName, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->cloudName) {
            $res['cloud_name'] = $this->cloudName;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->featureName) {
            $res['feature_name'] = $this->featureName;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->conditionalContent) {
            $res['conditional_content'] = $this->conditionalContent;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Feature
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['cloud_name'])) {
            $model->cloudName = $map['cloud_name'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['feature_name'])) {
            $model->featureName = $map['feature_name'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['conditional_content'])) {
            $model->conditionalContent = $map['conditional_content'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
