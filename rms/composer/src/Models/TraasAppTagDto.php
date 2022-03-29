<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraasAppTagDto extends Model
{
    // uuid
    /**
     * @example uuid
     *
     * @var string
     */
    public $uuid;

    // tag_value
    /**
     * @example tag_value
     *
     * @var string
     */
    public $tagValue;

    // tag_key
    /**
     * @example tag_key
     *
     * @var string
     */
    public $tagKey;

    // tenant_uuid
    /**
     * @example tenant_uuid
     *
     * @var string
     */
    public $tenantUuid;

    // tenant_name
    /**
     * @example tenant_name
     *
     * @var string
     */
    public $tenantName;

    // app_uuid
    /**
     * @example app_uuid
     *
     * @var string
     */
    public $appUuid;

    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // outside_id
    /**
     * @example outside_id
     *
     * @var string
     */
    public $outsideId;

    // source_from
    /**
     * @example source_from
     *
     * @var string
     */
    public $sourceFrom;

    // extension
    /**
     * @example extension
     *
     * @var string
     */
    public $extension;

    // gmt_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'uuid'        => 'uuid',
        'tagValue'    => 'tag_value',
        'tagKey'      => 'tag_key',
        'tenantUuid'  => 'tenant_uuid',
        'tenantName'  => 'tenant_name',
        'appUuid'     => 'app_uuid',
        'appName'     => 'app_name',
        'outsideId'   => 'outside_id',
        'sourceFrom'  => 'source_from',
        'extension'   => 'extension',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('uuid', $this->uuid, true);
        Model::validateRequired('tagKey', $this->tagKey, true);
        Model::validateRequired('sourceFrom', $this->sourceFrom, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->tagValue) {
            $res['tag_value'] = $this->tagValue;
        }
        if (null !== $this->tagKey) {
            $res['tag_key'] = $this->tagKey;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->appUuid) {
            $res['app_uuid'] = $this->appUuid;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->outsideId) {
            $res['outside_id'] = $this->outsideId;
        }
        if (null !== $this->sourceFrom) {
            $res['source_from'] = $this->sourceFrom;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraasAppTagDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['tag_value'])) {
            $model->tagValue = $map['tag_value'];
        }
        if (isset($map['tag_key'])) {
            $model->tagKey = $map['tag_key'];
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['app_uuid'])) {
            $model->appUuid = $map['app_uuid'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['outside_id'])) {
            $model->outsideId = $map['outside_id'];
        }
        if (isset($map['source_from'])) {
            $model->sourceFrom = $map['source_from'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
