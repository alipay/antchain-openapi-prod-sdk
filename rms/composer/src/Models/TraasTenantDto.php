<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraasTenantDto extends Model
{
    // uuid
    /**
     * @example uuid
     *
     * @var string
     */
    public $uuid;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // display_name
    /**
     * @example display_name
     *
     * @var string
     */
    public $displayName;

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
    protected $_name = [
        'uuid'        => 'uuid',
        'name'        => 'name',
        'displayName' => 'display_name',
        'outsideId'   => 'outside_id',
        'sourceFrom'  => 'source_from',
        'extension'   => 'extension',
    ];

    public function validate()
    {
        Model::validateRequired('uuid', $this->uuid, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('sourceFrom', $this->sourceFrom, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraasTenantDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
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

        return $model;
    }
}
