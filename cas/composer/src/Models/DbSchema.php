<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DbSchema extends Model
{
    // charSet
    /**
     * @example charSet
     *
     * @var string
     */
    public $charSet;

    // database
    /**
     * @example database
     *
     * @var Database
     */
    public $database;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // grants
    /**
     * @example
     *
     * @var DbSchemaGrant[]
     */
    public $grants;

    // iaas_type
    /**
     * @example iaas_type
     *
     * @var string
     */
    public $iaasType;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // utc_create
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
        'charSet'     => 'char_set',
        'database'    => 'database',
        'description' => 'description',
        'grants'      => 'grants',
        'iaasType'    => 'iaas_type',
        'id'          => 'id',
        'name'        => 'name',
        'status'      => 'status',
        'utcCreate'   => 'utc_create',
        'utcModified' => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('grants', $this->grants, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->charSet) {
            $res['char_set'] = $this->charSet;
        }
        if (null !== $this->database) {
            $res['database'] = null !== $this->database ? $this->database->toMap() : null;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->grants) {
            $res['grants'] = [];
            if (null !== $this->grants && \is_array($this->grants)) {
                $n = 0;
                foreach ($this->grants as $item) {
                    $res['grants'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
     * @return DbSchema
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['char_set'])) {
            $model->charSet = $map['char_set'];
        }
        if (isset($map['database'])) {
            $model->database = Database::fromMap($map['database']);
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['grants'])) {
            if (!empty($map['grants'])) {
                $model->grants = [];
                $n             = 0;
                foreach ($map['grants'] as $item) {
                    $model->grants[$n++] = null !== $item ? DbSchemaGrant::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
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
